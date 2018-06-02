/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import util.HandlerKavaDetail;
import util.Hodnoceni;
import util.Kava;

/**
 * FXML Controller class
 *
 * @author Cvesspy
 */
public class CoffeeRatingController implements Initializable {

    @FXML
    private Label hodnoceniCount;
    @FXML
    private Slider hodnoceniSlider;
    @FXML
    private Button buttonCancel;
    @FXML
    private Button buttonConfirm;
    @FXML
    private Label labelHodnocení;
    @FXML
    private Label hodnoceniCount1;
    @FXML
    private TextField textFieldDatum;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    public void init(Stage stage, HandlerKavaDetail detail) {
        initSliderRating();
        initButtonConfirm(detail, stage);
        initButtonCancel(stage);
    }

    private void initButtonConfirm(HandlerKavaDetail detail, Stage stage) {
        buttonConfirm.setOnAction((ActionEvent e) -> {
            if (detail.getCurrentDetail() != null) {
                checkDateFormat();
                writeHodnoceni(detail);
                stage.close();
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Chyba");
                alert.setHeaderText("Záznam nelze uložit.");
                alert.setContentText("Nejdříve vyberte kávu, kterouc chcete hodnotit, ze seznamu v levo.");
                alert.showAndWait();
                stage.close();
            }
        });
    }

    private void writeHodnoceni(HandlerKavaDetail detail) {
        Hodnoceni hodnoceni = new Hodnoceni(Integer.valueOf(hodnoceniCount.getText()));
        hodnoceni.setDatum(textFieldDatum.getText());
        detail.getCurrentDetail().addHodnoceni(hodnoceni);
        detail.showDetail(detail.getCurrentDetail().getNazev());
    }

    private void initButtonCancel(Stage stage) {
        buttonCancel.setOnAction((ActionEvent e) -> {
            stage.close();
        });
    }

    private void initSliderRating() {
        hodnoceniCount.setText(String.valueOf("0"));
        hodnoceniSlider.valueProperty().addListener((ObservableValue<? extends Number> ov, Number old_val, Number new_val) -> {
            new_val = Math.round(new_val.floatValue());
            hodnoceniCount.setText(String.valueOf(new_val));
        });
    }

    public void checkDateFormat() {

        Pattern p = Pattern.compile("^\\d\\d?\\.(0?[0-9]|1[012])\\.\\d{4}$");
        Matcher m = p.matcher(textFieldDatum.getText());
        if (textFieldDatum.getText().isEmpty() || !m.find()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Chyba");
            alert.setHeaderText("Záznam nelze uložit.");
            alert.setContentText("Datum vyplňujte ve formátu dd.mm.yyy.\n Např. 7.6.1995");
            alert.showAndWait();
        }
    }

}
