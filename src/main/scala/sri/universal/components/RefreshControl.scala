package sri.universal.components

import sri.core.ReactClass

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}
import scala.scalajs.js.{UndefOr => U}


@js.native
@JSImport("react-native","RefreshControl")
object RefreshControlClass extends ReactClass {
  val SIZE: js.Dynamic = js.native
}

@js.native
trait RefreshControlM extends js.Object

@ScalaJSDefined
trait BaseRefreshControlProps extends js.Object {
  var onRefresh: js.UndefOr[js.Function0[_]] = js.undefined
  var refreshing: js.UndefOr[Boolean] = js.undefined
  var tintColor: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var colors: js.UndefOr[js.Array[String]] = js.undefined
  var progressBackgroundColor: js.UndefOr[String] = js.undefined
  var progressViewOffset: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[RefreshControlSize] = js.undefined
}

@ScalaJSDefined
trait BaseRefreshControlPropsVal extends js.Object {
  val onRefresh: js.UndefOr[js.Function0[_]] = js.undefined
  val refreshing: js.UndefOr[Boolean] = js.undefined
  val tintColor: js.UndefOr[String] = js.undefined
  val title: js.UndefOr[String] = js.undefined
  val enabled: js.UndefOr[Boolean] = js.undefined
  val colors: js.UndefOr[js.Array[String]] = js.undefined
  val progressBackgroundColor: js.UndefOr[String] = js.undefined
  val progressViewOffset: js.UndefOr[Double] = js.undefined
  val size: js.UndefOr[RefreshControlSize] = js.undefined
}

@ScalaJSDefined
trait RefreshControlProps extends BaseRefreshControlProps with BaseViewProps with UniversalProps[RefreshControlM]

@ScalaJSDefined
trait RefreshControlPropsVal extends BaseRefreshControlPropsVal with BaseViewPropsVal with UniversalPropsVal[RefreshControlM]



@js.native
trait RefreshControlSize extends js.Object

object RefreshControlSize {
  val DEFAULT =  RefreshControlClass.SIZE.DEFAULT.asInstanceOf[RefreshControlSize]
  val LARGE =  RefreshControlClass.SIZE.LARGE.asInstanceOf[RefreshControlSize]
}