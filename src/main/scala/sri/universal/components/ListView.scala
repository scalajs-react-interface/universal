package sri.universal.components

import sri.core.{JSComponent, ReactElement, _}
import sri.macros.{
  FunctionObjectMacro,
  exclude,
  OptDefault => NoValue,
  OptionalParam => OP
}
import sri.universal.MergeJSObjects

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|
@js.native
@JSImport("react-native", "ListView")
object ListViewComponent extends JSComponent[ListViewProps[_, _]] {
  def getScrollResponder(): ScrollViewComponent.type = js.native
  def scrollTo(position: ScrollPosition): Unit = js.native
  def scrollToEnd(options: ScrollToEndOptions = ???): Unit = js.native
}

trait ListViewProps[R, H] extends ScrollViewProps {
  val scrollRenderAheadDistance: js.UndefOr[Int] = js.undefined
  val renderFooter: js.UndefOr[js.Function0[ReactElement]] =
    js.undefined
  val pageSize: js.UndefOr[Int] = js.undefined
  val renderHeader: js.UndefOr[js.Function0[ReactElement]] =
    js.undefined
  val renderRow
    : js.UndefOr[js.Function4[R,
                              String | Int,
                              String | Int,
                              js.Function2[String | Int, String | Int, Unit],
                              ReactElement]] = js.undefined
  val onEndReachedThreshold: js.UndefOr[Int] = js.undefined
  val dataSource: js.UndefOr[ListViewDataSource[R, H]] = js.undefined
  val renderScrollComponent
    : js.UndefOr[js.Function1[js.Dynamic, ReactElement]] =
    js.undefined
  val onEndReached: js.UndefOr[js.Function0[Unit]] = js.undefined
  val initialListSize: js.UndefOr[Int] = js.undefined
  val renderSeparator
    : js.UndefOr[js.Function3[String, String, Boolean, ReactElement]] =
    js.undefined
  val onChangeVisibleRows
    : js.UndefOr[js.Function2[VisibleRows, VisibleRows, Unit]] = js.undefined
  val renderSectionHeader: js.UndefOr[js.Function2[H, String, ReactElement]] =
    js.undefined
}

@js.native
trait VisibleRows extends js.Object {
  val sectionID: VisibleSection = js.native
}

@js.native
trait VisibleSection extends js.Object {
  val rowID: Boolean = js.native
}

object ListView {

  @inline
  def apply[R, H](
      renderSectionHeader: OP[(H, String) => ReactElement] = NoValue,
      @exclude extraProps: OP[ListViewProps[R, H]] = NoValue,
      renderFooter: OP[() => ReactElement] = NoValue,
      renderSeparator: OP[(String, String, Boolean) => ReactElement] = NoValue,
      style: OP[js.Any] = NoValue,
      pageSize: OP[Int] = NoValue,
      initialListSize: OP[Int] = NoValue,
      scrollRenderAheadDistance: OP[Double] = NoValue,
      renderRow: OP[
        (R,
         String | Int,
         String | Int,
         js.Function2[String | Int, String | Int, _]) => ReactElement] =
        NoValue,
      dataSource: OP[ListViewDataSource[R, H]] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[ListViewComponent.type, Unit] = null)
    : ReactElement { type Instance = ListViewComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => {
      MergeJSObjects(props, v)
    })

    CreateElementJSNoInline[ListViewComponent.type](
      ListViewComponent,
      props.asInstanceOf[ListViewProps[R, H]],
      key = key,
      ref = ref)
      .asInstanceOf[ReactElement { type Instance = ListViewComponent.type }]
  }

}
