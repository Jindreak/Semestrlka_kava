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
public class Adresa {
    
    protected String ulice;
    protected String mesto;
    protected int cisloPopisne;
    protected int PSC;

    public Adresa(String ulice, int cisloPopisne, String mesto, int PSC) {
        this.ulice = ulice;
        this.mesto = mesto;
        this.cisloPopisne = cisloPopisne;
        this.PSC = PSC;
    }

    @Override
    public String toString() {
        
        return ulice + " " + cisloPopisne + " " + mesto + " " + PSC;
        
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.ulice);
        hash = 41 * hash + Objects.hashCode(this.mesto);
        hash = 41 * hash + this.cisloPopisne;
        hash = 41 * hash + this.PSC;
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
    
    
    
    
}
