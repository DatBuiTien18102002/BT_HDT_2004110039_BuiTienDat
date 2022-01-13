package baihoc.tuan01_buoi2;

import java.util.Scanner;

public class SinhVien {
    int mssv;
    String tenSinhVien;
    int tuoi;
    String gioiTinh;
    String queQuan;

    Scanner sc = new Scanner(System.in);

    void nhapSV() {
        System.out.print("Nhap Ma so sinh vien: ");
        mssv = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap Ho va Ten: ");
        tenSinhVien = sc.nextLine();
        System.out.print("Nhap Tuoi: ");
        tuoi = sc.nextInt();
        queQuan = sc.nextLine();
        System.out.print("Nhap gioi tinh: ");
        gioiTinh = sc.nextLine();
        System.out.print("Nhap Que Quan: ");
        queQuan = sc.nextLine();
        System.out.println("------------------");
    }

    void inThongTinSV() {
        System.out.println("Ma so sinh vien: " + mssv);
        System.out.println("Ten sinh vien :" + tenSinhVien);
        System.out.println("Tuoi sinh vien:" + tuoi);
        System.out.println("Gioi tinh sinh vien :" + gioiTinh);
        System.out.println("Que quan sinh vien :" + queQuan);
    }
}
