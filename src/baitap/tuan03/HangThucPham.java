package baitap.tuan03;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class HangThucPham {
    private long maHang;
    private String tenHang;
    private double donGia;
    private Date nSX;
    private Date hSD;

    HangThucPham(){
        
    }

    HangThucPham(long maHang, String tenHang, double donGia, Date nSX, Date hSD){
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
        this.nSX = nSX;
        this.hSD = hSD;
    }

    HangThucPham(long maHang){
        this.maHang = maHang;
    }

    public long getMaHang() {
        return maHang;
    }
    public void setMaHang(long maHang) {
        this.maHang = maHang;
    }
    public String getTenHang() {
        return tenHang;
    }
    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public Date getnSX() {
        return nSX;
    }
    public void setnSX(Date nSX) {
        this.nSX = nSX;
    }
    public Date gethSD() {
        return hSD;
    }
    public void sethSD(Date hSD) {
        this.hSD = hSD;
    }

    
    public String toString() {
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeVN);
        String fDonGia = numberFormat.format(this.donGia);

        SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy");
        String fNSX = sdf.format(this.nSX);
        String fHSD = sdf.format(this.hSD);

        String string = "Ma Hang: "+this.maHang+"\nTen Hang: "+this.tenHang+"\nDon Gia: "+fDonGia+"\nNgay San Xuat: "+fNSX+"\nHan Su Dung: "+fHSD;
        return string;
    }

    public boolean ktTenHang(){
        boolean check = true;
        if(this.tenHang == "" || this.tenHang.isEmpty()){
            System.out.println("Ten hang khong de trong!!!");
        }else{
            check = false;
        }
        return check;
    }

    public boolean ktNgay(){
        boolean check = true;
        if (this.getnSX().compareTo(this.gethSD()) < 0) {
            check = false;
        } else {
            System.out.println("Ngay het han khong duoc nho hon ngay san xuat : ");
        }
        return check;
    }

    public void ktHSD(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date today = new Date();
        today.getTime();
        String st = sdf.format(today);
        if(this.gethSD().compareTo(today)<0){
            System.out.println("Hom nay la ngay "+st+"hang hoa da het han");
        }else{
            System.out.println("Hom nay la ngay "+st+"hang hoa van con han");
        }
    }

}
