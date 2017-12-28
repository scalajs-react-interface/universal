package sri.universal.styles

import sri.universal.BaseTest

import scala.scalajs.js
import scala.scalajs.js.JSON


class InlineStyleSheetUniversalTest extends BaseTest {

  object styles extends InlineStyleSheetUniversal {

    import dsl._

    val container =
      styleUR(flex := 1, alignItems.flexEnd, fontWeight.`500`)
  }

  test("UniversalStyleSheet"){
      val obj = styles.container.asInstanceOf[js.Dynamic]
      expect(obj.flex.toString()).toBe("1")
      expect(obj.alignItems.toString()).toBe("flex-end")
      expect(obj.fontWeight.toString).toBe("500")
    }
}
