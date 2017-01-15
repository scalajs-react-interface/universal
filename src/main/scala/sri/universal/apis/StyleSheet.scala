package sri.universal.apis

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
trait StyleSheet extends js.Object {

  def create(obj: js.Object): js.Dynamic = js.native

  val hairlineWidth : Double = js.native

  val absoluteFill : js.Any = js.native


}

@js.native
@JSImport("react-native","StyleSheet")
object StyleSheet extends StyleSheet
