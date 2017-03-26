package sri.universal.apis

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
trait PanResponder extends js.Object {

  def create(config: js.Object): Unit = js.native
}

@js.native
@JSImport("react-native","PanResponder")
object PanResponder extends PanResponder