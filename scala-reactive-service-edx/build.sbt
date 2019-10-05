name := course.value + "-" + assignment.value

scalaVersion := "2.11.12"
lazy val akkaVersion = "2.5.25"
scalacOptions ++= Seq("-deprecation")



libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion % Test,
  "org.scalatest" %% "scalatest" % "3.0.5" % Test,
  "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.4",
  "junit" % "junit" % "4.10" % Test
)


// include the common dir
commonSourcePackages += "common"

courseId := "bRPXgjY9EeW6RApRXdjJPw"
