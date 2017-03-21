package sri.universal.components

import sri.core.JSComponent

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}

@js.native
@JSImport("react-native", "ActivityIndicator")
object ActivityIndicatorComponent extends JSComponent[ActivityIndicatorProps]

@ScalaJSDefined
trait ActivityIndicatorProps extends ViewProps {
  val size: js.UndefOr[ActivityIndicatorSize] = js.undefined
  val hidesWhenStopped: js.UndefOr[Boolean] = js.undefined
  val color: js.UndefOr[String] = js.undefined
  val animating: js.UndefOr[Boolean] = js.undefined
}
