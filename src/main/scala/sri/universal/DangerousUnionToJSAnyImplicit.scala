package sri.universal

import scala.reflect.ClassTag
import scala.scalajs.js
import scala.scalajs.js.|

trait DangerousUnionToJSAnyImplicit {
  implicit def UnionEvidence[A: ClassTag, B: ClassTag](
      ab: A | B)(implicit eva: A => js.Any, evb: B => js.Any): js.Any =
    ab.asInstanceOf[js.Any]
}

object DangerousUnionToJSAnyImplicit extends DangerousUnionToJSAnyImplicit
