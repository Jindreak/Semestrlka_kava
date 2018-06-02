/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import util.SeznamKav;
import util.Kava;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;

/**
 *  Hlavni kontrolni trida pro zakreslovani do GUI
 * @author Jindra
 */
public class FXMLDocumentController implements Initializable {
    
    //Graficke komponenty, na ktere budeme chtit sahat (menit)
    
    @FXML
    private Label labelNazevKavy;
      
    @FXML
    private Label labelZemePuvodu;
    
    @FXML
    private Label labelPrumerneHodnoceni;
    
    
    
    @FXML
    private TextArea popisArea;
    
    @FXML
    private ListView listKavarny;
    
    @FXML
    private ListView listKavy;
    
    
    
    @FXML
    private TableColumn tableHodnoceniDatum;
    
    @FXML
    private TableColumn tableHodnoceniHodnoceni;
    
    @FXML
    private Button buttonNewShop;
    
    
    
    @FXML
    private Button buttonNewCoffee;
    
    @FXML
    private Button buttonRemoveCoffee;
    
    @FXML
    private Button buttonRating;
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
    }    
    
}
