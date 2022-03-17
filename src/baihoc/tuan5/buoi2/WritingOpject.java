package baihoc.tuan5.buoi2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

import baihoc.tuan04.HangThucPham;

public class WritingOpject {
    public static void main(String[] args) throws IOException {
        FileOutputStream outFile = new FileOutputStream("data.dat");

        ObjectOutputStream objOut = new ObjectOutputStream(outFile);

        HangThucPham htp = new HangThucPham("01", "Mi Hao Hao", 3500, new Date(), new Date());
        System.out.println(htp);

        objOut.writeObject(htp);

        objOut.close();

    }
}
