package sri.universal.components

import sri.core._
import sri.macros.{
  FunctionObjectMacro,
  exclude,
  rename,
  OptDefault => NoValue,
  OptionalParam => U
}
import sri.universal.apis.{
  AnimatedImageComponent,
  AnimatedTextComponent,
  AnimatedViewComponent,
  LayoutEvent
}
import sri.universal.{MergeJSObjects, ReactEvent, TextInputEvent}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.|
trait UniversalComponents {

  @inline
  def View(style: U[js.Any] = NoValue,
           onLayout: U[LayoutEvent => _] = NoValue,
           @exclude extraProps: U[ViewProps] = NoValue,
           @exclude key: String | Int = null,
           @exclude ref: js.Function1[ViewComponent.type, Unit] = null)(
      children: ReactNode*)
    : ReactElement { type Instance = ViewComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[ViewComponent.type](ViewComponent,
                                        props.asInstanceOf[ViewProps],
                                        key,
                                        ref,
                                        children.toJSArray)
  }

  @inline
  def View(children: ReactNode*) =
    CreateElementJS[ViewComponent.type](ViewComponent,
                                        json().asInstanceOf[ViewProps],
                                        children = children.toJSArray)

  @inline
  def AnimatedView(
      style: U[js.Any] = NoValue,
      @exclude extraProps: U[ViewProps] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[AnimatedViewComponent.type, Unit] = null)(
      children: ReactNode*)
    : ReactElement { type Instance = AnimatedViewComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[AnimatedViewComponent.type](AnimatedViewComponent,
                                                props.asInstanceOf[ViewProps],
                                                key,
                                                ref,
                                                children.toJSArray)
  }

  @inline
  def AnimatedView(children: ReactNode*) =
    CreateElementJS[AnimatedViewComponent.type](AnimatedViewComponent,
                                                json().asInstanceOf[ViewProps],
                                                children = children.toJSArray)

  @inline
  def ActivityIndicator(
      style: U[js.Any] = NoValue,
      size: U[ActivityIndicatorSize] = NoValue,
      animating: U[Boolean] = NoValue,
      color: U[String] = NoValue,
      @exclude extraProps: U[ActivityIndicatorProps] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[ActivityIndicatorComponent.type, Unit] = null)
    : ReactElement { type Instance = ActivityIndicatorComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[ActivityIndicatorComponent.type](
      ActivityIndicatorComponent,
      props.asInstanceOf[ActivityIndicatorProps],
      key,
      ref)
  }

  @inline
  def Button(style: U[js.Any] = NoValue,
             accessibilityLabel: U[String] = NoValue,
             color: U[String] = NoValue,
             disabled: U[Boolean] = NoValue,
             title: String,
             onPress: () => _,
             @exclude extraProps: U[ButtonProps] = NoValue,
             @exclude key: String | Int = null,
             @exclude ref: js.Function1[ButtonComponent.type, Unit] = null)
    : ReactElement { type Instance = ButtonComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[ButtonComponent.type](ButtonComponent,
                                          props.asInstanceOf[ButtonProps],
                                          key,
                                          ref)
  }

  @inline
  def Image(style: U[js.Any] = NoValue,
            onLayout: U[LayoutEvent => _] = NoValue,
            @exclude extraProps: U[ImageProps] = NoValue,
            source: U[ImageSource] = NoValue,
            resizeMode: U[ImageResizeMode] = NoValue,
            @rename("source") sourceDynamic: U[js.Any] = NoValue,
            @exclude key: String | Int = null,
            @exclude ref: js.Function1[ImageComponent.type, Unit] = null)
    : ReactElement { type Instance = ImageComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[ImageComponent.type](ImageComponent,
                                         props.asInstanceOf[ImageProps],
                                         key,
                                         ref)
  }

  @inline
  def ImageC(style: U[js.Any] = NoValue,
             @exclude extraProps: U[ImageProps] = NoValue,
             source: U[ImageSource] = NoValue,
             resizeMode: U[ImageResizeMode] = NoValue,
             @rename("source") sourceDynamic: U[js.Any] = NoValue,
             @exclude key: String | Int = null,
             @exclude ref: js.Function1[ImageComponent.type, Unit] = null)(
      children: ReactNode*)
    : ReactElement { type Instance = ImageComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[ImageComponent.type](ImageComponent,
                                         props.asInstanceOf[ImageProps],
                                         key,
                                         ref,
                                         children = children.toJSArray)
  }

