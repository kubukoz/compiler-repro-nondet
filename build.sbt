val demo = project
  .in(file("."))
  .settings(
    scalaVersion := "2.12.12",
    scalacOptions -= "-Xfatal-warnings"
  )
  .settings(
    libraryDependencies ++= Seq(
      "com.chuusai" %% "shapeless" % "2.3.3",
      "com.spotify" %% "magnolify-scalacheck" % "0.2.2"
    )
  )
