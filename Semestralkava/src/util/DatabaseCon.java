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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Jindra
 */
public class DatabaseCon {

    private static SeznamKavaren seznamKavaren;
    private static SeznamKav seznamKav;
    private static Map<Integer, Hodnoceni> hodnoceni;

    private static Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite::resource:kava.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());            
        }
        return conn;
    }

    private static SeznamKav nactiKavy() {
        String sql = "SELECT id, Nazev, Popis, Zeme_puvodu FROM Kava";
        seznamKav = new SeznamKav();

        //-------Nacteni zakladni listu kav
        try (Connection conn = DatabaseCon.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

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

        //-----Prirazeni kave kavarny
        sql = "SELECT kavy_id, kavarny_id FROM kavy_kavarny";

        try (Connection conn = DatabaseCon.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            Kava kava = null;
            Kavarna kavarna = null;

            while (rs.next()) {

                int idKavy = rs.getInt("kavy_id");
                int idKavarny = rs.getInt("kavarny_id");

                Iterator<Kava> it = seznamKav.getSeznam().iterator();
                Iterator<Kavarna> it2 = seznamKavaren.getKavarny().iterator();

                while (it.hasNext()) {

                    kava = it.next();
                    if (kava.getId() == idKavy) {
                        break;
                    }

                }

                while (it2.hasNext()) {

                    kavarna = it2.next();

                    if (kavarna.getId() == idKavarny) {
                        kava.addKavarnu(kavarna);

                    }

                }

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        //-----Prirazeni kave hodnoceni
        sql = "SELECT kava_id, hodnoceni_id FROM Hodnoceni_kavy";
        String sql2 = "SELECT id, Datum, Pocet FROM Hodnoceni";

        try (Connection conn = DatabaseCon.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            Kava kava = null;
            Kavarna kavarna = null;

            while (rs.next()) {

                int idKavy = rs.getInt("kava_id");
                int idHodnoceni = rs.getInt("hodnoceni_id");

                Iterator<Kava> it = seznamKav.getSeznam().iterator();

                while (it.hasNext()) {

                    kava = it.next();
                    if (kava.getId() == idKavy) {
                        break;
                    }

                }

                Hodnoceni h = hodnoceni.get(idHodnoceni);

                kava.addHodnoceni(h);

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return seznamKav;
    }

    private static SeznamKavaren nactiKavarny() {
        String sql = "SELECT id, Nazev, Adresa FROM Kavarna";
        seznamKavaren = new SeznamKavaren();

        try (Connection conn = DatabaseCon.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {

                String input = rs.getString("Adresa");
                String[] elements = input.split(" ");

                Kavarna kavarna = new Kavarna(rs.getString("Nazev"),
                        rs.getInt("id"),
                        elements[0],
                        Integer.parseInt(elements[1]),
                        elements[2],
                        Integer.parseInt(elements[3]));

                seznamKavaren.pridejKavarnu(kavarna);

            }
        } catch (SQLException e) {
            System.out.print("SQL CHYBKA");
            System.out.println(e.getMessage());
        }
        return seznamKavaren;
    }

    private static Map<Integer, Hodnoceni> nactiHodnoceni() {

        Map<Integer, Hodnoceni> map1 = new HashMap<Integer, Hodnoceni>();

        String sql = "SELECT id, Datum, Pocet FROM Hodnoceni";

        try (Connection conn = DatabaseCon.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {

                Hodnoceni hodnoceni = new Hodnoceni(rs.getInt("Pocet"),
                        rs.getString("Datum"));

                map1.put(rs.getInt("id"), hodnoceni);

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return map1;

    }

    private static int posledniIndexHodnoceni() {

        String sql = "SELECT id FROM Hodnoceni";
        int index = -1;

        try (Connection conn = DatabaseCon.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {

                index = rs.getInt("id");

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return index;

    }

    public void vypisHodnoceni() {
        String sql = "SELECT Nazev, Popis, Zeme_puvodu, Pocet, Datum\n"
                + "FROM Hodnoceni_kavy\n"
                + "INNER JOIN Hodnoceni ON hodnoceni_id = Hodnoceni.id\n"
                + "INNER JOIN Kava ON kava_id = Kava.id;";

        try (Connection conn = DatabaseCon.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "\t"
                        + rs.getString("Nazev") + "\t"
                        + rs.getString("Popis") + "\t"
                        + rs.getString("Zeme_puvodu") + "\t");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private DatabaseCon() {
    }

    public static void init() {

        seznamKavaren = nactiKavarny();
        hodnoceni = nactiHodnoceni();
        seznamKav = nactiKavy();

    }

    public static SeznamKavaren getKavarny() {
        return seznamKavaren;
    }

    public static SeznamKav getKavy() {
        return seznamKav;
    }

    public static void vlozKavarnu(int id, String nazev, String ulice, int cisloPopisne, String mesto, int psc) {

        String sql = "INSERT INTO Kavarna (id, Nazev, Adresa) VALUES(?,?,?)";
        String adresa = ulice + " " + cisloPopisne + " " + mesto + " " + psc;

        try (Connection conn = DatabaseCon.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            pstmt.setString(2, nazev);
            pstmt.setString(3, adresa);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void vlozKavu(Kava kava, Kavarna kavarna) {

        String sql = "INSERT INTO Kava (id, Nazev, Popis, Zeme_puvodu) VALUES(?,?,?,?)";

        try (Connection conn = DatabaseCon.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, kava.getId());
            pstmt.setString(2, kava.getNazev());
            pstmt.setString(3, kava.getPopis());
            pstmt.setString(4, kava.getZemePuvodu());
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        sql = "INSERT INTO kavy_kavarny (kavy_id, kavarny_id) VALUES(?,?)";

        try (Connection conn = DatabaseCon.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, kava.getId());
            pstmt.setInt(2, kavarna.getId());
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void vlozHodnoceni(Kava kava, Hodnoceni hodnoceni) {

        String sql = "INSERT INTO Hodnoceni (Datum, Pocet) VALUES(?,?)";
        int indexHodnoceni = -1;

        try (Connection conn = DatabaseCon.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, hodnoceni.getDatum());
            pstmt.setInt(2, hodnoceni.getHodnoceni());
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        indexHodnoceni = posledniIndexHodnoceni();

        sql = "INSERT INTO Hodnoceni_kavy (kava_id, hodnoceni_id) VALUES(?,?)";

        try (Connection conn = DatabaseCon.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, kava.getId());
            pstmt.setInt(2, indexHodnoceni);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

}
