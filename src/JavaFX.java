/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0907thverlynde
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
public class JavaFX extends Application {
@Override
public void start(Stage primaryStage) {
Button btOK = new Button("OK");
Scene scene = new Scene(btOK, 200, 250);
primaryStage.setTitle("MyJavaFX"); // Set the stage title
primaryStage.setScene(scene); // Place the scene in the stage
primaryStage.show(); // Display the stage
}
public static void main(String[] args) {
Application.launch(args);
}}