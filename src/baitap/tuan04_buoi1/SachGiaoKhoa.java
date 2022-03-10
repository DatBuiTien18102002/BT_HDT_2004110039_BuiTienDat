package baitap.tuan04_buoi1;

import java.util.Scanner;

public class SachGiaoKhoa extends LoaiSach{
    protected String tinhTrang;
    protected double thanhTien;

    public String getTinhTrang() {
        return tinhTrang;
    }
    public double getThanhTien() {
        return thanhTien;
    }
    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public SachGiaoKhoa(){

    }
    public SachGiaoKhoa(int maSach,double donGia,int soLuong,String nhaXB,String tinhTrang){
        super(maSach, donGia, soLuong, nhaXB);
        this.tinhTrang = tinhTrang;
    }

    @Override
    public void nhapDS() {
        Scanner sc = new Scanner(System.in);
        super.nhapDS();
        System.out.print("Tinh trang(cu/moi): ");
        setTinhTrang(sc.nextLine());
        if(this.tinhTrang.equalsIgnoreCase("moi")){
            this.thanhTien = this.soLuong*this.donGia;
        }else{
            this.thanhTien = this.soLuong*this.donGia*0.5;
        }
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+"\nTinh trang: "+this.tinhTrang+"\nThanh Tien: "+this.thanhTien;

    }
    
}
