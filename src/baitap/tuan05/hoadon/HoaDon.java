package baitap.tuan05.hoadon;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HoaDon {
    private int maHD;
    private Date ngayHD;
    private String tenKhach;
    private int maPhong;
    private double donGia;
    protected double thanhTien;

    public int getMaHD() {
        return maHD;
    }
    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }
    public Date getNgayHD() {
        return ngayHD;
    }
    public void setNgayHD(Date ngayHD) {
        this.ngayHD = ngayHD;
    }
    public String getTenKhach() {
        return tenKhach;
    }
    public void setTenKhach(String tenKhach) {
        this.tenKhach = tenKhach;
    }
    public int getMaPhong() {
        return maPhong;
    }
    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public double getThanhTien() {
        return thanhTien;
    }
    public HoaDon(int maHD, Date ngayHD, String tenKhach, int maPhong, double donGia) {
        this.maHD = maHD;
        this.ngayHD = ngayHD;
        this.tenKhach = tenKhach;
        this.maPhong = maPhong;
        this.donGia = donGia;
    }
    
    public HoaDon() {
    }

    Scanner sc = new Scanner(System.in);
    
    SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy");
    public void nhapThongTin() throws ParseException{
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
