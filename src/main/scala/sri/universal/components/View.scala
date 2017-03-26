package sri.universal.components

import sri.core.{ComponentConstructor, JSComponent, ReactClass}
import sri.universal.apis.LayoutEvent

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{global => g}
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}

@js.native
@JSImport("react-native", "View")
object ViewComponent extends JSComponent[ViewProps] {
//  override type PropsType = ViewProps
}

@ScalaJSDefined
trait ViewProps extends js.Object {
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
  val style: js.UndefOr[js.Any] = js.undefined
  val accessibilityTraits: js.UndefOr[js.Array[AccessibilityTraits]] =
    js.undefined
  val onAcccessibilityTap: js.UndefOr[js.Function] = js.undefined
  val collapsible: js.UndefOr[Boolean] = js.undefined
  val needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined
  val onResponderTerminationRequest: js.UndefOr[js.Function] = js.undefined
  val testID: js.UndefOr[String] = js.undefined
  val pointerEvents: js.UndefOr[PointerEvents] = js.undefined
  val onResponderTerminate: js.UndefOr[js.Function] = js.undefined
  val onStartShouldSetResponderCapture: js.UndefOr[js.Function] = js.undefined
  val onResponderGrant: js.UndefOr[js.Function] = js.undefined
  val importantForAccessibility: js.UndefOr[ImportantForAccessibility] =
    js.undefined
  val accessible: js.UndefOr[Boolean] = js.undefined
}

@ScalaJSDefined
trait AccessibilityTraits extends js.Object

object AccessibilityTraits {
  @inline def NONE = "none".asInstanceOf[AccessibilityTraits]
  @inline def BUTTON = "button".asInstanceOf[AccessibilityTraits]
  @inline def LINK = "link".asInstanceOf[AccessibilityTraits]
  @inline def HEADER = "header".asInstanceOf[AccessibilityTraits]
  @inline def SEARCH = "search".asInstanceOf[AccessibilityTraits]
  @inline def IMAGE = "image".asInstanceOf[AccessibilityTraits]
  @inline def SELECTED = "selected".asInstanceOf[AccessibilityTraits]
  @inline def PLAYS = "plays".asInstanceOf[AccessibilityTraits]
  @inline def KEY = "key".asInstanceOf[AccessibilityTraits]
  @inline def TEXT = "text".asInstanceOf[AccessibilityTraits]
  @inline def SUMMARY = "summary".asInstanceOf[AccessibilityTraits]
  @inline def DISABLED = "disabled".asInstanceOf[AccessibilityTraits]
  @inline def FREQUENT_UPDATES =
    "frequentUpdates".asInstanceOf[AccessibilityTraits]
  @inline def STARTS_MEDIA = "startsMedia".asInstanceOf[AccessibilityTraits]
  @inline def ADJUSTABLE = "adjustable".asInstanceOf[AccessibilityTraits]
  @inline def ALLOWS_DIRECT_INTERACTION =
    "allowsDirectInteraction".asInstanceOf[AccessibilityTraits]
  @inline def PAGE_TURN = "pageTurn".asInstanceOf[AccessibilityTraits]
}

@js.native
trait PointerEvents extends js.Object

object PointerEvents {
  @inline def BOX_NONE = "box-none".asInstanceOf[PointerEvents]
  @inline def BOX_ONLY = "box-only".asInstanceOf[PointerEvents]
  @inline def NONE = "none".asInstanceOf[PointerEvents]
  @inline def AUTO = "auto".asInstanceOf[PointerEvents]
}

@js.native
trait ImportantForAccessibility extends js.Object

object ImportantForAccessibility {
  @inline def AUTO = "auto".asInstanceOf[ImportantForAccessibility]
  @inline def YES = "yes".asInstanceOf[ImportantForAccessibility]
  @inline def NO = "no".asInstanceOf[ImportantForAccessibility]
  @inline def NO_HIDE_DESCEDANTS =
    "no-hide-descendants".asInstanceOf[ImportantForAccessibility]
}

@js.native
trait ActivityIndicatorSize extends js.Object

object ActivityIndicatorSize {
  @inline def SMALL = "small".asInstanceOf[ActivityIndicatorSize]
  @inline def LARGE = "large".asInstanceOf[ActivityIndicatorSize]
}

@ScalaJSDefined
trait EdgeInsets extends js.Object {
  val top: js.UndefOr[Double] = js.undefined
  val left: js.UndefOr[Double] = js.undefined
  val bottom: js.UndefOr[Double] = js.undefined
  val right: js.UndefOr[Double] = js.undefined
}
