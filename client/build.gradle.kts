plugins {
    java
    kotlin("jvm") version "1.2.71"
    application
    id("org.openjfx.javafxplugin") version "0.0.8"
}

group = "edu.gvsu.cis.cis457"
version = "1.0-SNAPSHOT"

application {
    mainClassName = "edu.gvsu.cis.cis457.filesharingsystem.client.MainApp"
}

javafx {
    version = "13"
    modules = mutableListOf("javafx.controls", "javafx.fxml")
}

repositories {
    mavenCentral()
    jcenter()
}

sourceSets {
    main {
        resources {
            srcDir ("./src/main/resources")
        }
    }
}

dependencies {
    implementation(kotlin("stdlib"))
}