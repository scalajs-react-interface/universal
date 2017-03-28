package sri.universal.apis

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}

@js.native
trait Dimensions extends js.Object {

  def get(in: String): WindowDimensions = js.native

  def set(dims: js.Object): Boolean = js.native

  def addEventListener(`type`: String, handler: js.Function): js.Any =
    js.native

  def removeEventListener(`type`: String, handler: js.Function): js.Any =
    js.native
}

@js.native
@JSImport("react-native", "Dimensions")
object Dimensions extends Dimensions

@js.native
trait WindowDimensions extends js.Object {

  val width: Double = js.native

  val height: Double = js.native

  val scale: Double = js.native

  val fontScale: Double = js.native
}
