package sri.universal.components

import sri.core._
import sri.universal._
import sri.universal.all._
import sri.universal.apis.PixelRatio
import sri.universal.router.UniversalRouterComponent
import sri.universal.styles.UniversalStyle

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

object DefaultNavigationBar {

  @ScalaJSDefined
  class Component extends UniversalRouterComponent[Props, Unit] {
    def render() = {
      val route = currentRoute
      View(new ViewProps {
        style = props.style.navBar
      })(
        if (route.leftButton.isDefined) route.leftButton.get()
        else if (props.leftButton != null) props.leftButton
        else {
          View(new ViewProps {
            style = props.style.navBarLeftButton
          })(
            previousRoute.isDefined ?= TouchableOpacity(
              new TouchableOpacityProps {
                onPress = js.defined(() => navigateBack())
              })(Text(new TextProps {
              style = props.style.navBarButtonText
            })("Back"))
          )
        },
        Text(new TextProps {
          style = props.style.navBarTitleText
        })(route.title),
        if (route.rightButton.isDefined) route.rightButton.get()
        else if (props.rightButton != null) props.rightButton
        else
          View(new ViewProps {
            style = props.style.navBarRightButton
          })()
      )
    }
  }

  /**
    * style for navigation bar
    */
  trait Style {

    def navBar: js.Any =
      new UniversalStyle {
        flexDirection = "row"
        backgroundColor = "rgb(248,248,248)"
        paddingTop = 30
        height = 64
        paddingBottom = 10
        borderBottomWidth = 1.0 / PixelRatio.get()
        borderBottomColor = "rgb(200, 199, 204)"
      }

    def navBarTitleText: js.Any =
      new UniversalStyle {
        color = "black"
        fontWeight = "500"
        textAlign = "center"
        flex = 1
        fontSize = 16
      }

    def navBarLeftButton: js.Any =
      new UniversalStyle {
        width = 70
        overflow = "hidden"
        flexDirection = "row"
        alignItems = "center"
        marginLeft = 10
        justifyContent = "flex-start"
      }

    def navBarRightButton: js.Any =
      new UniversalStyle {
        width = 70
        overflow = "hidden"
        flexDirection = "row"
        alignItems = "center"
        marginRight = 10
        justifyContent = "flex-end"
      }

    def navBarButtonText: js.Any =
      new UniversalStyle {
        fontSize = 16
        textAlign = "center"
        color = "rgb(21,125,251)"
      }

  }

  object IOSTheme extends Style {

    override val navBar = super.navBar

    override val navBarTitleText = super.navBarTitleText

    override val navBarLeftButton = super.navBarLeftButton

    override val navBarRightButton = super.navBarRightButton

    override val navBarButtonText = super.navBarButtonText

  }

  object AndroidTheme extends Style {

    override val navBar = js.Array(super.navBar, new UniversalStyle {
      height = 54
      backgroundColor = "#a9a9a9"
      paddingTop = 15
    })

    override val navBarTitleText =
      js.Array(super.navBarTitleText, new UniversalStyle { color = "white" })

    override val navBarLeftButton = super.navBarLeftButton

    override val navBarRightButton = super.navBarRightButton

    override val navBarButtonText =
      js.Array(super.navBarTitleText, new UniversalStyle { color = "white" })

  }

  val defaultTheme = if (isIOSPlatform) IOSTheme else AndroidTheme

  case class Props(style: Style,
                   leftButton: ReactElement = null,
                   rightButton: ReactElement = null)

  js.constructorOf[Component].contextTypes = router.routerContextTypes

  def apply(style: Style = defaultTheme,
            leftButton: ReactElement = null,
            rightButton: ReactElement = null,
            key: js.UndefOr[String] = js.undefined,
            ref: js.Function1[Component, Unit] = null) =
    makeElement[Component](props = Props(style, leftButton, rightButton),
                           key = key,
                           ref = ref)

}
