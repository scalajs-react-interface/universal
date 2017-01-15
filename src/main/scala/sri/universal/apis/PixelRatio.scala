package sri.universal.apis

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
trait PixelRatio extends js.Object {

  def get(): Double = js.native

  def getFontScale(): Double = js.native

  def getPixelSizeForLayoutSize(layoutSize: Double): Double = js.native

  def roundToNearestPixel(layoutSize: Double): Double = js.native
}

@js.native
@JSImport("react-native","PixelRatio")
object PixelRatio extends PixelRatio