package sri.universal.components

import sri.core._
import sri.universal.apis.{AnimatedImageClass, AnimatedTextClass, AnimatedViewClass}

import scala.scalajs.js
import scala.scalajs.js.|

trait UniversalComponents {

  @inline
  def View(props: ViewProps | ViewPropsVal)(children: ReactNode*) =
    React.createElement(ViewClass, props, children: _*)

  @inline
  def View(children: ReactNode*) =
    React.createElement(ViewClass, js.Dynamic.literal(), children: _*)

  @inline
  def AnimatedView(props: ViewProps | ViewPropsVal)(children: ReactNode*) =
    React.createElement(AnimatedViewClass, props, children: _*)

  @inline
  def AnimatedView(children: ReactNode*) =
    React.createElement(AnimatedViewClass, js.Dynamic.literal(), children: _*)

  @inline
  def ActivityIndicator(
      props: ActivityIndicatorProps | ActivityIndicatorPropsVal =
        js.Dynamic.literal().asInstanceOf[ActivityIndicatorProps]) =
    React.createElement(ActivityIndicatorClass, props)

  @inline
  def Button(props: ButtonProps | ButtonPropsVal) =
    React.createElement(ButtonClass, props)

  @inline
  def Image(
      props: ImageProps | ImagePropsVal =
        js.Dynamic.literal().asInstanceOf[ImageProps]) =
    React.createElement(ImageClass, props)

  @inline
  def AnimatedImage(
      props: ImageProps | ImagePropsVal =
        js.Dynamic.literal().asInstanceOf[ImageProps]) =
    React.createElement(AnimatedImageClass, props)

  @inline
  def KeyboardAvoidingView(
      props: KeyboardAvoidingViewProps | KeyboardAvoidingViewPropsVal)(
      children: ReactNode*) =
    React.createElement(KeyboardAvoidingViewClass, props, children: _*)

  @inline
  def KeyboardAvoidingView(children: ReactNode*) =
    React.createElement(KeyboardAvoidingViewClass,
                        js.Dynamic.literal(),
                        children: _*)

  @inline
  def ScrollView(props: ScrollViewProps | ScrollViewPropsVal)(
      children: ReactNode*) =
    React.createElement(ScrollViewClass, props, children: _*)

  @inline
  def ScrollView(children: ReactNode*) =
    React.createElement(ScrollViewClass, js.Dynamic.literal(), children: _*)

  @inline
  def ListView[R, H](props: ListViewProps[R, H] | ListViewPropsVal[R, H]) =
    React.createElement(ListViewClass, props)

  @inline
  def Modal(props: ModalProps | ModalPropsVal)(children: ReactNode*) =
    React.createElement(ModalClass, props, children: _*)

  @inline
  def Modal(children: ReactNode*) =
    React.createElement(ModalClass, js.Dynamic.literal(), children: _*)

  @inline
  def Navigator(props: NavigatorProps | NavigatorPropsVal) =
    React.createElement(NavigatorClass, props)

  @inline
  def Picker[T](props: PickerProps[T] | PickerPropsVal[T])(
      children: ReactNode*) =
    React.createElement(PickerClass, props, children: _*)

  @inline
  def Picker(children: ReactNode*) =
    React.createElement(PickerClass, js.Dynamic.literal(), children: _*)

  @inline
  def PickerItem[T](props: PickerItemProps[T] | PickerItemPropsVal[T]) =
    React.createElement(PickerItemClass, props)

  @inline
  def Slider(
      props: SliderProps | SliderPropsVal =
        js.Dynamic.literal().asInstanceOf[SliderProps]) =
    React.createElement(SliderClass, props)

  @inline
  def SwipeableListView[R, H](
      props: BaseSwipeableListViewProps[R, H] | BaseSwipeableListViewPropsVal[
        R,
        H]) = React.createElement(SwipeableListViewClass, props)

  @inline
  def Switch(
      props: SwitchProps | SwitchPropsVal =
        js.Dynamic.literal().asInstanceOf[SwitchProps]) =
    React.createElement(SwitchClass, props)

  @inline
  def Text(props: TextProps | TextPropsVal)(children: ReactNode*) =
    React.createElement(TextClass, props, children: _*)

  @inline
  def Text(children: ReactNode*) =
    React.createElement(TextClass, js.Dynamic.literal(), children: _*)

  @inline
  def AnimatedText(props: TextProps | TextPropsVal)(children: ReactNode*) =
    React.createElement(AnimatedTextClass, props, children: _*)

  @inline
  def AnimatedText(children: ReactNode*) =
    React.createElement(AnimatedTextClass, js.Dynamic.literal(), children: _*)

  @inline
  def TextInput(props: TextInputProps | TextInputPropsVal)(
      children: ReactNode*) =
    React.createElement(TextInputClass, props, children: _*)

  @inline
  def TextInput(children: ReactNode*) =
    React.createElement(TextInputClass, js.Dynamic.literal(), children: _*)

  @inline
  def TouchableWithoutFeedback(
      props: TouchableWithoutFeedbackProps | TouchableWithoutFeedbackPropsVal)(
      children: ReactNode*) =
    React.createElement(TouchableWithoutFeedbackClass, props, children: _*)

  @inline
  def TouchableWithoutFeedback(children: ReactNode*) =
    React.createElement(TouchableWithoutFeedbackClass,
                        js.Dynamic.literal(),
                        children: _*)

  @inline
  def TouchableHighlight(
      props: TouchableHighlightProps | TouchableHighlightPropsVal)(
      children: ReactNode*) =
    React.createElement(TouchableHighlightClass, props, children: _*)

  @inline
  def TouchableHighlight(children: ReactNode*) =
    React.createElement(TouchableHighlightClass,
                        js.Dynamic.literal(),
                        children: _*)

  @inline
  def TouchableOpacity(
      props: TouchableOpacityProps | TouchableOpacityPropsVal)(
      children: ReactNode*) =
    React.createElement(TouchableOpacityClass, props, children: _*)

  @inline
  def TouchableOpacity(children: ReactNode*) =
    React.createElement(TouchableOpacityClass,
                        js.Dynamic.literal(),
                        children: _*)

  @inline
  def WindowedListView[T](
      props: WindowedListViewProps[T] | WindowedListViewPropsVal[T]) =
    React.createElement(WindowedListViewClass, props)

  @inline
  def RefreshControl(
      props: RefreshControlProps | RefreshControlPropsVal =
        js.Dynamic.literal().asInstanceOf[RefreshControlProps]) =
    React.createElement(RefreshControlClass, props)

}

object UniversalComponents extends UniversalComponents