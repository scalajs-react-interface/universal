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
  val cancelable: js.UndefOr[Boolean] = js.undefined
  val onDismiss: js.UndefOr[js.Function] = js.undefined
}

@ScalaJSDefined
trait AlertType extends js.Object

object AlertType {
  @inline def DEFAULT = "default".asInstanceOf[AlertType]
  @inline def PLAIN_TEXT = "plain-text".asInstanceOf[AlertType]
  @inline def SECURE_TEXT = "secure-text".asInstanceOf[AlertType]
  @inline def LOGIN_PASSWORD = "login-password".asInstanceOf[AlertType]
}

@ScalaJSDefined
trait AlertButtonStyle extends js.Object

object AlertButtonStyle {

  @inline def DEFAULT = "default".asInstanceOf[AlertButtonStyle]

  @inline def CANCEL = "cancel".asInstanceOf[AlertButtonStyle]

  @inline def DESTRUCTIVE = "destructive".asInstanceOf[AlertButtonStyle]

}
