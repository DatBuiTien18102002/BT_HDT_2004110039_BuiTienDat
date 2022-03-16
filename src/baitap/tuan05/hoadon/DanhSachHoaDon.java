package baitap.tuan05.hoadon;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DanhSachHoaDon {
    private HoaDon[] hD = new HoaDon[100];
    private int countHD,sumTheoNgay=0,sumTheoGio=0,sumThanhTien=0,countKhaDung =0;
    private double trungBinhThanhTien=0;

    public DanhSachHoaDon(){
        countHD = 0;
        for (int i = 0; i < 100; i++) {
            hD[i] = new HoaDon();
        }
    }

    public void nhapDS(int temp) throws ParseException{
        if(countHD>100){
            System.out.println("Danh sach qua tai!!!");
        }else{
            if(temp == 1){
                hD[countHD] = new HoaDonTheoGio();
                HoaDonTheoGio hDTheoGio = new HoaDonTheoGio();
                hDTheoGio.nhapThongTin();
                hDTheoGio.tinhThanhTIen();
                hD[countHD] = hDTheoGio;
                sumTheoGio++; 
            }else{
                hD[countHD] = new HoaDonTheoNgay();
                HoaDonTheoNgay hDTheoNgay = new HoaDonTheoNgay();
                hDTheoNgay.nhapThongTin();
                hDTheoNgay.tinhThanhTien();
                hD[countHD] = hDTheoNgay;
                sumTheoNgay++;
            }
        }
    }
    public void inDS(){
        for (int i = 0; i < countHD; i++) {
            System.out.println("Hoa don "+(i+1));
            System.out.println(hD[i].toString());
        }
    }
    public  void tongSoLuong(){
        System.out.println("Tong so luong thue theo gio: "+sumTheoGio);
        System.out.println("Tong so luong thue theo ngay: "+sumTheoNgay);
    }
    SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy");
    public void trungBinhThanhTien() throws ParseException{
        for (int i = 0; i < countHD; i++) {
            if(hD[i].getNgayHD().compareTo(sdf.parse("01/09/2013"))>0&&hD[i].getNgayHD().compareTo(sdf.parse("31/09/2013"))<0){
               sumThanhTien +=  hD[i].getThanhTien();
               countKhaDung++;
            }
        }
        trungBinhThanhTien = sumThanhTien/countKhaDung;
    }


}
