package sri.universal.components

import sri.core.JSComponent

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}
import scala.scalajs.js.{UndefOr => U}

@js.native
@JSImport("react-native", "Button")
object ButtonComponent extends JSComponent[ButtonProps]

@ScalaJSDefined
trait ButtonProps extends js.Object {
  val title: js.UndefOr[String] = js.undefined
  val disabled: js.UndefOr[Boolean] = js.undefined
  val onPress: js.UndefOr[js.Function0[_]] = js.undefined
  val testID: js.UndefOr[String] = js.undefined
  val color: js.UndefOr[String] = js.undefined
  val accessibilityLabel: js.UndefOr[String] = js.undefined
}
