package baihoc.tuan03_buoi2;

public class Vchicle {
    private String tenCX;
    private String loaiXe;
    private int dungTich;
    private double triGia;

    public Vchicle(){

    }
    public Vchicle(String tenCX, String loaiXe, int dungTich, double triGia){
        this.tenCX = tenCX;
        this.loaiXe = loaiXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
    }

    public String getTenCX() {
        return tenCX;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public double getTriGia() {
        return triGia;
    }

    public void setTenCX(String tenCX) {
        this.tenCX = tenCX;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }

    public double thuePhaiNop(){
        double thuePhaiNop;
        if(dungTich < 100){
            thuePhaiNop = 1/100*triGia;
        }else if(dungTich >= 100 && dungTich <= 200){
            thuePhaiNop = 3/100*triGia;
        }else{
            thuePhaiNop = 5/100*triGia;
        }
        return triGia;
    }

    public void xuatBangKeKhai(){
        System.out.printf("%-15s %-15s %-15d %-15f %-15f \n", this.tenCX,this.loaiXe,this.dungTich,this.triGia,this.thuePhaiNop());
        
    }

}
