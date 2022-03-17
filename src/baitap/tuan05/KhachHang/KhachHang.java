package baitap.tuan05.KhachHang;

import java.util.Date;

public class KhachHang {
    protected int maKhach;
    protected String tenKhach;
    protected Date ngayHD;
    protected double soLuong;
    protected int donGia;
    protected double thanhTien;
    public int getMaKhach() {
        return maKhach;
    }
    protected void setMaKhach(int maKhach) {
        this.maKhach = maKhach;
    }
    protected String getTenKhach() {
        return tenKhach;
    }
    protected void setTenKhach(String tenKhach) {
        this.tenKhach = tenKhach;
    }
    protected Date getNgayHD() {
        return ngayHD;
    }
    protected void setNgayHD(Date ngayHD) {
        this.ngayHD = ngayHD;
    }
    protected double getSoLuong() {
        return soLuong;
    }
    protected void setSoLuong(double soLuong) {
        this.soLuong = soLuong;
    }
    protected int getDonGia() {
        return donGia;
    }
    protected void setDonGia(int donGia) {
        this.donGia = donGia;
    }
    protected double getThanhTien() {
        return thanhTien;
    }
    protected KhachHang(int maKhach, String tenKhach, Date ngayHD, double soLuong, int donGia) {
        this.maKhach = maKhach;
        this.tenKhach = tenKhach;
        this.ngayHD = ngayHD;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }


    
}
