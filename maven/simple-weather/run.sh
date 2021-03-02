#!/bin/sh 

mvn install  
mvn exec:java -Dexec.mainClass=org.sonatype.mavenbook.ch04.Main
