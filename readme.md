# Introduction

For a examples, API descriptions, and anything else code-related, please see the [wiki](https://github.com/xeraa/Ubercharts/wiki).

Bug reports are more than welcome in [GitHub's bug tracker](https://github.com/xeraa/Ubercharts/issues). As are any [pull requests](https://github.com/xeraa/Ubercharts/pulls).

# Getting Started

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



## IntelliJ IDEA

To create all needed IntelliJ IDEA Project Files, run the following commands:

    cd Ubercharts/
    gradle idea

Beside some other files, this will create beside a project file named ``Ubercharts.ipr`` in your ``Ubercharts`` directory. You can open this file with IntelliJ IDEA, in order to open the Ubercharts project.



## Upload to a Maven Repository

To upload the library to your own Maven repository, you need to create a custom configuration file in ``~/.gradle/gradle.properties``:

	username=<username>
	password=<password>
	repourl=scp://<domain of the server>:<absolute path on the server>

To start the upload itself, run the following commands:

    cd Ubercharts/ubercharts-lib/
    gradle uploadArchives



## Include via Maven

If you have not yet included the Maven repository to which you have uploaded Ubercharts, include the following in your ``<repositories>`` section:

    <repository>
        <id>[ID]</id>
        <name>Private Repository</name>
        <url>http://[Server URL and path to the repository]</url>
        <snapshots>
            <enabled>true</enabled>
        </snapshots>
    </repository>

In the ``<dependencies>`` section add Ubercharts:

    <dependency>
        <groupId>Ubercharts</groupId>
        <artifactId>ubercharts</artifactId>
        <version>0.2-SNAPSHOT</version>
    </dependency>



# License

[https://www.apache.org/licenses/LICENSE-2.0](https://www.apache.org/licenses/LICENSE-2.0)

Original repository: [https://github.com/comsysto/Ubercharts](https://github.com/comsysto/Ubercharts)