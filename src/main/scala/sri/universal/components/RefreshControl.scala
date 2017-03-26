package sri.universal.components

import sri.core.JSComponent

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}
import scala.scalajs.js.{UndefOr => U}

@js.native
@JSImport("react-native", "RefreshControl")
object RefreshControlComponent extends JSComponent[RefreshControlProps] {
  val SIZE: js.Dynamic = js.native
}

@ScalaJSDefined
trait RefreshControlProps extends ViewProps {
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

@js.native
trait RefreshControlSize extends js.Object

object RefreshControlSize {
  @inline def DEFAULT =
    RefreshControlComponent.SIZE.DEFAULT.asInstanceOf[RefreshControlSize]
  @inline def LARGE =
    RefreshControlComponent.SIZE.LARGE.asInstanceOf[RefreshControlSize]
}
