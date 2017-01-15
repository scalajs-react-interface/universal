package sri.universal.components

import sri.core._

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, JSName, ScalaJSDefined}
import scala.scalajs.js.{UndefOr => U}


@js.native
@JSImport("react-native","Slider")
object SliderClass extends ReactClass

@js.native
trait SliderM extends js.Object

@ScalaJSDefined
trait BaseSliderProps extends js.Object {
  var minimumTrackTintColor: js.UndefOr[String] = js.undefined
  var minimumValue: js.UndefOr[Double] = js.undefined
  var onSlidingComplete: js.UndefOr[js.Function1[Double,_]] = js.undefined
  var maximumTrackTintColor: js.UndefOr[String] = js.undefined
  var thumbImage: js.UndefOr[ImageSource] = js.undefined
  @JSName("thumbImage") var thumbImageDynamic: js.UndefOr[ImageSource] = js.undefined
  var trackImage: js.UndefOr[ImageSource] = js.undefined
  @JSName("trackImage") var trackImageDynamic: js.UndefOr[ImageSource] = js.undefined
  var minimumTrackImage: js.UndefOr[ImageSource] = js.undefined
  @JSName("minimumTrackImage") var minimumTrackImageDynamic: js.UndefOr[ImageSource] = js.undefined
  var maximumTrackImage: js.UndefOr[ImageSource] = js.undefined
  @JSName("maximumTrackImage") var maximumTrackImageDynamic: js.UndefOr[ImageSource] = js.undefined
  var onValueChange: js.UndefOr[js.Function1[Double,Unit]] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var maximumValue: js.UndefOr[Double] = js.undefined
}

@ScalaJSDefined
trait BaseSliderPropsVal extends js.Object {
  val minimumTrackTintColor: js.UndefOr[String] = js.undefined
  val minimumValue: js.UndefOr[Double] = js.undefined
  val onSlidingComplete: js.UndefOr[js.Function1[Double,_]] = js.undefined
  val maximumTrackTintColor: js.UndefOr[String] = js.undefined
  val thumbImage: js.UndefOr[ImageSource] = js.undefined
  @JSName("thumbImage") val thumbImageDynamic: js.UndefOr[ImageSource] = js.undefined
  val trackImage: js.UndefOr[ImageSource] = js.undefined
  @JSName("trackImage") val trackImageDynamic: js.UndefOr[ImageSource] = js.undefined
  val minimumTrackImage: js.UndefOr[ImageSource] = js.undefined
  @JSName("minimumTrackImage") val minimumTrackImageDynamic: js.UndefOr[ImageSource] = js.undefined
  val maximumTrackImage: js.UndefOr[ImageSource] = js.undefined
  @JSName("maximumTrackImage") val maximumTrackImageDynamic: js.UndefOr[ImageSource] = js.undefined
  val onValueChange: js.UndefOr[js.Function1[Double,Unit]] = js.undefined
  val value: js.UndefOr[Double] = js.undefined
  val step: js.UndefOr[Double] = js.undefined
  val disabled: js.UndefOr[Boolean] = js.undefined
  val maximumValue: js.UndefOr[Double] = js.undefined
}

@ScalaJSDefined
trait SliderProps extends BaseSliderProps with BaseViewProps with UniversalProps[SliderM]

@ScalaJSDefined
trait SliderPropsVal extends BaseSliderPropsVal with BaseViewPropsVal with UniversalPropsVal[SliderM]

