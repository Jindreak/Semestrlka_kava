/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Objects;

/**
 * Trida pro ukladani adresy  - vyuziva hlavne Kavarna
 * @author Jindra
 */
public class Adresa {
    
    protected String ulice;
    protected String mesto;
    protected int cisloPopisne;
    protected int PSC;
    
    /**
     * Konstruktor pro adresu
     * @param ulice Ulice
     * @param cisloPopisne Popisne cislo
     * @param mesto Mesto
     * @param PSC Postovni smerovaci cislo
     */
    public Adresa(String ulice, int cisloPopisne, String mesto, int PSC) {
        this.ulice = ulice;
        this.mesto = mesto;
        this.cisloPopisne = cisloPopisne;
        this.PSC = PSC;
    }

    /**
     * Prevadi adresu do plain textu
     * @return Stringova podoba adresy
     */
    @Override
    public String toString() {
        
        return ulice + " " + cisloPopisne + " " + mesto + " " + PSC;
        
    }

    /**
     * Unikatni cislo generovano pro adresu
     * @return integer unikatni pro adresu
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.ulice);
        hash = 41 * hash + Objects.hashCode(this.mesto);
        hash = 41 * hash + this.cisloPopisne;
        hash = 41 * hash + this.PSC;
        return hash;
    }
    
    
    /**
     * Porovnava objekt, zda je shodny
     * @param obj Objekt, ktery se ma porovnat
     * @return true/false zda je objekt stejny
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
        final Adresa other = (Adresa) obj;
        if (this.cisloPopisne != other.cisloPopisne) {
            return false;
        }
        if (this.PSC != other.PSC) {
            return false;
        }
        if (!Objects.equals(this.ulice, other.ulice)) {
            return false;
        }
        if (!Objects.equals(this.mesto, other.mesto)) {
            return false;
        }
        return true;
    }
    
    //=========GETRY SETRY======================================================

    public String getUlice() {
        return ulice;
    }

    public String getMesto() {
        return mesto;
    }

    public int getCisloPopisne() {
        return cisloPopisne;
    }

    public int getPSC() {
        return PSC;
    }

    public void setUlice(String ulice) {
        this.ulice = ulice;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }

    public void setCisloPopisne(int cisloPopisne) {
        this.cisloPopisne = cisloPopisne;
    }

    public void setPSC(int PSC) {
        this.PSC = PSC;
    }  
    
}
