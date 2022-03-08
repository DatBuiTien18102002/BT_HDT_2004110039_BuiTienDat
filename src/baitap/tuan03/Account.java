package baitap.tuan03;

import java.text.NumberFormat;
import java.util.Locale;

public class Account {
    private long soTK;
    private String tenTK;
    private double tienTK;
    private double laiXuat = 0.035;

    public Account(){

    }

    public Account(long soTK, String tenTK, double tienTK){
        this.soTK = soTK;
        this.tenTK = tenTK;
        this.tienTK = tienTK;
    }

    public Account(long soTK, String tenTK){
        this.soTK = soTK;
        this.tenTK = tenTK;
        this.tienTK = 50;
    }

    public long getSoTK() {
        return soTK;
    }
    public void setSoTK(long soTK) {
        this.soTK = soTK;
    }
    public String getTenTK() {
        return tenTK;
    }
    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }
    public double getTienTK() {
        return tienTK;
    }
    public void setTienTK(double tienTK) {
        this.tienTK = tienTK;
    }

    public void napTien(double tienNap){
        if (tienNap<0){
            System.out.println("Error!!!");
            System.out.println("Nhap lai so tien  !!!");
            return;
        }

        this.tienTK += tienNap;
    }

    public void rutTien(double tienRut){
        if (tienRut > this.tienTK ){
            System.out.println("Error!!!");
            System.out.println("Nhap lai so tien !!!");
            return;
        }
        double phiRut = tienRut * 10 / 100;
        this.tienTK -= (tienRut + phiRut);
    }

    public void daoHan(){
        this.tienTK += this.tienTK * this.laiXuat; 
    }

    private Account tkNhan;

    public void chuyenKhoan(double tienChuyen,long soTKNhan){
        tkNhan = new Account(soTKNhan, "Bui Nhu Y");
        rutTien(tienChuyen);
        tkNhan.napTien(tienChuyen);
        System.out.println("Chuyen khoan thanh cong!!!");
        System.out.println("Tai Khoan "+ soTKNhan + "hien co: " + tkNhan.getTienTK());
    }

    public String toString(){
        NumberFormat currencyVN = NumberFormat.getCurrencyInstance();
        String str1 = currencyVN.format(this.tienTK);
        String string  = "So tai khoan: " + this.soTK + "\nTen tai khoan: " +this.tenTK + "\nSo tien trong tai khoan: "+ str1;
        return string;
    }

}
