package sri.universal.components

import sri.core.{JSComponent, ReactClass, ReactElement, _}
import scalajsplus.macros.{FunctionObjectMacro,exclude,rename}
import scalajsplus.{ OptDefault => NoValue, OptionalParam => OP}
import sri.universal.apis.LayoutEvent
import sri.universal.{MergeJSObjects, ReactEvent}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.{undefined, |, UndefOr => U}

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

trait ListItemLayout extends js.Object {
  val length: Double
  val offset: Int
  val index: Int
}

trait OnEndReachedInfo extends js.Object {
  val distanceFromEnd: Double
}

trait ViewToken[I] extends js.Object {
  val item: I
  val key: String
  val index: U[Int]
  val isViewable: Boolean
  val section: U[Any]
}

trait ListItem[I] extends js.Object {
  val item: I
  val index: Int
}

trait OnViewableItemsChanged[I] extends js.Object {
  val viewableItems: js.Array[ViewToken[I]]
  val changed: js.Array[ViewToken[I]]
}

trait ViewabilityConfig extends js.Object {
  val minimumViewTime: U[Double] = undefined
  val viewAreaCoveragePercentThreshold: U[Double] = undefined
  val itemVisiblePercentThreshold: U[Double] = undefined
  val waitForInteraction: U[Boolean] = undefined

}

trait ScrollToEndParams extends js.Object {
  val animated: U[Boolean] = undefined
}

trait ScrollToIndexParams extends ScrollToEndParams {
  val viewPosition: U[Double] = undefined
  val index: Int
}

trait ScrollToItemParams extends ScrollToEndParams {
  val item: Any
  val viewPosition: U[Int] = undefined
}

trait ScrollToOffsetParams extends ScrollToEndParams {
  val offset: Int
}

trait VirtualizedListProps[D, I] extends js.Object {
  val ListFooterComponent: U[js.Function0[ReactElement]] = undefined
  val ListHeaderComponent: U[js.Function0[ReactElement]] = undefined
  val ItemSeparatorComponent: U[js.Function0[ReactElement]] = undefined
  val debug: U[Boolean] = undefined
  val data: U[D] = undefined
  val extraData: U[js.Any] = undefined
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

trait SectionBase[I] extends js.Object {
  val data: js.Array[I]
  val key: U[String] = undefined
  val renderItem: U[js.Function1[ListItem[I], ReactElement]] = undefined
  val SeparatorComponent: U[js.Function0[ReactElement]] = undefined
  val keyExtractor: U[js.Function1[I, String]] = undefined
}

trait SectionItem[I] extends js.Object {
  val section: SectionBase[I]
}

trait VirtualizedSectionListProps[D, I] extends VirtualizedListProps[D, I] {
  val sections: U[js.Array[SectionBase[I]]] = undefined
  val enableVirtualization: U[Boolean] = undefined
  val stickySectionHeadersEnabled: U[Boolean] = undefined
  val SectionSeparatorComponent: U[js.Function0[ReactElement]] = undefined
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
  def flashScrollIndicators(): Unit = js.native
}

trait FlatListProps[I] extends VirtualizedListProps[js.Array[I], I]

@js.native
@JSImport("react-native", "SectionList")
object SectionListComponent extends JSComponent[SectionListProps[_]] {
  def scrollToEnd(params: ScrollToEndParams): Unit = js.native
  def scrollToIndex(params: ScrollToIndexParams): Unit = js.native
  def scrollToItem(params: ScrollToItemParams): Unit = js.native
  def scrollToOffset(params: ScrollToEndParams): Unit = js.native
  def recordInteraction(): Unit = js.native
  def flashScrollIndicators(): Unit = js.native
}

trait SectionListProps[I] extends VirtualizedSectionListProps[js.Array[I], I]

object VirtualizedList {

  @inline
  def apply[D, I](
      style: OP[js.Any] = NoValue,
      data: D,
      ListFooterComponent: OP[() => ReactElement] = NoValue,
      ListHeaderComponent: OP[() => ReactElement] = NoValue,
      ItemSeparatorComponent: OP[() => ReactElement] = NoValue,
      debug: OP[Boolean] = NoValue,
      legacyImplementation: OP[Boolean] = NoValue,
      horizontal: OP[Boolean] = NoValue,
      initialNumToRender: OP[Int] = NoValue,
      maxToRenderPerBatch: OP[Int] = NoValue,
      extraData: OP[js.Any] = NoValue,
      windowSize: OP[Int] = NoValue,
      updateCellsBatchingPeriod: OP[Int] = NoValue,
      onEndReachedThreshold: OP[Int] = NoValue,
      viewabilityConfig: OP[ViewabilityConfig] = NoValue,
      disableVirtualization: OP[Boolean] = NoValue,
      refreshing: OP[Boolean] = NoValue,
      removeClippedSubviews: OP[Boolean] = NoValue,
      onEndReached: OP[OnEndReachedInfo] = NoValue,
      getItem: (D, Int) => I,
      getItemCount: (D) => Int,
      onViewableItemsChanged: OP[(OnViewableItemsChanged[I]) => Unit] = NoValue,
      onLayout: OP[(ReactEvent[LayoutEvent]) => _] = NoValue,
      renderItem: (ListItem[I]) => ReactElement,
      renderScrollComponent: OP[(js.Object) => ReactElement] = NoValue,
      onRefresh: OP[() => _] = NoValue,
      keyExtractor: OP[(I, Int) => String] = NoValue,
      getItemLayout: OP[(D, Int) => ListItemLayout] = NoValue,
      @exclude extraProps: OP[VirtualizedListProps[D, I]] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[VirtualizedListComponent.type, Unit] = null)
    : ReactElement { type Instance = VirtualizedListComponent.type } = {
    implicit def dataTOAny(in: D): js.Any = in.asInstanceOf[js.Any]

    val props = FunctionObjectMacro()
    extraProps.foreach(v => {
      MergeJSObjects(props, v)
    })
    CreateElementJSNoInline[VirtualizedListComponent.type](
      VirtualizedListComponent,
      props.asInstanceOf[VirtualizedListProps[_, _]],
      key,
      ref)
  }
}

object FlatList {

