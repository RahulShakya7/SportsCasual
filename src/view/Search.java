/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.SportsItemsDB;
import model.ProductList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Void
 */
public class Search {
    static int wearables = 0;
    static int sportsitems = 0;
    static int equipments = 0;
    public static ArrayList<ProductList> sportsitemsSearch(String model){
        ArrayList<ProductList> list = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection("jdbc:sqlite:DBs/wearablesDB.db");
            PreparedStatement ps = con.prepareStatement("SELECT * FROM wearables WHERE mbrand=? COLLATE NOCASE OR mmodel=? COLLATE NOCASE");
            ps.setString(1, model);
            ps.setString(2, model);
            ResultSet rs = ps.executeQuery();
            
            ProductList pl, gl, kl=null;
            
            while(rs.next()){
                pl = new ProductList(rs.getString("mbrand"),rs.getString("mmodel"),
                        rs.getInt("mprice"),rs.getInt("mquantity"),rs.getString("mdescription"),
                        rs.getString("mphoto"));
                wearables++;
                
                list.add(pl);

            }
            con.close();
            
            con = DriverManager.getConnection("jdbc:sqlite:DBs/sportsitemsDB.db");
            ps = con.prepareStatement("SELECT * FROM sportsitems WHERE mbrand=? COLLATE NOCASE OR mmodel=? COLLATE NOCASE");
            ps.setString(1, model);
            ps.setString(2, model);
            rs = ps.executeQuery();

            
            while(rs.next()){
                gl = new ProductList(rs.getString("mbrand"),rs.getString("mmodel"),
                        rs.getInt("mprice"),rs.getInt("mquantity"),rs.getString("mdescription"),
                        rs.getString("mphoto"));
                sportsitems++;
                list.add(gl);

            }
            con.close();
            
            con = DriverManager.getConnection("jdbc:sqlite:DBs/equipmentsDB.db");
            ps = con.prepareStatement("SELECT * FROM equipments WHERE mbrand=? COLLATE NOCASE OR mmodel=? COLLATE NOCASE");
            ps.setString(1, model);
            ps.setString(2, model);
            rs = ps.executeQuery();

            
            while(rs.next()){
                kl = new ProductList(rs.getString("mbrand"),rs.getString("mmodel"),
                        rs.getInt("mprice"),rs.getInt("mquantity"),rs.getString("mdescription"),
                        rs.getString("mphoto"));
                equipments++;
                list.add(kl);

            }
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(SportsItemsDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
   }
    
}
