package sri.universal.components

import sri.core.{JSComponent, ReactClass, ReactElement}
import sri.universal.ReactEvent
import sri.universal.apis.LayoutEvent

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}
import scala.scalajs.js.{undefined, UndefOr => U}

@js.native
@JSImport("react-native", "VirtualizedList")
object VirtualizedListComponent
    extends JSComponent[VirtualizedListProps[_, _]] {
  def scrollToEnd(params: ScrollToEndParams): Unit = js.native
  def scrollToIndex(params: ScrollToIndexParams): Unit = js.native
  def scrollToItem(params: ScrollToItemParams): Unit = js.native
  def scrollToOffset(params: ScrollToEndParams): Unit = js.native
  def recordInteraction(): Unit = js.native

}

@ScalaJSDefined
trait ListItemLayout extends js.Object {
  val length: Double
  val offset: Int
  val index: Int
}

@ScalaJSDefined
trait OnEndReachedInfo extends js.Object {
  val distanceFromEnd: Double
}

@ScalaJSDefined
trait ViewToken[I] extends js.Object {
  val item: I
  val key: String
  val index: U[Int]
  val isViewable: Boolean
  val section: U[Any]
}

@ScalaJSDefined
trait ListItem[I] extends js.Object {
  val item: I
  val index: Int
}

@ScalaJSDefined
trait OnViewableItemsChanged[I] extends js.Object {
  val viewableItems: js.Array[ViewToken[I]]
  val changed: js.Array[ViewToken[I]]
}

@ScalaJSDefined
trait ViewabilityConfig extends js.Object {
  val minimumViewTime: U[Double] = undefined
  val viewAreaCoveragePercentThreshold: U[Double] = undefined
  val itemVisiblePercentThreshold: U[Double] = undefined
  val waitForInteraction: U[Boolean] = undefined

}

@ScalaJSDefined
trait ScrollToEndParams extends js.Object {
  val animated: U[Boolean] = undefined
}

@ScalaJSDefined
trait ScrollToIndexParams extends ScrollToEndParams {
  val viewPosition: U[Double] = undefined
  val index: Int
}

@ScalaJSDefined
trait ScrollToItemParams extends ScrollToEndParams {
  val item: Any
  val viewPosition: U[Int] = undefined
}

@ScalaJSDefined
trait ScrollToOffsetParams extends ScrollToEndParams {
  val offset: Int
}

@ScalaJSDefined
trait VirtualizedListProps[D, I] extends js.Object {
  val ListFooterComponent: U[js.Function0[ReactElement]] = undefined
  val ListHeaderComponent: U[js.Function0[ReactElement]] = undefined
  val ItemSeparatorComponent: U[js.Function0[ReactElement]] = undefined
  val debug: U[Boolean] = undefined
  val data: U[D] = undefined
  val horizontal: U[Boolean] = undefined
  val initialNumToRender: U[Int] = undefined
  val maxToRenderPerBatch: U[Int] = undefined
  val windowSize: U[Int] = undefined
  val updateCellsBatchingPeriod: U[Int] = undefined
  val onEndReachedThreshold: U[Int] = undefined
  val viewabilityConfig: U[ViewabilityConfig] = undefined
  val disableVirtualization: U[Boolean] = undefined
  val refreshing: U[Boolean] = undefined
  val removeClippedSubviews: U[Boolean] = undefined
  val onEndReached: U[OnEndReachedInfo] = undefined
  val getItem: U[js.Function2[D, Int, I]] = undefined
  val shouldItemUpdate: U[
    js.Function2[ListItem[I] /*previous*/, ListItem[I] /*next*/, Boolean]] =
    undefined
  val getItemCount: U[js.Function1[D, Int]] = undefined
  val onViewableItemsChanged
    : U[js.Function1[OnViewableItemsChanged[I], Unit]] =
    undefined
  val onLayout: U[js.Function1[ReactEvent[LayoutEvent], _]] = undefined
  val renderItem: U[js.Function1[ListItem[I], ReactElement]] = undefined
  val renderScrollComponent: U[js.Function1[js.Object, ReactElement]] =
    undefined
  val onRefresh: U[js.Function0[_]] = undefined
  val keyExtractor: U[js.Function2[I, Int, String]] = undefined
  val getItemLayout: U[js.Function2[D, Int, ListItemLayout]] =
    undefined
}

@js.native
@JSImport("react-native", "VirtualizedSectionList")
object VirtualizedSectionListClass extends ReactClass {
  override type PropsType = VirtualizedSectionListProps[_, _]
  def scrollToEnd(params: ScrollToEndParams): Unit = js.native
  def scrollToIndex(params: ScrollToIndexParams): Unit = js.native
  def scrollToItem(params: ScrollToItemParams): Unit = js.native
  def scrollToOffset(params: ScrollToEndParams): Unit = js.native
  def recordInteraction(): Unit = js.native
}

@ScalaJSDefined
trait SectionBase[I] extends js.Object {
  val data: js.Array[I]
  val key: String
  val renderItem: U[js.Function1[ListItem[I], ReactElement]] = undefined
  val SeparatorComponent: U[js.Function0[ReactElement]] = undefined
  val keyExtractor: U[js.Function1[I, String]] = undefined
}

@ScalaJSDefined
trait SectionItem[I] extends js.Object {
  val section: SectionBase[I]
}

@ScalaJSDefined
trait VirtualizedSectionListProps[D, I] extends VirtualizedListProps[D, I] {
  val sections: U[js.Array[SectionBase[I]]] = undefined
  val enableVirtualization: U[Boolean] = undefined
  val ListFooterComponent: U[js.Function0[ReactElement]] = undefined
  val ListHeaderComponent: U[js.Function0[ReactElement]] = undefined
  val SectionSeparatorComponent: U[js.Function0[ReactElement]] = undefined
  val ItemSeparatorComponent: U[js.Function0[ReactElement]] = undefined
  val renderSectionHeader: U[js.Function1[SectionItem[I], ReactElement]] =
    undefined
}

@js.native
@JSImport("react-native", "FlatList")
object FlatListComponent extends JSComponent[FlatListProps[_]] {
  def scrollToEnd(params: ScrollToEndParams): Unit = js.native
  def scrollToIndex(params: ScrollToIndexParams): Unit = js.native
  def scrollToItem(params: ScrollToItemParams): Unit = js.native
  def scrollToOffset(params: ScrollToEndParams): Unit = js.native
  def recordInteraction(): Unit = js.native
}

@ScalaJSDefined
trait FlatListProps[I] extends VirtualizedListProps[js.Array[I], I]

@js.native
@JSImport("react-native", "SectionList")
object SectionListComponent extends JSComponent[SectionListProps[_]] {
  def scrollToEnd(params: ScrollToEndParams): Unit = js.native
  def scrollToIndex(params: ScrollToIndexParams): Unit = js.native
  def scrollToItem(params: ScrollToItemParams): Unit = js.native
  def scrollToOffset(params: ScrollToEndParams): Unit = js.native
  def recordInteraction(): Unit = js.native
}

@ScalaJSDefined
trait SectionListProps[I] extends VirtualizedSectionListProps[js.Array[I], I]
