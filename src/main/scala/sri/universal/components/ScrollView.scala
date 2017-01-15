package sri.universal.components

import sri.core.{ReactClass, ReactElement}
import sri.universal.{ReactEvent, XYValueLiteral}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}

@js.native
@JSImport("react-native", "ScrollView")
object ScrollViewClass extends ReactClass

@ScalaJSDefined
 private[sri] trait BaseScrollViewProps extends js.Object {

  var zoomScale: js.UndefOr[Int] = js.undefined
  var contentContainerStyle: js.UndefOr[js.Any] = js.undefined
  var contentInset: js.UndefOr[EdgeInsets] = js.undefined
  var alwaysBounceVertical: js.UndefOr[Boolean] = js.undefined
  var decelerationRate: js.UndefOr[Double] = js.undefined
  var minimumZoomScale: js.UndefOr[Double] = js.undefined
  var scrollsToTop: js.UndefOr[Boolean] = js.undefined
  var keyboardDismissMode: js.UndefOr[ScrollViewKeyboardDismissMode] = js.undefined
  var horizontal: js.UndefOr[Boolean] = js.undefined
  var contentOffset: js.UndefOr[XYValueLiteral] = js.undefined
  var centerContent: js.UndefOr[Boolean] = js.undefined
  var removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
  var onScroll: js.UndefOr[js.Function1[ReactEvent[ScrollEvent], Unit]] = js.undefined
  var scrollEventThrottle: js.UndefOr[Int] = js.undefined
  var throttleScrollCallbackMS: js.UndefOr[Int] = js.undefined
  var showsHorizontalScrollIndicator: js.UndefOr[Boolean] = js.undefined
  var endFillColor: js.UndefOr[String] = js.undefined
  var refreshControl: js.UndefOr[ReactElement] = js.undefined
  var scrollEnabled: js.UndefOr[Boolean] = js.undefined
  var indicatorStyle: js.UndefOr[ScrollViewIndicatorStyle] = js.undefined
  var bouncesZoom: js.UndefOr[Boolean] = js.undefined
  var alwaysBounceHorizontal: js.UndefOr[Boolean] = js.undefined
  var bounces: js.UndefOr[Boolean] = js.undefined
  var maximumZoomScale: js.UndefOr[Double] = js.undefined
  var automaticallyAdjustContentInsets: js.UndefOr[Boolean] = js.undefined
  var onScrollAnimationEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var stickyHeaderIndices: js.UndefOr[js.Array[Int]] = js.undefined
  var directionalLockEnabled: js.UndefOr[Boolean] = js.undefined
  var keyboardShouldPersistTaps: js.UndefOr[ScrollViewKeyboardPersistTaps] = js.undefined
  var pagingEnabled: js.UndefOr[Boolean] = js.undefined
  var scrollPerfTag: js.UndefOr[String] = js.undefined
  var canCancelContentTouches: js.UndefOr[Boolean] = js.undefined
  var showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.undefined
  var scrollIndicatorInsets: js.UndefOr[EdgeInsets] = js.undefined
}

