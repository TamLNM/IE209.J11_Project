package com.example.lenguyenminhtam.ie209j1_project;

public class ketquahoctap {
    String MaKQHT;
    String MSHS;
    String HocKy;
    String NamHoc;
    String TBCacMon;

    public ketquahoctap(String maKQHT, String MSHS, String hocKy, String namHoc, String TBCacMon) {
        MaKQHT = maKQHT;
        this.MSHS = MSHS;
        HocKy = hocKy;
        NamHoc = namHoc;
        this.TBCacMon = TBCacMon;
    }

    public void setMaKQHT(String maKQHT) {
        MaKQHT = maKQHT;
    }

    public void setMSHS(String MSHS) {
        this.MSHS = MSHS;
    }

    public void setHocKy(String hocKy) {
        HocKy = hocKy;
    }

    public void setNamHoc(String namHoc) {
        NamHoc = namHoc;
    }

    public void setTBCacMon(String TBCacMon) {
        this.TBCacMon = TBCacMon;
    }

    public String getMaKQHT() {

        return MaKQHT;
    }

    public String getMSHS() {
        return MSHS;
    }

    public String getHocKy() {
        return HocKy;
    }

    public String getNamHoc() {
        return NamHoc;
    }

    public String getTBCacMon() {
        return TBCacMon;
    }

    public ketquahoctap() {
    }
}
