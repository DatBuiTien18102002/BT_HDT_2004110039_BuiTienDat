package baitap.tuan04_buoi1;

import java.util.Scanner;

public class SachThamKhao extends LoaiSach{
    protected double  thue;
    protected double thanhTien;

    public double getThue() {
        return thue;
    }
    public double getThanhTien() {
        return thanhTien;
    }
    public void setThue(double thue) {
        this.thue = thue;
    }

    @Override
    public void nhapDS() {
        Scanner sc = new Scanner(System.in);
        super.nhapDS();
        System.out.print("Nhap thue: ");
        setThue(sc.nextDouble());
        this.thanhTien = this.donGia*this.soLuong+this.thue;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+"\nThue"+this.thue+"\nThanh tien: "+this.thanhTien;
    }
}
