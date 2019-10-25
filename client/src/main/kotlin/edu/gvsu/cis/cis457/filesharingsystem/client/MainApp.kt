package edu.gvsu.cis.cis457.filesharingsystem.client

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage

class MainApp : Application() {
    override fun start(stage: Stage?) {
        val sceneUrl = javaClass.getResource("scene.fxml")
        val root: Parent = FXMLLoader.load(sceneUrl)
        val scene = Scene(root)

        val styleUrl = javaClass.getResource("styles.css")
        scene.stylesheets.add(styleUrl.toExternalForm())

        if (stage != null) {
            stage.title = "File Sharing System"
            stage.scene = scene
            stage.show()
        }
    }

    companion object {
        @JvmStatic fun main(args: Array<String>) {
            launch(MainApp::class.java, *args)
        }
    }
}