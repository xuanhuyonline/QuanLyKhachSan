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
public class DichVu_Pojo {
    private String MADV;
    private String MAKH;
    private int GARAN;
    private int MUCKHO;
    private int CUABE;
    private int MATXA;
    private Double TongTienDV;

    public String getMADV() {
        return MADV;
    }

    public void setMADV(String MADV) {
        this.MADV = MADV;
    }

    public String getMAKH() {
        return MAKH;
    }

    public void setMAKH(String MAKH) {
        this.MAKH = MAKH;
    }

    public int getGARAN() {
        return GARAN;
    }

    public void setGARAN(int GARAN) {
        this.GARAN = GARAN;
    }

    public int getMUCKHO() {
        return MUCKHO;
    }

    public void setMUCKHO(int MUCKHO) {
        this.MUCKHO = MUCKHO;
    }

    public int getCUABE() {
        return CUABE;
    }

    public void setCUABE(int CUABE) {
        this.CUABE = CUABE;
    }

    public int getMATXA() {
        return MATXA;
    }

    public void setMATXA(int MATXA) {
        this.MATXA = MATXA;
    }

    public Double getTongTienDV() {
        return TongTienDV;
    }

    public void setTongTienDV(Double TongTienDV) {
        this.TongTienDV = TongTienDV;
    }
     
    public DichVu_Pojo(String MADV) {
        this.MADV = MADV;
    }

    public DichVu_Pojo(String MADV, String MAKH, int GARAN, int MUCKHO, int CUABE, int MATXA, Double TongTienDV) {
        this.MADV = MADV;
        this.MAKH = MAKH;
        this.GARAN = GARAN;
        this.MUCKHO = MUCKHO;
        this.CUABE = CUABE;
        this.MATXA = MATXA;
        this.TongTienDV = TongTienDV;
    }
    
    public DichVu_Pojo(String MADV, int GARAN, int MUCKHO, int CUABE, int MATXA, Double TongTienDV) {
        this.MADV = MADV;
        this.GARAN = GARAN;
        this.MUCKHO = MUCKHO;
        this.CUABE = CUABE;
        this.MATXA = MATXA;
        this.TongTienDV = TongTienDV;
    }
    
    
}
