
lazy val akkaVersion = "2.6.15"
lazy val akkaHttpVersion = "10.2.6"
lazy val circeVersion    = "0.14.1"

name := "akka-http-oauth2-client"

ThisBuild / version := "0.2.1"
ThisBuild / organization := "com.github.dakatsuka"
ThisBuild / scalaVersion := "2.13.6"
ThisBuild / scalacOptions ++= List("-encoding", "utf8", "-deprecation", "-feature", "-unchecked", "-Xfatal-warnings")

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http"           % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-stream"         % akkaVersion,
  "io.circe"          %% "circe-generic"       % circeVersion,
  "io.circe"          %% "circe-parser"        % circeVersion,
  "com.typesafe.akka" %% "akka-http-testkit"   % akkaHttpVersion % Test,
  "org.scalatest"     %% "scalatest"           % "3.2.0" % Test,
  "org.scalamock"     %% "scalamock"           % "5.0.0" % Test
)

scalafmtOnCompile := true

licenses := Seq("The Apache Software License, Version 2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt"))

homepage := Some(url("https://github.com/dakatsuka/akka-http-oauth2-client"))

publishMavenStyle := true