package sri.universal.styles


import scala.scalajs.js

import scala.language.experimental.macros

trait InlineStyleSheetUniversal {

  object dsl extends InlineStylePropsUniversal

  /**
    *  it creates and object and then it passes to PropRegistery to register it
    * @param props
    * @return
    */
  def style(props: InlineStylePropUniversal.type*): js.Any =
    macro InlineStylesMacro.styleRegisterMacroImpl

  /**
    *  It creates object from props and returns it.
    * @param props
    * @return
    */
  def styleUR(props: InlineStylePropUniversal.type*): js.Any =
    macro InlineStylesMacro.styleMacroImpl
}

object InlineStyleSheetUniversal extends InlineStyleSheetUniversal
