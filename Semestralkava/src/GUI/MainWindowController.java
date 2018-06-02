/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author Cvesspy
 */
public class MainWindowController implements Initializable {

    @FXML
    private Button buttonRating;
    @FXML
    private TextArea popisTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        popisTextArea.setText("TAK CO JEDEŠ?");
    }    
    
    public void something(String txt){
        buttonRating.setText(txt);
    }
}
