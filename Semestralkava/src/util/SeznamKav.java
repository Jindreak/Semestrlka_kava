/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Jindra
 */
public class SeznamKav {
    
    private ObservableList<Kava> kavy = FXCollections.observableArrayList();
    
    public ObservableList<Kava> getSeznamKav (){
        
        return kavy;
        
    }
    

    
    public void pridejKavu(Kava k){
        kavy.add(k);
    }
    
    public void odeberKavu (Kava k){
        kavy.remove(k);
    }
    
    
}
