package baihoc.tuan5.buoi2;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.ObjectInputStream;

import baihoc.tuan04.HangThucPham;

public class ReadingObject {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
            FileInputStream inFile = new FileInputStream("data.dat");
            
            ObjectInputStream objIn =new ObjectInputStream(inFile);

            HangThucPham htp = (HangThucPham)objIn.readObject();

            System.out.println(htp);
            objIn.close();
        }

    
}
