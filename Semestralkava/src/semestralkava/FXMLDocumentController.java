/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestralkava;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

/**
 *
 * @author Jindra
 */
public class FXMLDocumentController implements Initializable {
    
    SeznamKav SeznamKav = new SeznamKav();
    Kava kava1 = new Kava("Kava1","Dobra");
    Kava kava2 = new Kava("Kava2","Lepsi");
    Kava kava3 = new Kava("Kava3", "Nejlepsi");
    //smazat----
    Random rand = new Random();
      
    @FXML
    private ListView<Kava> kavaListView;
    

    
    @FXML
    private void handleZkouska1(ActionEvent event) {
       
       //kavy.add("Kava"+rand.nextInt(50));
       kavaListView.setItems(SeznamKav.getSeznamKav());
       
    }
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        SeznamKav.pridejKavu(kava1);
        SeznamKav.pridejKavu(kava2);
        SeznamKav.pridejKavu(kava3);
        
    }    
    
}
