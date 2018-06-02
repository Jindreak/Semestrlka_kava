/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

/**
 *
 * @author Jindra
 */
public class DatabaseCon {
    
    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:src\\semestralkava\\db\\kava.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
    public SeznamKav nactiKavy(){
        String sql =    "SELECT id, Nazev, Popis, Zeme_puvodu FROM Kava" ;
        SeznamKav seznamKav = new SeznamKav();            
        
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            
            while (rs.next()) {
                
                Kava kava = new Kava(rs.getInt("id"),
                                     rs.getString("Nazev"),
                                     rs.getString("Popis"),
                                     rs.getString("Zeme_puvodu"));
                
                seznamKav.pridejKavu(kava);
                
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return seznamKav;
    }
    
    public SeznamKavaren nactiKavarny(){
        String sql =    "SELECT id, Nazev, Adresa FROM Kavarna" ;
        SeznamKavaren seznamKavaren = new SeznamKavaren();            
        
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            
            while (rs.next()) {
                
                String input = rs.getString("Adresa");
                String[] elements = input.split(" ");
                
                
                Kavarna kavarna = new Kavarna(  rs.getString("Nazev"),
                                                rs.getInt("id"),
                                                elements[0],
                                                Integer.parseInt(elements[1]),
                                                elements[2],
                                                Integer.parseInt(elements[3]));
                
                seznamKavaren.pridejKavarnu(kavarna);
                
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return seznamKavaren;
    }
    
    public void vypisHodnoceni(){
        String sql =    "SELECT Nazev, Popis, Zeme_puvodu, Pocet, Datum\n" +
                        "FROM Hodnoceni_kavy\n" +
                        "INNER JOIN Hodnoceni ON hodnoceni_id = Hodnoceni.id\n" +
                        "INNER JOIN Kava ON kava_id = Kava.id;";
                    
        
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getInt("id") +  "\t" + 
                                   rs.getString("Nazev") + "\t" +
                                   rs.getString("Popis") + "\t" +
                                   rs.getString("Zeme_puvodu")+ "\t");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public DatabaseCon (){
        
    }
    
    
    
}
