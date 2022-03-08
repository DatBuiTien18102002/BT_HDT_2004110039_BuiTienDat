package baitap.tuan03;

import java.util.Scanner;

public class AccountTestDrive {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        Account account = new Account(123456,"Bui Tien Dat", 50);
        System.out.println(account.toString());

        // System.out.print("Nhap so tien can nap: ");
        // long tienNap = sc.nextLong();
        // account.napTien(tienNap);
        // System.out.println("Tai khoan ban co: "+account.getTienTK());

        // System.out.print("Nhap so tien can rut: ");
        // long tienRut = sc.nextLong();
        // account.rutTien(tienRut);
        // System.out.println("Tai khoan ban con lai: "+account.getTienTK());

        // account.daoHan();;
        // System.out.println("Tai khoan ban co: "+account.getTienTK());

        System.out.print("Nhap ID cua tai koan can chuyen: ");
        long soTKNhan = sc.nextLong();
        System.out.print("Nhap so tien can chuyen: ");
        long tienChuyen = sc.nextLong();
        account.chuyenKhoan(tienChuyen, soTKNhan);;
        System.out.println("Tai khoan ban co: "+account.getTienTK());


    }
}
