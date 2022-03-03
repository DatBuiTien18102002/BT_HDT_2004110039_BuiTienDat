package baihoc.tuan03_buoi2;

public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;


    public double getChieuDai(){
        return this.chieuDai;
    }
    public double getchieuRong(){
        return this.chieuRong;
    }
    public void setChieuRong(float chieuRong){
        this.chieuRong = chieuRong;
    }
    public void setChieuDai(float chieuDai){
        this.chieuDai = chieuDai;
    }

    public double tinhDienTich(){
        return  this.chieuDai*this.chieuRong;    
    }

    public double tinhChuVi(){
        return (this.chieuDai+this.chieuRong)*2;
    }

    public String toString (){
        String string = "Chieu Dai: " + this.chieuDai + " Chieu Rong: " + this.chieuRong;
        string += " Chu vi: " + this.tinhChuVi() + " Dien Tich: "+ this.tinhDienTich();
        return string;
    }


}
