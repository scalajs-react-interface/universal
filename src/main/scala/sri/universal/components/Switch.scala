package sri.universal.components

import sri.core.JSComponent

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}
import scala.scalajs.js.{UndefOr => U}

@js.native
@JSImport("react-native", "Switch")
object SwitchComponent extends JSComponent[SwitchProps]

@ScalaJSDefined
trait SwitchProps extends ViewProps {
  val value: js.UndefOr[Boolean] = js.undefined
  val disabled: js.UndefOr[Boolean] = js.undefined
  val onValueChange: js.UndefOr[js.Function1[Boolean, _]] = js.undefined
  val tintColor: js.UndefOr[String] = js.undefined
  val onTintColor: js.UndefOr[String] = js.undefined
  val thumbTintColor: js.UndefOr[String] = js.undefined
}

@js.native
trait SwitchM extends js.Object
