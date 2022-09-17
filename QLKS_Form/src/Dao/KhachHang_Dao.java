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
import pojo.KhachHang_Pojo;
import Dao.KhachHang_Dao;

/**
 *
 * @author Le Xuan Huy
 */
public class KhachHang_Dao {

    private SQL con;

    public KhachHang_Dao() {
        con = new SQL("DESKTOP-95N5PBV", "QLKS", "sa", "1");
    }

    public void LayDSKhachHang(Vector vdata) {

        vdata.removeAllElements();
        try {
            con.OpenConnection();
            String sql = "SELECT * FROM KHACHHANG";
            PreparedStatement preStatement = con.GetConnect().prepareStatement(sql);
            ResultSet rs = preStatement.executeQuery();
            while (rs.next()) {
                String MAKH = rs.getString("MAKH");
                String TENNV = rs.getString("TENKH");
                String GIOITINH = rs.getString("GIOITINH");
                String SDT = rs.getString("SDT");
                String MAPHONG = rs.getString("MAPHONG");

                Vector<String> v = new Vector<String>();
                v.add(MAKH);
                v.add(TENNV);
                v.add(GIOITINH);
                v.add(SDT);
                v.add(MAPHONG);
                vdata.add(v);
            }
            con.CloseConnection();
        } catch (SQLException ex) {
            Logger.getLogger(KhachHang_Dao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void ThemKhachHang(KhachHang_Pojo x) {
        try {
            con.OpenConnection();
            String sql = "{call ThemKhachHang(?,?,?,?,?)}";
            CallableStatement callStatement = con.GetConnect().prepareCall(sql);
            callStatement.setString(1, x.getMAKH());
            callStatement.setString(2, x.getTENKH());
            callStatement.setString(3, x.getGIOITINH());
            callStatement.setString(4, x.getSDT());
            callStatement.setString(5, x.getMAPHONG());         
            callStatement.execute();
            con.CloseConnection();
        } catch (SQLException ex) {
            Logger.getLogger(KhachHang_Dao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void SuaKhachHang(KhachHang_Pojo x) {
        try {
            con.OpenConnection();
            String sql = "{call SuaKhachHang(?,?,?,?,?)}";
            CallableStatement callStatement = con.GetConnect().prepareCall(sql);
            callStatement.setString(1, x.getMAKH());
            callStatement.setString(2, x.getTENKH());
            callStatement.setString(3, x.getGIOITINH());
            callStatement.setString(4, x.getSDT());
            callStatement.setString(5, x.getMAPHONG());    
            callStatement.execute();
            con.CloseConnection();
        } catch (SQLException ex) {
            Logger.getLogger(KhachHang_Dao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void XoaKhachHang(KhachHang_Pojo x, int pos)
    {
        if(pos>=0)
        {
            try {
                con.OpenConnection();
                String sql = "{call XoaKhachHang(?)}";
                CallableStatement callStatement = con.GetConnect().prepareCall(sql);
                callStatement.setString(1, x.getMAKH());
                callStatement.execute();
                con.CloseConnection();               
            } catch (Exception ex) {
                Logger.getLogger(KhachHang_Dao.class.getName()).log(Level.SEVERE, null,ex);
            }
        }
    }
    
    public void FindTenKH(Vector vdata,String timTenKH){        
        try {
            con.OpenConnection();
            String sqlSelect = "{call FindTenKH(?)}";
            CallableStatement callStatement = con.GetConnect().prepareCall(sqlSelect);
            callStatement.setString(1,timTenKH+"%");           
            ResultSet rs = callStatement.executeQuery();
            vdata.removeAllElements();
            while(rs.next())
            {
                String MAKH = rs.getString("MAKH");
                String TENNV = rs.getString("TENKH");
                String GIOITINH = rs.getString("GIOITINH");
                String SDT = rs.getString("SDT");
                String MAPHONG = rs.getString("MAPHONG");
                Vector<String> v = new Vector<String>();
                v.add(MAKH);
                v.add(TENNV);
                v.add(GIOITINH);
                v.add(SDT);
                v.add(MAPHONG);
                vdata.add(v);
            }
            con.CloseConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Phong_Dao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
