/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pojo;

/**
 *
 * @author Le Xuan Huy
 */
public class HoaDon_Pojo {
    private String MAHD;
    private String MAKH;
    private String MANV;
    private int soNgay;

    private int tongHoaDon;

    public String getMAHD() {
        return MAHD;
    }

    public void setMAHD(String MAHD) {
        this.MAHD = MAHD;
    }

    public String getMAKH() {
        return MAKH;
    }

    public void setMAKH(String MAKH) {
        this.MAKH = MAKH;
    }

    public String getMANV() {
        return MANV;
    }

    public void setMANV(String MANV) {
        this.MANV = MANV;
    }

    public int getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }

    public int getTongHoaDon() {
        return tongHoaDon;
    }

    public void setTongHoaDon(int tongHoaDon) {
        this.tongHoaDon = tongHoaDon;
    }
    
    public HoaDon_Pojo(String MAHD) {
        this.MAHD = MAHD;
    }

    public HoaDon_Pojo(String MAHD, String MAKH, String MANV, int soNgay, int tongHoaDon) {
        this.MAHD = MAHD;
        this.MAKH = MAKH;
        this.MANV = MANV;
        this.soNgay = soNgay;
        this.tongHoaDon = tongHoaDon;
    }
    
    public HoaDon_Pojo(String MAHD, String MAKH, String MANV, int soNgay) {
        this.MAHD = MAHD;
        this.MAKH = MAKH;
        this.MANV = MANV;
        this.soNgay = soNgay;
    }
}
