package com.example.lenguyenminhtam.ie209j1_project;

public class FaceHS_MHNhapDiemTheoLop {
    int STT;
    int MSHS;
    String HoTenHS;

    public FaceHS_MHNhapDiemTheoLop(int STT, int MSHS, String HoTenHS){
        this.STT = STT;
        this.MSHS = MSHS;
        this.HoTenHS = HoTenHS;
    }

    public int getMSHS() {
        return MSHS;
    }

    public String getHoTenHS() {
        return HoTenHS;
    }

    public int getSTT() {
        return STT;
    }

    public void setHoTenHS(String hoTenHS) {
        HoTenHS = hoTenHS;
    }

    public void setMSHS(int MSHS) {
        this.MSHS = MSHS;
    }

    public void setSTT(int STT) {
        this.STT = STT;
    }
}
