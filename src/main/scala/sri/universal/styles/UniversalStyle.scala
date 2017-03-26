package sri.universal.styles

import sri.macros.exclude
import sri.universal.apis.{AnimatedValue, ReactNativePropRegistry}

import scala.scalajs.js
import scala.scalajs.js.|
//import scala.scalajs.js.{UndefOr => U, undefined => NoValue}
import sri.macros.{
  FunctionObjectMacro,
  OptDefault => NoValue,
  OptionalParam => U
}

trait UniversalStyleConstants {
  @inline def visible = "visible"
  @inline def hidden = "hidden"
  @inline def scroll = "scroll"
  @inline def absolute = "absolute"
  @inline def relative = "relative"
  @inline def row = "row"
  @inline def column = "column"
  @inline def center = "center"
  @inline def wrap = "wrap"
  @inline def nowrap = "nowrap"
  @inline def flexEnd = "flex-end"
  @inline def stretch = "stretch"
  @inline def spaceBetween = "space-between"
  @inline def spaceAround = "space-around"
  @inline def normal = "normal"
  @inline def italic = "italic"
  @inline def left = "left"
  @inline def right = "right"
  @inline def auto = "auto"
  @inline def top = "top"
  @inline def bottom = "bottom"
  @inline def clipping = "clipping"
  @inline def wordWrapping = "word-wrapping"
  @inline def charWrapping = "char-wrapping"
  @inline def truncatingHead = "truncating-head"
  @inline def truncatingMiddle = "truncating-middle"
  @inline def truncatingTail = "truncating-tail"
  @inline def ltr = "ltr"
  @inline def rtl = "trl"
  @inline def bold = "bold"
  @inline def _100 = "100"
  @inline def _200 = "200"
  @inline def _300 = "300"
  @inline def _400 = "400"
  @inline def _500 = "500"
  @inline def _600 = "600"
  @inline def _700 = "700"
  @inline def _800 = "800"
  @inline def _900 = "900"
  @inline def solid = "solid"
  @inline def dotted = "dotted"
  @inline def dashed = "dashed"
}

trait UniversalStyleSheet extends UniversalStyleConstants {

  @inline
  def style(flex: U[Double | AnimatedValue] = NoValue,
            flexBasis: U[Double | AnimatedValue | String] = NoValue,
            flexShrink: U[Double | AnimatedValue] = NoValue,
            flexGrow: U[Double | AnimatedValue] = NoValue,
            borderBottomWidth: U[Double | AnimatedValue] = NoValue,
            borderLeftWidth: U[Double | AnimatedValue] = NoValue,
            borderRightWidth: U[Double | AnimatedValue] = NoValue,
            borderTopWidth: U[Double | AnimatedValue] = NoValue,
            borderWidth: U[Double | AnimatedValue] = NoValue,
            bottom: U[Double | AnimatedValue] = NoValue,
            height: U[Double | AnimatedValue | String] = NoValue,
            left: U[Double | AnimatedValue] = NoValue,
            margin: U[Double | AnimatedValue | String] = NoValue,
            marginBottom: U[Double | AnimatedValue] = NoValue,
            marginHorizontal: U[Double | AnimatedValue] = NoValue,
            marginLeft: U[Double | AnimatedValue] = NoValue,
            marginRight: U[Double | AnimatedValue] = NoValue,
            marginTop: U[Double | AnimatedValue] = NoValue,
            marginVertical: U[Double | AnimatedValue] = NoValue,
            maxHeight: U[Double | AnimatedValue | String] = NoValue,
            maxWidth: U[Double | AnimatedValue | String] = NoValue,
            minHeight: U[Double | AnimatedValue | String] = NoValue,
            minWidth: U[Double | AnimatedValue | String] = NoValue,
            padding: U[Double | AnimatedValue | String] = NoValue,
            paddingBottom: U[Double | AnimatedValue] = NoValue,
            paddingHorizontal: U[Double | AnimatedValue] = NoValue,
            paddingLeft: U[Double | AnimatedValue] = NoValue,
            paddingRight: U[Double | AnimatedValue] = NoValue,
            paddingTop: U[Double | AnimatedValue] = NoValue,
            paddingVertical: U[Double | AnimatedValue] = NoValue,
            right: U[Double | AnimatedValue] = NoValue,
            top: U[Double | AnimatedValue] = NoValue,
            width: U[Double | AnimatedValue | String] = NoValue,
            zIndex: U[Double | AnimatedValue] = NoValue,
            letterSpacing: U[Double | AnimatedValue] = NoValue,
            overflow: U[String] = NoValue,
            position: U[String] = NoValue,
            flexDirection: U[String] = NoValue,
            flexWrap: U[String] = NoValue,
            alignItems: U[String] = NoValue,
            alignSelf: U[String] = NoValue,
            justifyContent: U[String] = NoValue,
            color: U[String] = NoValue,
            containerBackgroundColor: U[String] = NoValue,
            fontFamily: U[String] = NoValue,
            fontSize: U[Double | AnimatedValue] = NoValue,
            lineHeight: U[Double | AnimatedValue] = NoValue,
            textShadowOffset: U[js.Dynamic] = NoValue,
            textShadowRadius: U[Double | AnimatedValue] = NoValue,
            textShadowColor: U[String] = NoValue,
            textDecorationLine: U[String] = NoValue,
            fontStyle: U[String] = NoValue,
            textAlign: U[String] = NoValue,
            textAlignVertical: U[String] = NoValue,
            lineBreakMode: U[String] = NoValue,
            writingDirection: U[String] = NoValue,
            fontWeight: U[String] = NoValue,
            backgroundColor: U[String] = NoValue,
            borderColor: U[String] = NoValue,
            tintColor: U[String] = NoValue,
            overlayColor: U[String] = NoValue,
            borderRadius: U[Double | AnimatedValue] = NoValue,
            opacity: U[Double | AnimatedValue] = NoValue,
            resizeMode: U[String] = NoValue,
            aspectRatio: U[Double] = NoValue,
            borderBottomColor: U[String] = NoValue,
            borderLeftColor: U[String] = NoValue,
            borderRightColor: U[String] = NoValue,
            borderTopColor: U[String] = NoValue,
            borderStyle: U[String] = NoValue,
            rotation: U[Double | AnimatedValue] = NoValue,
            scaleX: U[Double | AnimatedValue] = NoValue,
            scaleY: U[Double | AnimatedValue] = NoValue,
            shadowOpacity: U[Double | AnimatedValue] = NoValue,
            shadowRadius: U[Double | AnimatedValue] = NoValue,
            translateX: U[Double | AnimatedValue] = NoValue,
            translateY: U[Double | AnimatedValue] = NoValue,
            elevation: U[Double | AnimatedValue] = NoValue,
            shadowColor: U[String] = NoValue,
            shadowOffset: U[js.Object] = NoValue,
            transformMatrix: U[js.Array[Double]] = NoValue,
            borderTopLeftRadius: U[Double | AnimatedValue] = NoValue,
            borderTopRightRadius: U[Double | AnimatedValue] = NoValue,
            borderBottomLeftRadius: U[Double | AnimatedValue] = NoValue,
            borderBottomRightRadius: U[Double | AnimatedValue] = NoValue,
            transform: U[js.Array[js.Dynamic]] = NoValue,
            @exclude registerStyle: Boolean = true): js.Any = {
    val obj = FunctionObjectMacro()
    if (registerStyle) ReactNativePropRegistry.register(obj) else obj
  }
}

object UniversalStyleSheet extends UniversalStyleSheet

object UniversalStyleConstants extends UniversalStyleConstants
