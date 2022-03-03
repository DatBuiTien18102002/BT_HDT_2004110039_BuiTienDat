package baihoc.tuan03_buoi2;

public class SinhVien {
    private int maSV;
    private String hoTen;
    private float diemLT;
    private float diemTH;
    
    public SinhVien(){

    }
    public SinhVien(int maSV, String hoTen, float diemLT, float diemTH){
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public int getMaSV(){
        return this.maSV;
    }
    public String getHoTen(){
        return this.hoTen;
    }
    public float getDiemLT(){
        return this.diemLT;
    }
    public float getdiemTH(){
        return this.diemTH;
    }

    public void setMaSV(int maSV){
        this.maSV = maSV;
    }
    public void setHoTen(String hoTen){
        this.hoTen = hoTen;
    }
    public void setDiemLT(float diemLT){
        this.diemLT = diemLT;
    }
    public void setDiemTH(float diemTH){
        this.diemTH = diemTH;
    }

    public float diemTrungBinh(){
        return (diemLT+diemTH)/2 ;
    }

    public String toString (){
        String string = "Ma SV: " + this.maSV + "   Ho Ten: " + this.hoTen;
        string += "       Diem LT: " + this.diemLT + "   Diem TH: "+ this.diemTH + "   Diem Trung Binh: " + this.diemTrungBinh();
        return string;
    }
}
