package sri.universal.components

import sri.core.JSComponent

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}

@js.native
@JSImport("react-native", "Picker")
object PickerComponent extends JSComponent[PickerProps[_]] {

  val MODE_DIALOG: PickerMode = js.native

  val MODE_DROPDOWN: PickerMode = js.native

}

@ScalaJSDefined
trait PickerProps[T] extends ViewProps {
  val itemStyle: js.UndefOr[js.Any] = js.undefined
  val prompt: js.UndefOr[String] = js.undefined
  val enabled: js.UndefOr[Boolean] = js.undefined
  val mode: js.UndefOr[PickerMode] = js.undefined
  val onValueChange: js.UndefOr[js.Function2[T, Int, _]] = js.undefined
  val selectedValue: js.UndefOr[T] = js.undefined
}

@js.native
trait PickerM extends js.Object

@js.native
trait PickerMode extends js.Object

@js.native
@JSImport("react-native", "Picker.Item")
object PickerItemComponent extends JSComponent[PickerItemProps[_]]

@ScalaJSDefined
trait PickerItemProps[T] extends js.Object {
  val label: js.UndefOr[String] = js.undefined
  val color: js.UndefOr[String] = js.undefined
  val style: js.UndefOr[js.Any] = js.undefined
  val testID: js.UndefOr[String] = js.undefined
  val value: js.UndefOr[T] = js.undefined
}

@js.native
trait PickerItemM extends js.Object
