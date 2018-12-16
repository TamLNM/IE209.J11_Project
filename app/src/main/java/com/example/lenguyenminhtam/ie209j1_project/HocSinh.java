package com.example.lenguyenminhtam.ie209j1_project;

public class HocSinh {
    private String mshs;
    private String hoten;
    private String lop;
    private String gioitinh;
    private String diachi;
    private String ngaysinh;

    private String email;

    //private int avatar;


    public HocSinh() {
    }

    public String getHoten() {
        return hoten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

//    public int getAvatar() {
//        return avatar;
//    }


    public String getDiachi() {
        return diachi;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setMshs(String mshs) {
        this.mshs = mshs;
    }

    public String getMshs() {

        return mshs;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {

        return email;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getLop() {

        return lop;
    }

    public HocSinh(String mshs, String hoten, String gioitinh , String ngaysinh, String diachi, String email, String lop) {
        this.mshs= mshs;
        this.email=email;
        this.lop=lop;

        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.ngaysinh = ngaysinh;
        //this.avatar = avatar;

    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

//    public void setAvatar(int avatar) {
//        this.avatar = avatar;
//    }


}
