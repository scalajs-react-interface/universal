package sri.universal.components

import sri.core.{JSComponent, _}
import scalajsplus.macros.{FunctionObjectMacro,exclude,rename}
import scalajsplus.{ OptDefault => NoValue, OptionalParam => OP}
import sri.universal.MergeJSObjects

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@js.native
@JSImport("react-native", "Modal")
object ModalComponent extends JSComponent[ModalProps]

trait ModalProps extends js.Object {
  val visible: js.UndefOr[Boolean] = js.undefined
  val style: js.UndefOr[js.Any] = js.undefined
  val animationType: js.UndefOr[ModalAnimationType] = js.undefined
  val onDismiss: js.UndefOr[js.Function0[_]] = js.undefined
  val transparent: js.UndefOr[Boolean] = js.undefined
  val onRequestClose: js.UndefOr[js.Function0[_]] = js.undefined
}

@js.native
trait ModalAnimationType extends js.Object

object ModalAnimationType {
  @inline def SLIDE = "slide".asInstanceOf[ModalAnimationType]
  @inline def FADE = "fade".asInstanceOf[ModalAnimationType]
  @inline def NONE = "none".asInstanceOf[ModalAnimationType]
}

object Modal {
  @inline
  def apply(style: OP[js.Any] = NoValue,
            animationType: OP[ModalAnimationType] = NoValue,
            transparent: OP[Boolean] = NoValue,
            visible: OP[Boolean] = NoValue,
            @exclude extraProps: OP[ModalProps] = NoValue,
            @exclude key: String | Int = null,
            @exclude ref: js.Function1[ModalComponent.type, Unit] = null)(
      children: ReactNode*)
    : ReactElement { type Instance = ModalComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJSNoInline[ModalComponent.type](
      ModalComponent,
      props.asInstanceOf[ModalProps],
      key,
      ref,
      children.toJSArray)
  }
}

object ModalC {

  @inline
  def apply(children: ReactNode*) =
    CreateElementJSNoInline[ModalComponent.type](
      ModalComponent,
      json().asInstanceOf[ModalProps],
      children = children.toJSArray)

}
