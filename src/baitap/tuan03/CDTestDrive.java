package baitap.tuan03;

import java.util.Scanner;

public class CDTestDrive {
    public static void main(String[] args) {
        CD cd[] = null;
        int luaChon, n = 0;
        boolean flag = true;
        do {
            System.out.println("Lua chon cua ban ?");
            System.out.println("1.Nhap thong tin CD ");
            System.out.println("2.Xuat danh sach Album");
            System.out.println("3.Tinh tong gia thanh");
            System.out.println("4.Tong so luong CD");
            System.out.println("5.Sap xep giam dan theo gia thanh");
            System.out.println("6.Sap xep tang dan theo tưa CD");
            System.out.println("Nhap so khac de thoat");
            luaChon = sc.nextInt();
            switch (luaChon) {
                case 1:
                    System.out.println("Nhap so luong CD : ");
                    n = sc.nextInt();
                    cd = new CD[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("CD thu " + (i + 1)+": ");
                        cd[i] = new CD();
                        nhapDS(cd[i]);
                    }
                    break;
                case 2:
                    for (int i = 0; i < n; i++) {
                        System.out.println(cd.toString());
                    }
                    break;
                case 3:
                    int tong = 0;
                    for (int i = 0; i < n; i++) {
                        tong += cd[i].getGiaThanh();
                    }
                    System.out.println("Tong gia thanh: "+tong);
                    break;
                case 4:
                    System.out.println("Tong so luong CD la : " + n);
                    break;
                case 5:
                    CD temp = cd[0];
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = i + 1; j < n; j++) {
                            if (cd[i].getGiaThanh() < cd[j].getGiaThanh()) {
                                temp = cd[j];
                                cd[j] = cd[i];
                                cd[i] = temp;
                            }
                        }
                    }
                    System.out.println("Sap xep thanh cong, Nhap so 2 đe kiem tra!");
                    break;
                case 6:
                    temp = cd[0];
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = i + 1; j < n; j++) {
                            if (cd[i].getTenCD().compareTo(cd[j].getTenCD())>0) {
                                temp = cd[j];
                                cd[j] = cd[i];
                                cd[i] = temp;
                            }
                        }
                    }
                    System.out.println("Sap xep thanh cong, Nhap so 2 đe kiem tra!");
                    break;
                default:
                    System.out.println("Goodbye");
                    flag = false;
                    break;
            }
        }while (flag) ; 
    }
    static Scanner sc = new Scanner(System.in);
    public static void nhapDS(CD cd){
        System.out.print("Nhap ma CD: ");
        cd.setMaCD(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhap ten CD : ");
        cd.setTenCD(sc.nextLine());
        System.out.print("Nhap ten ca si : ");
        cd.setCaSy(sc.nextLine());
        System.out.print("Nhap so luong bai hat : ");
        cd.setSoBH(sc.nextInt());
        System.out.print("Nhap gia thanh : ");
        cd.setGiaThanh(sc.nextFloat());
    }
}
