# GVSU CIS457 Project 2: File Sharing System

## Introduction
This is a P2P File Sharing System that has a central server for queries and a P2P client with a GUI for downloading and uploading. The two applications are written in Kotlin, and the GUI is created using Open JavaFX 13. The project is built using Gradle build tool with the Kotlin DSL.

## Requirements
JDK 11 or JDK12 is needed to run this application. JDK 13 is not yet compatible with current stable version of Gradle (5.6).

## Running the client app
```bash
./gradlew client:run
```

## Testing the client app
```bash
./gradlew client:test
```

## Running the server app
```bash
./gradlew server:run
```

## Testing the server app
```bash
./gradlew server:test
```

## Development
Development for this project can be done using any Gradle and Kotlin compatible IDE or text-editor. Josh recommends either using IntelliJ, Eclipse with (Gradle and Kotlin plugins installed). Alternatively, VS Code (with fwcd's Kotlin extension) works well for Intellisense, but does not allow for debugging with this project.
