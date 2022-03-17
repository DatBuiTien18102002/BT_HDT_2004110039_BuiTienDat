package baitap.tuan05.hoadon;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HoaDon {
    protected int maHD;
    protected Date ngayHD;
    protected String tenKhach;
    protected int maPhong;
    protected double donGia;
    protected double thanhTien;

    protected int getMaHD() {
        return maHD;
    }
    protected void setMaHD(int maHD) {
        this.maHD = maHD;
    }
    protected Date getNgayHD() {
        return ngayHD;
    }
    protected void setNgayHD(Date ngayHD) {
        this.ngayHD = ngayHD;
    }
    protected String getTenKhach() {
        return tenKhach;
    }
    protected void setTenKhach(String tenKhach) {
        this.tenKhach = tenKhach;
    }
    protected int getMaPhong() {
        return maPhong;
    }
    protected void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }
    protected double getDonGia() {
        return donGia;
    }
    protected void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    protected double getThanhTien() {
        return thanhTien;
    }

    protected HoaDon(int maHD, Date ngayHD, String tenKhach, int maPhong, double donGia) {
        this.maHD = maHD;
        this.ngayHD = ngayHD;
        this.tenKhach = tenKhach;
        this.maPhong = maPhong;
        this.donGia = donGia;
    }
    
    protected HoaDon() {
    }

    Scanner sc = new Scanner(System.in);
    
    SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy");
    protected void nhapThongTin() throws ParseException{
        System.out.print("Nhap ma hoa don: ");
        setMaHD(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhap ngay hoa don:");
        setNgayHD(sdf.parse(sc.nextLine()));
        System.out.print("Nhap ten khach hang: ");
        setTenKhach(sc.nextLine());
        System.out.print("Nhap ma phong: ");
        setMaPhong(sc.nextInt());
        System.out.print("Nhap don gia: ");
        setDonGia(sc.nextDouble());
    }
    @Override
    public String toString() {
        return "\nMa hoa don: "+maHD+"\nNgay hoa don: "+sdf.format(ngayHD)+"\nTen khach hang: "+tenKhach+"\nMa phong: "+maPhong+"\nDon gia: "+donGia;
    }


    

}
