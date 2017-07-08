package sri.universal.styles

import sri.universal.apis.AnimatedValue

import scala.io.Source
import scala.scalajs.js
import scala.scalajs.js.|

trait InlineStylePropsUniversal {
  object flex {
    def :=(value: Double | AnimatedValue | String) = InlineStylePropUniversal

  }

  object flexBasis {
    def :=(value: Double | AnimatedValue | String) = InlineStylePropUniversal

  }

  object flexShrink {
    def :=(value: Double | AnimatedValue) = InlineStylePropUniversal

  }

  object flexGrow {
    def :=(value: Double | AnimatedValue) = InlineStylePropUniversal

  }

  object borderBottomWidth {
    def :=(value: Double | AnimatedValue) = InlineStylePropUniversal

  }

  object borderLeftWidth {
    def :=(value: Double | AnimatedValue) = InlineStylePropUniversal

  }

  object borderRightWidth {
    def :=(value: Double | AnimatedValue) = InlineStylePropUniversal

  }

  object borderTopWidth {
    def :=(value: Double | AnimatedValue) = InlineStylePropUniversal

  }

  object borderWidth {
    def :=(value: Double | AnimatedValue) = InlineStylePropUniversal

  }

  object bottom {
    def :=(value: Double | AnimatedValue) = InlineStylePropUniversal

  }

  object height {
    def :=(value: Double | AnimatedValue | String) = InlineStylePropUniversal

  }

  object left {
    def :=(value: Double | AnimatedValue) = InlineStylePropUniversal

  }

  object margin {
    def :=(value: Double | AnimatedValue | String) = InlineStylePropUniversal

  }

  object marginBottom {
    def :=(value: Double | AnimatedValue) = InlineStylePropUniversal

  }

  object marginHorizontal {
    def :=(value: Double | AnimatedValue) = InlineStylePropUniversal

  }

  object marginLeft {
    def :=(value: Double | AnimatedValue) = InlineStylePropUniversal

  }

  object marginRight {
    def :=(value: Double | AnimatedValue) = InlineStylePropUniversal

  }

  object marginTop {
    def :=(value: Double | AnimatedValue) = InlineStylePropUniversal

  }

  object marginVertical {
    def :=(value: Double | AnimatedValue) = InlineStylePropUniversal

  }

  object maxHeight {
    def :=(value: Double | AnimatedValue | String) = InlineStylePropUniversal

  }

  object alignContent {
    def :=(value: String) = InlineStylePropUniversal

  }

  object maxWidth {
    def :=(value: Double | AnimatedValue | String) = InlineStylePropUniversal

  }

  object minHeight {
    def :=(value: Double | AnimatedValue | String) = InlineStylePropUniversal

  }

  object minWidth {
    def :=(value: Double | AnimatedValue | String) = InlineStylePropUniversal

  }

  object padding {
    def :=(value: Double | AnimatedValue | String) = InlineStylePropUniversal

  }

  object paddingBottom {
    def :=(value: Double | AnimatedValue) = InlineStylePropUniversal

  }

  object paddingHorizontal {
    def :=(value: Double | AnimatedValue) = InlineStylePropUniversal

  }

  object paddingLeft {
    def :=(value: Double | AnimatedValue) = InlineStylePropUniversal

  }

  object paddingRight {
    def :=(value: Double | AnimatedValue) = InlineStylePropUniversal

  }

  object paddingTop {
    def :=(value: Double | AnimatedValue) = InlineStylePropUniversal

  }

  object paddingVertical {
    def :=(value: Double | AnimatedValue) = InlineStylePropUniversal

  }

  object right {
    def :=(value: Double | AnimatedValue) = InlineStylePropUniversal

  }

  object top {
    def :=(value: Double | AnimatedValue) = InlineStylePropUniversal

  }

  object width {
    def :=(value: Double | AnimatedValue | String) = InlineStylePropUniversal

  }

  object zIndex {
    def :=(value: Double | AnimatedValue) = InlineStylePropUniversal

  }

  object letterSpacing {
    def :=(value: Double | AnimatedValue) = InlineStylePropUniversal

  }

  object overflow {
    def :=(value: String) = InlineStylePropUniversal
    def visible = InlineStylePropUniversal
    def hidden = InlineStylePropUniversal
  }

  object position {
    def :=(value: String) = InlineStylePropUniversal
    def absolute = InlineStylePropUniversal
    def relative = InlineStylePropUniversal
  }

  object flexDirection {
    def :=(value: String) = InlineStylePropUniversal
    def row = InlineStylePropUniversal
    def column = InlineStylePropUniversal
  }

  object flexWrap {
    def :=(value: String) = InlineStylePropUniversal
    def wrap = InlineStylePropUniversal
    def nowrap = InlineStylePropUniversal
  }

  object alignItems {
    def :=(value: String) = InlineStylePropUniversal
    def center = InlineStylePropUniversal
    def flexStart = InlineStylePropUniversal
    def flexEnd = InlineStylePropUniversal
    def stretch = InlineStylePropUniversal
  }

  object alignSelf {
    def :=(value: String) = InlineStylePropUniversal
    def auto = InlineStylePropUniversal
    def center = InlineStylePropUniversal
    def flexStart = InlineStylePropUniversal
    def flexEnd = InlineStylePropUniversal
    def stretch = InlineStylePropUniversal
  }

  object justifyContent {
    def :=(value: String) = InlineStylePropUniversal
    def spaceBetween = InlineStylePropUniversal
    def center = InlineStylePropUniversal
    def flexStart = InlineStylePropUniversal
    def flexEnd = InlineStylePropUniversal
    def spaceAround = InlineStylePropUniversal
  }

  object color {
    def :=(value: String) = InlineStylePropUniversal

  }

