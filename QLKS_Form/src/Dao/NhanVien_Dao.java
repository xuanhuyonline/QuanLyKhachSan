/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pojo.NhanVien_Pojo;
import qlks_form.NhanVien_Form;
/**
 *
 * @author Le Xuan Huy
 */
public class NhanVien_Dao {
    private SQL con;
    
    public NhanVien_Dao() 
    {
        con=new SQL("DESKTOP-95N5PBV", "QLKS", "sa", "1");
    }
    
    public void ThemNhanVien(NhanVien_Pojo x) {
        try {
            con.OpenConnection();
            String sql = "{call ThemNhanVien(?,?,?,?,?,?)}";
            CallableStatement callStatement = con.GetConnect().prepareCall(sql);
            callStatement.setString(1, x.getMANV());
            callStatement.setString(2, x.getTENNV());
            callStatement.setString(3, x.getCHUCVU());
            callStatement.setDouble(4, x.getLUONGNV());
            callStatement.setString(5, x.getGIOITINH());
            callStatement.setString(6, x.getCHUTHICH());           
            callStatement.execute();
            con.CloseConnection();
        } catch (SQLException ex) {
            Logger.getLogger(NhanVien_Dao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void XoaNhanVien(NhanVien_Pojo x, int pos)
    {
        if(pos>=0)
        {
            try {
                con.OpenConnection();
                String sql = "{call XoaNhanVien(?)}";
                CallableStatement callStatement = con.GetConnect().prepareCall(sql);
                callStatement.setString(1, x.getMANV());
                callStatement.execute();
                con.CloseConnection();               
            } catch (Exception ex) {
                Logger.getLogger(NhanVien_Dao.class.getName()).log(Level.SEVERE, null,ex);
            }
        }
    }
    
    public void SuaNhanVien(NhanVien_Pojo x)
    {
        try {
            con.OpenConnection();
            String sql = "{call SuaNhanVien(?,?,?,?,?,?)}";
            CallableStatement callStatement = con.GetConnect().prepareCall(sql);
            callStatement.setString(1, x.getMANV());
            callStatement.setString(2, x.getTENNV());
            callStatement.setString(3, x.getCHUCVU());
            callStatement.setDouble(4, x.getLUONGNV());
            callStatement.setString(5, x.getGIOITINH());
            callStatement.setString(6, x.getCHUTHICH());
            callStatement.execute();
            con.CloseConnection();
        } catch (SQLException ex) {
            Logger.getLogger(NhanVien_Dao.class.getName()).log(Level.SEVERE, null,ex);
            
        }
    }
    
    public void LayDSNhanVien(Vector vdata){
        
        vdata.removeAllElements();
        try {
            con.OpenConnection();
            String sql = "SELECT * FROM NHANVIEN";
            PreparedStatement preStatement=con.GetConnect().prepareStatement(sql);
            ResultSet rs=preStatement.executeQuery();
            while(rs.next())
            {
                String MANV=rs.getString("MANV");
                String TENNV=rs.getString("TENNV");
                String CHUCVU=rs.getString("CHUCVU");
                String LUONGNV=rs.getString("LUONGNV");
                String GIOITINH=rs.getString("GIOITINH");
                String CHUTHICH=rs.getString("CHUTHICH");
                Vector<String> v=new Vector<String>();
                v.add(MANV);
                v.add(TENNV);
                v.add(CHUCVU);
                v.add(LUONGNV);
                v.add(GIOITINH);
                v.add(CHUTHICH);
                vdata.add(v);
            }
            con.CloseConnection();
        } catch (SQLException ex) {
            Logger.getLogger(NhanVien_Dao.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    public void FindTenNV(Vector vdata,String timTenNV){        
        try {
            con.OpenConnection();
            String sqlSelect = "{call FindTenNV(?)}";
            CallableStatement callStatement = con.GetConnect().prepareCall(sqlSelect);
            callStatement.setString(1,timTenNV+"%");           
            ResultSet rs = callStatement.executeQuery();
            vdata.removeAllElements();
            while(rs.next())
            {
                String MANV=rs.getString("MANV");
                String TENNV=rs.getString("TENNV");
                String CHUCVU=rs.getString("CHUCVU");
                String LUONGNV=rs.getString("LUONGNV");
                String GIOITINH=rs.getString("GIOITINH");
                String CHUTHICH=rs.getString("CHUTHICH");
                Vector<String> v=new Vector<String>();
                v.add(MANV);
                v.add(TENNV);
                v.add(CHUCVU);
                v.add(LUONGNV);
                v.add(GIOITINH);
                v.add(CHUTHICH);
                vdata.add(v);
            }
            con.CloseConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Phong_Dao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
