package sri.universal.components

import sri.core.ReactClass

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}

@js.native
@JSImport("react-native","TouchableWithoutFeedback")
object TouchableWithoutFeedbackClass extends ReactClass

@js.native
trait TouchableWithoutFeedbackM extends js.Object

@ScalaJSDefined
trait BaseTouchableWithoutFeedbackProps extends js.Object {
  var onPressIn: js.UndefOr[js.Function0[_]] = js.undefined
  var onPress: js.UndefOr[js.Function0[_]] = js.undefined
  var delayPressIn: js.UndefOr[Int] = js.undefined
  var onPressOut: js.UndefOr[js.Function0[_]] = js.undefined
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  var accessibilityTraits: js.UndefOr[String] = js.undefined
  var accessibilityComponentType: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var shouldBlockResponder: js.UndefOr[Boolean] = js.undefined
  var onLongPress: js.UndefOr[js.Function0[_]] = js.undefined
  var delayPressOut: js.UndefOr[Int] = js.undefined
  var delayLongPress: js.UndefOr[Int] = js.undefined
  var accessible: js.UndefOr[Boolean] = js.undefined
}

@ScalaJSDefined
trait BaseTouchableWithoutFeedbackPropsVal extends js.Object {
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
  val delayLongPress: js.UndefOr[Int] = js.undefined
  val accessible: js.UndefOr[Boolean] = js.undefined
}

@ScalaJSDefined
trait TouchableWithoutFeedbackProps extends BaseTouchableWithoutFeedbackProps  with UniversalProps[TouchableWithoutFeedbackM]

@ScalaJSDefined
trait TouchableWithoutFeedbackPropsVal extends BaseTouchableWithoutFeedbackPropsVal  with UniversalPropsVal[TouchableWithoutFeedbackM]
