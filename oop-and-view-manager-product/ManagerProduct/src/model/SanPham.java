/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Administrator
 */
public abstract class SanPham implements ISanPham {

    private String maSanPham;
    private String tenSanPham;
    private Long soLuong;
    private String nhaSanXuat;

    public SanPham() {
    }

    public SanPham(String maSanPham, String tenSanPham, Long soLuong, String nhaSanXuat) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.soLuong = soLuong;
        this.nhaSanXuat = nhaSanXuat;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public Long getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Long soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    @Override
    public String toString() {
        return maSanPham + "\t" + tenSanPham + "\t" + soLuong + "\t" + nhaSanXuat;
    }

    public String toData() {
        return String.format("%s,%s,%s,%s", maSanPham, tenSanPham, soLuong, nhaSanXuat);
    }

}
