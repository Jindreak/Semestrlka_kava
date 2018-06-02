/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author MarleyWins
 */
public class HandlerSeznamKav {

    private List<Kava> kavy;
    private ListView<String> seznam;
    private ObservableList<String> data;
    private HandlerKavaDetail detail;

    public HandlerSeznamKav(List<Kava> kavy, ListView seznam, HandlerKavaDetail detail) {
        this.kavy = kavy;
        this.seznam = seznam;
        data = FXCollections.observableArrayList();
        seznam.setItems(data);
        this.detail = detail;                
        init();
    }

    private void init() {       

        seznam.setOnMouseClicked((MouseEvent event) -> {
            String clickedRow = seznam.getSelectionModel().getSelectedItem();
            detail.showDetail(clickedRow);
        });

        loadData();
    }

    private void loadData() {
        for (Kava kava : kavy) {
            data.add(kava.getNazev());
        }
    }
    
    public void aktualizuj(){
        data.clear();
        init();
    }

}
