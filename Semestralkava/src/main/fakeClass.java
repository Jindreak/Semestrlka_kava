/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import util.Kava;
import util.Kavarna;
import util.SeznamKav;
import util.SeznamKavaren;

/**
 *
 * @author Jindra
 */
public class fakeClass {
    
    private SeznamKav seznamKav = new SeznamKav();
    private SeznamKavaren seznamKavaren = new SeznamKavaren();
    
    private Kava kava1 = new Kava(1,"Brazilska", "Jemna chut, jemna sila, blabla", "Brazilie");
    private Kava kava2 = new Kava(2,"Dokotare", "Zelezna chut - nahorkla, stredni sila, blabla", "Chille");
    private Kava kava3 = new Kava(3,"Viktoria", "Temna chut - polosladka, velka sila, blabla", "Indie");
    
    
    private Kavarna kavarna1 = new Kavarna("U bosse",10,"Kralickeho", 456, "Praha", 12000);
    private Kavarna kavarna2 = new Kavarna("Na rohu",11,"Okrouhla", 33, "Brno", 14005);
    
    public fakeClass(){
        seznamKav.pridejKavu(kava1);
        seznamKav.pridejKavu(kava2);
        seznamKav.pridejKavu(kava3);
        
        seznamKavaren.pridejKavarnu(kavarna1);
        seznamKavaren.pridejKavarnu(kavarna2);
    }
    
    public SeznamKavaren getSeznamKavaren(){
        return seznamKavaren;
    }
    
    public SeznamKav getSeznamKav(){
        return seznamKav;
    }
}
