package qlsvdtu;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

import util.FomatDate;

public class QuanLy_Gui {
  
    public FomatDate fd = new FomatDate();
    DanhSachThanhVien dstv = new DanhSachThanhVien();
    private static final Scanner sc = new Scanner(System.in);

    public void nhap() {
        try {
            System.out.println("1:Them moi sinh vien \n 2:Them moi giang vien");
            int luaChon = Integer.parseInt(sc.nextLine());
            System.out.println("Nhap ma: ");
            String ma = sc.nextLine();
            System.out.println("Nhap ten: ");
            String ten = sc.nextLine();
            System.out.println("Nhap ngay sinh: ");
            Date ngaySinh = fd.chuoiThanhNgay(sc.nextLine());
            System.out.println("Nhap nam hoc: ");
            String namHoc = sc.nextLine();
            if (luaChon == 1) {
                System.out.println("Nhap diem TB: ");
                double diemTB = Double.parseDouble(sc.nextLine());
                dstv.themVaoDS(new SinhVien(diemTB, ma, ten, ngaySinh, namHoc));
            } else {
                System.out.println("Nhap so bai bao: ");
                int soBaiBao = Integer.parseInt(sc.nextLine());
                System.out.println("Nhap so de tai: ");
                int soDeTai = Integer.parseInt(sc.nextLine());
                dstv.themVaoDS(new GiangVien(soBaiBao, soDeTai, ma, ten, ngaySinh, namHoc));
            }
        } catch (ParseException ex) {
            System.out.println("Loi nhap du lieu");
        }
    }

    public void seach() {
        System.out.println("Nhap ma can tim: ");
        String saechid = sc.nextLine();
        if (dstv.timKiem(saechid) == null) {
            System.out.println("Ma khong hop le hoac khong ton tai nguoi dung trong danh sach");
        } else {
            System.out.println(dstv.timKiem(saechid));
        }
    }

    public void delete() {
        System.out.println("Nhap ma nguoi dung can xoa ");
        String delete = sc.nextLine();
        if (dstv.xoa(delete)) {
            System.out.println("xoa thanh cong nguoi dung");
        } else {
            System.out.println("Ma khong hop le hoac khong ton tai nguoi dung trong danh sach");
        }
    }
}
