package sri.universal

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobalScope

@js.native
@JSGlobalScope
object AssetLoader extends js.Object {

  def require[T](name: String): T = js.native

}

//http://www.cakesolutions.net/teamblogs/default-type-parameters-with-implicits-in-scala
trait DefaultsTo[Type, Default]

object DefaultsTo {
  implicit def defaultDefaultsTo[T]: DefaultsTo[T, T] = null
  implicit def fallback[T, D]: DefaultsTo[T, D] = null
}
