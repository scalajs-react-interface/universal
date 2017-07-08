package sri.universal.apis

import scala.scalajs.js
import scala.scalajs.js.Promise
import scala.scalajs.js.annotation.JSImport

@js.native
trait AccessibilityInfo extends js.Object {

  def fetch(): Promise[Boolean] = js.native

  def addEventListener(eventName: String, handler: js.Function): js.Object =
    js.native

  def removeEventListener(eventName: String, handler: js.Function): Unit =
    js.native

  def setAccessibilityFocus(reactTag: Double): Unit = js.native

  def announceForAccessibility(announcement: String): Unit = js.native
}

@js.native
@JSImport("react-native", "AccessibilityInfo")
object AccessibilityInfo extends AccessibilityInfo
