package baitap.tuan04_buoi1;

import java.util.Scanner;

public class ChuyenXe {
    protected int maSoChuyen;
    protected String hoTenTaiXe;
    protected int soXe;
    protected double doanhThu;

    public int getMaSoChuyen() {
        return maSoChuyen;
    }
    public void setMaSoChuyen(int maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }
    public String getHoTenTaiXe() {
        return hoTenTaiXe;
    }
    public void setHoTenTaiXe(String hoTenTaiXe) {
        this.hoTenTaiXe = hoTenTaiXe;
    }
    public double getDoanhThu() {
        return doanhThu;
    }public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }
    public int getSoXe() {
        return soXe;
    }
    public void setSoXe(int soXe) {
        this.soXe = soXe;
    }

    public ChuyenXe(){

    }

   public ChuyenXe(int maSoChuyen,String hoTenTaiXe, int soXe, double doanhThu){
        this.maSoChuyen = maSoChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.doanhThu  = doanhThu;
    }
    public void nhapDanhSach(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap ma so chuyen xe: ");
        setMaSoChuyen(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap ho ten tai xe: ");
        setHoTenTaiXe(sc.nextLine());
        System.out.println("Nhap so xe: ");
        setSoXe(sc.nextInt());
        System.out.println("Nhap doanh thu: ");
        setDoanhThu(sc.nextDouble());
    }

    
    public String toString() {
        return "\nMa so chuyen xe: "+this.maSoChuyen+"\nHo ten tai xe: "+this.hoTenTaiXe+"\nSo xe: "+this.soXe+"\nDoanh thu: "+this.doanhThu;
    }
}
