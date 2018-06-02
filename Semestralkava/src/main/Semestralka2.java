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
import javafx.stage.Stage;
import util.HandlerKavaDetail;
import util.HandlerSeznamKav;

/**
 *
 * @author Jindra
 */
public class Semestralka2 extends Application {


    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/GUI/mainWindow.fxml"));
        Parent root = loader.load();

        MainWindowController mainController = loader.getController();
        
        fakeClass fakeClass = new fakeClass();
        
        HandlerKavaDetail handlerDetail = new HandlerKavaDetail(mainController, fakeClass.getSeznamKav().getSeznam());
        HandlerSeznamKav handleSeznam = new HandlerSeznamKav(fakeClass.getSeznamKav().getSeznam(), mainController.getListKavy(),handlerDetail);

        Scene scene = new Scene(root);

        stage.setTitle("Hodnocení káv");
        stage.setScene(scene);
        stage.show();
        
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
