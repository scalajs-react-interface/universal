package sri.universal.components

import sri.core.ReactClass
import sri.universal.apis.LayoutEvent

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{global => g}
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}

@js.native
@JSImport("react-native", "KeyboardAvoidingView")
object KeyboardAvoidingViewClass extends ReactClass

@ScalaJSDefined
trait ScreenRect extends js.Object {
  var screenX: js.UndefOr[Double] = js.undefined
  var screenY: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
}

@ScalaJSDefined
trait KeyboardChangeEvent extends js.Object {

  var startCoordinates: js.UndefOr[ScreenRect] = js.undefined

  var endCoordinates: ScreenRect

  var duration: js.UndefOr[Double] = js.undefined

  var easing: js.UndefOr[String] = js.undefined

}

@js.native
trait KeyboardAvoidingViewM extends js.Object {

  def relativeKeyboardHeight(keyboardFrame: ScreenRect): Double = js.native

  def onKeyboardChange(event: KeyboardChangeEvent = ???): Unit = js.native

  def onLayout(event: LayoutEvent): Unit = js.native
}

@ScalaJSDefined
private[sri] trait BaseKeyboardAvoidingViewProps extends js.Object {
  var behavior: js.UndefOr[KeyboardAvoidingViewBehaviour] = js.undefined
  var contentContainerStyle: js.UndefOr[js.Any] = js.undefined
  var keyboardVerticalOffset: js.UndefOr[Double] = js.undefined
}

@ScalaJSDefined
private[sri] trait BaseKeyboardAvoidingViewPropsVal extends js.Object {
  val behavior: js.UndefOr[KeyboardAvoidingViewBehaviour] = js.undefined
  val contentContainerStyle: js.UndefOr[js.Any] = js.undefined
  val keyboardVerticalOffset: js.UndefOr[Double] = js.undefined
}

@ScalaJSDefined
trait KeyboardAvoidingViewProps
    extends BaseKeyboardAvoidingViewProps
    with BaseViewProps
    with UniversalProps[KeyboardAvoidingViewM]

@ScalaJSDefined
trait KeyboardAvoidingViewPropsVal
    extends BaseKeyboardAvoidingViewPropsVal
    with BaseViewPropsVal
    with UniversalPropsVal[KeyboardAvoidingViewM]

@js.native
trait KeyboardAvoidingViewBehaviour extends js.Object

object KeyboardAvoidingViewBehaviour {
  val HEIGHT = "height".asInstanceOf[KeyboardAvoidingViewBehaviour]
  val POSITION = "position".asInstanceOf[KeyboardAvoidingViewBehaviour]
  val PADDING = "padding".asInstanceOf[KeyboardAvoidingViewBehaviour]
}