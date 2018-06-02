/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import GUI.mainWindow;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Jindra
 */
public class Semestralka2 extends Application {
    
    private VBox root;
    
    @Override
    public void start(Stage stage) throws Exception {
        
        root = new mainWindow();
                
        Scene scene = new Scene(root);
        
        stage.setTitle("Hodnocení káv");
        stage.setScene(scene);
        stage.show();
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
