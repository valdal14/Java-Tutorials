package com.valdal14.Maven;

/**
 *  BUILD AUTOMATION OR PACKAGE MANAGER TOOL -----------------------------------------------------------------------
 *      -> MAVEN uses convention over configuration
 *      -> if we execute the command mvn clean install maven will automatically compile both:
 *          -> src/main/java
 *          -> src/test/java
 *          -> runs the tests
 *          -> prepares jar/war files
 *          -> can even deploy
 *      -> It uses a plugin based architecture
 *          -> compiler plugin to run
 *          -> surefire plugin to run tests
 *          -> and more....
 *      -> The pom.xml is where the maven configuration is stored
 *          -> Inside the project we setup first the project coordinates
 *          -> plugins
 *          -> dependencies pulled from the Maven repository
 *      -> The Maven Repositories is where all our projects artifacts are stored
 *      -> We can also have local repositories
 *
 *      -> CREATE A MAVEN PROJECT:
 *          -> In Eclipse we can use the M2E plugin
 *              --> Select org.apache.maven.archetypes (quick start)
 *              --> Group Id: com.valdal14.project
 *              --> Artifact id: It the project name
 *
 *              <groupId>com.valdal14.maven</groupId>
 *              <artifactId>MavenTestProject</artifactId>
 *              <version>1.0-SNAPSHOT</version>
 *
 *              <!-- adding the default packaging -->
 *              <packaging>jar</packaging>
 *
 *        -> BUILD A MAVEN PROJECT:
 *          -> Select the project root and RUN as -> MAVEN INSTALL OR MAVEN CLEAN
 *          -> Note: very time we add a new dependency we should right click on the Project
 *                   look for MAVEN and select MAVEN UPDATE PROJECT
 *          -> We can run and see our test doing RUN as -> MAVEN INSTALL OR MAVEN CLEAN if we
 *             do not want to run it directly with JUNIT.
 *  ----------------------------------------------------------------------------------------------------------------
 */

public class Maven {
}
