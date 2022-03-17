package baitap.tuan05.hoadon;

import java.text.ParseException;
import java.util.Date;

public class HoaDonTheoNgay extends HoaDon{
    private int soNgayThue;

    public int getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }
    public HoaDonTheoNgay(){
        
    }

    public HoaDonTheoNgay(int maHD, Date ngayHD, String tenKhach, int maPhong, double donGia, int soNgayThue) {
        super(maHD, ngayHD, tenKhach, maPhong, donGia);
        this.soNgayThue = soNgayThue;
    }
    @Override
    public void nhapThongTin() throws ParseException {
        
        super.nhapThongTin();
        System.out.print("Nhap so ngay thue: ");
        setSoNgayThue(sc.nextInt());
    }
    public void tinhThanhTien(){
        if(this.soNgayThue>7){
            this.thanhTien = (7*this.donGia)+((this.soNgayThue-7)*this.donGia-(this.soNgayThue-7)*this.donGia*0.2);
        }else{
            this.thanhTien = soNgayThue*donGia;
        }
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+"\nSo ngay thue: "+this.soNgayThue+"\nThanh tien: "+this.thanhTien;
    }
    
    
}
