package services;

import java.util.ArrayList;
import model.SanPham;
import model.SanPhamNhapKhau;
import model.SanPhamXuatKhau;
import util.UtilFile;

public class SanPhamServices {

    public UtilFile utilFile = new UtilFile();
    public ArrayList<SanPham> sanPhams = utilFile.readFile();

    public void addNew(SanPham sp) {
        sanPhams.add(sp);
        utilFile.writeFile(sanPhams, false);
    }

    public boolean deleteProduct(String idproduct) {
        for (SanPham sanPham : sanPhams) {
            if (sanPham.getMaSanPham().equalsIgnoreCase(idproduct)) {
                sanPhams.remove(sanPham);
                utilFile.writeFile(sanPhams, false);
                return true;
            }
        }
        return false;
    }

    public SanPham search(String idproduct) {
        for (SanPham sanPham : sanPhams) {
            if (sanPham.getMaSanPham().equalsIgnoreCase(idproduct)) {
                return sanPham;
            }
        }
        return null;
    }

    public ArrayList<SanPham> hienThiThongTinTheoLoai(int loaiSP) {
        ArrayList<SanPham> list = new ArrayList<>();
        if (loaiSP == 0) {
            for (SanPham sanPham : sanPhams) {
                if (sanPham instanceof SanPhamNhapKhau) {
                    list.add(sanPham);
                }
            }
        }
        if (loaiSP == 1) {
            for (SanPham sanPham : sanPhams) {
                if (sanPham instanceof SanPhamXuatKhau) {
                    list.add(sanPham);
                }
            }
        }
        return list;
    }

    public double tonGiaban() {
        double sum = 0;
        for (SanPham sanPham : sanPhams) {
            if (sanPham instanceof SanPhamNhapKhau) {
                sum += sanPham.giaBan();
            } else {
                SanPhamXuatKhau spxk = (SanPhamXuatKhau) sanPham;
                sum += spxk.giaBan();
            }
        }
        return sum;
    }

    public double tongTienTheoSL() {
        double sum = 0;
        for (SanPham sanPham : sanPhams) {
            if (sanPham instanceof SanPhamNhapKhau) {
                sum += sanPham.tongtien();
            } else {
                SanPhamXuatKhau spxk = (SanPhamXuatKhau) sanPham;
                sum += spxk.tongtien();
            }
        }
        return sum;
    }

    public void sapXep() {
        for (int i = 0; i < sanPhams.size() - 1; i++) {
            for (int j = i + 1; j < sanPhams.size(); j++) {
                if (sanPhams.get(i).giaBan() > sanPhams.get(j).giaBan());
                SanPham temp = sanPhams.set(i, sanPhams.get(i));
                sanPhams.set(i, sanPhams.get(j));
                sanPhams.set(j, temp);
            }
        }
    }

    public double thueCaoNhat() {
        double thue = 0;
        for (SanPham sanPham : sanPhams) {
            if (sanPham instanceof SanPhamNhapKhau) {
                if (((SanPhamNhapKhau) sanPham).getThueNhapKhau() > thue) {
                    thue = ((SanPhamNhapKhau) sanPham).getThueNhapKhau();
                }

            }
        }
        return thue;
    }

    public SanPham thueCaoNhaBtnt() {
        for (SanPham sanPham : sanPhams) {
            if (sanPham instanceof SanPhamNhapKhau) {
                if (((SanPhamNhapKhau) sanPham).getThueNhapKhau() == thueCaoNhat()) {
                    return sanPham;
                }
            }
        }
        return null;
    }

    public double giaBanMax() {
        double max = 0;
        for (SanPham sanPham : sanPhams) {
            if (sanPham.giaBan() > max) {
                max = sanPham.giaBan();
            }
        }
        return max;
    }

    public SanPham giaBanMaxbtn() {
        for (SanPham sanPham : sanPhams) {
            if (sanPham.giaBan() == giaBanMax()) {
                return sanPham;
            }
        }
        return null;
    }
    public boolean ktmaSP(String ma){
        for (SanPham sanPham : sanPhams) {
            if (sanPham.getMaSanPham().equals(ma)) {
                return true;
            }
        }
        return false;
    }
}
