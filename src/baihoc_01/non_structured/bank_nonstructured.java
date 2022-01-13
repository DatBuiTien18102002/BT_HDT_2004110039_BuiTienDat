package baihoc_01.non_structured;

import java.util.Scanner;

public class bank_nonstructured {
    public static void main(String[] args) {
        // Data
        // Khai báo 2 biến
        int account_number = 123456;
        int account_banlance = 0;

        // hanh dong thao tac len data
        Scanner sc = new Scanner(System.in);

        // Gửi Tiền: deposit
        System.out.println("Nhap vao so tien gui: ");
        int depositAmount = 0;
        depositAmount = sc.nextInt();
        account_banlance += depositAmount; // thao tac lên data

        // show
        System.out.println("Thong tin tai khoan: ");
        System.out.println("Account Number: " + account_number);
        System.out.println("Account Balance: " + account_banlance);

        // Rút tiền: withdraw
        System.out.println("Nhap vao so tien rut: ");
        int withdrawAmount = 0;
        withdrawAmount = sc.nextInt();
        account_banlance -= withdrawAmount; // thao tac lên data

        // show
        System.out.println("Thong tin tai khoan: ");
        System.out.println("Account Number: " + account_number);
        System.out.println("Account Balance: " + account_banlance);

    }



}
