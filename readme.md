# Introduction

You can see a live demo of the current version at [http://ubercharts.xeraa.cloudbees.net](http://ubercharts.xeraa.cloudbees.net).

The JavaDoc is available at [https://xeraa.ci.cloudbees.com/job/ubercharts/javadoc/](https://xeraa.ci.cloudbees.com/job/ubercharts/javadoc/).

For a examples, API descriptions, and anything else code-related, please see the GitHub [wiki](https://github.com/xeraa/Ubercharts/wiki).

Bug reports are more than welcome in [GitHub's bug tracker](https://github.com/xeraa/Ubercharts/issues), as are any [pull requests](https://github.com/xeraa/Ubercharts/pulls).

You can get [snapshots](https://repository-xeraa.forge.cloudbees.com/snapshot/) and [releases](https://repository-xeraa.forge.cloudbees.com/release/) for Ubercharts. To integrate them into your own POM add the following code (you might want to change the ``<version>``):

```xml
<repositories>
    <repository>
        <id>xeraa-cloudbees-release</id>
        <name>Cloudbees releases of xeraa</name>
        <url>dav:https://repository-xeraa.forge.cloudbees.com/release/</url>
        <releases>
            <enabled>true</enabled>
        </releases>
    </repository>
    <repository>
        <id>xeraa-cloudbees-snapshot</id>
        <name>Cloudbees snapshots of xeraa</name>
        <url>dav:https://repository-xeraa.forge.cloudbees.com/snapshot/</url>
        <snapshots>
            <enabled>true</enabled>
        </snapshots>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>ubercharts</groupId>
        <artifactId>ubercharts-lib</artifactId>
        <version>0.2-SNAPSHOT</version>
    </dependency>
</dependencies>
```

Gist: [https://gist.github.com/1821832#file_pom.xml](https://gist.github.com/1821832#file_pom.xml)



# Building

## Prerequisites

* [Git](http://git-scm.com)
* [Gradle](http://gradle.org)
* The cloned [repository](https://github.com/xeraa/Ubercharts.git)



## Run the Example

Invoke the following commands:

    cd Ubercharts/example-page/
    gradle jettyRun

Gradle will start to download all required dependencies and run a Jetty web server with the example page on it. You should be able to see the example page by visiting [http://localhost:8080/example-page](http://localhost:8080/example-page) in your browser.



## Eclipse

### Load

To create all needed Eclipse Project files, run the following commands:

    cd Ubercharts
    gradle eclipse

Now, open the ``ubercharts-lib`` and the ``example-page`` projects by following these steps:

* Open Eclipse
* *File*
* *Import*
* *General*
* *Existing Projects into Workspace*
* Set Root Directory to your local ``Ubercharts/example-page`` folder and repeat the same steps for ``Ubercharts/ubercharts-lib``
* *Finish*



### Run

You can also run the project inside Eclipse. In the ``example-page`` project:

* Right click on the file ``com.comsysto.insight.test.Start.java``
* *Run As*
* *Java Application*
* The application should be available at [http://localhost:8080](http://localhost:8080)



## IntelliJ IDEA

To create all needed IntelliJ IDEA Project Files, run the following commands:

    cd Ubercharts/
    gradle idea

Beside some other files, this will create a project file named ``Ubercharts.ipr`` in your ``Ubercharts`` directory. You can open this file with IntelliJ IDEA, in order to open the Ubercharts project.



## Upload to a Maven Repository

To upload the library to your own Maven repository, you need to create a custom configuration file in ``~/.gradle/gradle.properties``:

	username=[username]
	password=[password]
    releaseurl=[URL]
    snapshoturl=[URL]

To start the upload itself, run the following commands:

    cd Ubercharts/ubercharts-lib/
    gradle uploadArchives



## Include via Maven

If you have not yet included the Maven repository to which you have uploaded Ubercharts, include the following in your POM:

```xml
<repositories>
    <repository>
        <id>[ID]</id>
        <name>[Name]</name>
        <url>[Protocol, server URL, and path to the repository]</url>
        <snapshots>
            <enabled>true</enabled>
        </snapshots>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>Ubercharts</groupId>
        <artifactId>ubercharts</artifactId>
        <version>[version]</version>
    </dependency>
</dependencies>
```

Gist: [https://gist.github.com/1821940#file_pom.xml](https://gist.github.com/1821940#file_pom.xml)



## Gradle Options

To see a list of all available Gradle options run:

    cd Ubercharts/
    gradle tasks

The current list looks like this:

```shell
------------------------------------------------------------
All tasks runnable from root project
------------------------------------------------------------

Build tasks
-----------
assemble - Assembles all Jar, War, Zip, and Tar archives.
build - Assembles and tests this project.
buildDependents - Assembles and tests this project and all projects that depend on it.
buildNeeded - Assembles and tests this project and all projects it depends on.
classes - Assembles the main classes.
clean - Deletes the build directory.
jar - Assembles a jar archive containing the main classes.
testClasses - Assembles the test classes.
war - Generates a war archive with all the compiled classes, the web-app content and the libraries.

Documentation tasks
-------------------
javadoc - Generates Javadoc API documentation for the main source code.

Help tasks
----------
dependencies - Displays the dependencies of root project 'Ubercharts'.
help - Displays a help message
projects - Displays the sub-projects of root project 'Ubercharts'.
properties - Displays the properties of root project 'Ubercharts'.
tasks - Displays the tasks runnable from root project 'Ubercharts' (some of the displayed tasks may belong to subprojects).

IDE tasks
---------
cleanEclipse - Cleans all Eclipse files.
cleanIdea - Cleans IDEA project files (IML, IPR)
eclipse - Generates all Eclipse files.
idea - Generates IDEA project files (IML, IPR, IWS)

Upload tasks
------------
uploadArchives - Uploads all artifacts belonging to configuration ':ubercharts-lib:archives'.

Verification tasks
------------------
check - Runs all checks.
test - Runs the unit tests.

Web application tasks
---------------------
jettyRun - Uses your files as and where they are and deploys them to Jetty.
jettyRunWar - Assembles the webapp into a war and deploys it to Jetty.
jettyStop - Stops Jetty.

Other tasks
-----------
cleanIdeaWorkspace
install - Does a maven install of the archives artifacts into the local .m2 cache.
```



# License

[https://www.apache.org/licenses/LICENSE-2.0](https://www.apache.org/licenses/LICENSE-2.0)

Original repository: [https://github.com/comsysto/Ubercharts](https://github.com/comsysto/Ubercharts)