  @inline
  def apply[I](
      style: OP[js.Any] = NoValue,
      data: js.Array[I],
      ListFooterComponent: OP[() => ReactElement] = NoValue,
      ListHeaderComponent: OP[() => ReactElement] = NoValue,
      ItemSeparatorComponent: OP[() => ReactElement] = NoValue,
      debug: OP[Boolean] = NoValue,
      horizontal: OP[Boolean] = NoValue,
      legacyImplementation: OP[Boolean] = NoValue,
      initialNumToRender: OP[Int] = NoValue,
      maxToRenderPerBatch: OP[Int] = NoValue,
      ListEmptyComponent: OP[ReactElement | ComponentConstructor] = NoValue,
      windowSize: OP[Int] = NoValue,
      extraData: OP[js.Any] = NoValue,
      updateCellsBatchingPeriod: OP[Int] = NoValue,
      onEndReachedThreshold: OP[Int] = NoValue,
      viewabilityConfig: OP[ViewabilityConfig] = NoValue,
      disableVirtualization: OP[Boolean] = NoValue,
      refreshing: OP[Boolean] = NoValue,
      removeClippedSubviews: OP[Boolean] = NoValue,
      onEndReached: OP[OnEndReachedInfo] = NoValue,
      getItem: OP[(js.Array[I], Int) => I] = NoValue,
      getItemCount: OP[(js.Array[I]) => Int] = NoValue,
      onViewableItemsChanged: OP[(OnViewableItemsChanged[I]) => Unit] = NoValue,
      onLayout: OP[(ReactEvent[LayoutEvent]) => _] = NoValue,
      renderItem: (ListItem[I]) => ReactElement,
      renderScrollComponent: OP[(js.Object) => ReactElement] = NoValue,
      onRefresh: OP[() => _] = NoValue,
      keyExtractor: OP[(I, Int) => String] = NoValue,
      getItemLayout: OP[(js.Array[I], Int) => ListItemLayout] = NoValue,
      @exclude extraProps: OP[FlatListProps[I]] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[FlatListComponent.type, Unit] = null)
    : ReactElement { type Instance = FlatListComponent.type } = {
    import scalajsplus.DangerousUnionToJSAnyImplicit._
    val props = FunctionObjectMacro()
    extraProps.foreach(v => {
      MergeJSObjects(props, v)
    })
    CreateElementJSNoInline[FlatListComponent.type](
      FlatListComponent,
      props.asInstanceOf[FlatListProps[I]],
      key,
      ref)
  }

}

object SectionList {

  @inline
  def apply[I](
      style: OP[js.Any] = NoValue,
      ListFooterComponent: OP[() => ReactElement] = NoValue,
      ListHeaderComponent: OP[() => ReactElement] = NoValue,
      ItemSeparatorComponent: OP[() => ReactElement] = NoValue,
      SectionSeparatorComponent: OP[() => ReactElement] = NoValue,
      debug: OP[Boolean] = NoValue,
      legacyImplementation: OP[Boolean] = NoValue,
      horizontal: OP[Boolean] = NoValue,
      initialNumToRender: OP[Int] = NoValue,
      maxToRenderPerBatch: OP[Int] = NoValue,
      windowSize: OP[Int] = NoValue,
      updateCellsBatchingPeriod: OP[Int] = NoValue,
      onEndReachedThreshold: OP[Int] = NoValue,
      viewabilityConfig: OP[ViewabilityConfig] = NoValue,
      disableVirtualization: OP[Boolean] = NoValue,
      refreshing: OP[Boolean] = NoValue,
      removeClippedSubviews: OP[Boolean] = NoValue,
      stickySectionHeadersEnabled: OP[Boolean] = NoValue,
      onEndReached: OP[OnEndReachedInfo] = NoValue,
      getItem: OP[(js.Array[I], Int) => I] = NoValue,
      getItemCount: OP[(js.Array[I]) => Int] = NoValue,
      onViewableItemsChanged: OP[(OnViewableItemsChanged[I]) => Unit] = NoValue,
      onLayout: OP[(ReactEvent[LayoutEvent]) => _] = NoValue,
      renderItem: (ListItem[I]) => ReactElement,
      renderSectionHeader: (SectionItem[I]) => ReactElement,
      sections: js.Array[SectionBase[I]],
      renderScrollComponent: OP[(js.Object) => ReactElement] = NoValue,
      onRefresh: OP[() => _] = NoValue,
      keyExtractor: OP[(I, Int) => String] = NoValue,
      getItemLayout: OP[(js.Array[I], Int) => ListItemLayout] = NoValue,
      @exclude extraProps: OP[SectionListProps[I]] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[SectionListComponent.type, Unit] = null)
    : ReactElement { type Instance = SectionListComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => {
      MergeJSObjects(props, v)
    })
    CreateElementJSNoInline[SectionListComponent.type](
      SectionListComponent,
      props.asInstanceOf[SectionListProps[I]],
      key,
      ref)
  }

}
