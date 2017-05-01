package sri.universal.apis

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
trait DeviceInfo extends js.Object {
  val Dimensions: Dimensions = js.native
}

@js.native
@JSImport("react-native", "DeviceInfo")
object DeviceInfo extends DeviceInfo
