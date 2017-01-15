package sri.universal.components

import sri.core.ReactClass

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}



@js.native
@JSImport("react-native","TouchableHighlight")
object TouchableHighlightClass extends ReactClass


@ScalaJSDefined
trait BaseTouchableHighlightProps extends js.Object {
  var activeOpacity: js.UndefOr[Double] = js.undefined
  var onHideUnderlay: js.UndefOr[js.Function0[_]] = js.undefined
  var onShowUnderlay: js.UndefOr[js.Function0[_]] = js.undefined
  var underlayColor: js.UndefOr[String] = js.undefined
}

@ScalaJSDefined
trait BaseTouchableHighlightPropsVal extends js.Object {
  val activeOpacity: js.UndefOr[Double] = js.undefined
  val onHideUnderlay: js.UndefOr[js.Function0[_]] = js.undefined
  val onShowUnderlay: js.UndefOr[js.Function0[_]] = js.undefined
  val underlayColor: js.UndefOr[String] = js.undefined
}

@ScalaJSDefined
trait TouchableHighlightProps extends BaseTouchableHighlightProps with BaseTouchableWithoutFeedbackProps with UniversalProps[TouchableHighlightM]

@ScalaJSDefined
trait TouchableHighlightPropsVal extends BaseTouchableHighlightPropsVal with BaseTouchableWithoutFeedbackPropsVal with UniversalPropsVal[TouchableHighlightM]




@js.native
trait TouchableHighlightM extends js.Object