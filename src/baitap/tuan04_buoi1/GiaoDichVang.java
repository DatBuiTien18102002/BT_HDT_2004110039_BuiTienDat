package baitap.tuan04_buoi1;

import java.util.Date;

public class GiaoDichVang extends GiaoDich{
    private String LoaiVang;



    public GiaoDichVang(int maGiaoDich, Date ngayGiaoDich, double donGia, int soLuong, String loaiVang) {
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
        LoaiVang = loaiVang;
    }

    public String getLoaiVang() {
        return LoaiVang;
    }

    public void setLoaiVang(String loaiVang) {
        LoaiVang = loaiVang;
    }

    public void nhap(){
        
    }



    
}
