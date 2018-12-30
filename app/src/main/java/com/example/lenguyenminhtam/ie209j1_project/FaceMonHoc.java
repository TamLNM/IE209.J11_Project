package com.example.lenguyenminhtam.ie209j1_project;

public class FaceMonHoc {
    private String IdMonHoc;
    private String TenMonHoc;


    public String getIdMonHoc() {
        return IdMonHoc;
    }

    public void setIdMonHoc(String id) {
        this.IdMonHoc = id;
    }

    public FaceMonHoc(String TenMonHoc) {
        this.TenMonHoc = TenMonHoc;
    }

    public FaceMonHoc() {
    }

    public String getTenMonHoc() {
        return TenMonHoc;
    }

    public void setTenMonHoc(String TenMonHoc){
        this.TenMonHoc = TenMonHoc;
    }


}

