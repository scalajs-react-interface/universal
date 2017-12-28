package sri.universal.components

import sri.core.{JSComponent, _}
import scalajsplus.macros.{FunctionObjectMacro,exclude,rename}
import scalajsplus.{ OptDefault => NoValue, OptionalParam => OP}
import sri.universal.apis.LayoutEvent
import sri.universal.{MergeJSObjects, ReactEvent, SyntheticEvent}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@js.native
@JSImport("react-native", "Text")
object TextComponent extends JSComponent[TextProps]

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

object Text {

  @inline
  def apply(style: OP[js.Any] = NoValue,
            onPress: OP[() => _] = NoValue,
            onLayout: OP[LayoutEvent => _] = NoValue,
            numberOfLines: OP[Int] = NoValue,
            @exclude extraProps: OP[TextProps] = NoValue,
            @exclude key: String | Int = null,
            @exclude ref: js.Function1[TextComponent.type, Unit] = null)(
      children: ReactNode*)
    : ReactElement { type Instance = TextComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => {
      MergeJSObjects(props, v)
    })
    CreateElementJSNoInline[TextComponent.type](TextComponent,
                                                props.asInstanceOf[TextProps],
                                                key,
                                                ref,
                                                children.toJSArray)
  }

}

object TextC {

  @inline
  def apply(children: ReactNode*) =
    CreateElementJSNoInline[TextComponent.type](TextComponent,
                                                json().asInstanceOf[TextProps],
                                                children = children.toJSArray)

}
