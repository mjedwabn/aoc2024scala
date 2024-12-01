ThisBuild / version := "0.1.0"

ThisBuild / scalaVersion := "3.5.2"

lazy val root = (project in file("."))
  .settings(
    name := "aoc2024scala"
  )

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.19" % "test"
