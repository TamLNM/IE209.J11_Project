package com.example.lenguyenminhtam.ie209j1_project;

public class FaceBaoCao {
    private String TenLop;
    private int SiSo, SoLuongDat;
    private double TyLeDat;

    public FaceBaoCao(String TenLop, int SiSo, int SoLuongDat){
        this.TenLop     = TenLop;
        this.SiSo       = SiSo;
        this.SoLuongDat = SoLuongDat;

    }


    public void setTenLop(String tenLop) {
        TenLop = tenLop;
    }

    public void setSiSo(int siSo) {
        SiSo = siSo;
    }

    public void setSoLuongDat(int soLuongDat) {
        SoLuongDat = soLuongDat;
    }

    public void setTyLeDat(double tyledat) { TyLeDat = tyledat; }



    public String getTenLop() {
        return TenLop;
    }

    public int getSiSo() {
        return SiSo;
    }

    public int getSoLuongDat() {
        return SoLuongDat;
    }

    public double getTyLeDat() { return TyLeDat; }

    public double TinhTyLe(int siSo, int soLuongDat){
        TyLeDat = (double)((double)soLuongDat/(double)siSo)*100;
        TyLeDat= (double) Math.round(TyLeDat * 100) / 100;

        return TyLeDat;
    }

}
