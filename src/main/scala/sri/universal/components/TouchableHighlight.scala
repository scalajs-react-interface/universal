package sri.universal.components

import sri.core.{JSComponent, _}
import scalajsplus.macros.{FunctionObjectMacro,exclude,rename}
import scalajsplus.{ OptDefault => NoValue, OptionalParam => OP}
import sri.universal.MergeJSObjects

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|
@js.native
@JSImport("react-native", "TouchableHighlight")
object TouchableHighlightComponent extends JSComponent[TouchableHighlightProps]

trait TouchableHighlightProps extends TouchableWithoutFeedbackProps {
  val activeOpacity: js.UndefOr[Double] = js.undefined
  val onHideUnderlay: js.UndefOr[js.Function0[_]] = js.undefined
  val onShowUnderlay: js.UndefOr[js.Function0[_]] = js.undefined
  val underlayColor: js.UndefOr[String] = js.undefined
}

object TouchableHighlight {

  @inline
  def apply(
      style: OP[js.Any] = NoValue,
      underlayColor: OP[String] = NoValue,
      activeOpacity: OP[Double] = NoValue,
      onPress: OP[() => _] = NoValue,
      onHideUnderlay: OP[() => _] = NoValue,
      onShowUnderlay: OP[() => _] = NoValue,
      onPressIn: OP[() => _] = NoValue,
      onPressOut: OP[() => _] = NoValue,
      onLongPress: OP[() => _] = NoValue,
      @exclude extraProps: OP[TouchableHighlightProps] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[TouchableHighlightComponent.type, Unit] = null)(
      children: ReactNode*)
    : ReactElement { type Instance = TouchableHighlightComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => {
      MergeJSObjects(props, v)
    })
    CreateElementJSNoInline[TouchableHighlightComponent.type](
      TouchableHighlightComponent,
      props.asInstanceOf[TouchableHighlightProps],
      key,
      ref,
      children.toJSArray)
  }

}
