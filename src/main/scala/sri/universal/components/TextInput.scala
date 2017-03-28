package sri.universal.components

import sri.core.JSComponent
import sri.universal.{ReactEvent, TextInputEvent}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}

@js.native
@JSImport("react-native", "TextInput")
object TextInputComponent extends JSComponent[TextInputProps] {
  def blur(): Unit = js.native
}

@ScalaJSDefined
trait TextInputProps extends ViewProps {
  val onBlur: js.UndefOr[js.Function1[ReactEvent[TextInputEvent], Unit]] =
    js.undefined
  val placeholderTextColor: js.UndefOr[String] = js.undefined
  val multiline: js.UndefOr[Boolean] = js.undefined
  val maxLength: js.UndefOr[Int] = js.undefined
  val onChange: js.UndefOr[js.Function1[ReactEvent[TextInputEvent], Unit]] =
    js.undefined
  val onScroll: js.UndefOr[js.Function1[ReactEvent[TextInputEvent], Unit]] =
    js.undefined
  val onSelectionChange
    : js.UndefOr[js.Function1[ReactEvent[TextInputEvent], Unit]] = js.undefined
  val underlineColorAndroid: js.UndefOr[String] = js.undefined
  val keyboardType: js.UndefOr[TextInputKeyboardType] = js.undefined
  val selectionState: js.UndefOr[DocumentSelectionState] = js.undefined
  val selectionColor: js.UndefOr[String] = js.undefined
  val enablesReturnKeyAutomatically: js.UndefOr[Boolean] = js.undefined
  val clearTextOnFocus: js.UndefOr[Boolean] = js.undefined
  val textAlignVertical: js.UndefOr[TextInputTextAlignVertical] = js.undefined
  val onSubmitEditing
    : js.UndefOr[js.Function1[ReactEvent[TextInputEvent], Unit]] = js.undefined
  val placeholder: js.UndefOr[String] = js.undefined
  val textAlign: js.UndefOr[TextInputTextAlign] = js.undefined
  val onChangeText: js.UndefOr[js.Function1[String, Unit]] = js.undefined
  val tintColor: js.UndefOr[String] = js.undefined
  val autoFocus: js.UndefOr[Boolean] = js.undefined
  val spellCheck: js.UndefOr[Boolean] = js.undefined
  val autoCorrect: js.UndefOr[Boolean] = js.undefined
  val caretHidden: js.UndefOr[Boolean] = js.undefined
  val disableExtractUI: js.UndefOr[Boolean] = js.undefined
  val autoCapitalize: js.UndefOr[TextInputAutoCapitalize] = js.undefined
  val bufferDelay: js.UndefOr[Int] = js.undefined
  val selection: js.UndefOr[TextInputSelection] = js.undefined
  val onEndEditing
    : js.UndefOr[js.Function1[ReactEvent[TextInputEvent], Unit]] =
    js.undefined
  val returnKeyType: js.UndefOr[TextInputReturnKeyType] = js.undefined
  val returnKeyLabel: js.UndefOr[String] = js.undefined
  val onFocus: js.UndefOr[js.Function1[ReactEvent[TextInputEvent], Unit]] =
    js.undefined
  val onContentSizeChange
    : js.UndefOr[js.Function1[ReactEvent[TextInputEvent], Unit]] = js.undefined
  val clearButtonMode: js.UndefOr[String] = js.undefined
  val value: js.UndefOr[String] = js.undefined
  val defaultValue: js.UndefOr[String] = js.undefined
  val selectTextOnFocus: js.UndefOr[Boolean] = js.undefined
  val dataDetectorTypes: js.UndefOr[TextInputDataDetectorTypes] = js.undefined
  val editable: js.UndefOr[Boolean] = js.undefined
  val blurOnSubmit: js.UndefOr[Boolean] = js.undefined
  val password: js.UndefOr[Boolean] = js.undefined
}

/**
  * mounted TextInput component methods
  */
@js.native
trait TextInputM extends js.Object {

  def blur(): Unit = js.native

  def focus(): Unit = js.native

}

@js.native
trait TextInputAutoCapitalize extends js.Object
object TextInputAutoCapitalize {
  @inline def NONE = "none".asInstanceOf[TextInputAutoCapitalize]
  @inline def SENTENCES = "sentences".asInstanceOf[TextInputAutoCapitalize]
  @inline def WORDS = "words".asInstanceOf[TextInputAutoCapitalize]
  @inline def CHARACTERS = "characters".asInstanceOf[TextInputAutoCapitalize]
}

