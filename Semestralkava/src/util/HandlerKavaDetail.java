/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import GUI.MainWindowController;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author Cvesspy
 */
public class HandlerKavaDetail {
    
    private MainWindowController controller;            
    private List<Kava> kavy;
    private Kava currentDetail;
    
    public HandlerKavaDetail(MainWindowController controller, List<Kava> kavy ){
        currentDetail = null;
        this.controller = controller;
        this.kavy = kavy;
        init();
    }
    
    private void init(){
        controller.getLabelCoffeeName().setText("");
        controller.getLabelCountryOrigin().setText("");
        controller.getLabelAvgRating().setText("");
        controller.getPopisTextArea().setText("");
    }
    
    public void showDetail(String name){
        
        for(Kava kava : kavy){
            if(kava.getNazev().equals(name)){
                currentDetail = kava;
                break;
            }
        }
        
        controller.getLabelCoffeeName().setText(currentDetail.getNazev());
        controller.getLabelCountryOrigin().setText(currentDetail.getZemePuvodu());
        controller.getPopisTextArea().setText(currentDetail.getPopis());
        controller.getLabelAvgRating().setText(String.valueOf(currentDetail.getHodnoceniAvg()) + "/10");
        
        loadDostupnost();
        loadRating();
    }
    
    public void loadDostupnost(){
        
        List<Kavarna> dostupnost = currentDetail.getDostupnost();
        ObservableList<String> data = FXCollections.observableArrayList();
        ListView seznam = controller.getListAvailableIn();
        seznam.setItems(data);
        
        for (Kavarna kavarna : dostupnost) {
            data.add(kavarna.toString());
        }
        
    }
    
    public void loadRating(){        
        ObservableList<Hodnoceni> hodnoceni = FXCollections.observableArrayList(currentDetail.getHodnoceni());               
        TableView hodnoceniTable = controller.getTableRatings();        
        PropertyValueFactory factory = new PropertyValueFactory("hodnoceni");     
        controller.getCollRating().setCellValueFactory(factory);
        hodnoceniTable.setItems(hodnoceni);
    }
}
