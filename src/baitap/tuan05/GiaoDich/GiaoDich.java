package baitap.tuan05.GiaoDich;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class GiaoDich {
    private int maGiaoDich;
    private Date ngayGiaoDich;
    private double donGia;
    private int soLuong;
    private double thanhTien;

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

    abstract public void tinhThanhTien();
    
    public GiaoDich(int maGiaoDich, Date ngayGiaoDich, double donGia, int soLuong) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy");
    public void nhap() throws ParseException{

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
