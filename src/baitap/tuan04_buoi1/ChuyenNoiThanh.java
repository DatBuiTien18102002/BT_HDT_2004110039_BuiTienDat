package baitap.tuan04_buoi1;

import java.util.Scanner;

public class ChuyenNoiThanh extends ChuyenXe{
    protected int soTuyen;
    protected double soKmDiDuoc;

    Scanner sc = new Scanner(System.in);

    public int getSoTuyen() {
        return soTuyen;
    }
    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }
    public double getSoKmDiDuoc() {
        return soKmDiDuoc;
    }
    public void setSoKmDiDuoc(double soKmDiDuoc) {
        this.soKmDiDuoc = soKmDiDuoc;
    }


    public ChuyenNoiThanh(){

    }
    public ChuyenNoiThanh(int maSoChuyen,String hoTenTaiXe, int soXe, double doanhThu, int soTuyen, double soKmDiDuoc){
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKmDiDuoc = soKmDiDuoc;
    }

    @Override
    public void nhapDanhSach() {
        super.nhapDanhSach();
        System.out.println("So tuyen xe: ");
        setSoTuyen(sc.nextInt());
        System.out.println("So km di duoc: ");
        setSoKmDiDuoc(sc.nextDouble());
    }

    @Override
    public String toString() {

        return super.toString() + "\nSo tuyen xe: "+this.soTuyen+"\nSo km di duoc: "+this.soKmDiDuoc;
    }


}
