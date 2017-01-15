package sri.universal.components

import sri.core.{ReactClass, ReactElement}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}


@js.native
@JSImport("react-native", "SwipeableListView")
object SwipeableListViewClass extends ReactClass {
  def SwipeableListView[R, H](): SwipeableListViewDataSource[R, H] = js.native

}


@ScalaJSDefined
trait BaseSwipeableListViewProps[R, H] extends js.Object {
  var bounceFirstRowOnMount: Boolean
  var dataSource: SwipeableListViewDataSource[R, H]
  var maxSwipeDistance: Double | js.Function
  var renderRow: js.Function4[R, String | Int, String | Int, js.Function2[String | Int, String | Int, Unit], ReactElement]
  var renderQuickActions: js.Function
}

@ScalaJSDefined
trait BaseSwipeableListViewPropsVal[R, H] extends js.Object {
  val bounceFirstRowOnMount: Boolean
  val dataSource: SwipeableListViewDataSource[R, H]
  val maxSwipeDistance: Double | js.Function
  val renderRow: js.Function4[R, String | Int, String | Int, js.Function2[String | Int, String | Int, Unit], ReactElement]
  val renderQuickActions: js.Function
}

@ScalaJSDefined
trait SwipeableListViewProps[R, H] extends BaseSwipeableListViewProps[R, H] with BaseScrollViewProps with UniversalProps[SwipeableListViewM]

@ScalaJSDefined
trait SwipeableListViewPropsVal[R, H] extends BaseSwipeableListViewPropsVal[R, H] with BaseScrollViewPropsVal with UniversalPropsVal[SwipeableListViewM]


@js.native
trait SwipeableListViewM extends ScrollViewM {

  def getScrollResponder(): ScrollViewM = js.native

}