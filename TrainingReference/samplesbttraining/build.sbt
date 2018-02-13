organization := "springer"

name := "samplesbttraining"

version := "1.0"

scalaVersion := "2.12.4"

lazy val hello = taskKey[Unit]("An example task")
hello := {
  println("Hello! this is an example task")
}

libraryDependencies ++= Seq("org.scalatest" % "scalatest_2.12" % "3.0.4" % "test")
    