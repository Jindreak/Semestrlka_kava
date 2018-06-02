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
    private int lastIdent = 1;

    public ArrayList<Kavarna> getKavarny() {
        
        return kavarny;
        
    }
    
    
    public boolean zalozKavarnu(String nazev, String ulice, int cisloPopisne, String mesto, int psc){        
        Kavarna kavarna = new Kavarna(nazev, ulice, cisloPopisne, mesto, psc);
        kavarna.setId(lastIdent);
        return pridejKavarnu(kavarna);
    }
    
    
    public boolean pridejKavarnu (Kavarna kav){
        
        if(kavarny.add(kav)){
            lastIdent++;
            return true;
        }else{
            return false;
        }
        
    }
    
}
