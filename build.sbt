organization in ThisBuild := "de.surfice"

version in ThisBuild := "0.0.1-SNAPSHOT"

scalaVersion in ThisBuild := "2.11.12"

val Version = new {
  val swog        = "0.1.0-SNAPSHOT"
  val smacrotools = "0.0.8"
  val utest       = "0.6.3"
}


lazy val commonSettings = Seq(
  scalacOptions ++= Seq("-deprecation","-unchecked","-feature","-language:implicitConversions","-Xlint"),
  addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full),
  libraryDependencies ++= Seq(
    "de.surfice" %%% "swog-cxx" % Version.swog
    ),
  resolvers += Opts.resolver.sonatypeSnapshots
)

lazy val vtk = project.in(file("."))
  .enablePlugins(ScalaNativePlugin)
  //.aggregate(core,gui,widgets)
  .settings(commonSettings ++ publishingSettings:_*)
  .settings(
    name := "scalanative-vtk",
    description := "ScalaNative bindings for VTK"
  )

val vtkPrefix = "/usr/local/Cellar/vtk/8.2.0/"
lazy val demo = project
  .enablePlugins(ScalaNativePlugin,NBHAutoPlugin,NBHCxxPlugin,NBHPkgConfigPlugin)
  .dependsOn(vtk)
  .settings(commonSettings ++ dontPublish: _*)
  .settings(
    nativeLinkStubs := true,
    nbhCxxCXXFlags := s"-std=c++11 -I$vtkPrefix/include/vtk-8.2/".split(" "),
    nbhCxxLDFlags := s"-L$vtkPrefix/lib/ -lvtkCommonCore-8.2 -lvtkCommonDataModel-8.2 -lvtkIOXML-8.2".split(" ")
  )

lazy val dontPublish = Seq(
  publish := {},
  publishLocal := {},
  com.typesafe.sbt.pgp.PgpKeys.publishSigned := {},
  com.typesafe.sbt.pgp.PgpKeys.publishLocalSigned := {},
  publishArtifact := false,
  publishTo := Some(Resolver.file("Unused transient repository",file("target/unusedrepo")))
)

lazy val publishingSettings = Seq(
  publishMavenStyle := true,
  publishTo := {
    val nexus = "https://oss.sonatype.org/"
    if (isSnapshot.value)
      Some("snapshots" at nexus + "content/repositories/snapshots")
    else
      Some("releases"  at nexus + "service/local/staging/deploy/maven2")
  },
  pomExtra := (
    <url>https://github.com/jokade/scalanative-vtk</url>
    <licenses>
      <license>
        <name>MIT License</name>
        <url>http://www.opensource.org/licenses/mit-license.php</url>
      </license>
    </licenses>
    <scm>
      <url>git@github.com:jokade/scalanative-vtk</url>
      <connection>scm:git:git@github.com:jokade/scalanative-vtk.git</connection>
    </scm>
    <developers>
      <developer>
        <id>jokade</id>
        <name>Johannes Kastner</name>
        <email>jokade@karchedon.de</email>
      </developer>
    </developers>
  )
)
 
