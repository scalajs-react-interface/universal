package sri.universal.components

import sri.core.{JSComponent, _}
import sri.macros.{
  FunctionObjectMacro,
  exclude,
  OptDefault => NoValue,
  OptionalParam => OP
}
import sri.universal.MergeJSObjects
import sri.universal.apis.LayoutEvent

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{global => g, literal => json}
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|
@js.native
@JSImport("react-native", "KeyboardAvoidingView")
object KeyboardAvoidingViewComponent
    extends JSComponent[KeyboardAvoidingViewProps] {
  def relativeKeyboardHeight(keyboardFrame: ScreenRect): Double = js.native

  def onKeyboardChange(event: KeyboardChangeEvent = ???): Unit = js.native

  def onLayout(event: LayoutEvent): Unit = js.native
}

trait ScreenRect extends js.Object {
  var screenX: js.UndefOr[Double] = js.undefined
  var screenY: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
}

trait KeyboardChangeEvent extends js.Object {

  var startCoordinates: js.UndefOr[ScreenRect] = js.undefined

  var endCoordinates: ScreenRect

  var duration: js.UndefOr[Double] = js.undefined

  var easing: js.UndefOr[String] = js.undefined

}

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

object KeyboardAvoidingView {
  @inline
  def apply(
      style: OP[js.Any] = NoValue,
      behavior: OP[KeyboardAvoidingViewBehaviour] = NoValue,
      @exclude extraProps: OP[KeyboardAvoidingViewProps] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[KeyboardAvoidingViewComponent.type, Unit] =
        null)(children: ReactNode*)
    : ReactElement { type Instance = KeyboardAvoidingViewComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => {
      MergeJSObjects(props, v)
    })
    CreateElementJSNoInline[KeyboardAvoidingViewComponent.type](
      KeyboardAvoidingViewComponent,
      props.asInstanceOf[KeyboardAvoidingViewProps],
      key,
      ref,
      children.toJSArray)
  }
}

object KeyboardAvoidingViewC {
  @inline
  def apply(children: ReactNode*) =
    CreateElementJSNoInline[KeyboardAvoidingViewComponent.type](
      KeyboardAvoidingViewComponent,
      json().asInstanceOf[KeyboardAvoidingViewProps],
      children = children.toJSArray)

}
