/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author MarleyWins
 */
public class Hodnoceni {
    
    private int hodnoceni;
    private String datum;
    
    public Hodnoceni(int hodnoceni){
        this.hodnoceni = hodnoceni;
        this.datum = null;
    }
    
    public Hodnoceni(int hodnoceni, String datum){
        this.hodnoceni = hodnoceni;
        this.datum = datum;
    }
    
    public void setDatum(String date){                
        datum = date;
    }
    
    public String getDatum(){
        return datum;
    }
    
    public int getHodnoceni(){
        return hodnoceni;
    }
    
}
