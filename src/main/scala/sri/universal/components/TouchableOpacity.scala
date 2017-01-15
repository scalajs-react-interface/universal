package sri.universal.components

import sri.core.ReactClass

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}

@js.native
@JSImport("react-native", "TouchableOpacity")
object TouchableOpacityClass extends ReactClass

@ScalaJSDefined
trait BaseTouchableOpacityProps extends js.Object {
  var activeOpacity: js.UndefOr[Double] = js.undefined
}

@ScalaJSDefined
trait BaseTouchableOpacityPropsVal extends js.Object {
  val activeOpacity: js.UndefOr[Double] = js.undefined
}

@ScalaJSDefined
trait TouchableOpacityProps extends BaseTouchableOpacityProps with BaseTouchableWithoutFeedbackProps with UniversalProps[TouchableOpacityM]

@ScalaJSDefined
trait TouchableOpacityPropsVal extends BaseTouchableOpacityPropsVal with BaseTouchableWithoutFeedbackPropsVal with UniversalPropsVal[TouchableOpacityM]


@js.native
trait TouchableOpacityM extends js.Object {
  def setOpacityTo(value: Double, duration: Double): Unit = js.native
}