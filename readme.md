# Introduction

Ubercharts can be seen as a Java / Wicket based wrapper for the extremely powerful [Highcharts JS](http://www.highcharts.com) library. Ubercharts allows you to create Highcharts charts within your Wicket projects without touching even one single line of JavaScript code.

You can see a live demo of the current version at [http://ubercharts.xeraa.cloudbees.net](http://ubercharts.xeraa.cloudbees.net), which should look something like the following image.

![Ubercharts Preview](https://raw.github.com/xeraa/Ubercharts/master/preview.png)

Additionally the following resources are available:

* [Javadoc](http://xeraa.github.com/Ubercharts/)
* For examples and building please see the GitHub [wiki](https://github.com/xeraa/Ubercharts/wiki)
* Bug reports are more than welcome in GitHub's [bug tracker](https://github.com/xeraa/Ubercharts/issues), as are any [pull requests](https://github.com/xeraa/Ubercharts/pulls).



# Use in Your Project

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



# History

* 0.2 is the current version -- using Wicket 1.5 and Highcharts 2.1
* 0.1 using Wicket 1.4 and Highcharts 2.0 is available in the original repository: [https://github.com/comsysto/Ubercharts](https://github.com/comsysto/Ubercharts)



# License

[https://www.apache.org/licenses/LICENSE-2.0](https://www.apache.org/licenses/LICENSE-2.0)

Original repository: [https://github.com/comsysto/Ubercharts](https://github.com/comsysto/Ubercharts)

**Authors**

* Daniel Bartl
* Mohammed El Batya
* Sekib
* Philipp Krenn [@xeraa](https://www.twitter.com/xeraa)