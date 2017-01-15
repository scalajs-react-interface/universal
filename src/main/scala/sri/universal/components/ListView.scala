package sri.universal.components

import sri.core.{ReactClass, ReactElement}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}


@js.native
@JSImport("react-native","ListView")
object ListViewClass extends ReactClass

@ScalaJSDefined
private[sri] trait BaseListViewProps[R,H] extends js.Object {
  var scrollRenderAheadDistance: js.UndefOr[Int] = js.undefined
  var renderFooter: js.UndefOr[js.Function0[ReactElement]] = js.undefined
  var pageSize: js.UndefOr[Int] = js.undefined
  var renderHeader: js.UndefOr[js.Function0[ReactElement]] = js.undefined
  var renderRow: js.Function4[R, String | Int, String | Int, js.Function2[String | Int, String | Int, Unit],ReactElement]
  var onEndReachedThreshold: js.UndefOr[Int] = js.undefined
  var dataSource: ListViewDataSource[R,H]
  var renderScrollComponent: js.UndefOr[js.Function1[js.Dynamic,ReactElement]] = js.undefined
  var onEndReached: js.UndefOr[js.Function0[Unit]] = js.undefined
  var initialListSize: js.UndefOr[Int] = js.undefined
  var renderSeparator: js.UndefOr[js.Function3[String, String, Boolean,ReactElement]] = js.undefined
  var onChangeVisibleRows: js.UndefOr[js.Function2[VisibleRows, VisibleRows,Unit]] = js.undefined
  var renderSectionHeader: js.UndefOr[js.Function2[H, String,ReactElement]] = js.undefined
}

@ScalaJSDefined
private[sri] trait BaseListViewPropsVal[R,H] extends js.Object {
  val scrollRenderAheadDistance: js.UndefOr[Int] = js.undefined
  val renderFooter: js.UndefOr[js.Function0[ReactElement]] = js.undefined
  val pageSize: js.UndefOr[Int] = js.undefined
  val renderHeader: js.UndefOr[js.Function0[ReactElement]] = js.undefined
  val renderRow: js.Function4[R, String | Int, String | Int, js.Function2[String | Int, String | Int, Unit],ReactElement]
  val onEndReachedThreshold: js.UndefOr[Int] = js.undefined
  val dataSource: ListViewDataSource[R,H]
  val renderScrollComponent: js.UndefOr[js.Function1[js.Dynamic,ReactElement]] = js.undefined
  val onEndReached: js.UndefOr[js.Function0[Unit]] = js.undefined
  val initialListSize: js.UndefOr[Int] = js.undefined
  val renderSeparator: js.UndefOr[js.Function3[String, String, Boolean,ReactElement]] = js.undefined
  val onChangeVisibleRows: js.UndefOr[js.Function2[VisibleRows, VisibleRows,Unit]] = js.undefined
  val renderSectionHeader: js.UndefOr[js.Function2[H, String,ReactElement]] = js.undefined
}

@ScalaJSDefined
trait ListViewProps[R,H] extends BaseListViewProps[R,H] with BaseScrollViewProps with UniversalProps[ListViewM]

@ScalaJSDefined
trait ListViewPropsVal[R,H] extends BaseListViewPropsVal[R,H] with BaseScrollViewPropsVal with UniversalPropsVal[ListViewM]


@js.native
trait VisibleRows extends js.Object {
  val sectionID: VisibleSection = js.native
}

@js.native
trait VisibleSection extends js.Object {
  val rowID: Boolean = js.native
}


@js.native
trait ListViewM extends ScrollViewM {

  def getScrollResponder(): ScrollViewM = js.native

}