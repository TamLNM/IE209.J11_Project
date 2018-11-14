package com.example.lenguyenminhtam.ie209j1_project;

public class HocSinh {
    private String mshs;
    private String hoten;
    private String lop;
    private String gioitinh;
    private String diachi;
    private String ngaysinh;

    private String email;

    private int avatar;
    private int ic_gioitinh;
    private int ic_ngaysinh;
    private int ic_diachi;

    public HocSinh() {
    }

    public String getHoten() {
        return hoten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public int getAvatar() {
        return avatar;
    }

    public int getIc_gioitinh() {
        return ic_gioitinh;
    }

    public int getIc_ngaysinh() {
        return ic_ngaysinh;
    }

    public int getIc_diachi() {
        return ic_diachi;
    }

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

    public HocSinh(String mshs, String hoten, String lop, String gioitinh, String diachi, String ngaysinh, String email, int avatar, int ic_gioitinh, int ic_ngaysinh, int ic_diachi) {
        this.mshs= mshs;
        this.email=email;
        this.lop=lop;

        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.ngaysinh = ngaysinh;
        this.avatar = avatar;
        this.ic_gioitinh = ic_gioitinh;
        this.ic_ngaysinh = ic_ngaysinh;
        this.ic_diachi = ic_diachi;
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

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public void setIc_gioitinh(int ic_gioitinh) {
        this.ic_gioitinh = ic_gioitinh;
    }

    public void setIc_ngaysinh(int ic_ngaysinh) {
        this.ic_ngaysinh = ic_ngaysinh;
    }

    public void setIc_diachi(int ic_diachi) {
        this.ic_diachi = ic_diachi;
    }
}
