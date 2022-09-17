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
import Pojo.HoaDon_Pojo;

/**
 *
 * @author Le Xuan Huy
 */
public class HoaDon_Dao {
    private SQL con;
    
    public HoaDon_Dao() 
    {
        con=new SQL("DESKTOP-95N5PBV", "QLKS", "sa", "1");
    }
    
    public void LayDSHoaDon(Vector vdata){
        
        vdata.removeAllElements();
        try {
            con.OpenConnection();
            String sql = "SELECT * FROM HOADON";
            PreparedStatement preStatement=con.GetConnect().prepareStatement(sql);
            ResultSet rs=preStatement.executeQuery();
            while(rs.next())
            {
                String MAHD=rs.getString("MAHD");
                String MAKH=rs.getString("MAKH");
                String MANV=rs.getString("MANV");
                String SONGAY=rs.getString("NGAY");
                String TONGHOADON=rs.getString("GIAHD");

                Vector<String> v=new Vector<String>();
                v.add(MAHD);
                v.add(MAKH);
                v.add(MANV);
                v.add(SONGAY);
                v.add(TONGHOADON);
                vdata.add(v);
            }
            con.CloseConnection();
        } catch (SQLException ex) {
            Logger.getLogger(HoaDon_Dao.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    public void XoaHoaDon(HoaDon_Pojo x, int pos)
    {
        if(pos>=0)
        {
            try {
                con.OpenConnection();
                String sql = "{call XoaHoaDon(?)}";
                CallableStatement callStatement = con.GetConnect().prepareCall(sql);
                callStatement.setString(1, x.getMAHD());
                callStatement.execute();
                con.CloseConnection();               
            } catch (Exception ex) {
                Logger.getLogger(HoaDon_Dao.class.getName()).log(Level.SEVERE, null,ex);
            }
        }
    }
    
    public void ThemHD(HoaDon_Pojo x) {
        try {
            con.OpenConnection();
            String sql = "{call ThemHoaDon(?,?,?,?,?)}";
            CallableStatement callStatement = con.GetConnect().prepareCall(sql);
            callStatement.setString(1, x.getMAHD());
            callStatement.setString(2, x.getMAKH());
            callStatement.setString(3, x.getMANV());
            callStatement.setInt(4, x.getSoNgay());
            callStatement.setInt(5, x.getTongHoaDon());
            
            callStatement.execute();
            con.CloseConnection();
        } catch (SQLException ex) {
            Logger.getLogger(NhanVien_Dao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void SuaHD(HoaDon_Pojo x) {
        try {
            con.OpenConnection();
            String sql = "{call SuaHoaDon(?,?,?,?)}";
            CallableStatement callStatement = con.GetConnect().prepareCall(sql);
            callStatement.setString(1, x.getMAHD());
            callStatement.setString(2, x.getMAKH());
            callStatement.setString(3, x.getMANV());
            callStatement.setInt(4, x.getSoNgay());
            callStatement.execute();
            con.CloseConnection();
        } catch (SQLException ex) {
            Logger.getLogger(NhanVien_Dao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void FindMaHD(Vector vdata,String timMaHD){        
        try {
            con.OpenConnection();
            String sqlSelect = "{call FindMaHD(?)}";
            CallableStatement callStatement = con.GetConnect().prepareCall(sqlSelect);
            callStatement.setString(1,timMaHD+"%");           
            ResultSet rs = callStatement.executeQuery();
            vdata.removeAllElements();
            while(rs.next())
            {
                String MAHD=rs.getString("MAHD");
                String MAKH=rs.getString("MAKH");
                String MANV=rs.getString("MANV");
                String SONGAY=rs.getString("NGAY");
                String TONGHOADON=rs.getString("GIAHD");
                Vector<String> v=new Vector<String>();
                v.add(MAHD);
                v.add(MAKH);
                v.add(MANV);
                v.add(SONGAY);
                v.add(TONGHOADON);
                vdata.add(v);
            }
            con.CloseConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Phong_Dao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
