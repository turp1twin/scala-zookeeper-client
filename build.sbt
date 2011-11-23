organization := "com.twitter"

name := "zookeeper-client"

version := "4.0.0-SNAPSHOT"

// Our Scala version...
scalaVersion := "2.9.1"

// Resolvers
resolvers += "twitter.com" at "http://maven.twttr.com/"

// Build dependencies
libraryDependencies ++= Seq(
	"com.twitter" % "util-logging" % "1.12.1",
	"org.apache.zookeeper" % "zookeeper" % "3.3.3"
)
	
//Test dependencies
libraryDependencies ++= Seq(
	"org.scala-tools.testing" % "specs_2.9.1" % "1.6.9" % "test"
)

ivyXML :=
  <dependencies>
    <exclude module="jms"/>
    <exclude module="jmxtools"/>
    <exclude module="jmxri"/>
  </dependencies>

pomExtra :=
  <licenses>
    <license>
      <name>Apache 2</name>
      <url>http://www.apache.org/licenses/LICENSE-2.0.txt</url>
      <distribution>repo</distribution>
    </license>
  </licenses>