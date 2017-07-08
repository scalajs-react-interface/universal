package sri.universal.apis

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

trait PlatformSelect extends js.Object {
  val ios: js.UndefOr[js.Object] = js.undefined
  val android: js.UndefOr[js.Object] = js.undefined
}

@js.native
trait ReactPlatform extends js.Object {
  val OS: String = js.native
  val Version: Double = js.native

  def select(obj: PlatformSelect): js.Object = js.native
}

@js.native
@JSImport("react-native", "Platform")
object ReactPlatform extends ReactPlatform
