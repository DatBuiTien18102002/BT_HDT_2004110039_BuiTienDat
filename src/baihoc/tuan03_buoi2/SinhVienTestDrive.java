package baihoc.tuan03_buoi2;

import java.util.Scanner;

public class SinhVienTestDrive {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(1,"Le Thanh Trung",7,6);
        SinhVien sv2 = new SinhVien(2,"Bui Tien Dat",6,8);
        SinhVien sv3 = new SinhVien();
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma sinh vien: ");
        int maSV = sc.nextInt();
        sc.nextLine();
        System.out.print("Ten sinh vien: ");
        String tenSV = sc.nextLine();
        System.out.print("Diem ly thuyet: ");
        float diemLT = sc.nextFloat();
        System.out.print("Diem thuc hanh: ");
        float diemTH = sc.nextFloat();

        sv3.setMaSV(maSV);
        sv3.setHoTen(tenSV);
        sv3.setDiemLT(diemLT);
        sv3.setDiemTH(diemTH);

        System.out.println(sv1.toString());
        System.out.println(sv2.toString());
        System.out.println(sv3.toString());
    }
}
