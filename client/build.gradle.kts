group = "edu.gvsu.cis.cis457"
version = "1.0-SNAPSHOT"

plugins {
    java
    kotlin("jvm") version "1.2.71"
    application
    id("org.openjfx.javafxplugin") version "0.0.8"
}

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

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.5.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.5.2")
}

tasks.withType<Test> {
    useJUnitPlatform()
}