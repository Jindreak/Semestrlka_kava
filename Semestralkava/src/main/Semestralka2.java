/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import GUI.MainWindowController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Jindra
 */
public class Semestralka2 extends Application {


    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation((getClass().getResource("/GUI/mainWindow.fxml")));
        Parent root = loader.load();

        MainWindowController mainController = loader.getController();
        
        mainController.something("delate si ze me prdel");

        Scene scene = new Scene(root);

        stage.setTitle("Hodnocení káv");
        stage.setScene(scene);
        stage.show();
        if (mainController == null) {
            System.out.println("FUCK THIS SHIT.");
        }
        //mainController.initialize(null, null);
       // mainController.nahrajKafe();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
