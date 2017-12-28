package sri.universal.components

import sri.core.{JSComponent, _}
import scalajsplus.macros.{FunctionObjectMacro,exclude,rename}
import scalajsplus.{ OptDefault => NoValue, OptionalParam => OP}
import sri.universal.MergeJSObjects

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.{|, UndefOr => U}

@js.native
@JSImport("react-native", "RefreshControl")
object RefreshControlComponent extends JSComponent[RefreshControlProps] {
  val SIZE: js.Dynamic = js.native
}

trait RefreshControlProps extends ViewProps {
  val onRefresh: js.UndefOr[js.Function0[_]] = js.undefined
  val refreshing: js.UndefOr[Boolean] = js.undefined
  val tintColor: js.UndefOr[String] = js.undefined
  val title: js.UndefOr[String] = js.undefined
  val enabled: js.UndefOr[Boolean] = js.undefined
  val colors: js.UndefOr[js.Array[String]] = js.undefined
  val progressBackgroundColor: js.UndefOr[String] = js.undefined
  val progressViewOffset: js.UndefOr[Double] = js.undefined
  val size: js.UndefOr[RefreshControlSize] = js.undefined
}

@js.native
trait RefreshControlSize extends js.Object

object RefreshControlSize {
  @inline def DEFAULT =
    RefreshControlComponent.SIZE.DEFAULT.asInstanceOf[RefreshControlSize]
  @inline def LARGE =
    RefreshControlComponent.SIZE.LARGE.asInstanceOf[RefreshControlSize]
}

object RefreshControl {

  @inline
  def apply(style: OP[js.Any] = NoValue,
            refreshing: OP[Boolean] = NoValue,
            tintColor: OP[String] = NoValue,
            onRefresh: OP[() => _] = NoValue,
            title: OP[String] = NoValue,
            progressBackgroundColor: OP[String] = NoValue,
            colors: OP[js.Array[String]] = NoValue,
            @exclude extraProps: OP[RefreshControlProps] = NoValue,
            @exclude key: String | Int = null,
            @exclude ref: js.Function1[RefreshControlComponent.type, Unit] =
              null)
    : ReactElement { type Instance = RefreshControlComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => {
      MergeJSObjects(props, v)
    })
    CreateElementJSNoInline[RefreshControlComponent.type](
      RefreshControlComponent,
      props.asInstanceOf[RefreshControlProps],
      key,
      ref)
  }

}
