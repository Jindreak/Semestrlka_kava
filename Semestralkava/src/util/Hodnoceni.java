/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Date;






/**
 *
 * @author MarleyWins
 */
public class Hodnoceni {
    
    private int hodnoceni;
    private Date datum;
    
    public Hodnoceni(int hodnoceni){
        this.hodnoceni = hodnoceni;
        this.datum = new Date();
    }
    
    public void setDatum(Date date){                
        datum = date;
    }
    
    public Date getDatum(){
        return datum;
    }
    
    public int getHodnoceni(){
        return hodnoceni;
    }
    
}
