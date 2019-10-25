plugins {
    kotlin("jvm") version "1.2.71"
    application
}

group = "edu.gvsu.cis.cis457"
version = "1.0-SNAPSHOT"

repositories {
    jcenter()
    mavenCentral()
}

application {
    mainClassName = "edu.gvsu.cis.cis457.filesharingsystem.server.ProgramKt"
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.5.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.5.2")
}

tasks.withType<Test> {
    useJUnitPlatform()
}