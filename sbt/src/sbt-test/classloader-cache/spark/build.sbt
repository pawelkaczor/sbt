name := "Simple Project"

version := "1.0"

scalaVersion := "2.12.12"

libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.3"

Compile / closeClassLoaders := false
