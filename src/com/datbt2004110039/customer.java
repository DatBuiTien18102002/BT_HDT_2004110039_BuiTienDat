package com.datbt2004110039;

import java.util.Scanner;

public class customer {
    String cusName;
    String address;
    Scanner sc = new Scanner(System.in);

    void getCusName(){
        System.out.print("Nhap ten khach hang: ");
        cusName = sc.nextLine();

    }

    void getAddress(){
        System.out.print("Nhap dia chi khach hang: ");
        address = sc.nextLine();
    }

    void showInformation(){
        System.out.println("Ten khach hang: "+ cusName);
        System.out.println("Dia chi: "+ address);
    }
}
