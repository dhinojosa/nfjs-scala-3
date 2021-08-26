name := "nfjs-scala-3"

version := "1.0-SNAPSHOT"

description := "Material NFJS Scala 3 Training"

scalaVersion := "3.0.1"

fork := true

scalacOptions ++= Seq(
  "-Xfatal-warnings",
  "-feature",
  "-deprecation",
  "-Yexplicit-nulls"
)

libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"
