/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jindra
 */
public class SeznamKav {
    
    private HandlerSeznamKav kavy;

    private List<Kava> seznam;

    public SeznamKav() {
        this.seznam = new ArrayList<Kava>();
    }

    public boolean pridejKavu(Kava nova) {
        return seznam.add(nova);
    }
    
    public void setSeznamKavy (HandlerSeznamKav kavy){
        this.kavy = kavy;
    }
    
    public void createCoffee(String nazev, String popis, String zemePuvodu, Kavarna kavarna){
        Kava kava = new Kava(nazev, popis, zemePuvodu);
        kava.addKavarnu(kavarna);
        kava.setID(15);
        pridejKavu(kava);
        kavy.aktualizuj();
        System.out.print(kava.toString());
    }
    
    public Kava odeberKavu(int ident){
        
        Kava deleted = null;
        for (Kava kava : seznam){
            if(kava.getId() == ident){
                deleted = kava;
                seznam.remove(deleted);
                break;
            }
        }
        return deleted;
    }

    public List<Kava> getSeznam(){
        return this.seznam;
    }
    
    public void init(){
        //TODO IMPLEMENTACE NACTENI Z DB
    }
}
