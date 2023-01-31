package qlsvdtu;

public class View {

    static QuanLy_Gui qlg = new QuanLy_Gui();
    static DanhSachThanhVien dstv = new DanhSachThanhVien();

    public static void main(String[] args) {
//        qlg.nhap();
        dstv.hienThi();
//        qlg.seach();
//        qlg.delete();
        dstv.suaThanhVien();
    }
}
