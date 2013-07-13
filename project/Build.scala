import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "play-todo"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
        "org.squeryl" %% "squeryl" % "0.9.5-6"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
        libraryDependencies ++= Seq(
           "org.squeryl" %% "squeryl" % "0.9.5-6",
		   "net.liftweb" %% "lift-json" % "2.5-M4" exclude("org.specs2","specs2_2.10")
        )
    )

}