@js.native
trait TextInputDataDetectorTypes extends js.Object

object TextInputDataDetectorTypes {
  @inline def PHONE_NUMBER =
    "phoneNumber".asInstanceOf[TextInputDataDetectorTypes]
  @inline def LINK = "link".asInstanceOf[TextInputDataDetectorTypes]
  @inline def ADDRESS = "address".asInstanceOf[TextInputDataDetectorTypes]
  @inline def CALENDER_EVENT =
    "calendarEvent".asInstanceOf[TextInputDataDetectorTypes]
  @inline def NONE = "none".asInstanceOf[TextInputDataDetectorTypes]
  @inline def ALL = "all".asInstanceOf[TextInputDataDetectorTypes]
}

@js.native
trait TextInputKeyboardType extends js.Object

object TextInputKeyboardType {
  @inline def DEFAULT = "default".asInstanceOf[TextInputKeyboardType]
  @inline def NUMERIC = "numeric".asInstanceOf[TextInputKeyboardType]
  @inline def EMAIL_ADDRESS =
    "email-address".asInstanceOf[TextInputKeyboardType]
  @inline def ASCII_CAPABLE =
    "ascii-capable".asInstanceOf[TextInputKeyboardType]
  @inline def NUMBERS_AND_PUNCTUATION =
    "numbers-and-punctuation".asInstanceOf[TextInputKeyboardType]
  @inline def URL = "url".asInstanceOf[TextInputKeyboardType]
  @inline def NUMBER_PAD = "number-pad".asInstanceOf[TextInputKeyboardType]
  @inline def PHONE_PAD = "phone-pad".asInstanceOf[TextInputKeyboardType]
  @inline def NUMBER_HONE_PAD =
    "name-phone-pad".asInstanceOf[TextInputKeyboardType]
  @inline def DECIMAL_PAD = "decimal-pad".asInstanceOf[TextInputKeyboardType]
  @inline def TWITTER = "twitter".asInstanceOf[TextInputKeyboardType]
  @inline def WEB_SEARCH = "web-search".asInstanceOf[TextInputKeyboardType]
}

@js.native
trait TextInputReturnKeyType extends js.Object

object TextInputReturnKeyType {
  @inline def DEFAULT = "default".asInstanceOf[TextInputReturnKeyType]
  @inline def GO = "go".asInstanceOf[TextInputReturnKeyType]
  @inline def GOOGLE = "google".asInstanceOf[TextInputReturnKeyType]
  @inline def JOIN = "join".asInstanceOf[TextInputReturnKeyType]
  @inline def NEXT = "next".asInstanceOf[TextInputReturnKeyType]
  @inline def ROUTE = "route".asInstanceOf[TextInputReturnKeyType]
  @inline def SEARCH = "search".asInstanceOf[TextInputReturnKeyType]
  @inline def SEND = "send".asInstanceOf[TextInputReturnKeyType]
  @inline def YAHOO = "yahoo".asInstanceOf[TextInputReturnKeyType]
  @inline def DONE = "done".asInstanceOf[TextInputReturnKeyType]
  @inline def EMERGENCY_CALL =
    "emergency-call".asInstanceOf[TextInputReturnKeyType]
}

@js.native
trait TextInputTextAlign extends js.Object

object TextInputTextAlign {
  @inline def START = "start".asInstanceOf[TextInputTextAlign]
  @inline def CENTER = "center".asInstanceOf[TextInputTextAlign]
  @inline def END = "end".asInstanceOf[TextInputTextAlign]
}

@js.native
trait TextInputTextAlignVertical extends js.Object

object TextInputTextAlignVertical {
  @inline def TOP = "top".asInstanceOf[TextInputTextAlignVertical]
  @inline def CENTER = "center".asInstanceOf[TextInputTextAlignVertical]
  @inline def BOTTOM = "bottom".asInstanceOf[TextInputTextAlignVertical]
}

@ScalaJSDefined
trait TextInputSelection extends js.Object {
  var start: js.UndefOr[Double] = js.undefined
  val end: js.UndefOr[Double] = js.undefined
}
