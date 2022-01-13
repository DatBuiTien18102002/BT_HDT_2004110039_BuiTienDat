package OO;

import java.util.Scanner;

public class bank_OO {
    int account_number = 123456;
    int account_banlance = 0;
    Scanner sc = new Scanner(System.in);

    void deposit(){
        System.out.println("Nhap vao so tien gui: ");
        int depositAmount = 0;
        depositAmount = sc.nextInt();
        account_banlance += depositAmount; // thao tac lên data
    }

    void witdraw(){
        System.out.println("Nhap vao so tien rut: ");
        int withdrawAmount = 0;
        withdrawAmount = sc.nextInt();
        account_banlance -= withdrawAmount; // thao tac lên data
    }

    void show(){
        System.out.println("Thong tin tai khoan: ");
        System.out.println("Account Number: " + account_number);
        System.out.println("Account Balance: " + account_banlance);
    }
}
