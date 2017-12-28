package sri.universal.components

import sri.core._
import scalajsplus.macros.{FunctionObjectMacro,exclude,rename}
import scalajsplus.{ OptDefault => NoValue, OptionalParam => OP}
import sri.universal.MergeJSObjects

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@js.native
@JSImport("react-native", "Animated.Image")
object AnimatedImageComponent extends JSComponent[ImageProps]

object AnimatedImage {

  @inline
  def apply(style: OP[js.Any] = NoValue,
            @exclude extraProps: OP[ImageProps] = NoValue,
            source: OP[ImageSource] = NoValue,
            resizeMode: OP[ImageResizeMode] = NoValue,
            @rename("source") sourceDynamic: OP[js.Any] = NoValue,
            @exclude key: String | Int = null,
            @exclude ref: js.Function1[AnimatedImageComponent.type, Unit] =
              null)
    : ReactElement { type Instance = AnimatedImageComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => {
      MergeJSObjects(props, v)
    })
    CreateElementJS[AnimatedImageComponent.type](
      AnimatedImageComponent,
      props.asInstanceOf[ImageProps],
      key,
      ref)
  }

}

object AnimatedImageWithC {

  @inline
  def apply(style: OP[js.Any] = NoValue,
            @exclude extraProps: OP[ImageProps] = NoValue,
            source: OP[ImageSource] = NoValue,
            resizeMode: OP[ImageResizeMode] = NoValue,
            @rename("source") sourceDynamic: OP[js.Any] = NoValue,
            @exclude key: String | Int = null,
            @exclude ref: js.Function1[AnimatedImageComponent.type, Unit] =
              null)(children: ReactNode*)
    : ReactElement { type Instance = AnimatedImageComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => {
      MergeJSObjects(props, v)
    })
    CreateElementJS[AnimatedImageComponent.type](
      AnimatedImageComponent,
      props.asInstanceOf[ImageProps],
      key,
      ref,
      children = children.toJSArray)
  }

}
