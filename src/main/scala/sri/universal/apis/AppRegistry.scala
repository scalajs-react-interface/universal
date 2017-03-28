package sri.universal.apis

import sri.core.ReactClass

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
trait AppRegistry extends js.Object {

  def registerConfig(config: js.Array[js.Object]): Unit = js.native

  def registerComponent(appKey: String,
                        getComponentFunc: js.Function0[ReactClass]): Unit =
    js.native

  def registerRunnable(appKey: String, getComponentFunc: js.Function): Unit =
    js.native

  def runApplication(appKey: String, appParameters: js.Any): Unit = js.native

  def getRegistry(): Registry = js.native
}

@js.native
trait Registry extends js.Object {
  val sections: js.Array[String] = js.native
  val runnables: js.Dictionary[Any] = js.native
}

@js.native
@JSImport("react-native", "AppRegistry")
object AppRegistry extends AppRegistry
