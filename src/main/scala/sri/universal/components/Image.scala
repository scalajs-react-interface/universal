package sri.universal.components

import sri.core.{JSComponent, _}
import scalajsplus.macros.{FunctionObjectMacro,exclude,rename}
import scalajsplus.{ OptDefault => NoValue, OptionalParam => OP}
import sri.universal.apis.LayoutEvent
import sri.universal.{ImageEvent, MergeJSObjects, ReactEvent}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.annotation.{JSImport, JSName}
import scala.scalajs.js.|
@js.native
@JSImport("react-native", "Image")
object ImageComponent extends JSComponent[ImageProps] {

  def getSize(uri: String,
              success: (Double, Double) => Unit,
              failure: js.Dynamic => Unit): Unit = js.native

  def prefetch(url: String): js.Promise[js.Dynamic] = js.native
}

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

trait ImageSource extends js.Object {
  var uri: String
  var isStatic: js.UndefOr[Boolean] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
  var headers: js.UndefOr[js.Dictionary[String]] = js.undefined
}

object ImageSource {
  @inline
  def apply(uri: String,
            scale: OP[Double] = NoValue,
            headers: OP[js.Dictionary[String]] = NoValue): ImageSource = {
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

object Image {

  @inline
  def apply(style: OP[js.Any] = NoValue,
            onLayout: OP[LayoutEvent => _] = NoValue,
            @exclude extraProps: OP[ImageProps] = NoValue,
            source: OP[ImageSource] = NoValue,
            resizeMode: OP[ImageResizeMode] = NoValue,
            @rename("source") sourceDynamic: OP[js.Any] = NoValue,
            @exclude key: String | Int = null,
            @exclude ref: js.Function1[ImageComponent.type, Unit] = null)
    : ReactElement { type Instance = ImageComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => {
      MergeJSObjects(props, v)
    })
    CreateElementJS[ImageComponent.type](ImageComponent,
                                         props.asInstanceOf[ImageProps],
                                         key,
                                         ref)
  }

}
@js.native
@JSImport("react-native", "Image")
object ImageBackgroundComponent extends JSComponent[ImageProps] {

  def getSize(uri: String,
              success: (Double, Double) => Unit,
              failure: js.Dynamic => Unit): Unit = js.native

  def prefetch(url: String): js.Promise[js.Dynamic] = js.native
}

object ImageBackground {

  @inline
  def apply(style: OP[js.Any] = NoValue,
            onLayout: OP[LayoutEvent => _] = NoValue,
            @exclude extraProps: OP[ImageProps] = NoValue,
            source: OP[ImageSource] = NoValue,
            resizeMode: OP[ImageResizeMode] = NoValue,
            @rename("source") sourceDynamic: OP[js.Any] = NoValue,
            @exclude key: String | Int = null,
            @exclude ref: js.Function1[ImageBackgroundComponent.type, Unit] =
              null)(children: ReactNode*)
    : ReactElement { type Instance = ImageBackgroundComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => {
      MergeJSObjects(props, v)
    })
    CreateElementJS[ImageBackgroundComponent.type](
      ImageBackgroundComponent,
      props.asInstanceOf[ImageProps],
      key,
      ref,
      children = children.toJSArray)
  }

}
