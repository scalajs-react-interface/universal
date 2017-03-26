package sri.universal.apis

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
trait Keyboard extends js.Object{

  def addListener(eventName: String,callback : KeyboardEventData => _ ): js.Dynamic = js.native

  def removeListener(eventName: String,callback : js.Function): Unit = js.native

  def removeAllListeners(eventName: String): Unit = js.native

  def dismiss(): Unit = js.native

}

@js.native
@JSImport("react-native","Keyboard")
object Keyboard extends Keyboard

@js.native
trait KeyboardEventData extends js.Object {

  val endCoordinates : js.Dynamic = js.native

}