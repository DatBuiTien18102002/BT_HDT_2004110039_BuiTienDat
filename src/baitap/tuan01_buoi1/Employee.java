package baitap.tuan01_buoi1;

import java.util.Scanner;

public class Employee {
    String EmName;
    int salary;
    Scanner sc = new Scanner(System.in);

    void getEmployeeName(){
        System.out.print("Nhap ten nhan vien: ");
        EmName = sc.nextLine();

    }

    void getSalary(){
        System.out.print("Nhap luong cua nhan vien: ");
        salary = sc.nextInt();
    }

    void showInformation(){
        System.out.println("===Ten nhan vien: "+ EmName);
        System.out.println("===Luong: "+ salary);
    }
}
