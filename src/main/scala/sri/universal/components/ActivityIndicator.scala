package sri.universal.components

import sri.core.{JSComponent, _}
import sri.macros.{
  FunctionObjectMacro,
  exclude,
  OptDefault => NoValue,
  OptionalParam => OP
}
import sri.universal.MergeJSObjects

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|
@js.native
@JSImport("react-native", "ActivityIndicator")
object ActivityIndicatorComponent extends JSComponent[ActivityIndicatorProps]

trait ActivityIndicatorProps extends ViewProps {
  val size: js.UndefOr[ActivityIndicatorSize] = js.undefined
  val hidesWhenStopped: js.UndefOr[Boolean] = js.undefined
  val color: js.UndefOr[String] = js.undefined
  val animating: js.UndefOr[Boolean] = js.undefined
}

object ActivityIndicator {
  @inline
  def apply(style: OP[js.Any] = NoValue,
            size: OP[ActivityIndicatorSize] = NoValue,
            animating: OP[Boolean] = NoValue,
            color: OP[String] = NoValue,
            @exclude extraProps: OP[ActivityIndicatorProps] = NoValue,
            @exclude key: String | Int = null,
            @exclude ref: js.Function1[ActivityIndicatorComponent.type, Unit] =
              null)
    : ReactElement { type Instance = ActivityIndicatorComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJSNoInline[ActivityIndicatorComponent.type](
      ActivityIndicatorComponent,
      props.asInstanceOf[ActivityIndicatorProps],
      key,
      ref)
  }
}
