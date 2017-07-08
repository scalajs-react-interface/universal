package sri.universal.components

import sri.core.{JSComponent, ReactElement, _}
import sri.macros.{
  FunctionObjectMacro,
  exclude,
  OptDefault => NoValue,
  OptionalParam => OP
}
import sri.universal.{MergeJSObjects, ReactEvent, XYValueLiteral}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|
@js.native
@JSImport("react-native", "ScrollView")
object ScrollViewComponent extends JSComponent[ScrollViewProps] {
  def scrollTo(position: ScrollPosition): Unit = js.native
  def scrollToEnd(options: ScrollToEndOptions = ???): Unit = js.native
  def flashScrollIndicators(): Unit = js.native
}

trait ScrollToEndOptions extends js.Object {
  val animated: js.UndefOr[Boolean] = js.undefined
}

trait ScrollViewProps extends ViewProps {
  val zoomScale: js.UndefOr[Int] = js.undefined
  val contentContainerStyle: js.UndefOr[js.Any] = js.undefined
  val contentInset: js.UndefOr[EdgeInsets] = js.undefined
  val alwaysBounceVertical: js.UndefOr[Boolean] = js.undefined
  val decelerationRate: js.UndefOr[Double] = js.undefined
  val minimumZoomScale: js.UndefOr[Double] = js.undefined
  val scrollsToTop: js.UndefOr[Boolean] = js.undefined
  val keyboardDismissMode: js.UndefOr[ScrollViewKeyboardDismissMode] =
    js.undefined
  val horizontal: js.UndefOr[Boolean] = js.undefined
  val contentOffset: js.UndefOr[XYValueLiteral] = js.undefined
  val centerContent: js.UndefOr[Boolean] = js.undefined
  val onScroll: js.UndefOr[js.Function1[ReactEvent[ScrollEvent], Unit]] =
    js.undefined
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
  val keyboardShouldPersistTaps: js.UndefOr[ScrollViewKeyboardPersistTaps] =
    js.undefined
  val pagingEnabled: js.UndefOr[Boolean] = js.undefined
  val scrollPerfTag: js.UndefOr[String] = js.undefined
  val canCancelContentTouches: js.UndefOr[Boolean] = js.undefined
  val showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.undefined
  val scrollIndicatorInsets: js.UndefOr[EdgeInsets] = js.undefined
  val overScrollMode: js.UndefOr[OverScrollMode] = js.undefined
}

trait OverScrollMode extends js.Object

object OverScrollMode {
  @inline def AUTO = "auto".asInstanceOf[OverScrollMode]
  @inline def ALWAYS = "always".asInstanceOf[OverScrollMode]
  @inline def NEVER = "never".asInstanceOf[OverScrollMode]
}

@js.native
trait ScrollViewKeyboardPersistTaps extends js.Object

object ScrollViewKeyboardPersistTaps {
  @inline def ALWAYS = "always".asInstanceOf[ScrollViewKeyboardPersistTaps]
  @inline def NEVER = "never".asInstanceOf[ScrollViewKeyboardPersistTaps]
  @inline def HANDLED = "handled".asInstanceOf[ScrollViewKeyboardPersistTaps]
}

@js.native
trait ScrollViewKeyboardDismissMode extends js.Object

object ScrollViewKeyboardDismissMode {
  @inline def NONE = "none".asInstanceOf[ScrollViewKeyboardDismissMode]
  @inline def INTERACTIVE =
    "interactive".asInstanceOf[ScrollViewKeyboardDismissMode]
  @inline def ON_DRAG = "on-drag".asInstanceOf[ScrollViewKeyboardDismissMode]
}

@js.native
trait ScrollViewIndicatorStyle extends js.Object

object ScrollViewIndicatorStyle {
  @inline def DEFAULT = "default".asInstanceOf[ScrollViewIndicatorStyle]
  @inline def BLACK = "black".asInstanceOf[ScrollViewIndicatorStyle]
  @inline def WHITE = "white".asInstanceOf[ScrollViewIndicatorStyle]
}

trait ScrollPosition extends js.Object {
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
  var animated: js.UndefOr[Boolean] = js.undefined
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

object ContentInset {
  @inline
  def apply(top: OP[Double] = NoValue,
            left: OP[Double] = NoValue,
            right: OP[Double] = NoValue,
            bottom: OP[Double] = NoValue): ContentInset = {
    val p = FunctionObjectMacro()
    p.asInstanceOf[ContentInset]
  }
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

object ScrollView {

  @inline
  def apply(style: OP[js.Any] = NoValue,
            contentInset: OP[ContentInset] = NoValue,
            @exclude extraProps: OP[ScrollViewProps] = NoValue,
            @exclude key: String | Int = null,
            pagingEnabled: OP[Boolean] = NoValue,
            scrollEventThrottle: OP[Double] = NoValue,
            onScroll: OP[ReactEvent[ScrollEvent] => _] = NoValue,
            refreshControl: OP[ReactElement] = NoValue,
            keyboardDismissMode: OP[ScrollViewKeyboardDismissMode] = NoValue,
            keyboardShouldPersistTaps: OP[ScrollViewKeyboardPersistTaps] =
              NoValue,
            horizontal: OP[Boolean] = NoValue,
            @exclude ref: js.Function1[ScrollViewComponent.type, Unit] = null)(
      children: ReactNode*)
    : ReactElement { type Instance = ScrollViewComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => {
      MergeJSObjects(props, v)
    })
    CreateElementJSNoInline[ScrollViewComponent.type](
      ScrollViewComponent,
      props.asInstanceOf[ScrollViewProps],
      key,
      ref,
      children.toJSArray)
  }

}

object ScrollViewC {
  @inline
  def apply(children: ReactNode*) =
    CreateElementJSNoInline[ScrollViewComponent.type](
      ScrollViewComponent,
      json().asInstanceOf[ScrollViewProps],
      children = children.toJSArray)
}
