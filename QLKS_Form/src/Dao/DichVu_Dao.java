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
import pojo.DichVu_Pojo;

/**
 *
 * @author Le Xuan Huy
 */
public class DichVu_Dao {
    private SQL con;
    
    public DichVu_Dao() 
    {
        con=new SQL("DESKTOP-95N5PBV", "QLKS", "sa", "1");
    }
    
    public void LayDSDichVu(Vector vdata){
        
        vdata.removeAllElements();
        try {
            con.OpenConnection();
            String sql = "SELECT * FROM DICHVU";
            PreparedStatement preStatement=con.GetConnect().prepareStatement(sql);
            ResultSet rs=preStatement.executeQuery();
            while(rs.next())
            {
                String MADV=rs.getString("MADV");
                String MAKH=rs.getString("MAKH");
                String GAGAN=rs.getString("GAGAN");
                String MUCKHO=rs.getString("MUCKHO");
                String CUABE=rs.getString("CUABE");
                String MATXA=rs.getString("MATXA");
                String TONGTIENDV=rs.getString("TONGTIENDV");

                Vector<String> v=new Vector<String>();
                v.add(MADV);
                v.add(MAKH);
                v.add(GAGAN);
                v.add(MUCKHO);
                v.add(CUABE);
                v.add(MATXA);
                 v.add(TONGTIENDV);
                vdata.add(v);
            }
            con.CloseConnection();
        } catch (SQLException ex) {
            Logger.getLogger(NhanVien_Dao.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    public void ThemDichVu(DichVu_Pojo x) {
        try {
            con.OpenConnection();
            String sql = "{call ThemDichVu(?,?,?,?,?,?,?)}";
            CallableStatement callStatement = con.GetConnect().prepareCall(sql);
            callStatement.setString(1, x.getMADV());
            callStatement.setString(2, x.getMAKH());
            callStatement.setInt(3, x.getGARAN());
            callStatement.setInt(4, x.getMUCKHO());
            callStatement.setInt(5, x.getCUABE());
            callStatement.setInt(6, x.getMATXA());
            callStatement.setDouble(7, x.getTongTienDV());
            
            callStatement.execute();
            con.CloseConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DichVu_Dao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void SuaDichVu(DichVu_Pojo x) {
        try {
            con.OpenConnection();
            String sql = "{call SuaDichVu(?,?,?,?,?,?)}";
            CallableStatement callStatement = con.GetConnect().prepareCall(sql);
            callStatement.setString(1, x.getMADV());
            callStatement.setInt(2, x.getGARAN());
            callStatement.setInt(3, x.getMUCKHO());
            callStatement.setInt(4, x.getCUABE());
            callStatement.setInt(5, x.getMATXA());
            callStatement.setDouble(6, x.getTongTienDV());           
            callStatement.execute();
            con.CloseConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DichVu_Dao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void XoaDichVu(DichVu_Pojo x, int pos)
    {
        if(pos>=0)
        {
            try {
                con.OpenConnection();
                String sql = "{call XoaDichVu(?)}";
                CallableStatement callStatement = con.GetConnect().prepareCall(sql);
                callStatement.setString(1, x.getMADV());
                callStatement.execute();
                con.CloseConnection();               
            } catch (Exception ex) {
                Logger.getLogger(DichVu_Dao.class.getName()).log(Level.SEVERE, null,ex);
            }
        }
    }
    
    public void FindMaDV(Vector vdata,String timMaDV){        
        try {
            con.OpenConnection();
            String sqlSelect = "{call FindMaDV(?)}";
            CallableStatement callStatement = con.GetConnect().prepareCall(sqlSelect);
            callStatement.setString(1,timMaDV+"%");           
            ResultSet rs = callStatement.executeQuery();
            vdata.removeAllElements();
            while(rs.next())
            {
                String MADV=rs.getString("MADV");
                String MAKH=rs.getString("MAKH");
                String GAGAN=rs.getString("GAGAN");
                String MUCKHO=rs.getString("MUCKHO");
                String CUABE=rs.getString("CUABE");
                String MATXA=rs.getString("MATXA");
                String TONGTIENDV=rs.getString("TONGTIENDV");
                Vector<String> v=new Vector<String>();
                v.add(MADV);
                v.add(MAKH);
                v.add(GAGAN);
                v.add(MUCKHO);
                v.add(CUABE);
                v.add(MATXA);
                 v.add(TONGTIENDV);
                vdata.add(v);
            }
            con.CloseConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Phong_Dao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
