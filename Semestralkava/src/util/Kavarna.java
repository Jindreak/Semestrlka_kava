/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Objects;

/**
 *
 * @author Jindra
 */
public class Kavarna {
    
    private String nazev;
    private int id;
    private Adresa adresa;
    
    /**
     * 
     * @param nazev         Nazev kavarny
     * @param id            ID pro databazi
     * @param ulice         Nazev ulice
     * @param cisloPopisne  Cislo popisne ulice
     * @param mesto         Mesto
     * @param PSC           Postovni smerovaci cislo
     */
    public Kavarna (String nazev, int id, String ulice, int cisloPopisne, String mesto, int PSC){
        
        this.nazev = nazev;
        this.id = id;
        this.adresa = new Adresa(ulice, cisloPopisne, mesto, PSC);
        
    }
    
    @Override
    public String toString(){
        
        return nazev + " " + adresa.toString();
        
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.nazev);
        hash = 67 * hash + this.id;
        hash = 67 * hash + Objects.hashCode(this.adresa.hashCode());
        return hash;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Kavarna other = (Kavarna) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nazev, other.nazev)) {
            return false;
        }
        if (!Objects.equals(this.adresa, other.adresa)) {
            return false;
        }
        return true;
    }

    

    

    
    
}


