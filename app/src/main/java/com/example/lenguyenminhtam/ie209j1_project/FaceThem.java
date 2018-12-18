package com.example.lenguyenminhtam.ie209j1_project;

public class FaceThem {
    private String TenLop;
    private String MaLop;
    private String SiSo;
    private String NamHoc;

    public FaceThem() {
    }

    public FaceThem(String MaLop, String TenLop, String SiSo, String NamHoc){
        this.TenLop     = TenLop;
        this.SiSo       = SiSo;
        this.MaLop=MaLop;
        this.NamHoc=NamHoc;
        //this.SiSoNam    = SiSoNam;
//        this.SiSoNu     = SiSoNu;
//        this.SiSoHienTai = SiSoHienTai;
    }

   // public void setSiSoHienTai(int siSoHienTai) {
//        SiSoHienTai = siSoHienTai;
//    }

//    public int getSiSoHienTai() {
//
//        return SiSoHienTai;
//    }

    public void setTenLop(String tenLop) {
        TenLop = tenLop;
    }

    public void setSiSo(String siSo) {
        SiSo = siSo;
    }

//    public void setSiSoNam(int siSoNam) {
//        SiSoNam = siSoNam;
//    }
//
//    public void setSiSoNu(int siSoNu) {
//        SiSoNu = siSoNu;
//    }

    public String getTenLop() {
        return TenLop;
    }

    public String getSiSo() {
        return SiSo;
    }

    public void setMaLop(String maLop) {
        MaLop = maLop;
    }

    public void setNamHoc(String namHoc) {
        NamHoc = namHoc;
    }

    public String getMaLop() {

        return MaLop;
    }

    public String getNamHoc() {
        return NamHoc;
    }
//    public int getSiSoNam() {
//        return SiSoNam;
//    }
//
//    public int getSiSoNu() {
//        return SiSoNu;
//    }
}
