package model;

public class SanPhamNhapKhau extends SanPham {

    private double giaNhapKhau;
    private String tinhThanhNhap;
    private double thueNhapKhau;

    public SanPhamNhapKhau() {
    }

    public SanPhamNhapKhau(String maSanPham, String tenSanPham, Long soLuong, String nhaSanXuat, double giaNhapKhau, String tinhThanhNhap, double thueNhapKhau) {
        super(maSanPham, tenSanPham, soLuong, nhaSanXuat);
        this.giaNhapKhau = giaNhapKhau;
        this.tinhThanhNhap = tinhThanhNhap;
        this.thueNhapKhau = thueNhapKhau;
    }

    public double getGiaNhapKhau() {
        return giaNhapKhau;
    }

    public void setGiaNhapKhau(double giaNhapKhau) {
        this.giaNhapKhau = giaNhapKhau;
    }

    public String getTinhThanhNhap() {
        return tinhThanhNhap;
    }

    public void setTinhThanhNhap(String tinhThanhNhap) {
        this.tinhThanhNhap = tinhThanhNhap;
    }

    public double getThueNhapKhau() {
        return thueNhapKhau;
    }

    public void setThueNhapKhau(double thueNhapKhau) {
        this.thueNhapKhau = thueNhapKhau;
    }

    @Override
    public double giaBan() {
        return this.giaNhapKhau + (this.giaNhapKhau* this.thueNhapKhau) / 100;
    }

    @Override
    public String toString() {
        return super.toString() + giaNhapKhau + "\t" + tinhThanhNhap + "\t" + thueNhapKhau + "\t" + giaBan();
    }

    @Override
    public String toData() {
        return String.format("nk,%s,%s,%s,%s,%s", super.toData(), giaNhapKhau, tinhThanhNhap, thueNhapKhau, giaBan());
    }

    @Override
    public double tongtien() {
        return giaBan() * getSoLuong();
    }

}
