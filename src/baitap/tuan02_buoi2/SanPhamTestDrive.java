package baitap.tuan02_buoi2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SanPhamTestDrive {
    public static void main(String[] args) {

        // SanPham sp1 = new SanPham();
        // sp1.nhap();
        
        // SanPham sp2 = new SanPham();
        // sp2.nhap();

        // sp1.xuat();
        // sp2.xuat();

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so san pham can tao: ");
        int n = sc.nextInt();
        List<SanPham> dsSanPham = new ArrayList<>();

        for(int i = 0; i<n;i++){
            SanPham sp = new SanPham();
            sp.nhap();
            dsSanPham.add(sp);
        }
        for(int i = 0; i<n;i++){
            SanPham sanPham  = dsSanPham.get(i); 
            sanPham.xuat();
        }




    }
}