  @inline
  def AnimatedImage(
      style: U[js.Any] = NoValue,
      @exclude extraProps: U[ImageProps] = NoValue,
      source: U[ImageSource] = NoValue,
      resizeMode: U[ImageResizeMode] = NoValue,
      @rename("source") sourceDynamic: U[js.Any] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[AnimatedImageComponent.type, Unit] = null)
    : ReactElement { type Instance = AnimatedImageComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[AnimatedImageComponent.type](
      AnimatedImageComponent,
      props.asInstanceOf[ImageProps],
      key,
      ref)
  }

  @inline
  def AnimatedImageC(
      style: U[js.Any] = NoValue,
      @exclude extraProps: U[ImageProps] = NoValue,
      source: U[ImageSource] = NoValue,
      resizeMode: U[ImageResizeMode] = NoValue,
      @rename("source") sourceDynamic: U[js.Any] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[AnimatedImageComponent.type, Unit] = null)(
      children: ReactNode*)
    : ReactElement { type Instance = AnimatedImageComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[AnimatedImageComponent.type](
      AnimatedImageComponent,
      props.asInstanceOf[ImageProps],
      key,
      ref,
      children = children.toJSArray)
  }

  @inline
  def KeyboardAvoidingView(
      style: U[js.Any] = NoValue,
      behavior: U[KeyboardAvoidingViewBehaviour] = NoValue,
      @exclude extraProps: U[KeyboardAvoidingViewProps] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[KeyboardAvoidingViewComponent.type, Unit] =
        null)(children: ReactNode*)
    : ReactElement { type Instance = KeyboardAvoidingViewComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[KeyboardAvoidingViewComponent.type](
      KeyboardAvoidingViewComponent,
      props.asInstanceOf[KeyboardAvoidingViewProps],
      key,
      ref,
      children.toJSArray)
  }

  @inline
  def KeyboardAvoidingView(children: ReactNode*) =
    CreateElementJS[KeyboardAvoidingViewComponent.type](
      KeyboardAvoidingViewComponent,
      json().asInstanceOf[KeyboardAvoidingViewProps],
      children = children.toJSArray)

  @inline
  def ScrollView(
      style: U[js.Any] = NoValue,
      contentInset: U[ContentInset] = NoValue,
      @exclude extraProps: U[ScrollViewProps] = NoValue,
      @exclude key: String | Int = null,
      pagingEnabled: U[Boolean] = NoValue,
      scrollEventThrottle: U[Double] = NoValue,
      onScroll: U[ReactEvent[ScrollEvent] => _] = NoValue,
      refreshControl: U[ReactElement] = NoValue,
      keyboardDismissMode: U[ScrollViewKeyboardDismissMode] = NoValue,
      keyboardShouldPersistTaps: U[ScrollViewKeyboardPersistTaps] = NoValue,
      horizontal: U[Boolean] = NoValue,
      @exclude ref: js.Function1[ScrollViewComponent.type, Unit] = null)(
      children: ReactNode*)
    : ReactElement { type Instance = ScrollViewComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[ScrollViewComponent.type](
      ScrollViewComponent,
      props.asInstanceOf[ScrollViewProps],
      key,
      ref,
      children.toJSArray)
  }

  @inline
  def ScrollView(children: ReactNode*) =
    CreateElementJS[ScrollViewComponent.type](
      ScrollViewComponent,
      json().asInstanceOf[ScrollViewProps],
      children = children.toJSArray)

