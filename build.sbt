name := "train"
version := "1.0"
scalaVersion := "2.12.8"
val ZIOVersion = "1.0-RC4"


libraryDependencies ++= Seq(
  "com.github.mpilquist"  %% "simulacrum" % "0.16.0",
  "org.scalaz" %% "scalaz-zio" % ZIOVersion,
  "org.scalacheck" %% "scalacheck" % "1.14.0"
)

scalacOptions in ThisBuild ++= Seq(
  "-language:_",
  "-Ypartial-unification",
  "-Xfatal-warnings"
)

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.1" cross CrossVersion.full)
