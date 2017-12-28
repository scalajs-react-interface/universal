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
@JSImport("react-native", "TouchableOpacity")
object TouchableOpacityComponent extends JSComponent[TouchableOpacityProps] {
  def setOpacityTo(value: Double, duration: Double): Unit = js.native

}

trait TouchableOpacityProps extends TouchableWithoutFeedbackProps {
  val activeOpacity: js.UndefOr[Double] = js.undefined
}

object TouchableOpacity {

  @inline
  def apply(style: OP[js.Any] = NoValue,
            @exclude extraProps: OP[TouchableOpacityProps] = NoValue,
            onPress: OP[() => _] = NoValue,
            onPressIn: OP[() => _] = NoValue,
            onPressOut: OP[() => _] = NoValue,
            onLongPress: OP[() => _] = NoValue,
            activeOpacity: OP[Double] = NoValue,
            @exclude key: String | Int = null,
            @exclude ref: js.Function1[TouchableOpacityComponent.type, Unit] =
              null)(children: ReactNode*)
    : ReactElement { type Instance = TouchableOpacityComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => {
      MergeJSObjects(props, v)
    })
    CreateElementJSNoInline[TouchableOpacityComponent.type](
      TouchableOpacityComponent,
      props.asInstanceOf[TouchableOpacityProps],
      key,
      ref,
      children.toJSArray)
  }

}
