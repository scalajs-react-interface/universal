package sri.universal

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.|

package object components extends UniversalComponents{

  @ScalaJSDefined
  trait UniversalProps[Ref] extends js.Object {
    var key: js.UndefOr[String | Int] = js.undefined
    var ref: js.UndefOr[js.Function1[Ref,Unit]] = js.undefined
    var style: js.UndefOr[js.Any] = js.undefined
  }

  @ScalaJSDefined
  trait UniversalPropsVal[Ref] extends js.Object {
    val key: js.UndefOr[String | Int] = js.undefined
    val ref: js.UndefOr[js.Function1[Ref,Unit]] = js.undefined
    val style: js.UndefOr[js.Any] = js.undefined
  }

}