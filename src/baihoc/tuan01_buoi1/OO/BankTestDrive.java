package baihoc.tuan01_buoi1.OO;

public class BankTestDrive {
    public static void main(String[] args) {
        bank_OO account = new bank_OO();

        account.deposit();
        account.show();
        account.witdraw();
        account.show();
    }
}
