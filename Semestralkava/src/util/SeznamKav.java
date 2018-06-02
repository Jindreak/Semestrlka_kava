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

    private List<Kava> seznam;

    public SeznamKav() {
        this.seznam = new ArrayList<Kava>();
    }

    public boolean pridejKavu(Kava nova) {
        return seznam.add(nova);
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
