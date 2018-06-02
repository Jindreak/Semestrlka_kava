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
public class SeznamKavaren {
    
    private ObservableList<Kavarna> kavarny = FXCollections.observableArrayList();

    public ObservableList<Kavarna> getKavarny() {
        return kavarny;
    }
    
    public void pridejKavarnu (Kavarna kav){
        
        kavarny.add(kav);
        
    }
    
    public void odeberKavarnu (Kavarna kav){
        
        kavarny.remove(kav);
        
    }
    
}
