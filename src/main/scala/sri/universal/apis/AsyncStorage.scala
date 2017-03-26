package sri.universal.apis

import scala.scalajs.js
import scala.scalajs.js.Promise
import scala.scalajs.js.annotation.JSImport

case class AsyncStorageException(err: js.Dynamic) extends Exception

@js.native
trait AsyncStorage extends js.Object {

  def getItem(key: String): Promise[String] = js.native

  def setItem(key: String, value: String): Promise[Null] = js.native

  def mergeItem(key: String, value: String): Promise[Null] =
    js.native

  def removeItem(key: String): Promise[Null] = js.native

  def clear(): Promise[Null] = js.native

  def getAllKeys(): Promise[js.Array[String]] = js.native

  def flushGetRequests(): Unit = js.native

  def multiGet(keys: js.Array[String]): Promise[js.Array[js.Array[String]]] =
    js.native

  def multiRemove(keys: js.Array[String]): Promise[Null] = js.native

  def multiSet(keyValuePairs: js.Array[js.Array[String]]): Promise[Null] =
    js.native

  def multiMerge(keyValuePairs: js.Array[js.Array[String]]): Promise[Null] =
    js.native

}

@js.native
@JSImport("react-native", "AsyncStorage")
object AsyncStorage extends AsyncStorage
