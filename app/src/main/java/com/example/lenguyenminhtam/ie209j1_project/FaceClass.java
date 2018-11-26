package com.example.lenguyenminhtam.ie209j1_project;

public class FaceClass {
    private String IdClass;
    private String TenClass;
    private String Year;


    public String getIdClass() {
        return IdClass;
    }

    public void setIdClass(String id) {
        this.IdClass = id;
    }

    public FaceClass(String TenMonHoc) {
        this.TenClass = TenMonHoc;
    }


    public String getTenClass() {
        return TenClass;
    }

    public void setTenClass(String TenMonHoc){
        this.TenClass = TenMonHoc;
    }


}

