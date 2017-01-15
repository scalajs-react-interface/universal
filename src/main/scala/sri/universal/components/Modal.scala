package sri.universal.components

import sri.core.ReactClass

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}


@js.native
@JSImport("react-native", "Modal")
object ModalClass extends ReactClass


@ScalaJSDefined
trait BaseModalProps extends js.Object {
  var visible: js.UndefOr[Boolean] = js.undefined
  var animationType: js.UndefOr[ModalAnimationType] = js.undefined
  var onDismiss: js.UndefOr[js.Function0[_]] = js.undefined
  var transparent: js.UndefOr[Boolean] = js.undefined
}

@ScalaJSDefined
trait BaseModalPropsVal extends js.Object {
  val visible: js.UndefOr[Boolean] = js.undefined
  val animationType: js.UndefOr[ModalAnimationType] = js.undefined
  val onDismiss: js.UndefOr[js.Function0[_]] = js.undefined
  val transparent: js.UndefOr[Boolean] = js.undefined
}

@ScalaJSDefined
trait ModalProps extends BaseModalProps with UniversalProps[ModalM]

@ScalaJSDefined
trait ModalPropsVal extends BaseModalPropsVal with UniversalPropsVal[ModalM]


//mounted Modal methods/vars
@js.native
trait ModalM extends js.Object

@js.native
trait ModalAnimationType extends js.Object

object ModalAnimationType {
  val SLIDE = "slide".asInstanceOf[ModalAnimationType]
  val FADE = "fade".asInstanceOf[ModalAnimationType]
  val NONE = "none".asInstanceOf[ModalAnimationType]
}