package sri.universal.components

import sri.core.ReactClass
import sri.universal.apis.LayoutEvent

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{global => g}
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}


@js.native
@JSImport("react-native", "View")
object ViewClass extends ReactClass

@ScalaJSDefined
 private[sri] trait BaseViewProps extends js.Object {
  var onResponderReject: js.UndefOr[js.Function] = js.undefined
  var renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined
  var onStartShouldSetResponder: js.UndefOr[js.Function] = js.undefined
  var onResponderRelease: js.UndefOr[js.Function] = js.undefined
  var onMagicTap: js.UndefOr[js.Function] = js.undefined
  var onResponderMove: js.UndefOr[js.Function] = js.undefined
  var collapsable: js.UndefOr[Boolean] = js.undefined
  var shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined
  var onLayout: js.UndefOr[js.Function1[LayoutEvent, _]] = js.undefined
  var onAccessibilityTap: js.UndefOr[js.Function0[_]] = js.undefined
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  var AccessibilityComponentType: js.UndefOr[js.Any] = js.undefined
  var onMoveShouldSetResponder: js.UndefOr[js.Function] = js.undefined
  var removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
  var accessibilityTraits: js.UndefOr[js.Array[AccessibilityTraits]] = js.undefined
  var onAcccessibilityTap: js.UndefOr[js.Function] = js.undefined
  var collapsible: js.UndefOr[Boolean] = js.undefined
  var needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined
  var onResponderTerminationRequest: js.UndefOr[js.Function] = js.undefined
  var testID: js.UndefOr[String] = js.undefined
  var pointerEvents: js.UndefOr[PointerEvents] = js.undefined
  var onResponderTerminate: js.UndefOr[js.Function] = js.undefined
  var onStartShouldSetResponderCapture: js.UndefOr[js.Function] = js.undefined
  var onResponderGrant: js.UndefOr[js.Function] = js.undefined
  var importantForAccessibility: js.UndefOr[ImportantForAccessibility] = js.undefined
  var accessible: js.UndefOr[Boolean] = js.undefined
}

@ScalaJSDefined
private[sri] trait BaseViewPropsVal extends js.Object {
 val onResponderReject: js.UndefOr[js.Function] = js.undefined
 val renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined
 val onStartShouldSetResponder: js.UndefOr[js.Function] = js.undefined
 val onResponderRelease: js.UndefOr[js.Function] = js.undefined
 val onMagicTap: js.UndefOr[js.Function] = js.undefined
 val onResponderMove: js.UndefOr[js.Function] = js.undefined
 val collapsable: js.UndefOr[Boolean] = js.undefined
 val shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined
 val onLayout: js.UndefOr[js.Function1[LayoutEvent, _]] = js.undefined
 val onAccessibilityTap: js.UndefOr[js.Function0[_]] = js.undefined
 val accessibilityLabel: js.UndefOr[String] = js.undefined
 val AccessibilityComponentType: js.UndefOr[js.Any] = js.undefined
 val onMoveShouldSetResponder: js.UndefOr[js.Function] = js.undefined
 val removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
 val accessibilityTraits: js.UndefOr[js.Array[AccessibilityTraits]] = js.undefined
 val onAcccessibilityTap: js.UndefOr[js.Function] = js.undefined
 val collapsible: js.UndefOr[Boolean] = js.undefined
 val needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined
 val onResponderTerminationRequest: js.UndefOr[js.Function] = js.undefined
 val testID: js.UndefOr[String] = js.undefined
 val pointerEvents: js.UndefOr[PointerEvents] = js.undefined
 val onResponderTerminate: js.UndefOr[js.Function] = js.undefined
 val onStartShouldSetResponderCapture: js.UndefOr[js.Function] = js.undefined
 val onResponderGrant: js.UndefOr[js.Function] = js.undefined
 val importantForAccessibility: js.UndefOr[ImportantForAccessibility] = js.undefined
 val accessible: js.UndefOr[Boolean] = js.undefined
}

@ScalaJSDefined
trait ViewProps extends BaseViewProps with UniversalProps[ViewM]

@ScalaJSDefined
trait ViewPropsVal extends BaseViewPropsVal with UniversalPropsVal[ViewM]

@js.native
trait ViewM extends js.Object

@js.native
trait AccessibilityTraits extends js.Object

object AccessibilityTraits {
  val NONE = "none".asInstanceOf[AccessibilityTraits]
  val BUTTON = "button".asInstanceOf[AccessibilityTraits]
  val LINK = "link".asInstanceOf[AccessibilityTraits]
  val HEADER = "header".asInstanceOf[AccessibilityTraits]
  val SEARCH = "search".asInstanceOf[AccessibilityTraits]
  val IMAGE = "image".asInstanceOf[AccessibilityTraits]
  val SELECTED = "selected".asInstanceOf[AccessibilityTraits]
  val PLAYS = "plays".asInstanceOf[AccessibilityTraits]
  val KEY = "key".asInstanceOf[AccessibilityTraits]
  val TEXT = "text".asInstanceOf[AccessibilityTraits]
  val SUMMARY = "summary".asInstanceOf[AccessibilityTraits]
  val DISABLED = "disabled".asInstanceOf[AccessibilityTraits]
  val FREQUENT_UPDATES = "frequentUpdates".asInstanceOf[AccessibilityTraits]
  val STARTS_MEDIA = "startsMedia".asInstanceOf[AccessibilityTraits]
  val ADJUSTABLE = "adjustable".asInstanceOf[AccessibilityTraits]
  val ALLOWS_DIRECT_INTERACTION = "allowsDirectInteraction".asInstanceOf[AccessibilityTraits]
  val PAGE_TURN = "pageTurn".asInstanceOf[AccessibilityTraits]
}

@js.native
trait PointerEvents extends js.Object

object PointerEvents {
  val BOX_NONE = "box-none".asInstanceOf[PointerEvents]
  val BOX_ONLY = "box-only".asInstanceOf[PointerEvents]
  val NONE = "none".asInstanceOf[PointerEvents]
  val AUTO = "auto".asInstanceOf[PointerEvents]
}

@js.native
trait ImportantForAccessibility extends js.Object

object ImportantForAccessibility {
  val AUTO = "auto".asInstanceOf[ImportantForAccessibility]
  val YES = "yes".asInstanceOf[ImportantForAccessibility]
  val NO = "no".asInstanceOf[ImportantForAccessibility]
  val NO_HIDE_DESCEDANTS = "no-hide-descendants".asInstanceOf[ImportantForAccessibility]
}

@js.native
trait ActivityIndicatorSize extends js.Object

object ActivityIndicatorSize {
  val SMALL = "small".asInstanceOf[ActivityIndicatorSize]
  val LARGE = "large".asInstanceOf[ActivityIndicatorSize]
}

@ScalaJSDefined
trait EdgeInsets extends js.Object {
  var top: js.UndefOr[Double] = js.undefined
  var left: js.UndefOr[Double] = js.undefined
  var bottom: js.UndefOr[Double] = js.undefined
  var right: js.UndefOr[Double] = js.undefined
}