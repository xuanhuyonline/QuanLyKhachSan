/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import pojo.Phong_Pojo;

/**
 *
 * @author Le Xuan Huy
 */
public class Phong_Dao {

    private SQL con;

    public Phong_Dao() {
        con = new SQL("DESKTOP-95N5PBV", "QLKS", "sa", "1");
    }

    public void LayDSPhong(Vector vdata) {

        vdata.removeAllElements();
        try {
            con.OpenConnection();
            String sql = "SELECT * FROM PHONG";
            PreparedStatement preStatement = con.GetConnect().prepareStatement(sql);
            ResultSet rs = preStatement.executeQuery();
            while (rs.next()) {
                String MAPHONG = rs.getString("MAPHONG");
                String TENPHONG = rs.getString("TENPHONG");
                String LOAIPHONG = rs.getString("LOAIPHONG");
                String GIAPHONG = rs.getString("GIAPHONG");
                String TINHTRANG = rs.getString("TINHTRANG");
                String CHUTHICH = rs.getString("CHUTHICH");

                Vector<String> v = new Vector<String>();
                v.add(MAPHONG);
                v.add(TENPHONG);
                v.add(LOAIPHONG);
                v.add(GIAPHONG);
                v.add(TINHTRANG);
                v.add(CHUTHICH);
                vdata.add(v);
            }
            con.CloseConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Phong_Dao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void ThemPhong(Phong_Pojo x) {
        try {
            con.OpenConnection();
            String sql = "{call ThemPhong(?,?,?,?,?,?)}";
            CallableStatement callStatement = con.GetConnect().prepareCall(sql);
            callStatement.setString(1, x.getMAPHONG());
            callStatement.setString(2, x.getTENPHONG());
            callStatement.setString(3, x.getLOAIPHONG());
            callStatement.setDouble(4, x.getGIAPHONG());
            callStatement.setString(5, x.getTINHTRANG());
            callStatement.setString(6, x.getCHUTHICH());        
            callStatement.execute();
            con.CloseConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Phong_Dao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void SuaPhong(Phong_Pojo x) {
        try {
            con.OpenConnection();
            String sql = "{call SuaPhong(?,?,?,?,?,?)}";
            CallableStatement callStatement = con.GetConnect().prepareCall(sql);
            callStatement.setString(1, x.getMAPHONG());
            callStatement.setString(2, x.getTENPHONG());
            callStatement.setString(3, x.getLOAIPHONG());
            callStatement.setDouble(4, x.getGIAPHONG());
            callStatement.setString(5, x.getTINHTRANG());
            callStatement.setString(6, x.getCHUTHICH());          
            callStatement.execute();
            con.CloseConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Phong_Dao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void XoaPhong(Phong_Pojo x, int pos)
    {
        if(pos>=0)
        {
            try {
                con.OpenConnection();
                String sql = "{call XoaPhong(?)}";
                CallableStatement callStatement = con.GetConnect().prepareCall(sql);
                callStatement.setString(1, x.getMAPHONG());
                callStatement.execute();
                con.CloseConnection();               
            } catch (Exception ex) {
                Logger.getLogger(Phong_Dao.class.getName()).log(Level.SEVERE, null,ex);
            }
        }
    }
    
    public void FindPhong(Vector vdata,String timPhong){        
        try {
            con.OpenConnection();
            String sqlSelect = "{call FindPhong(?)}";
            CallableStatement callStatement = con.GetConnect().prepareCall(sqlSelect);
            callStatement.setString(1,timPhong+"%");           
            ResultSet rs = callStatement.executeQuery();
            vdata.removeAllElements();
            while(rs.next())
            {
                String MAPHONG = rs.getString("MAPHONG");
                String TENPHONG = rs.getString("TENPHONG");
                String LOAIPHONG = rs.getString("LOAIPHONG");
                String GIAPHONG = rs.getString("GIAPHONG");
                String TINHTRANG = rs.getString("TINHTRANG");
                String CHUTHICH = rs.getString("CHUTHICH");
                Vector<String> v = new Vector<String>();
                v.add(MAPHONG);
                v.add(TENPHONG);
                v.add(LOAIPHONG);
                v.add(GIAPHONG);
                v.add(TINHTRANG);
                v.add(CHUTHICH);
                vdata.add(v);
            }
            con.CloseConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Phong_Dao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void FindPhongTrong(Vector vdata,String phongTrong){       
        try {
            con.OpenConnection();
            String sqlSelect = "{call FindPhongTrong(?)}";
            CallableStatement callStatement = con.GetConnect().prepareCall(sqlSelect);
            callStatement.setString(1,phongTrong);           
            ResultSet rs = callStatement.executeQuery();
            vdata.removeAllElements();
            while(rs.next())
            {
                String MAPHONG = rs.getString("MAPHONG");
                String TENPHONG = rs.getString("TENPHONG");
                String LOAIPHONG = rs.getString("LOAIPHONG");
                String GIAPHONG = rs.getString("GIAPHONG");
                String TINHTRANG = rs.getString("TINHTRANG");
                String CHUTHICH = rs.getString("CHUTHICH");
                Vector<String> v = new Vector<String>();
                v.add(MAPHONG);
                v.add(TENPHONG);
                v.add(LOAIPHONG);
                v.add(GIAPHONG);
                v.add(TINHTRANG);
                v.add(CHUTHICH);
                vdata.add(v);
            }
            con.CloseConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Phong_Dao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void DatPhong(Phong_Pojo x) {
        try {
            con.OpenConnection();
            String sql = "{call DatPhong(?)}";
            CallableStatement callStatement = con.GetConnect().prepareCall(sql);
            callStatement.setString(1, x.getMAPHONG());
            callStatement.execute();
            con.CloseConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Phong_Dao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    
    
}
