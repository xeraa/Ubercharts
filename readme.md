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



## License

[https://www.apache.org/licenses/LICENSE-2.0](https://www.apache.org/licenses/LICENSE-2.0)

Original repository: [https://github.com/comsysto/Ubercharts](https://github.com/comsysto/Ubercharts)