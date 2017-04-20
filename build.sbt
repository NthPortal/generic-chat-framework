organization := "com.nthportal"
name := "generic-chat-framework"
description := "A generic chat framework, designed to be adaptable to many chat systems."

val rawVersion = "1.0.0"
isSnapshot := true
version := rawVersion + {if (isSnapshot.value) "-SNAPSHOT" else ""}

scalaVersion := "2.12.2"
crossScalaVersions := Seq(
  "2.12.1",
  "2.12.2"
)

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.1+" % Test
)

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

publishMavenStyle := true
licenses := Seq("The Apache License, Version 2.0" -> url("https://www.apache.org/licenses/LICENSE-2.0.txt"))
homepage := Some(url("https://github.com/NthPortal/generic-chat-framework"))

pomExtra :=
  <scm>
    <url>https://github.com/NthPortal/generic-chat-framework</url>
    <connection>scm:git:git@github.com:NthPortal/generic-chat-framework.git</connection>
    <developerConnection>scm:git:git@github.com:NthPortal/generic-chat-framework.git</developerConnection>
  </scm>
    <developers>
      <developer>
        <id>NthPortal</id>
        <name>NthPortal</name>
        <url>https://github.com/NthPortal</url>
      </developer>
    </developers>
