package sri.universal.components

import sri.core.ReactClass

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}


@js.native
@JSImport("react-native","Picker")
object PickerClass extends ReactClass {
  val MODE_DIALOG: PickerMode = js.native

  val MODE_DROPDOWN: PickerMode = js.native

}


@ScalaJSDefined
trait BasePickerProps[T] extends js.Object {
  var itemStyle: js.UndefOr[js.Any] = js.undefined
  var prompt: js.UndefOr[String] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[PickerMode] = js.undefined
  var onValueChange: js.UndefOr[js.Function2[T, Int, _]] = js.undefined
  var selectedValue: js.UndefOr[T] = js.undefined
}

@ScalaJSDefined
trait BasePickerPropsVal[T] extends js.Object {
  val itemStyle: js.UndefOr[js.Any] = js.undefined
  val prompt: js.UndefOr[String] = js.undefined
  val enabled: js.UndefOr[Boolean] = js.undefined
  val mode: js.UndefOr[PickerMode] = js.undefined
  val onValueChange: js.UndefOr[js.Function2[T, Int, _]] = js.undefined
  val selectedValue: js.UndefOr[T] = js.undefined
}

@ScalaJSDefined
trait PickerProps[T] extends BasePickerProps[T] with BaseViewProps with UniversalProps[PickerM]

@ScalaJSDefined
trait PickerPropsVal[T] extends BasePickerPropsVal[T] with BaseViewPropsVal with UniversalPropsVal[PickerM]


@js.native
trait PickerM extends js.Object

@js.native
trait PickerMode extends js.Object


@js.native
@JSImport("react-native","Picker.Item")
object PickerItemClass extends ReactClass


@ScalaJSDefined
trait BasePickerItemProps[T] extends js.Object {
  var label: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var testID: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[T] = js.undefined
}

@ScalaJSDefined
trait BasePickerItemPropsVal[T] extends js.Object {
  val label: js.UndefOr[String] = js.undefined
  val color: js.UndefOr[String] = js.undefined
  val testID: js.UndefOr[String] = js.undefined
  val value: js.UndefOr[T] = js.undefined
}

@ScalaJSDefined
trait PickerItemProps[T] extends BasePickerItemProps[T]  with UniversalProps[PickerItemM]

@ScalaJSDefined
trait PickerItemPropsVal[T] extends BasePickerItemPropsVal[T]  with UniversalPropsVal[PickerItemM]





@js.native
trait PickerItemM extends js.Object