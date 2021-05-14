import Dependencies._

name := "sangria-akka-http-circe"
organization := "org.sangria-graphql"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core" % circeVersion,
  "io.circe" %% "circe-generic" % circeVersion,
  "de.heikoseeberger" %% "akka-http-circe" % "1.36.0",
  "org.sangria-graphql" %% "sangria-circe" % SangriaVersion.sangriaCirce,
  "com.typesafe.akka" %% "akka-http" % akkaHttpVersion % Test,
  "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion % Test,
  "com.typesafe.akka" %% "akka-http-testkit" % akkaHttpVersion % Test,
  "io.circe" %% "circe-optics" % circeVersion % Test
)