  object containerBackgroundColor {
    def :=(value: String) = InlineStylePropUniversal

  }

  object fontFamily {
    def :=(value: String) = InlineStylePropUniversal

  }

  object fontSize {
    def :=(value: Double | AnimatedValue) = InlineStylePropUniversal

  }

  object lineHeight {
    def :=(value: Double | AnimatedValue) = InlineStylePropUniversal

  }

  object textShadowOffset {
    def :=(value: js.Dynamic) = InlineStylePropUniversal

  }

  object textShadowRadius {
    def :=(value: Double | AnimatedValue) = InlineStylePropUniversal

  }

  object textShadowColor {
    def :=(value: String) = InlineStylePropUniversal

  }

  object textDecorationLine {
    def :=(value: String) = InlineStylePropUniversal

  }

  object fontStyle {
    def :=(value: String) = InlineStylePropUniversal
    def normal = InlineStylePropUniversal
    def italic = InlineStylePropUniversal
  }

  object textAlign {
    def :=(value: String) = InlineStylePropUniversal
    def auto = InlineStylePropUniversal
    def left = InlineStylePropUniversal
    def right = InlineStylePropUniversal
    def center = InlineStylePropUniversal
  }

  object textAlignVertical {
    def :=(value: String) = InlineStylePropUniversal
    def auto = InlineStylePropUniversal
    def top = InlineStylePropUniversal
    def bottom = InlineStylePropUniversal
    def center = InlineStylePropUniversal
  }

  object lineBreakMode {
    def :=(value: String) = InlineStylePropUniversal
    def clipping = InlineStylePropUniversal
    def wordWrapping = InlineStylePropUniversal
    def charWrapping = InlineStylePropUniversal
    def truncatingHead = InlineStylePropUniversal
    def truncatingMiddle = InlineStylePropUniversal
    def truncatingTail = InlineStylePropUniversal
  }

  object writingDirection {
    def :=(value: String) = InlineStylePropUniversal
    def auto = InlineStylePropUniversal
    def ltr = InlineStylePropUniversal
    def rtl = InlineStylePropUniversal
  }

  object fontWeight {
    def :=(value: String) = InlineStylePropUniversal
    def normal = InlineStylePropUniversal
    def bold = InlineStylePropUniversal
    def `100` = InlineStylePropUniversal
    def `200` = InlineStylePropUniversal
    def `300` = InlineStylePropUniversal
    def `400` = InlineStylePropUniversal
    def `500` = InlineStylePropUniversal
    def `600` = InlineStylePropUniversal
    def `700` = InlineStylePropUniversal
    def `800` = InlineStylePropUniversal
    def `900` = InlineStylePropUniversal
  }

  object backgroundColor {
    def :=(value: String) = InlineStylePropUniversal

  }

  object borderColor {
    def :=(value: String) = InlineStylePropUniversal

  }

  object tintColor {
    def :=(value: String) = InlineStylePropUniversal

  }

  object overlayColor {
    def :=(value: String) = InlineStylePropUniversal

  }

  object borderRadius {
    def :=(value: Double | AnimatedValue) = InlineStylePropUniversal

  }

  object opacity {
    def :=(value: Double | AnimatedValue) = InlineStylePropUniversal

  }

  object resizeMode {
    def :=(value: String) = InlineStylePropUniversal

  }

  object aspectRatio {
    def :=(value: Double) = InlineStylePropUniversal

  }

  object borderBottomColor {
    def :=(value: String) = InlineStylePropUniversal

  }

  object borderLeftColor {
    def :=(value: String) = InlineStylePropUniversal

  }

  object borderRightColor {
    def :=(value: String) = InlineStylePropUniversal

  }

  object borderTopColor {
    def :=(value: String) = InlineStylePropUniversal

  }

  object borderStyle {
    def :=(value: String) = InlineStylePropUniversal
    def solid = InlineStylePropUniversal
    def dotted = InlineStylePropUniversal
    def dashed = InlineStylePropUniversal
  }

  object rotation {
    def :=(value: Double | AnimatedValue) = InlineStylePropUniversal

  }

  object scaleX {
    def :=(value: Double | AnimatedValue) = InlineStylePropUniversal

  }

  object scaleY {
    def :=(value: Double | AnimatedValue) = InlineStylePropUniversal

  }

  object shadowOpacity {
    def :=(value: Double | AnimatedValue) = InlineStylePropUniversal

  }

  object shadowRadius {
    def :=(value: Double | AnimatedValue) = InlineStylePropUniversal

  }

  object translateX {
    def :=(value: Double | AnimatedValue) = InlineStylePropUniversal

  }

  object translateY {
    def :=(value: Double | AnimatedValue) = InlineStylePropUniversal

  }

  object elevation {
    def :=(value: Double | AnimatedValue) = InlineStylePropUniversal

  }

  object shadowColor {
    def :=(value: String) = InlineStylePropUniversal

  }

  object shadowOffset {
    def :=(value: js.Object) = InlineStylePropUniversal

  }

  object transformMatrix {
    def :=(value: js.Array[Double]) = InlineStylePropUniversal

  }

  object borderTopLeftRadius {
    def :=(value: Double | AnimatedValue) = InlineStylePropUniversal

  }

  object borderTopRightRadius {
    def :=(value: Double | AnimatedValue) = InlineStylePropUniversal

  }

  object borderBottomLeftRadius {
    def :=(value: Double | AnimatedValue) = InlineStylePropUniversal

  }

  object borderBottomRightRadius {
    def :=(value: Double | AnimatedValue) = InlineStylePropUniversal

  }

  object transform {
    def :=(value: js.Array[js.Dynamic]) = InlineStylePropUniversal

  }

}

object InlineStylePropUniversal
