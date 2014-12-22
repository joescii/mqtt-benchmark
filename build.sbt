name := "mqtt-benchmark"

organization := "com.github.mqtt"

version := "1.0-SNAPSHOT"

scalaVersion := "2.9.1"

resolvers ++= Seq(
  "snapshots"         at "https://oss.sonatype.org/content/repositories/snapshots",
  "releases"          at "https://oss.sonatype.org/content/repositories/releases"
)

scalacOptions ++= Seq("-deprecation", "-unchecked")

libraryDependencies ++= Seq(
  "org.fusesource.hawtdispatch" % "hawtdispatch-scala"             % "1.9"   % "compile",
  "org.fusesource.mqtt-client"  %  "mqtt-client"                    % "1.0"   % "compile",
  "org.apache.karaf.shell"      %  "org.apache.karaf.shell.console" % "2.2.1" % "compile",
  "org.slf4j"                   %  "slf4j-nop"                      % "1.6.0"
)
