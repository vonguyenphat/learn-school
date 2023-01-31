package qlsvdtu;

import java.util.Date;
import util.FomatDate;


public abstract class ThanhVien implements IThanhVien {

    private FomatDate fd = new FomatDate();
    private String ma;
    private String ten;
    private Date ngaySinh;
    private String namHoc;

    public ThanhVien() {
    }

    public ThanhVien(String ma, String ten, Date ngaySinh, String namHoc) {
        this.ma = ma;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.namHoc = namHoc;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getNamHoc() {
        return namHoc;
    }

    public void setNamHoc(String namHoc) {
        this.namHoc = namHoc;
    }

    @Override
    public String toString() {
        return ma + "\t" + ten + "\t" + fd.ngayThanhChuoi(ngaySinh) + "\t" + namHoc;
    }

    public String toData() {
        return String.format("%s,%s,%s,%s", ma, ten, fd.ngayThanhChuoi(ngaySinh), namHoc);
    }
}
