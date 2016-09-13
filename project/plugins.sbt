logLevel := Level.Info

val playVersion = "2.5.6"

resolvers += Resolver.sonatypeRepo("snapshots")

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % playVersion)

addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.1.1")