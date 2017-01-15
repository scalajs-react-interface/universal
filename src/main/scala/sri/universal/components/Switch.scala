package sri.universal.components

import sri.core.ReactClass

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}
import scala.scalajs.js.{UndefOr => U}


@js.native
@JSImport("react-native","Switch")
object SwitchClass extends ReactClass

@ScalaJSDefined
trait BaseSwitchProps extends js.Object {
  var value: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var onValueChange: js.UndefOr[js.Function1[Boolean,_]] = js.undefined
  var testID: js.UndefOr[String] = js.undefined
  var tintColor: js.UndefOr[String] = js.undefined
  var onTintColor: js.UndefOr[String] = js.undefined
  var thumbTintColor: js.UndefOr[String] = js.undefined
}

@ScalaJSDefined
trait BaseSwitchPropsVal extends js.Object {
  val value: js.UndefOr[Boolean] = js.undefined
  val disabled: js.UndefOr[Boolean] = js.undefined
  val onValueChange: js.UndefOr[js.Function1[Boolean,_]] = js.undefined
  val testID: js.UndefOr[String] = js.undefined
  val tintColor: js.UndefOr[String] = js.undefined
  val onTintColor: js.UndefOr[String] = js.undefined
  val thumbTintColor: js.UndefOr[String] = js.undefined
}

@ScalaJSDefined
trait SwitchProps extends BaseSwitchProps  with UniversalProps[SwitchM]

@ScalaJSDefined
trait SwitchPropsVal extends BaseSwitchPropsVal  with UniversalPropsVal[SwitchM]



@js.native
trait SwitchM extends js.Object