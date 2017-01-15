package sri.universal.components

import sri.core.ReactClass
import sri.universal.{ReactEvent, TextInputEvent}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}


@js.native
@JSImport("react-native", "TextInput")
object TextInputClass extends ReactClass

@ScalaJSDefined
trait BaseTextInputProps extends js.Object {
  var onBlur: js.UndefOr[js.Function1[ReactEvent[TextInputEvent], Unit]] = js.undefined
  var placeholderTextColor: js.UndefOr[String] = js.undefined
  var multiline: js.UndefOr[Boolean] = js.undefined
  var maxLength: js.UndefOr[Int] = js.undefined
  var onChange: js.UndefOr[js.Function1[ReactEvent[TextInputEvent], Unit]] = js.undefined
  var onScroll: js.UndefOr[js.Function1[ReactEvent[TextInputEvent], Unit]] = js.undefined
  var onSelectionChange: js.UndefOr[js.Function1[ReactEvent[TextInputEvent], Unit]] = js.undefined
  var underlineColorAndroid: js.UndefOr[String] = js.undefined
  var keyboardType: js.UndefOr[TextInputKeyboardType] = js.undefined
  var selectionState: js.UndefOr[DocumentSelectionState] = js.undefined
  var selectionColor: js.UndefOr[String] = js.undefined
  var enablesReturnKeyAutomatically: js.UndefOr[Boolean] = js.undefined
  var clearTextOnFocus: js.UndefOr[Boolean] = js.undefined
  var textAlignVertical: js.UndefOr[TextInputTextAlignVertical] = js.undefined
  var onSubmitEditing: js.UndefOr[js.Function1[ReactEvent[TextInputEvent], Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var textAlign: js.UndefOr[TextInputTextAlign] = js.undefined
  var onChangeText: js.UndefOr[js.Function1[String, Unit]] = js.undefined
  var tintColor: js.UndefOr[String] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var spellCheck: js.UndefOr[Boolean] = js.undefined
  var autoCorrect: js.UndefOr[Boolean] = js.undefined
  var disableExtractUI: js.UndefOr[Boolean] = js.undefined
  var autoCapitalize: js.UndefOr[TextInputAutoCapitalize] = js.undefined
  var bufferDelay: js.UndefOr[Int] = js.undefined
  var selection: js.UndefOr[TextInputSelection] = js.undefined
  var onEndEditing: js.UndefOr[js.Function1[ReactEvent[TextInputEvent], Unit]] = js.undefined
  var returnKeyType: js.UndefOr[TextInputReturnKeyType] = js.undefined
  var returnKeyLabel: js.UndefOr[String] = js.undefined
  var onFocus: js.UndefOr[js.Function1[ReactEvent[TextInputEvent], Unit]] = js.undefined
  var onContentSizeChange: js.UndefOr[js.Function1[ReactEvent[TextInputEvent], Unit]] = js.undefined
  var clearButtonMode: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
  var defaultValue: js.UndefOr[String] = js.undefined
  var selectTextOnFocus: js.UndefOr[Boolean] = js.undefined
  var dataDetectorTypes: js.UndefOr[TextInputDataDetectorTypes] = js.undefined
  var editable: js.UndefOr[Boolean] = js.undefined
  var blurOnSubmit: js.UndefOr[Boolean] = js.undefined
  var password: js.UndefOr[Boolean] = js.undefined
}

@ScalaJSDefined
trait BaseTextInputPropsVal extends js.Object {
  val onBlur: js.UndefOr[js.Function1[ReactEvent[TextInputEvent], Unit]] = js.undefined
  val placeholderTextColor: js.UndefOr[String] = js.undefined
  val multiline: js.UndefOr[Boolean] = js.undefined
  val maxLength: js.UndefOr[Int] = js.undefined
  val onChange: js.UndefOr[js.Function1[ReactEvent[TextInputEvent], Unit]] = js.undefined
  val onScroll: js.UndefOr[js.Function1[ReactEvent[TextInputEvent], Unit]] = js.undefined
  val onSelectionChange: js.UndefOr[js.Function1[ReactEvent[TextInputEvent], Unit]] = js.undefined
  val underlineColorAndroid: js.UndefOr[String] = js.undefined
  val keyboardType: js.UndefOr[TextInputKeyboardType] = js.undefined
  val selectionState: js.UndefOr[DocumentSelectionState] = js.undefined
  val selectionColor: js.UndefOr[String] = js.undefined
  val enablesReturnKeyAutomatically: js.UndefOr[Boolean] = js.undefined
  val clearTextOnFocus: js.UndefOr[Boolean] = js.undefined
  val textAlignVertical: js.UndefOr[TextInputTextAlignVertical] = js.undefined
  val onSubmitEditing: js.UndefOr[js.Function1[ReactEvent[TextInputEvent], Unit]] = js.undefined
  val placeholder: js.UndefOr[String] = js.undefined
  val textAlign: js.UndefOr[TextInputTextAlign] = js.undefined
  val onChangeText: js.UndefOr[js.Function1[String, Unit]] = js.undefined
  val tintColor: js.UndefOr[String] = js.undefined
  val autoFocus: js.UndefOr[Boolean] = js.undefined
  val spellCheck: js.UndefOr[Boolean] = js.undefined
  val autoCorrect: js.UndefOr[Boolean] = js.undefined
  val disableExtractUI: js.UndefOr[Boolean] = js.undefined
  val autoCapitalize: js.UndefOr[TextInputAutoCapitalize] = js.undefined
  val bufferDelay: js.UndefOr[Int] = js.undefined
  val selection: js.UndefOr[TextInputSelection] = js.undefined
  val onEndEditing: js.UndefOr[js.Function1[ReactEvent[TextInputEvent], Unit]] = js.undefined
  val returnKeyType: js.UndefOr[TextInputReturnKeyType] = js.undefined
  val returnKeyLabel: js.UndefOr[String] = js.undefined
  val onFocus: js.UndefOr[js.Function1[ReactEvent[TextInputEvent], Unit]] = js.undefined
  val onContentSizeChange: js.UndefOr[js.Function1[ReactEvent[TextInputEvent], Unit]] = js.undefined
  val clearButtonMode: js.UndefOr[String] = js.undefined
  val value: js.UndefOr[String] = js.undefined
  val defaultValue: js.UndefOr[String] = js.undefined
  val selectTextOnFocus: js.UndefOr[Boolean] = js.undefined
  val dataDetectorTypes: js.UndefOr[TextInputDataDetectorTypes] = js.undefined
  val editable: js.UndefOr[Boolean] = js.undefined
  val blurOnSubmit: js.UndefOr[Boolean] = js.undefined
  val password: js.UndefOr[Boolean] = js.undefined
}

@ScalaJSDefined
trait TextInputProps extends BaseTextInputProps with BaseViewProps with UniversalProps[TextInputM]

@ScalaJSDefined
trait TextInputPropsVal extends BaseTextInputPropsVal with BaseViewPropsVal with UniversalPropsVal[TextInputM]


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
  val NONE = "none".asInstanceOf[TextInputAutoCapitalize]
  val SENTENCES = "sentences".asInstanceOf[TextInputAutoCapitalize]
  val WORDS = "words".asInstanceOf[TextInputAutoCapitalize]
  val CHARACTERS = "characters".asInstanceOf[TextInputAutoCapitalize]
}


@js.native
trait TextInputDataDetectorTypes extends js.Object

object TextInputDataDetectorTypes {
  val PHONE_NUMBER = "phoneNumber".asInstanceOf[TextInputDataDetectorTypes]
  val LINK = "link".asInstanceOf[TextInputDataDetectorTypes]
  val ADDRESS = "address".asInstanceOf[TextInputDataDetectorTypes]
  val CALENDER_EVENT = "calendarEvent".asInstanceOf[TextInputDataDetectorTypes]
  val NONE = "none".asInstanceOf[TextInputDataDetectorTypes]
  val ALL = "all".asInstanceOf[TextInputDataDetectorTypes]
}


@js.native
trait TextInputKeyboardType extends js.Object

object TextInputKeyboardType {
  val DEFAULT = "default".asInstanceOf[TextInputKeyboardType]
  val NUMERIC = "numeric".asInstanceOf[TextInputKeyboardType]
  val EMAIL_ADDRESS = "email-address".asInstanceOf[TextInputKeyboardType]
  val ASCII_CAPABLE = "ascii-capable".asInstanceOf[TextInputKeyboardType]
  val NUMBERS_AND_PUNCTUATION = "numbers-and-punctuation".asInstanceOf[TextInputKeyboardType]
  val URL = "url".asInstanceOf[TextInputKeyboardType]
  val NUMBER_PAD = "number-pad".asInstanceOf[TextInputKeyboardType]
  val PHONE_PAD = "phone-pad".asInstanceOf[TextInputKeyboardType]
  val NUMBER_HONE_PAD = "name-phone-pad".asInstanceOf[TextInputKeyboardType]
  val DECIMAL_PAD = "decimal-pad".asInstanceOf[TextInputKeyboardType]
  val TWITTER = "twitter".asInstanceOf[TextInputKeyboardType]
  val WEB_SEARCH = "web-search".asInstanceOf[TextInputKeyboardType]
}


@js.native
trait TextInputReturnKeyType extends js.Object

object TextInputReturnKeyType {
  val DEFAULT = "default".asInstanceOf[TextInputReturnKeyType]
  val GO = "go".asInstanceOf[TextInputReturnKeyType]
  val GOOGLE = "google".asInstanceOf[TextInputReturnKeyType]
  val JOIN = "join".asInstanceOf[TextInputReturnKeyType]
  val NEXT = "next".asInstanceOf[TextInputReturnKeyType]
  val ROUTE = "route".asInstanceOf[TextInputReturnKeyType]
  val SEARCH = "search".asInstanceOf[TextInputReturnKeyType]
  val SEND = "send".asInstanceOf[TextInputReturnKeyType]
  val YAHOO = "yahoo".asInstanceOf[TextInputReturnKeyType]
  val DONE = "done".asInstanceOf[TextInputReturnKeyType]
  val EMERGENCY_CALL = "emergency-call".asInstanceOf[TextInputReturnKeyType]
}

@js.native
trait TextInputTextAlign extends js.Object

object TextInputTextAlign {
  val START = "start".asInstanceOf[TextInputTextAlign]
  val CENTER = "center".asInstanceOf[TextInputTextAlign]
  val END = "end".asInstanceOf[TextInputTextAlign]
}

@js.native
trait TextInputTextAlignVertical extends js.Object

object TextInputTextAlignVertical {
  val TOP = "top".asInstanceOf[TextInputTextAlignVertical]
  val CENTER = "center".asInstanceOf[TextInputTextAlignVertical]
  val BOTTOM = "bottom".asInstanceOf[TextInputTextAlignVertical]
}

@ScalaJSDefined
trait TextInputSelection extends js.Object {
  var start: js.UndefOr[Double] = js.undefined
  val end: js.UndefOr[Double] = js.undefined
}
