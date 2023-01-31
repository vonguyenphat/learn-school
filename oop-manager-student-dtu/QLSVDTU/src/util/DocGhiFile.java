package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import qlsvdtu.GiangVien;
import qlsvdtu.SinhVien;
import qlsvdtu.ThanhVien;

public class DocGhiFile {

    FomatDate fd = new FomatDate();
    private static final String PATH = "D:\\CS311_VONGUYENHAT\\testDaoDien\\QLSVDTU.txt";

    public void ghiFile(List<ThanhVien> thanhViens, boolean isAppen) {
        try ( BufferedWriter bw = new BufferedWriter(new FileWriter(PATH, isAppen))) {
            for (ThanhVien tv : thanhViens) {
                bw.write(tv.toData());
                bw.newLine();
            }
            bw.close();
        } catch (IOException ex) {
            System.out.println("Loi ghi file");
        }
    }

    public ArrayList<ThanhVien> docFile() {
        ArrayList<ThanhVien> tvs = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(PATH));
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String[] s = line.split(",");
                String ma = s[0];
                String ten = s[1];
                Date ngaySinh = fd.chuoiThanhNgay(s[2]);
                String namHoc = s[3];
                if (s[6].equals("0")) {
                    double diemTB = Double.parseDouble(s[4]);
                    double tinhTien = Double.parseDouble(s[5]);
                    tvs.add(new SinhVien(diemTB, ma, ten, ngaySinh, namHoc));
                }   
                else {
                    int soBaiBao = Integer.parseInt(s[4]);
                    int soDetai = Integer.parseInt(s[5]);
                    tvs.add(new GiangVien(soBaiBao, soDetai, ma, ten, ngaySinh, namHoc));
                }
            }
        } catch (ParseException ex) {
            System.out.println("fomat loi");
        } catch (FileNotFoundException ex) {
            System.out.println("File khong ton tai");
        } catch (IOException ex) {
            System.out.println("Loi doc file");
        }
        return tvs;
    }
}
