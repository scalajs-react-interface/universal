package sri.universal.components

import sri.core._
import sri.universal.ReactEvent

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}
import scala.scalajs.js.{UndefOr => U}


@js.native
@JSImport("react-native","WindowedListView")
object WindowedListViewClass extends ReactClass

@ScalaJSDefined
trait BaseWindowedListViewProps[T] extends js.Object {
  var data: js.Array[T]
  var renderRow: js.Function4[T, Int, Int, String,ReactElement]
  var renderWindowBoundaryIndicator: js.UndefOr[js.Function0[ReactElement]] = js.undefined
  var renderFooter: js.UndefOr[js.Function0[ReactElement]] = js.undefined
  var onScroll: js.UndefOr[js.Function1[ReactEvent[js.Object],_]] = js.undefined
  var onVisibleRowsChanged: js.UndefOr[js.Function2[Int, Int,_]] = js.undefined
  var onViewableRowsChanged: js.UndefOr[js.Function1[js.Array[Int],_]] = js.undefined
  var viewablePercentThreshold: js.UndefOr[Double] = js.undefined
  var initialNumToRender: js.UndefOr[Int] = js.undefined
  var maxNumToRender: js.UndefOr[Int] = js.undefined
  var numToRenderAhead: js.UndefOr[Int] = js.undefined
  var recomputeRowsBatchingPeriod: js.UndefOr[Int] = js.undefined
  var renderScrollComponent: js.UndefOr[js.Function1[js.Object,ReactElement]] = js.undefined
  var enableDangerousRecycling: js.UndefOr[Boolean] = js.undefined
  var disableIncrementalRendering: js.UndefOr[Boolean] = js.undefined
  var asyncRowPerfEventName: js.UndefOr[String] = js.undefined
}

@ScalaJSDefined
trait BaseWindowedListViewPropsVal[T] extends js.Object {
  val data: js.Array[T]
  var renderRow: js.Function4[T, Int, Int, String,ReactElement]
  val renderWindowBoundaryIndicator: js.UndefOr[js.Function0[ReactElement]] = js.undefined
  val renderFooter: js.UndefOr[js.Function0[ReactElement]] = js.undefined
  val onScroll: js.UndefOr[js.Function1[ReactEvent[js.Object],_]] = js.undefined
  val onVisibleRowsChanged: js.UndefOr[js.Function2[Int, Int,_]] = js.undefined
  val onViewableRowsChanged: js.UndefOr[js.Function1[js.Array[Int],_]] = js.undefined
  val viewablePercentThreshold: js.UndefOr[Double] = js.undefined
  val initialNumToRender: js.UndefOr[Int] = js.undefined
  val maxNumToRender: js.UndefOr[Int] = js.undefined
  val numToRenderAhead: js.UndefOr[Int] = js.undefined
  val recomputeRowsBatchingPeriod: js.UndefOr[Int] = js.undefined
  val renderScrollComponent: js.UndefOr[js.Function1[js.Object,ReactElement]] = js.undefined
  val enableDangerousRecycling: js.UndefOr[Boolean] = js.undefined
  val disableIncrementalRendering: js.UndefOr[Boolean] = js.undefined
  val asyncRowPerfEventName: js.UndefOr[String] = js.undefined
}

@ScalaJSDefined
trait WindowedListViewProps[T] extends BaseWindowedListViewProps[T]  with UniversalProps[WindowedListViewM]

@ScalaJSDefined
trait WindowedListViewPropsVal[T] extends BaseWindowedListViewPropsVal[T]  with UniversalPropsVal[WindowedListViewM]



@js.native
trait WindowedListViewM extends js.Object