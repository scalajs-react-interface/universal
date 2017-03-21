package sri.universal.apis

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}

@js.native
trait Alert extends js.Object {
  def alert(title: String = ???,
            message: String = ???,
            buttons: js.Array[AlertButton] = ???,
            options: AlertOptions = ???,
            `type`: AlertType = AlertType.DEFAULT): Unit = js.native
}

@js.native
@JSImport("react-native", "Alert")
object Alert extends Alert

@ScalaJSDefined
trait AlertButton extends js.Object {
  var text: js.UndefOr[String] = js.undefined
  var onPress: js.UndefOr[js.Function] = js.undefined
  var style: js.UndefOr[AlertButtonStyle] = js.undefined
}

@ScalaJSDefined
trait AlertOptions extends js.Object {
  var cancelable: js.UndefOr[Boolean] = js.undefined
}

@ScalaJSDefined
trait AlertType extends js.Object

object AlertType {
  final val DEFAULT = "default".asInstanceOf[AlertType]
  final val PLAIN_TEXT = "plain-text".asInstanceOf[AlertType]
  final val SECURE_TEXT = "secure-text".asInstanceOf[AlertType]
  final val LOGIN_PASSWORD = "login-password".asInstanceOf[AlertType]
}

@ScalaJSDefined
trait AlertButtonStyle extends js.Object

object AlertButtonStyle {

  final val DEFAULT = "default".asInstanceOf[AlertButtonStyle]

  final val CANCEL = "cancel".asInstanceOf[AlertButtonStyle]

  final val DESTRUCTIVE = "destructive".asInstanceOf[AlertButtonStyle]

}
