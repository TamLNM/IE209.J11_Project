package com.example.lenguyenminhtam.ie209j1_project;

public class FaceThem {
    private String TenLop;
    private int SiSo, SiSoNu, SiSoNam, SiSoHienTai;


    public FaceThem(String TenLop, int SiSo, int SiSoNu, int SiSoNam, int SiSoHienTai){
        this.TenLop     = TenLop;
        this.SiSo       = SiSo;
        this.SiSoNam    = SiSoNam;
        this.SiSoNu     = SiSoNu;
        this.SiSoHienTai = SiSoHienTai;
    }

    public void setSiSoHienTai(int siSoHienTai) {
        SiSoHienTai = siSoHienTai;
    }

    public int getSiSoHienTai() {

        return SiSoHienTai;
    }

    public void setTenLop(String tenLop) {
        TenLop = tenLop;
    }

    public void setSiSo(int siSo) {
        SiSo = siSo;
    }

    public void setSiSoNam(int siSoNam) {
        SiSoNam = siSoNam;
    }

    public void setSiSoNu(int siSoNu) {
        SiSoNu = siSoNu;
    }

    public String getTenLop() {
        return TenLop;
    }

    public int getSiSo() {
        return SiSo;
    }

    public int getSiSoNam() {
        return SiSoNam;
    }

    public int getSiSoNu() {
        return SiSoNu;
    }
}
