name := "zBlog"

version := "1.0"

lazy val `zBlog` = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
    jdbc,
    cache,
    ws,
    specs2 % Test,
    "mysql" % "mysql-connector-java" % "5.1.38",
    "com.typesafe.play" %% "play-slick" % "2.0.0"
)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

PlayKeys.devSettings := Seq("play.server.http.port" -> "8888")

//EclipseKeys.withSource := true

routesGenerator := InjectedRoutesGenerator