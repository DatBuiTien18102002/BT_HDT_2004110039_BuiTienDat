package baitap.tuan05.GiaoDich;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class GiaoDichVang extends GiaoDich{
    private String loaiVang;

    public String getLoaiVang() {
        return loaiVang;
    }

    public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }

    public GiaoDichVang(int maGiaoDich, Date ngayGiaoDich, double donGia, int soLuong, String loaiVang) {
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
        this.loaiVang = loaiVang;
    }


    Scanner sc = new Scanner(System.in);
    @Override
    public void nhap() throws ParseException {
        
        super.nhap();
        System.out.println("Nhap loai vang: ");
        setLoaiVang(sc.nextLine());
    }
    public void tinhThanhTien(){
        this.thanhTien = this.soLuong*this.donGia;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+"\nLoai Vang: "+this.loaiVang+"\nThanh tien: "+this.thanhTien;
    }

}
