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
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|
@js.native
@JSImport("react-native", "Picker")
object PickerComponent extends JSComponent[PickerProps[_]] {

  val MODE_DIALOG: PickerMode = js.native

  val MODE_DROPDOWN: PickerMode = js.native

}

trait PickerProps[T] extends ViewProps {
  val itemStyle: js.UndefOr[js.Any] = js.undefined
  val prompt: js.UndefOr[String] = js.undefined
  val enabled: js.UndefOr[Boolean] = js.undefined
  val mode: js.UndefOr[PickerMode] = js.undefined
  val onValueChange: js.UndefOr[js.Function2[T, Int, _]] = js.undefined
  val selectedValue: js.UndefOr[T] = js.undefined
}

@js.native
trait PickerMode extends js.Object

@js.native
@JSImport("react-native", "Picker.Item")
object PickerItemComponent extends JSComponent[PickerItemProps[_]]

trait PickerItemProps[T] extends js.Object {
  val label: js.UndefOr[String] = js.undefined
  val color: js.UndefOr[String] = js.undefined
  val style: js.UndefOr[js.Any] = js.undefined
  val testID: js.UndefOr[String] = js.undefined
  val value: js.UndefOr[T] = js.undefined
}

object Picker {

  @inline
  def apply[T](style: OP[js.Any] = NoValue,
               selectedValue: OP[T] = NoValue,
               onValueChange: OP[(T, Int) => _] = NoValue,
               @exclude extraProps: OP[PickerProps[T]] = NoValue,
               @exclude key: String | Int = null,
               @exclude ref: js.Function1[PickerComponent.type, Unit] = null)(
      children: ReactNode*)
    : ReactElement { type Instance = PickerComponent.type } = {
    implicit def toToAny(t: T): js.Any = t.asInstanceOf[js.Any]

    val props = FunctionObjectMacro()
    extraProps.foreach(v => {
      MergeJSObjects(props, v)
    })
    CreateElementJSNoInline[PickerComponent.type](
      PickerComponent,
      props.asInstanceOf[PickerProps[T]],
      key,
      ref,
      children.toJSArray)
  }

}

object PickerC {

  @inline
  def apply(children: ReactNode*) =
    CreateElementJSNoInline[PickerComponent.type](
      PickerComponent,
      json().asInstanceOf[PickerProps[_]],
      children = children.toJSArray)

}

object PickerItem {

  @inline
  def apply[T](style: OP[js.Any] = NoValue,
               value: OP[T] = NoValue,
               label: OP[String] = NoValue,
               @exclude extraProps: OP[PickerItemProps[T]] = NoValue,
               @exclude key: String | Int = null,
               @exclude ref: js.Function1[PickerItemComponent.type, Unit] =
                 null)
    : ReactElement { type Instance = PickerItemComponent.type } = {
    implicit def toToAny(t: T): js.Any = t.asInstanceOf[js.Any]

    val props = FunctionObjectMacro()
    extraProps.foreach(v => {
      MergeJSObjects(props, v)
    })
    CreateElementJSNoInline[PickerItemComponent.type](
      PickerItemComponent,
      props.asInstanceOf[PickerItemProps[T]],
      key,
      ref)
  }

}
