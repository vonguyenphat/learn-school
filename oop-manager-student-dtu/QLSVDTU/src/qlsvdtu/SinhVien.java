package qlsvdtu;

import java.util.Date;

public class SinhVien extends ThanhVien {

    private double diemTB;

    public SinhVien() {
    }

    public SinhVien(double diemTB, String ma, String ten, Date ngaySinh, String namHoc) {
        super(ma, ten, ngaySinh, namHoc);
        this.diemTB = diemTB;
    }

    @Override
    public double tinhThuong() {
        if (diemTB >= 9) {
            return 5000000;
        } else if (diemTB >= 8) {
            return 3000000;
        }return 0;
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + diemTB + "\t" + tinhThuong();
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public String toData() {
        return String.format("%s,%s,%s,0", super.toData(), diemTB, tinhThuong());
    }
}
