package model;

public class SanPhamXuatKhau extends SanPham {

    private double giaXuatKhau;
    private String quocGiaNhapSanPham;

    public SanPhamXuatKhau() {
    }

    public SanPhamXuatKhau(String maSanPham, String tenSanPham, Long soLuong, String nhaSanXuat, double giaXuatKhau, String quocGiaNhapSanPham) {
        super(maSanPham, tenSanPham, soLuong, nhaSanXuat);
        this.giaXuatKhau = giaXuatKhau;
        this.quocGiaNhapSanPham = quocGiaNhapSanPham;
    }

    public double getGiaXuatKhau() {
        return giaXuatKhau;
    }

    public void setGiaXuatKhau(double giaXuatKhau) {
        this.giaXuatKhau = giaXuatKhau;
    }

    public String getQuocGiaNhapSanPham() {
        return quocGiaNhapSanPham;
    }

    public void setQuocGiaNhapSanPham(String quocGiaNhapSanPham) {
        this.quocGiaNhapSanPham = quocGiaNhapSanPham;
    }

    @Override
    public double giaBan() {
        return this.giaXuatKhau + this.giaXuatKhau*0.2;
    }

    @Override
    public String toString() {
        return super.toString() + giaXuatKhau + "\t" + quocGiaNhapSanPham + "\t" + giaBan();
    }

    @Override
    public String toData() {
        return String.format("sk,%s,%s,%s,%s", super.toData(), giaXuatKhau, quocGiaNhapSanPham, giaBan());
    }

    @Override
    public double tongtien() {
        return giaBan() * getSoLuong();
    }
}
