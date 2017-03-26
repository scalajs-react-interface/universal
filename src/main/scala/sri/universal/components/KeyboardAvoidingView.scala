package sri.universal.components

import sri.core.JSComponent
import sri.universal.apis.LayoutEvent

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{global => g}
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}

@js.native
@JSImport("react-native", "KeyboardAvoidingView")
object KeyboardAvoidingViewComponent
    extends JSComponent[KeyboardAvoidingViewProps] {
  def relativeKeyboardHeight(keyboardFrame: ScreenRect): Double = js.native

  def onKeyboardChange(event: KeyboardChangeEvent = ???): Unit = js.native

  def onLayout(event: LayoutEvent): Unit = js.native
}

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

@ScalaJSDefined
trait KeyboardAvoidingViewProps extends ViewProps {
  val behavior: js.UndefOr[KeyboardAvoidingViewBehaviour] = js.undefined
  val contentContainerStyle: js.UndefOr[js.Any] = js.undefined
  val keyboardVerticalOffset: js.UndefOr[Double] = js.undefined
}

@js.native
trait KeyboardAvoidingViewBehaviour extends js.Object

object KeyboardAvoidingViewBehaviour {
  @inline def HEIGHT = "height".asInstanceOf[KeyboardAvoidingViewBehaviour]
  @inline def POSITION = "position".asInstanceOf[KeyboardAvoidingViewBehaviour]
  @inline def PADDING = "padding".asInstanceOf[KeyboardAvoidingViewBehaviour]
}
