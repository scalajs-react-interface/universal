package sri.universal.components

import sri.core._
import sri.macros.{
  FunctionObjectMacro,
  exclude,
  OptDefault => NoValue,
  OptionalParam => OP
}
import sri.universal.MergeJSObjects

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@js.native
@JSImport("react-native", "Animated.View")
object AnimatedViewComponent extends JSComponent[ViewProps]

object AnimatedView {

  @inline
  def apply(
      style: OP[js.Any] = NoValue,
      @exclude extraProps: OP[ViewProps] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[AnimatedViewComponent.type, Unit] = null)(
      children: ReactNode*)
    : ReactElement { type Instance = AnimatedViewComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => {
      MergeJSObjects(props, v)
    })
    CreateElementJS[AnimatedViewComponent.type](AnimatedViewComponent,
                                                props.asInstanceOf[ViewProps],
                                                key,
                                                ref,
                                                children.toJSArray)
  }

}

object AnimatedViewC {
  @inline
  def apply(children: ReactNode*) =
    CreateElementJS[AnimatedViewComponent.type](AnimatedViewComponent,
                                                json().asInstanceOf[ViewProps],
                                                children = children.toJSArray)
}
