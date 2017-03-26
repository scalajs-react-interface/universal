package sri.universal.components

import sri.core.JSComponent

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}

@js.native
@JSImport("react-native", "Modal")
object ModalComponent extends JSComponent[ModalProps]

@ScalaJSDefined
trait ModalProps extends js.Object {
  val visible: js.UndefOr[Boolean] = js.undefined
  val style: js.UndefOr[js.Any] = js.undefined
  val animationType: js.UndefOr[ModalAnimationType] = js.undefined
  val onDismiss: js.UndefOr[js.Function0[_]] = js.undefined
  val transparent: js.UndefOr[Boolean] = js.undefined
}

//mounted Modal methods/vars
@js.native
trait ModalM extends js.Object

@js.native
trait ModalAnimationType extends js.Object

object ModalAnimationType {
  @inline def SLIDE = "slide".asInstanceOf[ModalAnimationType]
  @inline def FADE = "fade".asInstanceOf[ModalAnimationType]
  @inline def NONE = "none".asInstanceOf[ModalAnimationType]
}
