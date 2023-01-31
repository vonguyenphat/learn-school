package qlsvdtu;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import util.DocGhiFile;
import util.FomatDate;

public class DanhSachThanhVien {

    FomatDate fd = new FomatDate();
    private static final Scanner sc = new Scanner(System.in);
    DocGhiFile dgf = new DocGhiFile();
    public ArrayList<ThanhVien> tvs = dgf.docFile();

    public void themVaoDS(ThanhVien tv) {
        tvs.add(tv);
        dgf.ghiFile(tvs, false);
        System.out.println("Them thanh cong");
    }

    public ThanhVien timKiem(String ma) {
        for (ThanhVien thanhVien : dgf.docFile()) {
            if (ma.trim().equalsIgnoreCase(thanhVien.getMa())) {
                return thanhVien;
            }
        }
        return null;
    }

    public boolean xoa(String ma) {
        for (ThanhVien thanhVien : tvs) {
            if (ma.trim().equalsIgnoreCase(thanhVien.getMa())) {
                tvs.remove(thanhVien);
                dgf.ghiFile(tvs, false);
                return true;
            }
        }
        return false;
    }

    public void suaThanhVien() {
        SinhVien sv = new SinhVien();
        GiangVien gv = new GiangVien();
        System.out.println("1:Sua sinh vien" + "\n" + "2:Sua giang vien");
        int luaChon = Integer.parseInt(sc.nextLine());
        if (luaChon == 1) {
            System.out.println("Nhap ma sinh vien can sua");
            String edit = sc.nextLine();
            for (int i = 0; i < tvs.size(); i++) {
                if (tvs.get(i).getMa().equals(edit)) {
                    try {            
                        sv.setMa(tvs.get(i).getMa());
                        System.out.println("Nhap ten: ");
                        sv.setTen(sc.nextLine());
                        System.out.println("Nhap ngay sinh: ");
                        sv.setNgaySinh(fd.chuoiThanhNgay(sc.nextLine()));
                        System.out.println("Nhap nam hoc: ");
                        sv.setNamHoc(sc.nextLine());
                        System.out.println("Nhap diem TB: ");
                        sv.setDiemTB(Double.parseDouble(sc.nextLine()));
                        tvs.set(i, sv);
                    } catch (ParseException ex) {
                        System.out.println("loi nhap chuoi");
                    }
                }
            }

        } else {
            System.out.println("Nhap ma giao vien can sua");
            String edit = sc.nextLine();
            for (int i = 0; i < tvs.size(); i++) {
                if (tvs.get(i).getMa().equals(edit)) {
                    try {
                        gv.setMa(tvs.get(i).getMa());
                        System.out.println("Nhap ten: ");
                        gv.setTen(sc.nextLine());
                        System.out.println("Nhap ngay sinh: ");
                        gv.setNgaySinh(fd.chuoiThanhNgay(sc.nextLine()));
                        System.out.println("Nhap nam hoc: ");
                        gv.setNamHoc(sc.nextLine());
                        System.out.println("Nhap so bai bao: ");
                        gv.setSoBaiBao(Integer.parseInt(sc.nextLine()));
                        System.out.println("Nhap so de tai: ");
                        gv.setSoDeTai(Integer.parseInt(sc.nextLine()));
                        tvs.set(i, gv);
                    } catch (ParseException ex) {
                        System.out.println("loi nhap chuoi");
                    }
                }
            }
        }
        dgf.ghiFile(tvs, false);
    }

    public void hienThi() {
        for (ThanhVien tv : dgf.docFile()) {
            System.out.println(tv);
        }
    }
}
