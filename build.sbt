ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "etl-stellar",
    idePackagePrefix := Some("ru.red.etl_stellar")
  )

resolvers += "jitpack" at "https://jitpack.io" // required for stellar
resolvers += Resolver.jcenterRepo // required for novacrypto libraries

// Akka
val AkkaVersion = "2.7.0"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion,
  "com.typesafe.akka" %% "akka-stream" % AkkaVersion,
  "com.typesafe.akka" %% "akka-stream-testkit" % AkkaVersion % Test
)

// Stellar SDK
libraryDependencies += "io.github.synesso" %% "scala-stellar-sdk" % "0.21.1"
