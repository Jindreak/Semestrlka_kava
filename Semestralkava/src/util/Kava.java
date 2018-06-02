/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Jindra
 */
public class Kava {
    
private String Nazev;
private String Popis;

public Kava (String nazev, String popis){
    
    Nazev = nazev;
    Popis = popis;
}

@Override
public String toString (){
    
    return Nazev + " - " + Popis;
    
  }
    
}
