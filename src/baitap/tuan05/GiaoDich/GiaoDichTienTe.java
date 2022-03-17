package baitap.tuan05.GiaoDich;

import java.text.ParseException;
import java.util.Date;

public class GiaoDichTienTe extends GiaoDich{
    private String loaiTienTe;
    private int choice;
    private double tiGia;

    public String getLoaiTienTe() {
        return loaiTienTe;
    }

    public void setLoaiTienTe(String loaiTienTe) {
        this.loaiTienTe = loaiTienTe;
    }
    public double getTiGia() {
        return tiGia;
    }
    public void setTiGia(double tiGia) {
        this.tiGia = tiGia;
    }

    public GiaoDichTienTe(int maGiaoDich, Date ngayGiaoDich, double donGia, int soLuong, String loaiTienTe,
            double tiGia) {
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
        this.loaiTienTe = loaiTienTe;
        this.tiGia = tiGia;
    }

    @Override
    public void nhap() throws ParseException {
        // TODO Auto-generated method stub
        super.nhap();
        System.out.print("Nhap loai tien te: ");
        System.out.println("1.Tien Viet Nam");
        System.out.println("2.Tien USD");
        System.out.println("3.Tien Euro");
        System.out.print("Lua CHon: ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                this.loaiTienTe = "Tien Viet Nam";
                break;
            case 2:
                this.loaiTienTe = "Tien USD";
            default:
                this.loaiTienTe = "Tien Euro";
                break;
        }
    }
    public void tinhThanhTIen(){
        if(choice == 1){
            this.thanhTien = this.soLuong*this.donGia;
        }else{
            this.thanhTien =this.soLuong*this.donGia*tiGia;
        }
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+"\nLoai tien te: "+this.loaiTienTe+"\nThanh tien: "+this.thanhTien;
    }
}
