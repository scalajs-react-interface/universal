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
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|
@js.native
@JSImport("react-native", "TouchableWithoutFeedback")
object TouchableWithoutFeedbackComponent
    extends JSComponent[TouchableWithoutFeedbackProps]

trait TouchableWithoutFeedbackProps extends js.Object {
  val onPressIn: js.UndefOr[js.Function0[_]] = js.undefined
  val onPress: js.UndefOr[js.Function0[_]] = js.undefined
  val delayPressIn: js.UndefOr[Int] = js.undefined
  val onPressOut: js.UndefOr[js.Function0[_]] = js.undefined
  val accessibilityLabel: js.UndefOr[String] = js.undefined
  val accessibilityTraits: js.UndefOr[String] = js.undefined
  val accessibilityComponentType: js.UndefOr[String] = js.undefined
  val disabled: js.UndefOr[Boolean] = js.undefined
  val shouldBlockResponder: js.UndefOr[Boolean] = js.undefined
  val onLongPress: js.UndefOr[js.Function0[_]] = js.undefined
  val delayPressOut: js.UndefOr[Int] = js.undefined
  val style: js.UndefOr[js.Any] = js.undefined
  val delayLongPress: js.UndefOr[Int] = js.undefined
  val accessible: js.UndefOr[Boolean] = js.undefined
}

object TouchableWithoutFeedback {

  @inline
  def apply(style: OP[js.Any] = NoValue,
            onPress: OP[() => _] = NoValue,
            onPressIn: OP[() => _] = NoValue,
            onPressOut: OP[() => _] = NoValue,
            onLongPress: OP[() => _] = NoValue,
            @exclude extraProps: OP[TouchableWithoutFeedbackProps] = NoValue,
            @exclude key: String | Int = null,
            @exclude ref: js.Function1[TouchableWithoutFeedbackComponent.type,
                                       Unit] = null)(
      children: ReactNode*): ReactElement {
    type Instance = TouchableWithoutFeedbackComponent.type
  } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => {
      MergeJSObjects(props, v)
    })
    CreateElementJSNoInline[TouchableWithoutFeedbackComponent.type](
      TouchableWithoutFeedbackComponent,
      props.asInstanceOf[TouchableWithoutFeedbackProps],
      key,
      ref,
      children.toJSArray)
  }

}
