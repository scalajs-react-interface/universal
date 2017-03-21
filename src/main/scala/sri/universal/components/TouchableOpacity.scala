package sri.universal.components

import sri.core.JSComponent

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}

@js.native
@JSImport("react-native", "TouchableOpacity")
object TouchableOpacityComponent extends JSComponent[TouchableOpacityProps]

@ScalaJSDefined
trait TouchableOpacityProps extends TouchableWithoutFeedbackProps {
  val activeOpacity: js.UndefOr[Double] = js.undefined
}

@js.native
trait TouchableOpacityM extends js.Object {
  def setOpacityTo(value: Double, duration: Double): Unit = js.native
}
