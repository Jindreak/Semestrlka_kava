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
     * Zakladni trida pro reprezentaci kavarny.
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
    
    public Kavarna (String nazev, String ulice, int cisloPopisne, String mesto, int PSC){
        
        this.nazev = nazev;
        this.id = id;
        this.adresa = new Adresa(ulice, cisloPopisne, mesto, PSC);
        
    }
    
    public String getDlouhyNazev(){
        return id + " " +  toString();
    }
    
    /**
     * Prevadi Kavarnu do plain textu
     * @return Stringova podoba kavarny
     */
    @Override
    public String toString(){
        
        return nazev + " " + adresa.toString();
        
    }
    
    /**
     * Pocita unikatni kod pro kavarnu
     * @return integer unikatni pro kavarnu
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.nazev);
        hash = 67 * hash + this.id;
        hash = 67 * hash + Objects.hashCode(this.adresa.hashCode());
        return hash;
    }
    /**
     * Porovnava dve kavarny
     * @param obj Trida object - pro porovnani
     * @return true/false, jeslti je objekt totozny
     */
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
    
    
//=========GETRY SETRY==========================================================
    
    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Adresa getAdresa() {
        return adresa;
    }

    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }
    
    //=====Getry a setry na atributy adresy===========
    
    public String getUlice() {
        return adresa.getUlice();
    }

    public String getMesto() {
        return adresa.getMesto();
    }

    public int getCisloPopisne() {
        return adresa.getCisloPopisne();
    }

    public int getPSC() {
        return adresa.getCisloPopisne();
    }

    public void setUlice(String ulice) {
        adresa.setUlice(ulice);
    }

    public void setMesto(String mesto) {
        adresa.setMesto(mesto);
    }

    public void setCisloPopisne(int cisloPopisne) {
        adresa.setCisloPopisne(cisloPopisne);
    }

    public void setPSC(int PSC) {
        adresa.setPSC(PSC);
    } 
    

    
    
}


