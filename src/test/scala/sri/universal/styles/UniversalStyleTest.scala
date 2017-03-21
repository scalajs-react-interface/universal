package sri.universal.styles

import sri.universal.BaseTest

import scala.scalajs.js
import scala.scalajs.js.JSON

class UniversalStyleTest extends BaseTest {
  test("UniversalStyle") {
    val o =
      UniversalStyleSheet
        .style(flex = 1, backgroundColor = "red", registerStyle = false)
        .asInstanceOf[js.Dynamic]

    assert(o.flex.toString == "1")
    assert(o.backgroundColor.toString == "red")
  }
}
