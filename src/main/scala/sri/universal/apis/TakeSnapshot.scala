package sri.universal.apis

import scala.scalajs.js
import scala.scalajs.js.Promise
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}

@js.native
@JSImport("react-native", "takeSnapshot")
object TakeSnapshot extends js.Object {
  def apply(view: js.Any = ???,
            options: SnapShotOptions = ???): Promise[js.Any] = js.native
}

@ScalaJSDefined
trait SnapShotOptions extends js.Object {

  var width: js.UndefOr[Double] = js.undefined

  var height: js.UndefOr[Double] = js.undefined

  var format: js.UndefOr[String] = js.undefined

  var quality: js.UndefOr[Double] = js.undefined

}
