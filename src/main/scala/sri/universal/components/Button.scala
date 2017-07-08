package sri.universal.components

import sri.core.{JSComponent, _}
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
@JSImport("react-native", "Button")
object ButtonComponent extends JSComponent[ButtonProps]

trait ButtonProps extends js.Object {
  val title: js.UndefOr[String] = js.undefined
  val disabled: js.UndefOr[Boolean] = js.undefined
  val onPress: js.UndefOr[js.Function0[_]] = js.undefined
  val testID: js.UndefOr[String] = js.undefined
  val color: js.UndefOr[String] = js.undefined
  val accessibilityLabel: js.UndefOr[String] = js.undefined
}

object Button {

  @inline
  def apply(style: OP[js.Any] = NoValue,
            accessibilityLabel: OP[String] = NoValue,
            color: OP[String] = NoValue,
            disabled: OP[Boolean] = NoValue,
            title: String,
            onPress: () => _,
            @exclude extraProps: OP[ButtonProps] = NoValue,
            @exclude key: String | Int = null,
            @exclude ref: js.Function1[ButtonComponent.type, Unit] = null)
    : ReactElement { type Instance = ButtonComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[ButtonComponent.type](ButtonComponent,
                                          props.asInstanceOf[ButtonProps],
                                          key,
                                          ref)
  }
}
