package baitap.tuan03;

import java.util.Scanner;

public class SinhVienTestDrive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int n = sc.nextInt();

        SinhVien[] newSV = new SinhVien[n];

        for(int i = 0;i<n;i++){
            newSV[i] = new SinhVien();
            System.out.print("Nhap ma sinh vien: ");
            newSV[i].setMaSV(sc.nextInt());
            sc.nextLine();
            System.out.print("Nhap ten sinh vien: ");
            newSV[i].setHoTen(sc.nextLine());
            System.out.print("Nhap dia chi: ");
            newSV[i].setDiaChi(sc.nextLine());
            System.out.print("Nhap so dien thoai gom 7 so: ");
            newSV[i].setSoDT(sc.nextInt());
        }

        for(int i = 0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                if(newSV[i].getMaSV()>newSV[j].getMaSV()){
                    SinhVien temp = new SinhVien();
                    temp = newSV[i];
                    newSV[i] = newSV[j];
                    newSV[j] = temp;
                }
            }
        }

        for(int i = 0;i<n;i++){
            System.out.print(newSV[i].toString());
            
        }
    }

}
