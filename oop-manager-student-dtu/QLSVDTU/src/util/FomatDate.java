package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FomatDate {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public String ngayThanhChuoi(Date date) {
        return sdf.format(date);
    }

    public Date chuoiThanhNgay(String string) throws ParseException {
        return sdf.parse(string);
    }
}
