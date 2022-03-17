package baitap.tuan05.GiaoDich;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class GiaoDich {
    protected int maGiaoDich;
    protected Date ngayGiaoDich;
    protected double donGia;
    protected int soLuong;
    protected double thanhTien;

    protected int getMaGiaoDich() {
        return maGiaoDich;
    }
    protected void setMaGiaoDich(int maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }
    protected Date getNgayGiaoDich() {
        return ngayGiaoDich;
    }
    protected void setNgayGiaoDich(Date ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }
    protected double getDonGia() {
        return donGia;
    }
    protected void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    protected int getSoLuong() {
        return soLuong;
    }
    protected void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    protected double getThanhTien() {
        return thanhTien;
    }
 
    
    protected GiaoDich(int maGiaoDich, Date ngayGiaoDich, double donGia, int soLuong) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy");
    protected void nhap() throws ParseException{

        System.out.print("Nhap ma giao dich: ");
        setMaGiaoDich(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhap ngay giao dich");
        setNgayGiaoDich(sdf.parse(sc.nextLine()));
        System.out.print("Nhap don gia:");
        setDonGia(sc.nextDouble());
        System.out.print("Nhap so luong");
        setSoLuong(sc.nextInt());

    }
    @Override
    public String toString() {
        return "\nMa giao dich: "+this.maGiaoDich+"\nNgay giao dich: "+sdf.format(this.ngayGiaoDich)+"\nDonGia: "+this.donGia+"\nSo luong: "+this.soLuong+"\nThanh tien: "+this.thanhTien;
    }

    
}
