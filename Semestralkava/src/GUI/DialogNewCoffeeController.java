/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Jindra
 */
public class DialogNewCoffeeController implements Initializable {

    Stage stage;
    List<TextField> fields;
    
    @FXML
    private VBox mainBox;
    @FXML
    private GridPane formGrid;
    @FXML
    private Label labelName;
    @FXML
    private TextField nameField;
    @FXML
    private Label labelPopis;
    @FXML
    private Label labelZemePuvodu;
    @FXML
    private TextField popisField;
    @FXML
    private TextField zemePuvoduField;
    @FXML
    private HBox buttonBox;
    @FXML
    private Button okButton;
    @FXML
    private Button cancelButton;
    
    
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
     
    }
    
    public void init(Stage stage) {
    this.stage = stage;
    cancelButton.setOnAction((ActionEvent event) -> {
        stage.close();
    });
    
            okButton.setOnAction((ActionEvent event) -> {
            System.out.print("Clicked");
            checkValues();
            createRecord();
        });
        
        fields = new ArrayList<>();
        fields.add(nameField);
        fields.add(popisField);
        fields.add(zemePuvoduField);

    
    }
    

        
        
        public void checkValues() {
        for (TextField field : fields) {
            if (field.getText().isEmpty()) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Chyba");
                alert.setHeaderText("Záznam nelze uložit.");
                alert.setContentText("Nevyplnili jste všechna pole.");
                alert.showAndWait();
                break;
            }
        }
    }
        
        public void createRecord(){
            
        }
        

}
