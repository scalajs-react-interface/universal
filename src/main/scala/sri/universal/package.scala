package sri


import sri.core.{CoreAll, React, ReactElementU}
import sri.universal.apis.Platform
import sri.universal.components.{ListViewDataSource, ListViewDataSourceInput}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.`|`

package object universal {

  trait UniversalAll extends CoreAll {

    lazy val isIOSPlatform: Boolean = !js.isUndefined(Platform) && Platform.OS == "ios"

    lazy val isAndroidPlatform: Boolean = !js.isUndefined(Platform) && Platform.OS == "android"

    lazy val isWebPlatform: Boolean = !js.isUndefined(Platform) && Platform.OS == "web"

    def createListViewDataSource[R, H](rowHasChanged: js.Function2[R, R, Boolean],
                                       sectionHeaderHasChanged: js.Function2[H, H, Boolean] = null,
                                       getRowData: js.Function3[_, String | Int, String | Int, _] = null,
                                       getSectionHeaderData: js.Function2[_, String | Int, _] = null
                                        ): ListViewDataSource[R, H] = {

      new ListViewDataSource[R, H](new ListViewDataSourceInput[R, H]{ rowHasChangedF = rowHasChanged;
        sectionHeaderHasChangedF = if (sectionHeaderHasChanged != null) sectionHeaderHasChanged else js.undefined;
        getRowDataF = if (getRowDataF != null) getRowData else js.undefined;
        getSectionHeaderDataF = if (getSectionHeaderData != null) getSectionHeaderData else js.undefined})
    }

    /**
     * use this method to create root component of sri.mobile, use the output to register..
     * @param rootComponent
     * @return
     */
    def createReactNativeRoot[P, S](rootComponent: => ReactElementU[P, S], name: String = "SriMobileApp") = {
      React.createClass(json(render = () => rootComponent, displayName = name))
    }

  }

  object all extends UniversalAll


}
