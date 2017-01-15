package sri.universal.components

import sri.core.{ReactClass, ReactElement}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}

@js.native
@JSImport("react-native","Navigator")
object NavigatorClass extends ReactClass {

  val SceneConfigs: NavigatorSceneConfigs = js.native

  val NavigationBar: ReactClass = js.native

  val BreadcrumbNavigationBar: ReactClass = js.native
}


@ScalaJSDefined
trait BaseNavigatorProps extends js.Object {
  var navigator: js.UndefOr[js.Object] = js.undefined
  var onItemRef: js.UndefOr[js.Function3[String, Int, js.Dynamic,Unit]] = js.undefined
  var navigationBar: js.UndefOr[ReactElement] = js.undefined
  var renderScene: js.Function2[js.Dynamic,NavigatorM,ReactElement]
  var initialRouteStack: js.UndefOr[js.Array[js.Dynamic]] = js.undefined
  var sceneStyle: js.UndefOr[js.Any] = js.undefined
  var configureScene: js.UndefOr[js.Function1[js.Dynamic,NavigatorSceneConfig]] = js.undefined
  var initialRoute: js.UndefOr[js.Object] = js.undefined
}

@ScalaJSDefined
trait BaseNavigatorPropsVal extends js.Object {
  val navigator: js.UndefOr[js.Object] = js.undefined
  val onItemRef: js.UndefOr[js.Function3[String, Int, js.Dynamic,Unit]] = js.undefined
  val navigationBar: js.UndefOr[ReactElement] = js.undefined
  val renderScene: js.Function2[js.Dynamic,NavigatorM,ReactElement]
  val initialRouteStack: js.UndefOr[js.Array[js.Dynamic]] = js.undefined
  val sceneStyle: js.UndefOr[js.Any] = js.undefined
  val configureScene: js.UndefOr[js.Function1[js.Dynamic,NavigatorSceneConfig]] = js.undefined
  val initialRoute: js.UndefOr[js.Object] = js.undefined
}

@ScalaJSDefined
trait NavigatorProps extends BaseNavigatorProps  with UniversalProps[NavigatorM]

@ScalaJSDefined
trait NavigatorPropsVal extends BaseNavigatorPropsVal  with UniversalPropsVal[NavigatorM]


@js.native
trait NavigatorM extends js.Object {

  def getCurrentRoutes(): js.Array[js.Dynamic] = js.native

  def jumpBack(): Unit = js.native

  def jumpForward(): Unit = js.native

  def jumpTo(route: js.Object): Unit = js.native

  def push(route: js.Object): Unit = js.native

  def pop(): Unit = js.native

  def popN(in: Int): Unit = js.native

  def replace(route: js.Object): Unit = js.native

  def replaceAtIndex(route: js.Object, index: Int): Unit = js.native

  def replacePrevious(route: js.Object): Unit = js.native

  def replacePreviousAndPop(route: js.Object): Unit = js.native

  def immediatelyResetRouteStack(routeStack: js.Array[js.Object]): Unit = js.native

  def popToRoute(route: js.Object): Unit = js.native

  def popToTop(): Unit = js.native

  val navigationContext: NavigationContext = js.native

}

@js.native
trait NavigationContext extends js.Object {
  def addListener(eventType: String, listener: js.Function, context: js.Object = ???, useCapture: Boolean = ???): js.Dynamic = js.native
}

@js.native
trait NavigatorSceneConfigs extends js.Object {

  val FloatFromBottom: NavigatorSceneConfig = js.native

  val FloatFromBottomAndroid: NavigatorSceneConfig = js.native

  val PushFromRight: NavigatorSceneConfig = js.native

  val HorizontalSwipeJump: NavigatorSceneConfig = js.native

  val FadeAndroid: NavigatorSceneConfig = js.native

  val FloatFromLeft: NavigatorSceneConfig = js.native

  val FloatFromRight: NavigatorSceneConfig = js.native

  val VerticalUpSwipeJump: NavigatorSceneConfig = js.native

  val VerticalDownSwipeJump: NavigatorSceneConfig = js.native

  val PushFromLeft: NavigatorSceneConfig = js.native

  val HorizontalSwipeJumpFromLeft: NavigatorSceneConfig = js.native

}

@js.native
trait NavigatorSceneConfig extends js.Object



