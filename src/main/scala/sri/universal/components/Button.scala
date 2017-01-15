package sri.universal.components

import sri.core.ReactClass

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}
import scala.scalajs.js.{UndefOr => U}

@js.native
@JSImport("react-native", "Button")
object ButtonClass extends ReactClass

@js.native
trait ButtonM extends js.Object

@ScalaJSDefined
private[sri] trait BaseButtonProps extends js.Object{
  var title: String
  var disabled: js.UndefOr[Boolean] = js.undefined
  var onPress: js.Function0[_]
  var testID: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var accessibilityLabel: js.UndefOr[String] = js.undefined
}

@ScalaJSDefined
private[sri] trait BaseButtonPropsVal extends js.Object{
  val title: String
  val disabled: js.UndefOr[Boolean] = js.undefined
  val onPress: js.Function0[_]
  val testID: js.UndefOr[String] = js.undefined
  val color: js.UndefOr[String] = js.undefined
  val accessibilityLabel: js.UndefOr[String] = js.undefined
}

@ScalaJSDefined
trait ButtonProps extends BaseButtonProps with UniversalProps[ButtonM]

@ScalaJSDefined
trait ButtonPropsVal extends BaseButtonPropsVal  with UniversalPropsVal[ButtonM]