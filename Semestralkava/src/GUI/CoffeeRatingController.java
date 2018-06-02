/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

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
        hodnoceniSlider.valueProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue<? extends Number> ov,
                    Number old_val, Number new_val) {
                new_val = Math.round(new_val.floatValue());
                hodnoceniCount.setText(String.valueOf(new_val));                
            }
        });
    }

}
