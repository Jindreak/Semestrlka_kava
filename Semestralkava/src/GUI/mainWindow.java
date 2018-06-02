package GUI;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Separator;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TitledPane;
import javafx.scene.control.ToolBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class mainWindow extends VBox {

    protected final ToolBar toolBar;
    protected final Button button;
    protected final Button button0;
    protected final Button button1;
    protected final Button buttonRating;
    protected final SplitPane splitPane;
    protected final VBox vBox;
    protected final Label label;
    protected final Separator separator;
    protected final ListView listView;
    protected final VBox vBox0;
    protected final Label label0;
    protected final TitledPane titledPane;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final Label label1;
    protected final Label label2;
    protected final Label label3;
    protected final Label label4;
    protected final Label label5;
    protected final Label label6;
    protected final TitledPane titledPane0;
    protected final HBox hBox;
    protected final ImageView imageView;
    protected final TextArea textArea;
    protected final TitledPane titledPane1;
    protected final ListView listView0;
    protected final TitledPane titledPane2;
    protected final TableView tableView;
    protected final TableColumn tableColumn;
    protected final TableColumn tableColumn0;

    public mainWindow() {
   
        toolBar = new ToolBar();
        button = new Button();
        button0 = new Button();
        button1 = new Button();
        buttonRating = new Button();
        splitPane = new SplitPane();
        vBox = new VBox();
        label = new Label();
        separator = new Separator();
        listView = new ListView();
        vBox0 = new VBox();
        label0 = new Label();
        titledPane = new TitledPane();
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        label1 = new Label();
        label2 = new Label();
        label3 = new Label();
        label4 = new Label();
        label5 = new Label();
        label6 = new Label();
        titledPane0 = new TitledPane();
        hBox = new HBox();
        imageView = new ImageView();
        textArea = new TextArea();
        titledPane1 = new TitledPane();
        listView0 = new ListView();
        titledPane2 = new TitledPane();
        tableView = new TableView();
        tableColumn = new TableColumn();
        tableColumn0 = new TableColumn();

        setId("mainVbox");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(768.0);
        setPrefWidth(1024.0);

        VBox.setVgrow(toolBar, javafx.scene.layout.Priority.ALWAYS);
        toolBar.setId("toolbar");
        toolBar.setPrefHeight(40.0);
        toolBar.setPrefWidth(200.0);

        button.setId("buttonNewShop");
        button.setMnemonicParsing(false);
        button.setText("Vlo�it kav�rnu");
        button.setFont(new Font(15.0));

        button0.setId("buttonNewCoffee");
        button0.setMnemonicParsing(false);
        button0.setText("Vlo�it k�vu");
        button0.setFont(new Font(15.0));

        button1.setId("buttonRemoveCoffee");
        button1.setMnemonicParsing(false);
        button1.setText("Odebrat k�vu");
        button1.setFont(new Font(15.0));

        buttonRating.setId("buttonRemoveCoffee");
        buttonRating.setMnemonicParsing(false);
        buttonRating.setText("Ohodno? k�vu");
        buttonRating.setFont(new Font(15.0));

        VBox.setVgrow(splitPane, javafx.scene.layout.Priority.ALWAYS);
        splitPane.setDividerPositions(0.35);
        splitPane.setId("splitPane");
        splitPane.setPrefHeight(200.0);
        splitPane.setPrefWidth(200.0);

        vBox.setAlignment(javafx.geometry.Pos.TOP_CENTER);
        vBox.setId("leftBox");
        vBox.setPrefHeight(200.0);
        vBox.setPrefWidth(100.0);

        label.setId("seznamKavLabel");
        label.setText("Seznam k�v");
        label.setFont(new Font("System Bold", 25.0));

        separator.setId("leftSeparator");
        separator.setPrefWidth(200.0);

        VBox.setVgrow(listView, javafx.scene.layout.Priority.ALWAYS);
        listView.setId("listKavy");
        listView.setPrefHeight(200.0);
        listView.setPrefWidth(200.0);

        vBox0.setAlignment(javafx.geometry.Pos.TOP_CENTER);
        vBox0.setId("rightBox");
        vBox0.setPrefHeight(200.0);
        vBox0.setPrefWidth(100.0);
        vBox0.setSpacing(5.0);

        label0.setId("detailLabel");
        label0.setText("Detail k�vy");
        label0.setFont(new Font("System Bold", 25.0));

        titledPane.setId("baseInfoPane");
        titledPane.setText("Z�kladn� informace");
        titledPane.setFont(new Font(15.0));

        gridPane.setAlignment(javafx.geometry.Pos.CENTER_LEFT);
        gridPane.setHgap(5.0);
        gridPane.setId("baseInfoGrid");

        columnConstraints.setHalignment(javafx.geometry.HPos.LEFT);
        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMaxWidth(313.0);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(169.0);

        columnConstraints0.setHalignment(javafx.geometry.HPos.LEFT);
        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMaxWidth(466.0);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(466.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(30.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        label1.setText("N�zev k�vy");
        label1.setFont(new Font("System Bold", 15.0));

        GridPane.setRowIndex(label2, 1);
        label2.setText("Zem? p?vodu");
        label2.setFont(new Font("System Bold", 15.0));

        GridPane.setRowIndex(label3, 2);
        label3.setText("Pr?m?rn� hodnocen�");
        label3.setFont(new Font("System Bold", 15.0));

        GridPane.setColumnIndex(label4, 1);
        label4.setId("coffeeNameLabel");
        label4.setText("ZDE BUDE JM�NO K�VY");
        label4.setFont(new Font(14.0));

        GridPane.setColumnIndex(label5, 1);
        GridPane.setRowIndex(label5, 1);
        label5.setId("countryLabel");
        label5.setText("ZDE BUDE ZEM? P?VODU");
        label5.setFont(new Font(14.0));

        GridPane.setColumnIndex(label6, 1);
        GridPane.setRowIndex(label6, 2);
        label6.setId("countryLabel");
        label6.setText("XX / 10");
        label6.setFont(new Font(14.0));
        titledPane.setContent(gridPane);

        titledPane0.setId("popisPane");
        titledPane0.setText("Popis");
        titledPane0.setFont(new Font(15.0));

        hBox.setAlignment(javafx.geometry.Pos.CENTER);
        hBox.setId("popisHbox");
        hBox.setPrefHeight(100.0);
        hBox.setPrefWidth(200.0);
        hBox.setSpacing(3.0);

        imageView.setFitHeight(150.0);
        imageView.setFitWidth(200.0);
        imageView.setId("coffeeImage");
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("/semestralkava/img/coffee4.jpg").toExternalForm()));

        HBox.setHgrow(textArea, javafx.scene.layout.Priority.ALWAYS);
        textArea.setEditable(false);
        textArea.setId("popisArea");
        textArea.setText("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. In rutrum. Proin in tellus sit amet nibh dignissim sagittis. Etiam quis quam. Nullam rhoncus aliquam metus. Donec ipsum massa, ullamcorper in, auctor et, scelerisque sed, est. Etiam sapien elit, consequat eget, tristique non, venenatis quis, ante. In rutrum. Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur? Mauris elementum mauris vitae tortor.Curabitur ligula sapien, pulvinar a vestibulum quis, facilisis vel sapien. Mauris metus. Fusce consectetuer risus a nunc. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos hymenaeos. Etiam commodo dui eget wisi. Aliquam ornare wisi eu metus. Donec iaculis gravida nulla. Donec ipsum massa, ullamcorper in, auctor et, scelerisque sed, est. Itaque earum rerum hic tenetur a sapiente delectus, ut aut reiciendis voluptatibus maiores alias consequatur aut perferendis doloribus asperiores repellat. Integer malesuada. Phasellus faucibus molestie nisl. Duis pulvinar. Donec vitae arcu. Vivamus ac leo pretium faucibus. Donec vitae arcu. Duis sapien nunc, commodo et, interdum suscipit, sollicitudin et, dolor.");
        textArea.setWrapText(true);
        titledPane0.setContent(hBox);

        titledPane1.setId("dostupnostPane");
        titledPane1.setText("Dostupnost");
        titledPane1.setFont(new Font(15.0));

        listView0.setId("listKavarny");
        listView0.setPrefHeight(200.0);
        titledPane1.setContent(listView0);

        VBox.setVgrow(titledPane2, javafx.scene.layout.Priority.ALWAYS);
        titledPane2.setId("hodnoceniPane");
        titledPane2.setText("Hodnocen�");
        titledPane2.setFont(new Font(15.0));

        tableView.setId("tableHodnoceni");
        tableView.setPrefHeight(150.0);

        tableColumn.setId("columnDate");
        tableColumn.setPrefWidth(75.0);
        tableColumn.setText("Datum");

        tableColumn0.setId("columnHodnoceni");
        tableColumn0.setPrefWidth(75.0);
        tableColumn0.setText("Hodnocen�");
        tableView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        titledPane2.setContent(tableView);

        toolBar.getItems().add(button);
        toolBar.getItems().add(button0);
        toolBar.getItems().add(button1);
        toolBar.getItems().add(buttonRating);
        getChildren().add(toolBar);
        vBox.getChildren().add(label);
        vBox.getChildren().add(separator);
        vBox.getChildren().add(listView);
        splitPane.getItems().add(vBox);
        vBox0.getChildren().add(label0);
        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        gridPane.getChildren().add(label1);
        gridPane.getChildren().add(label2);
        gridPane.getChildren().add(label3);
        gridPane.getChildren().add(label4);
        gridPane.getChildren().add(label5);
        gridPane.getChildren().add(label6);
        vBox0.getChildren().add(titledPane);
        hBox.getChildren().add(imageView);
        hBox.getChildren().add(textArea);
        vBox0.getChildren().add(titledPane0);
        vBox0.getChildren().add(titledPane1);
        tableView.getColumns().add(tableColumn);
        tableView.getColumns().add(tableColumn0);
        vBox0.getChildren().add(titledPane2);
        splitPane.getItems().add(vBox0);
        getChildren().add(splitPane);

    }
}
