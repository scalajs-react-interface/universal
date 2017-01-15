package sri.universal.components

import sri.core.ReactClass
import sri.universal.apis.LayoutEvent
import sri.universal.{ReactEvent, SyntheticEvent}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}


@js.native
@JSImport("react-native", "Text")
object TextClass extends ReactClass


@ScalaJSDefined
trait BaseTextProps extends js.Object {
  var suppressHighlighting: js.UndefOr[Boolean] = js.undefined
  var onPress: js.UndefOr[js.Function1[ReactEvent[SyntheticEvent], Unit]] = js.undefined
  var onLongPress: js.UndefOr[js.Function1[ReactEvent[SyntheticEvent], Unit]] = js.undefined
  var allowFontScaling: js.UndefOr[Boolean] = js.undefined
  var selectable: js.UndefOr[Boolean] = js.undefined
  var adjustsFontSizeToFit: js.UndefOr[Boolean] = js.undefined
  var includeFontPadding: js.UndefOr[Boolean] = js.undefined
  var onLayout: js.UndefOr[js.Function1[LayoutEvent, _]] = js.undefined
  var numberOfLines: js.UndefOr[Int] = js.undefined
  var lineBreakMode: js.UndefOr[LineBreakMode] = js.undefined
  var testID: js.UndefOr[String] = js.undefined
}

@ScalaJSDefined
trait BaseTextPropsVal extends js.Object {
  val suppressHighlighting: js.UndefOr[Boolean] = js.undefined
  val onPress: js.UndefOr[js.Function1[ReactEvent[SyntheticEvent], Unit]] = js.undefined
  val onLongPress: js.UndefOr[js.Function1[ReactEvent[SyntheticEvent], Unit]] = js.undefined
  val allowFontScaling: js.UndefOr[Boolean] = js.undefined
  val selectable: js.UndefOr[Boolean] = js.undefined
  val adjustsFontSizeToFit: js.UndefOr[Boolean] = js.undefined
  val includeFontPadding: js.UndefOr[Boolean] = js.undefined
  val onLayout: js.UndefOr[js.Function1[LayoutEvent, _]] = js.undefined
  val numberOfLines: js.UndefOr[Int] = js.undefined
  val lineBreakMode: js.UndefOr[LineBreakMode] = js.undefined
  val testID: js.UndefOr[String] = js.undefined
}

@ScalaJSDefined
trait TextProps extends BaseTextProps with UniversalProps[TextM]

@ScalaJSDefined
trait TextPropsVal extends BaseTextPropsVal with UniversalPropsVal[TextM]


@js.native
trait TextM extends js.Object

class LineBreakMode private(val value: String) extends AnyVal

object LineBreakMode {

  val HEAD = new LineBreakMode("head")
  val MIDDLE = new LineBreakMode("middle")
  val TAIL = new LineBreakMode("tail")
  val CLIP = new LineBreakMode("clip")
}