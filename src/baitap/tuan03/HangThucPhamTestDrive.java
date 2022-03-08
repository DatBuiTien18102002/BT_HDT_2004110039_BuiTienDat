package baitap.tuan03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class HangThucPhamTestDrive {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);

        HangThucPham thucPham = new HangThucPham();


        System.out.print("Nhap ma hang: ");
        long maHang = sc.nextLong();

        thucPham.setMaHang(maHang);
        sc.nextLine();
        do {
            System.out.print("Nhap ten hang: ");
            String tenHang = sc.nextLine();
            thucPham.setTenHang(tenHang);
        } while (thucPham.ktTenHang());

        System.out.print("Nhap don gia: ");
        double donGia = sc.nextDouble();
        thucPham.setDonGia(donGia);
        sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        do {
            System.out.print("Nhap ngay san xuat: ");
            thucPham.setnSX(sdf.parse(sc.nextLine()));
            System.out.print("Nhap ngay het han: ");
            thucPham.sethSD(sdf.parse(sc.nextLine()));
        } while (thucPham.ktNgay());

        System.out.println(thucPham.toString());

        thucPham.ktHSD();

    }
}
