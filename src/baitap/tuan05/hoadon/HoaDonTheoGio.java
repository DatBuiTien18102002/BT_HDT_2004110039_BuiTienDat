package baitap.tuan05.hoadon;

import java.text.ParseException;
import java.util.Date;

public class HoaDonTheoGio extends HoaDon{
    private int soGioThue;

    public int getSoGioThue() {
        return soGioThue;
    }


    public void setSoGioThue(int soGioThue) {
        if(soGioThue>24 && soGioThue<30){
            this.soGioThue = 24;
            return;
        }else if(soGioThue>30){
            System.out.println("So gio thue lon hon 30 gio");
            System.out.println("Khong dung hoa don theo gio!!!");
        }
        this.soGioThue = soGioThue;
    }
    public HoaDonTheoGio(){
        
    }

    public HoaDonTheoGio(int maHD, Date ngayHD, String tenKhach, int maPhong, double donGia, int soGioThue) {
        super(maHD, ngayHD, tenKhach, maPhong, donGia);
        this.soGioThue = soGioThue;
    }
    @Override
    public void nhapThongTin() throws ParseException {
        super.nhapThongTin();
        System.out.print("Nhap so gio thue: ");
        setSoGioThue(sc.nextInt());

    }
    public void tinhThanhTIen(){
        this.thanhTien = this.soGioThue*this.donGia;
    }
    @Override
    public String toString() {
        return super.toString()+"\nSo gio thue: "+this.soGioThue+"\nThanh tien: "+this.thanhTien;
    }
    
    
}
