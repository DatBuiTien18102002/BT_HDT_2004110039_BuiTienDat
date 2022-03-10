package baitap.tuan04_buoi1;

import java.util.Scanner;

public class ChuyenNgoaiThanh extends ChuyenXe{
    protected String noiDen;
    protected int soNgayDiDuoc;

    Scanner sc = new Scanner(System.in);
    public String getNoiDen() {
        return noiDen;
    }
    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }
    public int getSoNgayDiDuoc() {
        return soNgayDiDuoc;
    }
    public void setSoNgayDiDuoc(int soNgayDiDuoc) {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    public ChuyenNgoaiThanh(){

    }
    public ChuyenNgoaiThanh(int maSoChuyen,String hoTenTaiXe, int soXe, double doanhThu, String noiDen, int soNgayDiDuoc){
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.noiDen =noiDen;
        this.soNgayDiDuoc=soNgayDiDuoc;
    }

    @Override
    public void nhapDanhSach() {
        // TODO Auto-generated method stub
        super.nhapDanhSach();
        System.out.println("Nhap noi den: ");
        setNoiDen(sc.nextLine());
        System.out.println("Nhap so ngay di duoc: ");
        setSoNgayDiDuoc(sc.nextInt());
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+"\nNoi den: "+this.noiDen+"\nSo ngay di duoc: "+this.soNgayDiDuoc;

    }
}
