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
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import util.SeznamKavaren;

/**
 * FXML Controller class
 *
 * @author MarleyWins
 */
public class DialogNewShopController implements Initializable {

    Stage stage;
    List<TextField> fields;
    SeznamKavaren kavarny;

    @FXML
    private TextField nameField;
    @FXML
    private TextField uliceField;
    @FXML
    private TextField cisloPopisneField;
    @FXML
    private TextField mestoField;
    @FXML
    private TextField pscField;
    @FXML
    private Button okButton;
    @FXML
    private Button cancelButton;



    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    public void init(Stage stage, SeznamKavaren kavarny) {

        this.kavarny = kavarny;

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
        fields.add(pscField);
        fields.add(uliceField);
        fields.add(mestoField);
        fields.add(cisloPopisneField);
    }

    public void checkValues() {
        for (TextField field : fields) {
            if (field.getText().isEmpty()) {
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Chyba");
                alert.setHeaderText("Záznam nelze uložit.");
                alert.setContentText("Nevyplnili jste všechna pole.");
                alert.showAndWait();
                break;
            }
        }
    }

    public void createRecord() {

        int psc;
        int cisloPopisne;
        try {
            cisloPopisne = Integer.parseInt(cisloPopisneField.getText().replaceAll("\\s+", ""));
            try {
                psc = Integer.parseInt(pscField.getText().replaceAll("\\s+", ""));
                if (!kavarny.zalozKavarnu(nameField.getText(), uliceField.getText(), cisloPopisne, mestoField.getText().replaceAll("\\s+", ""), psc)) {
                    Alert alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Chyba");
                    alert.setHeaderText("Nepodařilo se založit kavárnu.");
                    alert.setContentText("Z nějakého důvodu se nepodařilo založit kavárnu.");
                    alert.showAndWait();
                    pscField.requestFocus();
                } else {
                    Alert alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Informace");
                    alert.setHeaderText("Založení kavárny proběhlo v pořádku.");
                    alert.setContentText("Kavárna " + nameField.getText() + " byla vložena do systému.");
                    alert.showAndWait();
                    stage.close();
                }
            } catch (NumberFormatException e) {
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Chyba");
                alert.setHeaderText("Špatná hodnota");
                alert.setContentText("PSČ může obsahovat pouze čísla.");
                alert.showAndWait();
                pscField.requestFocus();
            }
        } catch (NumberFormatException e) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Chyba");
            alert.setHeaderText("Špatná hodnota");
            alert.setContentText("Číslo popisné může obsahovat pouze čísla.");
            alert.showAndWait();
            cisloPopisneField.requestFocus();
        }

    }
}
