/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author huy
 */
public class Phong_Pojo {
    private String MAPHONG;
    private String TENPHONG;
    private String LOAIPHONG;
    private double GIAPHONG;
    private String CHUTHICH;
    private String TINHTRANG;
    //private String MANV;
    //private String MADV;

    public Phong_Pojo(String MAPHONG, String TENPHONG, String LOAIPHONG, double GIAPHONG, String CHUTHICH, String TINHTRANG) {
        this.MAPHONG = MAPHONG;
        this.TENPHONG = TENPHONG;
        this.LOAIPHONG = LOAIPHONG;
        this.GIAPHONG = GIAPHONG;
        this.CHUTHICH = CHUTHICH;
        this.TINHTRANG = TINHTRANG;
    }

    public String getMAPHONG() {
        return MAPHONG;
    }

    public void setMAPHONG(String MAPHONG) {
        this.MAPHONG = MAPHONG;
    }

    public String getTENPHONG() {
        return TENPHONG;
    }

    public void setTENPHONG(String TENPHONG) {
        this.TENPHONG = TENPHONG;
    }

    public String getLOAIPHONG() {
        return LOAIPHONG;
    }

    public void setLOAIPHONG(String LOAIPHONG) {
        this.LOAIPHONG = LOAIPHONG;
    }

    public double getGIAPHONG() {
        return GIAPHONG;
    }

    public void setGIAPHONG(double GIAPHONG) {
        this.GIAPHONG = GIAPHONG;
    }

    public String getCHUTHICH() {
        return CHUTHICH;
    }

    public void setCHUTHICH(String CHUTHICH) {
        this.CHUTHICH = CHUTHICH;
    }

    public String getTINHTRANG() {
        return TINHTRANG;
    }

    public void setTINHTRANG(String TINHTRANG) {
        this.TINHTRANG = TINHTRANG;
    }

   
    
    public Phong_Pojo(String MAPHONG) {
        this.MAPHONG = MAPHONG;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
