package sri.universal.components

import sri.core.ReactClass

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}


@js.native
@JSImport("react-native", "ActivityIndicator")
object ActivityIndicatorClass extends ReactClass

@js.native
trait ActivityIndicatorM extends js.Object

@ScalaJSDefined
private[sri] trait BaseActivityIndicatorProps extends js.Object {
  var size: js.UndefOr[ActivityIndicatorSize] = js.undefined
  var hidesWhenStopped: js.UndefOr[Boolean] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var animating: js.UndefOr[Boolean] = js.undefined
}

@ScalaJSDefined
private[sri] trait BaseActivityIndicatorPropsVal extends js.Object{
  val size: js.UndefOr[ActivityIndicatorSize] = js.undefined
  val hidesWhenStopped: js.UndefOr[Boolean] = js.undefined
  val color: js.UndefOr[String] = js.undefined
  val animating: js.UndefOr[Boolean] = js.undefined
}

@ScalaJSDefined
trait ActivityIndicatorProps extends BaseActivityIndicatorProps with BaseViewProps with UniversalProps[ActivityIndicatorM]

@ScalaJSDefined
trait ActivityIndicatorPropsVal extends BaseActivityIndicatorProps with BaseViewPropsVal with UniversalPropsVal[ActivityIndicatorM]