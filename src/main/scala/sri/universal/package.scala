package sri

import sri.core.{ReactElement, ReactNode}
import sri.macros.{OptDefault, OptSpecified, OptionalParam}
import sri.universal.apis.Dimensions
import sri.universal.components.{ListViewDataSource, ListViewDataSourceInput}

import scala.collection.GenTraversableOnce
import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.`|`

package object universal {

  implicit class Boolean_Ext_Methods(val value: Boolean) extends AnyVal {
    def ?=(elm: => ReactNode): ReactElement =
      if (value) elm.asInstanceOf[ReactElement] else null
  }

  implicit class UndefOr_Ext_Methods(val value: js.UndefOr[_]) extends AnyVal {
    def isUndefinedOrNull: Boolean = value.isEmpty || value == null

    def isDefinedAndNotNull: Boolean = value.isDefined && value != null
  }

  implicit def genTravarsableToJSArrayReactElement[I <: js.Object](
      elm: GenTraversableOnce[ReactElement { type Instance = I }]): ReactNode =
    elm.toJSArray.asInstanceOf[ReactNode]

  implicit def jSArrayReactElementToNode[I <: js.Object](
      elm: js.Array[ReactElement { type Instance = I }]): ReactNode =
    elm.asInstanceOf[ReactNode]

  implicit def undefOrToOptionalParam[A](in: js.UndefOr[A]): OptionalParam[A] = {
    in.map(OptSpecified(_)).getOrElse(OptDefault)
  }

  def createListViewDataSource[R, H](
      rowHasChanged: js.Function2[R, R, Boolean],
      sectionHeaderHasChanged: js.Function2[H, H, Boolean] = null,
      getRowData: js.Function3[_, String | Int, String | Int, _] = null,
      getSectionHeaderData: js.Function2[_, String | Int, _] = null)
    : ListViewDataSource[R, H] = {

    new ListViewDataSource[R, H](new ListViewDataSourceInput[R, H] {
      rowHasChangedF = rowHasChanged;
      sectionHeaderHasChangedF =
        if (sectionHeaderHasChanged != null) sectionHeaderHasChanged
        else js.undefined;
      getRowDataF = if (getRowDataF != null) getRowData else js.undefined;
      getSectionHeaderDataF =
        if (getSectionHeaderData != null) getSectionHeaderData
        else js.undefined
    })
  }

  @inline def windowDimensions = Dimensions.get("window")

}