  @inline
  def ListView[R, H](
      renderSectionHeader: U[(H, String) => ReactElement] = NoValue,
      @exclude extraProps: U[ListViewProps[R, H]] = NoValue,
      renderFooter: U[() => ReactElement] = NoValue,
      renderSeparator: U[(String, String, Boolean) => ReactElement] = NoValue,
      style: U[js.Any] = NoValue,
      pageSize: U[Int] = NoValue,
      initialListSize: U[Int] = NoValue,
      scrollRenderAheadDistance: U[Double] = NoValue,
      renderRow: U[
        (R,
         String | Int,
         String | Int,
         js.Function2[String | Int, String | Int, _]) => ReactElement] =
        NoValue,
      dataSource: U[ListViewDataSource[R, H]] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[ListViewComponent.type, Unit] = null)
    : ReactElement { type Instance = ListViewComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })

    CreateElementJSNoInline[ListViewComponent.type](
      ListViewComponent,
      props.asInstanceOf[ListViewProps[R, H]],
      key = key,
      ref = ref)
      .asInstanceOf[ReactElement { type Instance = ListViewComponent.type }]
  }

  @inline
  def Modal(style: U[js.Any] = NoValue,
            animationType: U[ModalAnimationType] = NoValue,
            transparent: U[Boolean] = NoValue,
            visible: U[Boolean] = NoValue,
            @exclude extraProps: U[ModalProps] = NoValue,
            @exclude key: String | Int = null,
            @exclude ref: js.Function1[ModalComponent.type, Unit] = null)(
      children: ReactNode*)
    : ReactElement { type Instance = ModalComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[ModalComponent.type](ModalComponent,
                                         props.asInstanceOf[ModalProps],
                                         key,
                                         ref,
                                         children.toJSArray)
  }

  @inline
  def Modal(children: ReactNode*) =
    CreateElementJS[ModalComponent.type](ModalComponent,
                                         json().asInstanceOf[ModalProps],
                                         children = children.toJSArray)

  @inline
  def Picker[T](style: U[js.Any] = NoValue,
                selectedValue: U[T] = NoValue,
                onValueChange: U[(T, Int) => _] = NoValue,
                @exclude extraProps: U[PickerProps[T]] = NoValue,
                @exclude key: String | Int = null,
                @exclude ref: js.Function1[PickerComponent.type, Unit] = null)(
      children: ReactNode*)
    : ReactElement { type Instance = PickerComponent.type } = {
    implicit def toToAny(t: T): js.Any = t.asInstanceOf[js.Any]
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[PickerComponent.type](PickerComponent,
                                          props.asInstanceOf[PickerProps[T]],
                                          key,
                                          ref,
                                          children.toJSArray)
  }

  @inline
  def Picker(children: ReactNode*) =
    CreateElementJS[PickerComponent.type](PickerComponent,
                                          json().asInstanceOf[PickerProps[_]],
                                          children = children.toJSArray)

  @inline
  def PickerItem[T](
      style: U[js.Any] = NoValue,
      value: U[T] = NoValue,
      label: U[String] = NoValue,
      @exclude extraProps: U[PickerItemProps[T]] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[PickerItemComponent.type, Unit] = null)
    : ReactElement { type Instance = PickerItemComponent.type } = {
    implicit def toToAny(t: T): js.Any = t.asInstanceOf[js.Any]
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[PickerItemComponent.type](
      PickerItemComponent,
      props.asInstanceOf[PickerItemProps[T]],
      key,
      ref)
  }

  @inline
  def Slider(style: U[js.Any] = NoValue,
             value: U[Double] = NoValue,
             onValueChange: U[Double => _] = NoValue,
             @exclude extraProps: U[SliderProps] = NoValue,
             @exclude key: String | Int = null,
             @exclude ref: js.Function1[SliderComponent.type, Unit] = null)
    : ReactElement { type Instance = SliderComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[SliderComponent.type](SliderComponent,
                                          props.asInstanceOf[SliderProps],
                                          key,
                                          ref)
  }

  @inline
  def Switch(style: U[js.Any] = NoValue,
             value: U[Boolean] = NoValue,
             disabled: U[Boolean] = NoValue,
             tintColor: U[String] = NoValue,
             onTintColor: U[String] = NoValue,
             onValueChange: U[Boolean => _] = NoValue,
             @exclude extraProps: U[SwitchProps] = NoValue,
             @exclude key: String | Int = null,
             @exclude ref: js.Function1[SwitchComponent.type, Unit] = null)
    : ReactElement { type Instance = SwitchComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[SwitchComponent.type](SwitchComponent,
                                          props.asInstanceOf[SwitchProps],
                                          key,
                                          ref)
  }

  @inline
  def Text(style: U[js.Any] = NoValue,
           onPress: U[() => _] = NoValue,
           onLayout: U[LayoutEvent => _] = NoValue,
           numberOfLines: U[Int] = NoValue,
           @exclude extraProps: U[TextProps] = NoValue,
           @exclude key: String | Int = null,
           @exclude ref: js.Function1[TextComponent.type, Unit] = null)(
      children: ReactNode*)
    : ReactElement { type Instance = TextComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[TextComponent.type](TextComponent,
                                        props.asInstanceOf[TextProps],
                                        key,
                                        ref,
                                        children.toJSArray)
  }

  @inline
  def Text(children: ReactNode*) =
    CreateElementJS[TextComponent.type](TextComponent,
                                        json().asInstanceOf[TextProps],
                                        children = children.toJSArray)

  @inline
  def AnimatedText(
      style: U[js.Any] = NoValue,
      @exclude extraProps: U[TextProps] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[AnimatedTextComponent.type, Unit] = null)(
      children: ReactNode*)
    : ReactElement { type Instance = AnimatedTextComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[AnimatedTextComponent.type](AnimatedTextComponent,
                                                props.asInstanceOf[TextProps],
                                                key,
                                                ref,
                                                children.toJSArray)
  }

  @inline
  def AnimatedText(children: ReactNode*) =
    CreateElementJS[AnimatedTextComponent.type](AnimatedTextComponent,
                                                json().asInstanceOf[TextProps],
                                                children = children.toJSArray)

  @inline
  def TextInput(style: U[js.Any] = NoValue,
                autoCorrect: U[Boolean] = NoValue,
                autoFocus: U[Boolean] = NoValue,
                placeholder: U[String] = NoValue,
                value: U[String] = NoValue,
                underlineColorAndroid: U[String] = NoValue,
                autoCapitalize: U[TextInputAutoCapitalize] = NoValue,
                clearButtonMode: U[String] = NoValue,
                onFocus: U[ReactEvent[TextInputEvent] => _] = NoValue,
                onBlur: U[ReactEvent[TextInputEvent] => _] = NoValue,
                onChange: U[ReactEvent[TextInputEvent] => _] = NoValue,
                onChangeText: U[String => _] = NoValue,
                onEndEditing: U[ReactEvent[TextInputEvent] => _] = NoValue,
                onSubmitEditing: U[ReactEvent[TextInputEvent] => _] = NoValue,
                @exclude extraProps: U[TextInputProps] = NoValue,
                @exclude key: String | Int = null,
                @exclude ref: js.Function1[TextInputComponent.type, Unit] =
                  null)
    : ReactElement { type Instance = TextInputComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[TextInputComponent.type](
      TextInputComponent,
      props.asInstanceOf[TextInputProps],
      key,
      ref)
  }

  @inline
  def TextInputC(style: U[js.Any] = NoValue,
                 autoCorrect: U[Boolean] = NoValue,
                 autoFocus: U[Boolean] = NoValue,
                 placeholder: U[String] = NoValue,
                 autoCapitalize: U[TextInputAutoCapitalize] = NoValue,
                 clearButtonMode: U[String] = NoValue,
                 onFocus: U[ReactEvent[TextInputEvent] => _] = NoValue,
                 onBlur: U[ReactEvent[TextInputEvent] => _] = NoValue,
                 onChange: U[ReactEvent[TextInputEvent] => _] = NoValue,
                 onEndEditing: U[ReactEvent[TextInputEvent] => _] = NoValue,
                 onSubmitEditing: U[ReactEvent[TextInputEvent] => _] = NoValue,
                 @exclude extraProps: U[TextInputProps] = NoValue,
                 @exclude key: String | Int = null,
                 @exclude ref: js.Function1[TextInputComponent.type, Unit] =
                   null)(children: ReactNode*)
    : ReactElement { type Instance = TextInputComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[TextInputComponent.type](
      TextInputComponent,
      props.asInstanceOf[TextInputProps],
      key,
      ref,
      children.toJSArray)
  }

  @inline
  def TouchableWithoutFeedback(
      style: U[js.Any] = NoValue,
      onPress: U[() => _] = NoValue,
      onPressIn: U[() => _] = NoValue,
      onPressOut: U[() => _] = NoValue,
      onLongPress: U[() => _] = NoValue,
      @exclude extraProps: U[TouchableWithoutFeedbackProps] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[TouchableWithoutFeedbackComponent.type, Unit] =
        null)(children: ReactNode*): ReactElement {
    type Instance = TouchableWithoutFeedbackComponent.type
  } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[TouchableWithoutFeedbackComponent.type](
      TouchableWithoutFeedbackComponent,
      props.asInstanceOf[TouchableWithoutFeedbackProps],
      key,
      ref,
      children.toJSArray)
  }

  @inline
  def TouchableHighlight(
      style: U[js.Any] = NoValue,
      underlayColor: U[String] = NoValue,
      activeOpacity: U[Double] = NoValue,
      onPress: U[() => _] = NoValue,
      onHideUnderlay: U[() => _] = NoValue,
      onShowUnderlay: U[() => _] = NoValue,
      onPressIn: U[() => _] = NoValue,
      onPressOut: U[() => _] = NoValue,
      onLongPress: U[() => _] = NoValue,
      @exclude extraProps: U[TouchableHighlightProps] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[TouchableHighlightComponent.type, Unit] = null)(
      children: ReactNode*)
    : ReactElement { type Instance = TouchableHighlightComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[TouchableHighlightComponent.type](
      TouchableHighlightComponent,
      props.asInstanceOf[TouchableHighlightProps],
      key,
      ref,
      children.toJSArray)
  }

  @inline
  def TouchableOpacity(
      style: U[js.Any] = NoValue,
      @exclude extraProps: U[TouchableOpacityProps] = NoValue,
      onPress: U[() => _] = NoValue,
      onPressIn: U[() => _] = NoValue,
      onPressOut: U[() => _] = NoValue,
      onLongPress: U[() => _] = NoValue,
      activeOpacity: U[Double] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[TouchableOpacityComponent.type, Unit] = null)(
      children: ReactNode*)
    : ReactElement { type Instance = TouchableOpacityComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[TouchableOpacityComponent.type](
      TouchableOpacityComponent,
      props.asInstanceOf[TouchableOpacityProps],
      key,
      ref,
      children.toJSArray)
  }

  @inline
  def RefreshControl(
      style: U[js.Any] = NoValue,
      refreshing: U[Boolean] = NoValue,
      tintColor: U[String] = NoValue,
      onRefresh: U[() => _] = NoValue,
      title: U[String] = NoValue,
      progressBackgroundColor: U[String] = NoValue,
      colors: U[js.Array[String]] = NoValue,
      @exclude extraProps: U[RefreshControlProps] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[RefreshControlComponent.type, Unit] = null)
    : ReactElement { type Instance = RefreshControlComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[RefreshControlComponent.type](
      RefreshControlComponent,
      props.asInstanceOf[RefreshControlProps],
      key,
      ref)
  }

  @inline
  def VirtualizedList[D, I](
      style: U[js.Any] = NoValue,
      data: D,
      ListFooterComponent: U[() => ReactElement] = NoValue,
      ListHeaderComponent: U[() => ReactElement] = NoValue,
      ItemSeparatorComponent: U[() => ReactElement] = NoValue,
      debug: U[Boolean] = NoValue,
      legacyImplementation: U[Boolean] = NoValue,
      horizontal: U[Boolean] = NoValue,
      initialNumToRender: U[Int] = NoValue,
      maxToRenderPerBatch: U[Int] = NoValue,
      windowSize: U[Int] = NoValue,
      updateCellsBatchingPeriod: U[Int] = NoValue,
      onEndReachedThreshold: U[Int] = NoValue,
      viewabilityConfig: U[ViewabilityConfig] = NoValue,
      disableVirtualization: U[Boolean] = NoValue,
      refreshing: U[Boolean] = NoValue,
      removeClippedSubviews: U[Boolean] = NoValue,
      onEndReached: U[OnEndReachedInfo] = NoValue,
      getItem: (D, Int) => I,
      shouldItemUpdate: U[(ListItem[I] /*previous*/, ListItem[I]) => Boolean] =
        NoValue,
      getItemCount: (D) => Int,
      onViewableItemsChanged: U[(OnViewableItemsChanged[I]) => Unit] = NoValue,
      onLayout: U[(ReactEvent[LayoutEvent]) => _] = NoValue,
      renderItem: (ListItem[I]) => ReactElement,
      renderScrollComponent: U[(js.Object) => ReactElement] = NoValue,
      onRefresh: U[() => _] = NoValue,
      keyExtractor: U[(I, Int) => String] = NoValue,
      getItemLayout: U[(D, Int) => ListItemLayout] = NoValue,
      @exclude extraProps: U[VirtualizedListProps[D, I]] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[VirtualizedListComponent.type, Unit] = null)
    : ReactElement { type Instance = VirtualizedListComponent.type } = {
    implicit def dataTOAny(in: D): js.Any = in.asInstanceOf[js.Any]
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJSNoInline[VirtualizedListComponent.type](
      VirtualizedListComponent,
      props.asInstanceOf[VirtualizedListProps[_, _]],
      key,
      ref)
  }

  @inline
  def FlatList[I](
      style: U[js.Any] = NoValue,
      data: js.Array[I],
      ListFooterComponent: U[() => ReactElement] = NoValue,
      ListHeaderComponent: U[() => ReactElement] = NoValue,
      ItemSeparatorComponent: U[() => ReactElement] = NoValue,
      debug: U[Boolean] = NoValue,
      horizontal: U[Boolean] = NoValue,
      legacyImplementation: U[Boolean] = NoValue,
      initialNumToRender: U[Int] = NoValue,
      maxToRenderPerBatch: U[Int] = NoValue,
      windowSize: U[Int] = NoValue,
      updateCellsBatchingPeriod: U[Int] = NoValue,
      onEndReachedThreshold: U[Int] = NoValue,
      viewabilityConfig: U[ViewabilityConfig] = NoValue,
      disableVirtualization: U[Boolean] = NoValue,
      refreshing: U[Boolean] = NoValue,
      removeClippedSubviews: U[Boolean] = NoValue,
      onEndReached: U[OnEndReachedInfo] = NoValue,
      getItem: U[(js.Array[I], Int) => I] = NoValue,
      shouldItemUpdate: U[(ListItem[I] /*previous*/, ListItem[I]) => Boolean] =
        NoValue,
      getItemCount: U[(js.Array[I]) => Int] = NoValue,
      onViewableItemsChanged: U[(OnViewableItemsChanged[I]) => Unit] = NoValue,
      onLayout: U[(ReactEvent[LayoutEvent]) => _] = NoValue,
      renderItem: (ListItem[I]) => ReactElement,
      renderScrollComponent: U[(js.Object) => ReactElement] = NoValue,
      onRefresh: U[() => _] = NoValue,
      keyExtractor: U[(I, Int) => String] = NoValue,
      getItemLayout: U[(js.Array[I], Int) => ListItemLayout] = NoValue,
      @exclude extraProps: U[FlatListProps[I]] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[FlatListComponent.type, Unit] = null)
    : ReactElement { type Instance = FlatListComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJSNoInline[FlatListComponent.type](
      FlatListComponent,
      props.asInstanceOf[FlatListProps[I]],
      key,
      ref)
  }

  @inline
  def SectionList[I](
      style: U[js.Any] = NoValue,
      ListFooterComponent: U[() => ReactElement] = NoValue,
      ListHeaderComponent: U[() => ReactElement] = NoValue,
      ItemSeparatorComponent: U[() => ReactElement] = NoValue,
      SectionSeparatorComponent: U[() => ReactElement] = NoValue,
      debug: U[Boolean] = NoValue,
      legacyImplementation: U[Boolean] = NoValue,
      horizontal: U[Boolean] = NoValue,
      initialNumToRender: U[Int] = NoValue,
      maxToRenderPerBatch: U[Int] = NoValue,
      windowSize: U[Int] = NoValue,
      updateCellsBatchingPeriod: U[Int] = NoValue,
      onEndReachedThreshold: U[Int] = NoValue,
      viewabilityConfig: U[ViewabilityConfig] = NoValue,
      disableVirtualization: U[Boolean] = NoValue,
      refreshing: U[Boolean] = NoValue,
      removeClippedSubviews: U[Boolean] = NoValue,
      onEndReached: U[OnEndReachedInfo] = NoValue,
      getItem: U[(js.Array[I], Int) => I] = NoValue,
      shouldItemUpdate: U[(ListItem[I] /*previous*/, ListItem[I]) => Boolean] =
        NoValue,
      getItemCount: U[(js.Array[I]) => Int] = NoValue,
      onViewableItemsChanged: U[(OnViewableItemsChanged[I]) => Unit] = NoValue,
      onLayout: U[(ReactEvent[LayoutEvent]) => _] = NoValue,
      renderItem: (ListItem[I]) => ReactElement,
      renderSectionHeader: (SectionItem[I]) => ReactElement,
      sections: js.Array[SectionBase[I]],
      renderScrollComponent: U[(js.Object) => ReactElement] = NoValue,
      onRefresh: U[() => _] = NoValue,
      keyExtractor: U[(I, Int) => String] = NoValue,
      getItemLayout: U[(js.Array[I], Int) => ListItemLayout] = NoValue,
      @exclude extraProps: U[SectionListProps[I]] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[SectionListComponent.type, Unit] = null)
    : ReactElement { type Instance = SectionListComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJSNoInline[SectionListComponent.type](
      SectionListComponent,
      props.asInstanceOf[SectionListProps[I]],
      key,
      ref)
  }
}

object UniversalComponents extends UniversalComponents
