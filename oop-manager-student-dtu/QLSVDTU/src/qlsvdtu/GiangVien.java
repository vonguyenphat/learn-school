package qlsvdtu;

import java.util.Date;

public class GiangVien extends ThanhVien {

    private int soBaiBao;
    private int soDeTai;

    @Override
    public double tinhThuong() {
        return soBaiBao*1000000 + soDeTai*2000000;
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + soBaiBao + "\t" + soDeTai + "\t" + tinhThuong();
    }

    public GiangVien(int soBaiBao, int soDeTai, String ma, String ten, Date ngaySinh, String namHoc) {
        super(ma, ten, ngaySinh, namHoc);
        this.soBaiBao = soBaiBao;
        this.soDeTai = soDeTai;
    }

    public GiangVien() {
    }

    public int getSoBaiBao() {
        return soBaiBao;
    }

    public void setSoBaiBao(int soBaiBao) {
        this.soBaiBao = soBaiBao;
    }

    public int getSoDeTai() {
        return soDeTai;
    }

    public void setSoDeTai(int soDeTai) {
        this.soDeTai = soDeTai;
    }

    @Override
    public String toData() {
        return String.format("%s,%s,%s,%s", super.toData(), soBaiBao, soDeTai, tinhThuong());
    }
}
