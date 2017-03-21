package sri.universal.components

import sri.core.JSComponent

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}

@js.native
@JSImport("react-native", "TouchableHighlight")
object TouchableHighlightComponent extends JSComponent[TouchableHighlightProps]

@ScalaJSDefined
trait TouchableHighlightProps extends TouchableWithoutFeedbackProps {
  val activeOpacity: js.UndefOr[Double] = js.undefined
  val onHideUnderlay: js.UndefOr[js.Function0[_]] = js.undefined
  val onShowUnderlay: js.UndefOr[js.Function0[_]] = js.undefined
  val underlayColor: js.UndefOr[String] = js.undefined
}

@js.native
trait TouchableHighlightM extends js.Object
