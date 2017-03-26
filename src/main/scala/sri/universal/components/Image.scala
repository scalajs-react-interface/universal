package sri.universal.components

import sri.core.JSComponent
import sri.macros.{FunctionObjectMacro, OptDefault, OptionalParam}
import sri.universal.apis.LayoutEvent
import sri.universal.{ImageEvent, ReactEvent}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, JSName, ScalaJSDefined}

@js.native
@JSImport("react-native", "Image")
object ImageComponent extends JSComponent[ImageProps] {

  def getSize(uri: String,
              success: (Double, Double) => Unit,
              failure: js.Dynamic => Unit): Unit = js.native

  def prefetch(url: String): js.Promise[js.Dynamic] = js.native
}

@ScalaJSDefined
trait ImageProps extends js.Object {
  val source: js.UndefOr[ImageSource] = js.undefined
  @JSName("source") val sourceDynamic: js.UndefOr[js.Any] = js.undefined
  val onLayout: js.UndefOr[js.Function1[LayoutEvent, _]] = js.undefined
  val accessibilityLabel: js.UndefOr[String] = js.undefined
  val onError: js.UndefOr[js.Function1[ReactEvent[ImageEvent], _]] =
    js.undefined
  val onLoadEnd: js.UndefOr[js.Function1[ReactEvent[ImageEvent], _]] =
    js.undefined
  val onLoad: js.UndefOr[js.Function1[ReactEvent[ImageEvent], _]] =
    js.undefined
  val resizeMode: js.UndefOr[ImageResizeMode] = js.undefined
  val testID: js.UndefOr[String] = js.undefined
  val blurRadius: js.UndefOr[Double] = js.undefined
  val onLoadStart: js.UndefOr[js.Function1[ReactEvent[ImageEvent], _]] =
    js.undefined
  val defaultSource: js.UndefOr[ImageSource] = js.undefined
  @JSName("defaultSource") val defaultSourceDynamic: js.UndefOr[js.Dynamic] =
    js.undefined
  val loadingIndicatorSrc: js.UndefOr[ImageSource] = js.undefined
  @JSName("loadingIndicatorSrc")
  val loadingIndicatorSrcDynamic: js.UndefOr[js.Dynamic] = js.undefined
  val onProgress: js.UndefOr[js.Function1[ReactEvent[ImageEvent], _]] =
    js.undefined
  val accessible: js.UndefOr[Boolean] = js.undefined
}

@ScalaJSDefined
trait ImageSource extends js.Object {
  var uri: String
  var isStatic: js.UndefOr[Boolean] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
}

object ImageSource {
  @inline
  def apply(uri: String,
            scale: OptionalParam[Double] = OptDefault): ImageSource = {
    val p = FunctionObjectMacro()
    p.asInstanceOf[ImageSource]
  }
}

@js.native
trait ImageResizeMode extends js.Object

object ImageResizeMode {
  val COVER = "cover".asInstanceOf[ImageResizeMode]
  val CONTAIN = "contain".asInstanceOf[ImageResizeMode]
  val STRETCH = "stretch".asInstanceOf[ImageResizeMode]
  val REPEAT = "repeat".asInstanceOf[ImageResizeMode]
  val CENTER = "center".asInstanceOf[ImageResizeMode]
}
