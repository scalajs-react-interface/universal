package sri.universal.apis

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.JSImport

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

trait AlertButton extends js.Object {
  val text: js.UndefOr[String] = js.undefined
  val onPress: js.UndefOr[js.Function] = js.undefined
  val style: js.UndefOr[AlertButtonStyle] = js.undefined
}

object AlertButton {
  @inline
  def apply(text: OP[String] = NoValue,
            onPress: OP[() => _] = NoValue,
            style: OP[AlertButtonStyle] = NoValue): AlertButton = {
    val p = FunctionObjectMacro()
    p.asInstanceOf[AlertButton]
  }
}

trait AlertOptions extends js.Object {
  val cancelable: js.UndefOr[Boolean] = js.undefined
  val onDismiss: js.UndefOr[js.Function] = js.undefined
}

trait AlertType extends js.Object

object AlertType {
  @inline def DEFAULT = "default".asInstanceOf[AlertType]
  @inline def PLAIN_TEXT = "plain-text".asInstanceOf[AlertType]
  @inline def SECURE_TEXT = "secure-text".asInstanceOf[AlertType]
  @inline def LOGIN_PASSWORD = "login-password".asInstanceOf[AlertType]
}

trait AlertButtonStyle extends js.Object

object AlertButtonStyle {

  @inline def DEFAULT = "default".asInstanceOf[AlertButtonStyle]

  @inline def CANCEL = "cancel".asInstanceOf[AlertButtonStyle]

  @inline def DESTRUCTIVE = "destructive".asInstanceOf[AlertButtonStyle]

}
