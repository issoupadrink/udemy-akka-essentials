name := "udemy-akka"

version := "0.1"

scalaVersion := "2.13.3"

val akkaVersion = "2.5.13"
val scalaTest = "3.0.5"

libraryDependencies ++= Seq(
    "com.typesafe.akka" %% "akka-actor" % akkaVersion,
    "com.typesafe.akka" %% "akka-testkit" % akkaVersion,
    "org.scalatest" %% "scalatest" % scalaTest
)