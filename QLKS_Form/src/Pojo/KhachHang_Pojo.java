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
public class KhachHang_Pojo {
    private String MAKH;
    private String TENKH;
    private String GIOITINH;
    private String SDT;
    private String MAPHONG;

    public String getMAKH() {
        return MAKH;
    }

    public void setMAKH(String MAKH) {
        this.MAKH = MAKH;
    }

    public String getTENKH() {
        return TENKH;
    }

    public void setTENKH(String TENKH) {
        this.TENKH = TENKH;
    }

    public String getGIOITINH() {
        return GIOITINH;
    }

    public void setGIOITINH(String GIOITINH) {
        this.GIOITINH = GIOITINH;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getMAPHONG() {
        return MAPHONG;
    }

    public void setMAPHONG(String MAPHONG) {
        this.MAPHONG = MAPHONG;
    }

    public KhachHang_Pojo(String MAKH) {
        this.MAKH = MAKH;
    }

    public KhachHang_Pojo(String MAKH, String TENKH, String GIOITINH, String SDT, String MAPHONG) {
        this.MAKH = MAKH;
        this.TENKH = TENKH;
        this.GIOITINH = GIOITINH;
        this.SDT = SDT;
        this.MAPHONG = MAPHONG;
    }

    
    
    
    
}
