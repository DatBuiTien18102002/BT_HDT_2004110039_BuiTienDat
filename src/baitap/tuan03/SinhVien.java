package baitap.tuan03;

import java.util.concurrent.Semaphore;

public class SinhVien {
    
    private int maSV;
    private String hoTen;
    private String diaChi;
    private int soDT;

    public int getMaSV() {
        return maSV;
    }
    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public int getSoDT() {
        return soDT;
    }
    public void setSoDT(int soDT) {
        this.soDT = soDT;
    }

    SinhVien(){

    }
    SinhVien(int maSV, String hoTen, String diaChi,int soDT){
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.soDT = soDT;

    }
    public String toString(){
        String string = "\nMa sinh vien: "+this.maSV+"\nHo ten: "+this.hoTen+"\nDia chi: "+this.diaChi+"\nSo dien thoai: "+this.soDT;
        return string;
    }

}
