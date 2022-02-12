package baitap.tuan02_buoi2;

import java.util.Scanner;



public class SanPham {
    
    private String tenSP;
    private double donGia;
    private double giamGia;

    SanPham(){

    }

    public SanPham(String tenSP, double donGia, double giamGia){
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham(String tenSP, double donGia){
        this(tenSP, donGia, 0);
    }

    private double getThueNhapKhau(){
        return donGia*10/100;
    }

    void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.print("Ten san pham: ");
        tenSP = sc.nextLine();
        System.out.print("Don gia: ");
        donGia = sc.nextDouble();
        System.out.print("Giam gia: ");
        giamGia = sc.nextDouble();
    }

    public void xuat(){
        System.out.println("");
        System.out.println("Ten san pham: " + tenSP);
        System.out.println("Don gia: " + donGia);
        System.out.println("Giam gia: " + giamGia);
        System.out.println("Thue nhap khau: " + getThueNhapKhau());
    }

    public String getTenSp(){ 
        return this.tenSP;
    }
    public void setTenSp(String tenSP){ 
        this.tenSP = tenSP;
    }

    public double getDonGia(){
        return this.donGia;
    }
    public void setDonGia(double donGia){
        this.donGia = donGia;
    }

    public double getGiamGia(){
        return this.giamGia;
    }
    public void setGiamGia(double giamGia){
        this.giamGia = giamGia;
    }
    


}
