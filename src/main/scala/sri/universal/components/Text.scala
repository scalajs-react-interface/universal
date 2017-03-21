package sri.universal.components

import sri.core.JSComponent
import sri.universal.apis.LayoutEvent
import sri.universal.{ReactEvent, SyntheticEvent}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}

@js.native
@JSImport("react-native", "Text")
object TextComponent extends JSComponent[TextProps]

@ScalaJSDefined
trait TextProps extends js.Object {
  val suppressHighlighting: js.UndefOr[Boolean] = js.undefined
  val selectionColor: js.UndefOr[String] = js.undefined
  val pressRetentionOffset: js.UndefOr[EdgeInsets] = js.undefined
  val onPress: js.UndefOr[js.Function1[ReactEvent[SyntheticEvent], Unit]] =
    js.undefined
  val onLongPress: js.UndefOr[js.Function1[ReactEvent[SyntheticEvent], Unit]] =
    js.undefined
  val allowFontScaling: js.UndefOr[Boolean] = js.undefined
  val selectable: js.UndefOr[Boolean] = js.undefined
  val adjustsFontSizeToFit: js.UndefOr[Boolean] = js.undefined
  val includeFontPadding: js.UndefOr[Boolean] = js.undefined
  val onLayout: js.UndefOr[js.Function1[LayoutEvent, _]] = js.undefined
  val numberOfLines: js.UndefOr[Int] = js.undefined
  val lineBreakMode: js.UndefOr[LineBreakMode] = js.undefined
  val testID: js.UndefOr[String] = js.undefined
}

class LineBreakMode private (val value: String) extends AnyVal

object LineBreakMode {

  val HEAD = new LineBreakMode("head")
  val MIDDLE = new LineBreakMode("middle")
  val TAIL = new LineBreakMode("tail")
  val CLIP = new LineBreakMode("clip")
}
