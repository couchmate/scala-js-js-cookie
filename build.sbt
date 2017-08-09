lazy val jscookie = project.in(file("."))
  .enablePlugins(ScalaJSPlugin)

name := "ScalaJS Facade for js-cookie"

normalizedName := "scala-js-js-cookie"

version := "0.0.1"

organization := "com.couchmate"

scalaVersion := "2.11.7"

libraryDependencies +=
  "org.webjars" % "js-cookie" % "2.1.3"

jsDependencies +=
  "org.webjars" % "js-cookie" % "2.1.3" / "js.cookie.js"
