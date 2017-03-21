package sri.universal.components

import sri.core.JSComponent

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}

@js.native
@JSImport("react-native", "TouchableWithoutFeedback")
object TouchableWithoutFeedbackComponent
    extends JSComponent[TouchableWithoutFeedbackProps]

@ScalaJSDefined
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
