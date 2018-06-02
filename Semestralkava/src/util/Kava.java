/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Jindra
 */
public class Kava {

    private String nazev;
    private String popis;
    private final int id;
    private final String zemePuvodu;
    private List<Hodnoceni> hodnoceni;

    public Kava(int id, String nazev, String popis, String zemePuvodu) {

        this.nazev = nazev;
        this.popis = popis;
        this.id = id;
        this.zemePuvodu = zemePuvodu;
        this.hodnoceni = new ArrayList<>();

    }

    /**
     * Getter pro jmeno kavy
     *
     * @return string jmeno kavy
     */
    public String getNazev() {
        return nazev;
    }

    /**
     * Getter pro popis kavy
     *
     * @return popis kavy
     */
    public String getPopis() {
        return popis;
    }

    /**
     * Getter pro systemove ID kavy
     *
     * @return integer ID
     */
    public int getId() {
        return id;
    }

    /**
     * Returns zeme puvodu kafe
     *
     * @return string zeme puvodu
     */
    public String getZemePuvodu() {
        return zemePuvodu;
    }

    /**
     * Setter pro nazev
     *
     * @param nazev nazev kavy
     */
    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    /**
     * Setter pro popis kavy
     *
     * @param popis popis kavy
     */
    public void setPopis(String popis) {
        this.popis = popis;
    }

    /**
     * Prida nove hodnoceni do seznamu hodnoceni kavy.
     *
     * @param nove nove hodnoceni pro pridani
     * @return false pokud pridani selhalo
     */
    public boolean pridejHodnoceni(Hodnoceni nove) {
        return (this.hodnoceni.add(nove));
    }

    /**
     * Vraci seznam hodnoceni k dalsimu zpracovani
     * @return List<Hodnoceni> hodnoceni
     */
    public List<Hodnoceni> getHodnoceni() {
        return hodnoceni;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.nazev);
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
        final Kava other = (Kava) obj;
        if (!Objects.equals(this.nazev, other.nazev)) {
            return false;
        }
        return true;
    }

}
