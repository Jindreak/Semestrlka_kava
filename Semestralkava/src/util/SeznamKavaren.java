/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;

/**
 * Obalovaci trida pro Kavarny - standartni ArrayList
 * @author Jindra
 */
public class SeznamKavaren {
    
    private ArrayList<Kavarna> kavarny = new ArrayList<>();

    public ArrayList<Kavarna> getKavarny() {
        
        return kavarny;
        
    }
    
    public boolean pridejKavarnu (Kavarna kav){
        
        return kavarny.add(kav);
        
    }
    
}
