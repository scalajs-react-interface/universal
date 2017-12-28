package sri.universal.components

import sri.core.{JSComponent, _}
import scalajsplus.macros.{FunctionObjectMacro,exclude,rename}
import scalajsplus.{ OptDefault => NoValue, OptionalParam => OP}
import sri.universal.MergeJSObjects

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.{JSImport, JSName}
import scala.scalajs.js.{|, UndefOr => U}

@js.native
@JSImport("react-native", "Slider")
object SliderComponent extends JSComponent[SliderProps]

trait SliderProps extends ViewProps {
  val minimumTrackTintColor: js.UndefOr[String] = js.undefined
  val minimumValue: js.UndefOr[Double] = js.undefined
  val onSlidingComplete: js.UndefOr[js.Function1[Double, _]] = js.undefined
  val maximumTrackTintColor: js.UndefOr[String] = js.undefined
  val thumbImage: js.UndefOr[ImageSource] = js.undefined
  @JSName("thumbImage") val thumbImageDynamic: js.UndefOr[ImageSource] =
    js.undefined
  val trackImage: js.UndefOr[ImageSource] = js.undefined
  @JSName("trackImage") val trackImageDynamic: js.UndefOr[ImageSource] =
    js.undefined
  val minimumTrackImage: js.UndefOr[ImageSource] = js.undefined
  @JSName("minimumTrackImage")
  val minimumTrackImageDynamic: js.UndefOr[ImageSource] = js.undefined
  val maximumTrackImage: js.UndefOr[ImageSource] = js.undefined
  @JSName("maximumTrackImage")
  val maximumTrackImageDynamic: js.UndefOr[ImageSource] = js.undefined
  val onValueChange: js.UndefOr[js.Function1[Double, Unit]] = js.undefined
  val value: js.UndefOr[Double] = js.undefined
  val step: js.UndefOr[Double] = js.undefined
  val disabled: js.UndefOr[Boolean] = js.undefined
  val maximumValue: js.UndefOr[Double] = js.undefined
}

object Slider {
  @inline
  def apply(style: OP[js.Any] = NoValue,
            value: OP[Double] = NoValue,
            onValueChange: OP[Double => _] = NoValue,
            @exclude extraProps: OP[SliderProps] = NoValue,
            @exclude key: String | Int = null,
            @exclude ref: js.Function1[SliderComponent.type, Unit] = null)
    : ReactElement { type Instance = SliderComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => {
      MergeJSObjects(props, v)
    })
    CreateElementJSNoInline[SliderComponent.type](
      SliderComponent,
      props.asInstanceOf[SliderProps],
      key,
      ref)
  }

}
