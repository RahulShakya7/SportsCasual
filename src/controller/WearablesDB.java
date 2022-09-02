/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import model.ProductList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Void
 */
public class WearablesDB {
    public static boolean flag = false;
    public static int insertIntoWearablesDB(String brand, String model, int price, int qty, String description, String imagePath){
        int result = 0;
        try {
            Connection con = DriverManager.getConnection("jdbc:sqlite:DBs/wearablesDB.db");
         
            PreparedStatement ps = con.prepareStatement("INSERT INTO wearables(mbrand, mmodel, mprice,"
                    + "mquantity, mdescription, mphoto) VALUES(?,?,?,?,?,?)");
            
            ps.setString(1, brand);
            ps.setString(2, model);
            ps.setInt(3, price);
            ps.setInt(4, qty);
            ps.setString(5, description);
            ps.setString(6, imagePath);
            if(ps.executeUpdate()==1)
                JOptionPane.showMessageDialog(null, "Entry successful!");
            result = 1;
            
        } catch (SQLException ex) {
            Logger.getLogger(WearablesDB.class.getName()).log(Level.SEVERE, null, ex);
    }
    return result;
    }
    
    public static void updateWearablesDB(String model, int qty){
         try {
            Connection con = DriverManager.getConnection("jdbc:sqlite:DBs/wearablesDB.db");
            
            PreparedStatement ps = con.prepareStatement("UPDATE wearables SET mquantity=? WHERE mmodel=?");
            
            ps.setInt(1, qty);
            ps.setString(2, model);
            if(ps.executeUpdate()==0)
                JOptionPane.showMessageDialog(null, "Entry does not exist!");
            else if(ps.executeUpdate()==1 && flag){
                JOptionPane.showMessageDialog(null, "Stock updated successfully!");
                flag = false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(WearablesDB.class.getName()).log(Level.SEVERE, null, ex);

    }
    }
    
    public static ArrayList<ProductList> TableGenerator(){
        ArrayList<ProductList> list = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection("jdbc:sqlite:DBs/wearablesDB.db");
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT mbrand, mmodel, mprice,mquantity, mdescription, mphoto FROM wearables");
            
            ProductList pl;
            
            while(rs.next()){
                pl = new ProductList(rs.getString("mbrand"),rs.getString("mmodel"),
                        rs.getInt("mprice"),rs.getInt("mquantity"),rs.getString("mdescription"),
                        rs.getString("mphoto"));
                
                list.add(pl);

            }
            
        } catch (SQLException ex) {
            Logger.getLogger(WearablesDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
}
    
   public static ArrayList<ProductList> homePageContent(){
        ArrayList<ProductList> list = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection("jdbc:sqlite:DBs/wearablesDB.db");
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT mbrand, mmodel, mprice,mquantity, mdescription, mphoto FROM wearables ORDER BY id DESC LIMIT 3");
            
            ProductList pl;
            
            while(rs.next()){
                pl = new ProductList(rs.getString("mbrand"),rs.getString("mmodel"),
                        rs.getInt("mprice"),rs.getInt("mquantity"),rs.getString("mdescription"),
                        rs.getString("mphoto"));
                
                list.add(pl);

            }
            
        } catch (SQLException ex) {
            Logger.getLogger(WearablesDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
   }
   public static ArrayList<ProductList> checkStock(){
        ArrayList<ProductList> list = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection("jdbc:sqlite:DBs/wearablesDB.db");
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT mbrand, mmodel, mprice, mquantity FROM wearables");
            
            ProductList pl;
            
            while(rs.next()){
                pl = new ProductList(rs.getString("mbrand"),rs.getString("mmodel"),
                        0, rs.getInt("mquantity"),null, null);
                
                list.add(pl);

            }
            
        } catch (SQLException ex) {
            Logger.getLogger(WearablesDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
   }
    
   public static void delete(String model){
        try {
            Connection con = DriverManager.getConnection("jdbc:sqlite:DBs/wearablesDB.db");
            PreparedStatement ps = con.prepareStatement("DELETE FROM wearables WHERE mmodel=?");
            ps.setString(1, model);
            if(ps.executeUpdate()==0)
                JOptionPane.showMessageDialog(null, "Entry does not exist!");
            else
                JOptionPane.showMessageDialog(null, "Entry deleted successfully!");
            
        } catch (SQLException ex) {
            Logger.getLogger(WearablesDB.class.getName()).log(Level.SEVERE, null, ex);
        }
            
   }
    
}
