package sri.universal.apis

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}

@js.native
trait ReactPlatForm extends js.Object {
  val OS: String = js.native
  val Version: Double = js.native

  def select(obj: PlatformSelect): js.Object = js.native
}

@js.native
@JSImport("react-native", "Platform")
object ReactPlatform extends ReactPlatForm

@ScalaJSDefined
trait PlatformSelect extends js.Object {
  var ios: js.UndefOr[js.Object] = js.undefined
  var android: js.UndefOr[js.Object] = js.undefined
}
