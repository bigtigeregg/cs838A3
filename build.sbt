lazy val root = (project in file(".")).
  settings(
    name := "cs838testA3",
    version := "1.0",
    scalaVersion := "2.11.7",
    mainClass in (Compile,run) := Some("testA3"),
    libraryDependencies += "org.apache.spark" %% "spark-core" % "1.5.0",
    libraryDependencies += "org.apache.spark" %% "spark-graphx" % "1.5.0"
  )
