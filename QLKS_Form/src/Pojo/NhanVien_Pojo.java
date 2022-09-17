/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.util.Date;

/**
 *
 * @author huy
 */
public class NhanVien_Pojo {
    private String MANV;
    private String TENNV;
    private String CHUCVU;
    private double LUONGNV;
    private String GIOITINH;
    private String CHUTHICH;

    public NhanVien_Pojo(String MANV, String TENNV, String CHUCVU, double LUONGNV,String GIOITINH, String CHUTHICH) {
        this.MANV = MANV;
        this.TENNV = TENNV;
        this.CHUCVU = CHUCVU;
        this.LUONGNV = LUONGNV;
        this.GIOITINH = GIOITINH;
        this.CHUTHICH = CHUTHICH;
    }

    public NhanVien_Pojo(String text, String text0, String text1, String text2, String gioiTinh, String text3, String text4, String text5) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public NhanVien_Pojo(String text, String text0, String gioiTinh, String text1, String text2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getMANV() {
        return MANV;
    }

    public void setMANV(String MANV) {
        this.MANV = MANV;
    }

    public String getTENNV() {
        return TENNV;
    }

    public void setTENNV(String TENNV) {
        this.TENNV = TENNV;
    }

    public String getCHUCVU() {
        return CHUCVU;
    }

    public void setCHUCVU(String CHUCVU) {
        this.CHUCVU = CHUCVU;
    }

    public double getLUONGNV() {
        return LUONGNV;
    }

    public void setLUONGNV(double LUONGNV) {
        this.LUONGNV = LUONGNV;
    }

    public String getGIOITINH() {
        return GIOITINH;
    }

    public void setGIOITINH(String GIOITINH) {
        this.GIOITINH = GIOITINH;
    }

    public String getCHUTHICH() {
        return CHUTHICH;
    }

    public void setCHUTHICH(String CHUTHICH) {
        this.CHUTHICH = CHUTHICH;
    }
    
    public NhanVien_Pojo(String MANV) {
        this.MANV = MANV;
    }
    
    
    
    
    
}