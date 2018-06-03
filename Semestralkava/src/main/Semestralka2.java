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
import util.DatabaseCon;
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

        fakeClass fakeClass = new fakeClass();
        
        
        DatabaseCon.init();
        
        MainWindowController mainController = loader.getController();

        HandlerKavaDetail handlerDetail = new HandlerKavaDetail(mainController, DatabaseCon.getKavy().getSeznam());
        HandlerSeznamKav handleSeznam = new HandlerSeznamKav(DatabaseCon.getKavy().getSeznam(), mainController.getListKavy(), handlerDetail);
        
        DatabaseCon.getKavy().setSeznamKavy(handleSeznam);
        
        mainController.init(DatabaseCon.getKavarny(),handlerDetail, DatabaseCon.getKavy());
        
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
