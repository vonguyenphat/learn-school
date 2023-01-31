package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import model.SanPham;
import model.SanPhamNhapKhau;
import model.SanPhamXuatKhau;

public class UtilFile {

    private static final String PATH = "sanpham.txt";

    public ArrayList<SanPham> readFile() {
        ArrayList<SanPham> list = new ArrayList<>();
        try ( BufferedReader br = new BufferedReader(new FileReader(PATH));) {
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null ) {
                    break;
                }
                String[] temp = line.split(",");
                if (temp[0].equalsIgnoreCase("nk")) {
                    list.add(new SanPhamNhapKhau(temp[1], temp[2], Long.parseLong(temp[3]), temp[4], Double.parseDouble(temp[5]), temp[6], Double.parseDouble(temp[7])));
                } else {
                    list.add(new SanPhamXuatKhau(temp[1], temp[2], Long.parseLong(temp[3]), temp[4], Double.parseDouble(temp[5]), temp[6]));
                }
            }
            br.close();
        } catch (IOException ex) {
            System.out.println("error read file !!!!!");
        }
        return list;
    }
    
    public void writeFile(ArrayList<SanPham> list, boolean isAppen) {
        try ( BufferedWriter bw = new BufferedWriter(new FileWriter(PATH));) {
            for (SanPham sanPham : list) {
                bw.write(sanPham.toData());
                bw.newLine();
            }
            bw.close();
        } catch (IOException ex) {
            System.out.println("error write file!!!!!");
        }
    }

}
