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
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import util.Kavarna;
import util.SeznamKav;
import util.SeznamKavaren;

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
    @FXML
    private Label labelZemePuvodu1;
    @FXML
    private ChoiceBox<?> seznamKavaren;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void init(Stage stage, SeznamKavaren seznam, SeznamKav kavy) {
        this.stage = stage;
        initSeznamKavaren(seznam.getKavarny());
        cancelButton.setOnAction((ActionEvent event) -> {
            stage.close();
        });

        okButton.setOnAction((ActionEvent event) -> {
            //checkValues();
            createRecord(kavy);
            stage.close();
        });

        fields = new ArrayList<>();
        fields.add(nameField);
        fields.add(popisField);
        fields.add(zemePuvoduField);

    }

    private void initSeznamKavaren(List kavarny) {
        ObservableList data = FXCollections.observableArrayList(kavarny);
        seznamKavaren.setItems(data);
    }

    private boolean checkValues(Kavarna kavarna) {
        
        
        for (TextField field : fields) {
            if (field.getText().isEmpty() || kavarna == null) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Chyba");
                alert.setHeaderText("Záznam nelze uložit.");
                alert.setContentText("Nevyplnili jste všechna pole.");
                alert.showAndWait();
                return false;
            }
        }       return true;
    }

    private void createRecord(SeznamKav seznam) {
        Kavarna kavarna = (Kavarna) seznamKavaren.getSelectionModel().getSelectedItem();
        
        if (checkValues(kavarna)){
        seznam.createCoffee(nameField.getText(), popisField.getText(), zemePuvoduField.getText(), kavarna);
        }
    }

}
