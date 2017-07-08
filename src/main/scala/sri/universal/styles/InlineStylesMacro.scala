package sri.universal.styles

import scala.reflect.macros.whitebox
import scala.scalajs.js
import scala.util

private[sri] object InlineStylesMacro {

  def styleMacroImpl(c: whitebox.Context)(props: c.Tree*): c.Tree = {
    import c.universe._

    val obj = TermName(c.freshName())

    val keyValues = props.map(prop => {

      prop match {
        case q"$propName := $propValue" => {
          q"${propName.symbol.asTerm.name.decodedName.toString} -> $propValue"
        }
        case q"$propName.$propValue" => {
          val value = s"$propValue"
          val s =
            if (util.Try(value.toDouble).isSuccess) value
            else
              camelCaseToHyphen(
                value.replace("$minus", "-").replace("$u0020", " "))
          q"${propName.symbol.asTerm.name.decodedName.toString} -> $s"
        }
        case _ =>
          c.abort(c.enclosingPosition, s"Supplied prop $prop is not supported")
      }

    })
    q"""
         import scalajs.js
         import sri.universal.DangerousUnionToJSAnyImplicit._
         val $obj = js.Dynamic.literal(..$keyValues)
         $obj
      """
  }

  def styleRegisterMacroImpl(c: whitebox.Context)(props: c.Tree*): c.Tree = {
    import c.universe._
    val obj = styleMacroImpl(c)(props: _*)
    q"""
       sri.universal.apis.ReactNativePropRegistry.register($obj)
      """
  }

  @inline
  def camelCaseToHyphen(name: String) =
    "[A-Z\\d]".r
      .replaceAllIn(name, { m =>
        "-" + m.group(0).toLowerCase()
      })
}
