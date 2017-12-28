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
@JSImport("react-native", "Switch")
object SwitchComponent extends JSComponent[SwitchProps]

trait SwitchProps extends ViewProps {
  val value: js.UndefOr[Boolean] = js.undefined
  val disabled: js.UndefOr[Boolean] = js.undefined
  val onValueChange: js.UndefOr[js.Function1[Boolean, _]] = js.undefined
  val tintColor: js.UndefOr[String] = js.undefined
  val onTintColor: js.UndefOr[String] = js.undefined
  val thumbTintColor: js.UndefOr[String] = js.undefined
}

object Switch {

  @inline
  def apply(style: OP[js.Any] = NoValue,
            value: OP[Boolean] = NoValue,
            disabled: OP[Boolean] = NoValue,
            tintColor: OP[String] = NoValue,
            onTintColor: OP[String] = NoValue,
            onValueChange: OP[Boolean => _] = NoValue,
            @exclude extraProps: OP[SwitchProps] = NoValue,
            @exclude key: String | Int = null,
            @exclude ref: js.Function1[SwitchComponent.type, Unit] = null)
    : ReactElement { type Instance = SwitchComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => {
      MergeJSObjects(props, v)
    })
    CreateElementJSNoInline[SwitchComponent.type](
      SwitchComponent,
      props.asInstanceOf[SwitchProps],
      key,
      ref)
  }

}
