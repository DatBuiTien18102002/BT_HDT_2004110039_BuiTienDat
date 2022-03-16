package baitap.tuan04_buoi1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class GiaoDich {
    private int maGiaoDich;
    private Date ngayGiaoDich;
    private double donGia;
    private int soLuong;
    
    public GiaoDich(int maGiaoDich, Date ngayGiaoDich, double donGia, int soLuong) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }
    public int getMaGiaoDich() {
        return maGiaoDich;
    }
    public void setMaGiaoDich(int maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }
    public Date getNgayGiaoDich() {
        return ngayGiaoDich;
    }
    public void setNgayGiaoDich(Date ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy");
    public void nhapDS() throws ParseException{
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma giao dich: ");
        this.maGiaoDich = sc.nextInt();
        System.out.print("Nhap ngay giao dich(dd/mm/yyyy): ");
        this.ngayGiaoDich = sdf.parse(sc.nextLine());
        System.out.print("Nhap don gia: ");
        this.donGia = sc.nextDouble();
        System.out.print("Nhap so luong: ");
        this.soLuong = sc.nextInt();
    }
    @Override
    public String toString() {
        return "Ma giao dich: "+this.maGiaoDich+"\nNgay giao dich: "+this.ngayGiaoDich+"\nDon gia: "+this.donGia+"\nSo luong: "+this.soLuong;
    }
    


}
