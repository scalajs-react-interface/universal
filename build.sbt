name := "universal"

//version := "2017.2.0-SNAPSHOT"

enablePlugins(ScalaJSPlugin)

val scala211 = "2.11.8"

val scala212 = "2.12.1"

scalaVersion := scala211

crossScalaVersions := Seq(scala211, scala212)

scalacOptions ++= Seq(
  "-feature",
  "-deprecation",
  "-unchecked",
  "-language:existentials",
  "-language:implicitConversions"
)

//Dependencies
libraryDependencies += "scalajs-react-universe" %%% "core" % "2017.3.21-beta" % Provided
libraryDependencies += "scalajs-react-universe" %%% "macros" % "2017.3.22-beta"
libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.1"

//bintray
resolvers += Resolver.jcenterRepo

organization := "scalajs-react-universe"

licenses += ("Apache-2.0", url(
  "https://www.apache.org/licenses/LICENSE-2.0.html"))

bintrayOrganization := Some("scalajs-react-universe")

bintrayRepository := "maven"

bintrayVcsUrl := Some("git@github.com:scalajs-react-universe/universal.git")

publishArtifact in Test := false

//Test
resolvers += Resolver.bintrayRepo("scalajs-react-universe", "maven")
libraryDependencies += "org.scalatest" %%% "scalatest" % "3.0.0" % Test
scalaJSStage in Global := FastOptStage

scalaJSModuleKind in Test := ModuleKind.CommonJSModule