@ScalaJSDefined
private[sri] trait BaseScrollViewPropsVal extends js.Object {
 val zoomScale: js.UndefOr[Int] = js.undefined
 val contentContainerStyle: js.UndefOr[js.Any] = js.undefined
 val contentInset: js.UndefOr[EdgeInsets] = js.undefined
 val alwaysBounceVertical: js.UndefOr[Boolean] = js.undefined
 val decelerationRate: js.UndefOr[Double] = js.undefined
 val minimumZoomScale: js.UndefOr[Double] = js.undefined
 val scrollsToTop: js.UndefOr[Boolean] = js.undefined
 val keyboardDismissMode: js.UndefOr[ScrollViewKeyboardDismissMode] = js.undefined
 val horizontal: js.UndefOr[Boolean] = js.undefined
 val contentOffset: js.UndefOr[XYValueLiteral] = js.undefined
 val centerContent: js.UndefOr[Boolean] = js.undefined
 val removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
 val onScroll: js.UndefOr[js.Function1[ReactEvent[ScrollEvent], Unit]] = js.undefined
 val scrollEventThrottle: js.UndefOr[Int] = js.undefined
 val throttleScrollCallbackMS: js.UndefOr[Int] = js.undefined
 val showsHorizontalScrollIndicator: js.UndefOr[Boolean] = js.undefined
 val endFillColor: js.UndefOr[String] = js.undefined
 val refreshControl: js.UndefOr[ReactElement] = js.undefined
 val scrollEnabled: js.UndefOr[Boolean] = js.undefined
 val indicatorStyle: js.UndefOr[ScrollViewIndicatorStyle] = js.undefined
 val bouncesZoom: js.UndefOr[Boolean] = js.undefined
 val alwaysBounceHorizontal: js.UndefOr[Boolean] = js.undefined
 val bounces: js.UndefOr[Boolean] = js.undefined
 val maximumZoomScale: js.UndefOr[Double] = js.undefined
 val automaticallyAdjustContentInsets: js.UndefOr[Boolean] = js.undefined
 val onScrollAnimationEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
 val stickyHeaderIndices: js.UndefOr[js.Array[Int]] = js.undefined
 val directionalLockEnabled: js.UndefOr[Boolean] = js.undefined
 val keyboardShouldPersistTaps: js.UndefOr[ScrollViewKeyboardPersistTaps] = js.undefined
 val pagingEnabled: js.UndefOr[Boolean] = js.undefined
 val scrollPerfTag: js.UndefOr[String] = js.undefined
 val canCancelContentTouches: js.UndefOr[Boolean] = js.undefined
 val showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.undefined
 val scrollIndicatorInsets: js.UndefOr[EdgeInsets] = js.undefined
}

@ScalaJSDefined
trait ScrollViewProps extends BaseScrollViewProps with UniversalProps[ScrollViewM]

@ScalaJSDefined
trait ScrollViewPropsVal extends BaseScrollViewPropsVal with UniversalPropsVal[ScrollViewM]


@js.native
trait ScrollViewKeyboardPersistTaps extends js.Object

object ScrollViewKeyboardPersistTaps {
  val ALWAYS = "always".asInstanceOf[ScrollViewKeyboardPersistTaps]
  val NEVER = "never".asInstanceOf[ScrollViewKeyboardPersistTaps]
  val HANDLED = "handled".asInstanceOf[ScrollViewKeyboardPersistTaps]
}

@js.native
trait ScrollViewKeyboardDismissMode extends js.Object

object ScrollViewKeyboardDismissMode {
  val NONE = "none".asInstanceOf[ScrollViewKeyboardDismissMode]
  val INTERACTIVE = "interactive".asInstanceOf[ScrollViewKeyboardDismissMode]
  val ON_DRAG = "on-drag".asInstanceOf[ScrollViewKeyboardDismissMode]
}


@js.native
trait ScrollViewIndicatorStyle extends js.Object

object ScrollViewIndicatorStyle {
  val DEFAULT = "default".asInstanceOf[ScrollViewIndicatorStyle]
  val BLACK = "black".asInstanceOf[ScrollViewIndicatorStyle]
  val WHITE = "white".asInstanceOf[ScrollViewIndicatorStyle]
}

@ScalaJSDefined
trait ScrollPosition extends js.Object {
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
  var animated: js.UndefOr[Boolean] = js.undefined
}


@js.native
trait ScrollViewM extends js.Object {

  def scrollTo(position: ScrollPosition): Unit = js.native
}

@js.native
trait ScrollEvent extends js.Object {

  val contentInset: ContentInset = js.native

  val contentOffset: ContentOffset = js.native

  val layoutMeasurement: Size2d = js.native

  val contentSize: Size2d = js.native

  val zoomScale: Double = js.native
}

@js.native
trait ContentInset extends js.Object {

  val top: Double = js.native

  val left: Double = js.native

  val right: Double = js.native

  val bottom: Double = js.native
}

@js.native
trait ContentOffset extends js.Object {

  val x: Double = js.native

  val y: Double = js.native
}

@js.native
trait Size2d extends js.Object {

  val width: Double = js.native

  val height: Double = js.native
}