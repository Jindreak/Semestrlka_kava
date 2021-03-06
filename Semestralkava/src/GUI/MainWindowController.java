/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.stage.Modality;
import javafx.stage.Stage;
import util.HandlerKavaDetail;
import util.Kava;
import util.SeznamKav;
import util.SeznamKavaren;

/**
 * FXML Controller class
 *
 * @author MarleyWins
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

    /**
     * geter na prvek
     * @return 
     */
    public Button getButtonNewShop() {
        return buttonNewShop;
    }
    /**
     * geter na prvek
     * @return 
     */
    public Button getButtonNewCoffee() {
        return buttonNewCoffee;
    }
    /**
     * geter na prvek
     * @return 
     */
    public Button getButtonRemoveCoffee() {
        return buttonRemoveCoffee;
    }
    /**
     * geter na prvek
     * @return 
     */
    public Button getButtonRating() {
        return buttonRating;
    }
    /**
     * geter na prvek
     * @return 
     */
    public ListView<?> getListKavy() {
        return listKavy;
    }
    /**
     * geter na prvek
     * @return 
     */
    public Label getLabelCoffeeName() {
        return labelCoffeeName;
    }
    /**
     * geter na prvek
     * @return 
     */
    public Label getLabelCountryOrigin() {
        return labelCountryOrigin;
    }
    /**
     * geter na prvek
     * @return 
     */
    public Label getLabelAvgRating() {
        return labelAvgRating;
    }
    /**
     * geter na prvek
     * @return 
     */
    public TextArea getPopisTextArea() {
        return popisTextArea;
    }
    /**
     * geter na prvek
     * @return 
     */
    public ListView<?> getListAvailableIn() {
        return listAvailableIn;
    }
    /**
     * geter na prvek
     * @return 
     */
    public TableView<?> getTableRatings() {
        return tableRatings;
    }
    /**
     * geter na prvek
     * @return 
     */
    public TableColumn<?, ?> getCollDate() {
        return collDate;
    }
    /**
     * geter na prvek
     * @return 
     */
    public TableColumn<?, ?> getCollRating() {
        return collRating;
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
    /**
     * inicializacni metoda, vola podstatne metody
     * @param kavarny podavany seznam kav
     * @param detail handler pro detail
     * @param kavy podavany seznam kav
     */
    public void init(SeznamKavaren kavarny, HandlerKavaDetail detail, SeznamKav kavy) {
        buttonNewShopInit(kavarny);
        buttonNewCoffeeInit(kavarny, kavy);
        buttonRatingInit(detail);
    }

    
    private void buttonRatingInit(HandlerKavaDetail detail) {

        buttonRating.setOnAction((ActionEvent e) -> {
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/GUI/coffeeRating.fxml"));

            Parent root;
            try {

                root = loader.load();

                CoffeeRatingController controller = loader.getController();
                controller.init(stage, detail);

                Scene scene = new Scene(root);
                stage.setTitle("Ohodnoť kávu.");
                stage.setScene(scene);
                stage.show();

            } catch (IOException ex) {
                Logger.getLogger(MainWindowController.class.getName()).log(Level.SEVERE, null, ex);
            }

        });

    }

    private void buttonNewShopInit(SeznamKavaren kavarny) {
        buttonNewShop.setOnAction((ActionEvent e) -> {
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/GUI/dialogNewShop.fxml"));

            Parent root;
            try {
                root = loader.load();

                DialogNewShopController controller = loader.getController();
                if (stage == null) {
                    System.out.println("FUCK");
                }
                if (controller == null) {
                    System.out.println("SHIT");
                }
                controller.init(stage, kavarny);

                Scene scene = new Scene(root);
                stage.setTitle("Založ novou kávu");
                stage.setScene(scene);
                stage.show();

            } catch (IOException ex) {
                Logger.getLogger(MainWindowController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    private void buttonNewCoffeeInit(SeznamKavaren seznam, SeznamKav kavy) {

        buttonNewCoffee.setOnAction((ActionEvent e) -> {
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/GUI/dialogNewCoffee.fxml"));

            Parent root;
            try {
                root = loader.load();

                DialogNewCoffeeController controller = loader.getController();
                if (stage == null) {
                    System.out.println("FUCK");
                }
                if (controller == null) {
                    System.out.println("SHIT");
                }
                controller.init(stage, seznam, kavy);

                Scene scene = new Scene(root);
                stage.setTitle("Založ novou kávu");
                stage.setScene(scene);
                stage.show();

            } catch (IOException ex) {
                Logger.getLogger(MainWindowController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });

    }

}
