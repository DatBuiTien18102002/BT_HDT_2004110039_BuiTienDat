package baihoc_01.structured;

import java.util.Scanner;



public class bank_structured {
    static int account_number = 123456;
    static int account_banlance = 0;
    static Scanner sc ;
    public static void main(String[] args) {
        // Data
        // Khai báo 2 biến


        // hanh dong thao tac len data
        sc = new Scanner(System.in);

        // Gửi Tiền: deposit
        deposit();

        //show
        show();

        // Rút tiền: withdraw
        witdraw();

        //show
        show();

    }

    static void deposit(){
        System.out.println("Nhap vao so tien gui: ");
        int depositAmount = 0;
        depositAmount = sc.nextInt();
        account_banlance += depositAmount; // thao tac lên data
    }

    static void witdraw(){
        System.out.println("Nhap vao so tien rut: ");
        int withdrawAmount = 0;
        withdrawAmount = sc.nextInt();
        account_banlance -= withdrawAmount; // thao tac lên data
    }

    static void show(){
        System.out.println("Thong tin tai khoan: ");
        System.out.println("Account Number: " + account_number);
        System.out.println("Account Balance: " + account_banlance);
    }
}
