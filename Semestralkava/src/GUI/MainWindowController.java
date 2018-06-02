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
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author Cvesspy
 */
public class MainWindowController implements Initializable {

    @FXML
    private Button buttonNewShop;
    @FXML
    private Button buttonNewCoffee;
    @FXML
    private Button buttonRemoveCoffee;
    @FXML
    private Button buttonRating;
    @FXML
    private ListView<?> listKavy;
    @FXML
    private Label labelCoffeeName;
    @FXML
    private Label labelCountryOrigin;
    @FXML
    private Label labelAvgRating;
    @FXML
    private TextArea popisTextArea;
    @FXML
    private ListView<?> listAvailableIn;
    @FXML
    private TableView<?> tableRatings;
    @FXML
    private TableColumn<?, ?> collDate;
    @FXML
    private TableColumn<?, ?> collRating;

    public Button getButtonNewShop() {
        return buttonNewShop;
    }

    public Button getButtonNewCoffee() {
        return buttonNewCoffee;
    }

    public Button getButtonRemoveCoffee() {
        return buttonRemoveCoffee;
    }

    public Button getButtonRating() {
        return buttonRating;
    }

    public ListView<?> getListKavy() {
        return listKavy;
    }

    public Label getLabelCoffeeName() {
        return labelCoffeeName;
    }

    public Label getLabelCountryOrigin() {
        return labelCountryOrigin;
    }

    public Label getLabelAvgRating() {
        return labelAvgRating;
    }

    public TextArea getPopisTextArea() {
        return popisTextArea;
    }

    public ListView<?> getListAvailableIn() {
        return listAvailableIn;
    }

    public TableView<?> getTableRatings() {
        return tableRatings;
    }

    public TableColumn<?, ?> getCollDate() {
        return collDate;
    }

    public TableColumn<?, ?> getCollRating() {
        return collRating;
    }
    
    /**
     * Initializes the controller class.
     */    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
