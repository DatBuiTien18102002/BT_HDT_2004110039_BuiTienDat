package baitap.tuan04_buoi1;

import java.util.Scanner;

public class LoaiSach {
    protected int maSach;
    protected double donGia;
    protected int soLuong;
    protected String nhaXB;


    public int getMaSach() {
        return maSach;
    }
    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }
    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public String getNhaXB() {
        return nhaXB;
    }
    public void setNhaXB(String nhaXB) {
        this.nhaXB = nhaXB;
    }

    public LoaiSach(){

    }
    public LoaiSach(int maSach,double donGia,int soLuong,String nhaXB){
        this.maSach =maSach;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nhaXB = nhaXB;
    }

    public void nhapDS(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ma Sach: ");
        setMaSach(sc.nextInt());
        System.out.print("Don Gia: ");
        setDonGia(sc.nextDouble());
        System.out.print("So Luong: ");
        setSoLuong(sc.nextInt());
        sc.nextLine();
        System.out.print("Nha Xuat Ban:");
        setNhaXB(sc.nextLine());
    }

    @Override
    public String toString() {
        return "Ma sach: "+this.maSach+"\nDon gia: "+this.donGia+"\nSo luong: "+this.soLuong+"\nNha xuat ban: "+this.nhaXB;
    }
}
