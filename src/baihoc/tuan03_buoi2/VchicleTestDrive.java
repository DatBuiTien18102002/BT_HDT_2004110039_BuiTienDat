package baihoc.tuan03_buoi2;

public class VchicleTestDrive {
    public static void main(String[] args) {
        Vchicle xe1 = new Vchicle("Bui Tien Dat","SH",100,35000000);
        Vchicle xe2 = new Vchicle("Le Hoang","Dream",50,15000000);
        Vchicle xe3 = new Vchicle("Nguyen Thu Ngan","Honda",500,7000000);

        System.out.printf("%-15s %-15s %-15s %-15s %-15s \n","Ten Chu Xe","Loai Xe","Dung Tich","Tri Gia","Thue Phai Nop");
        System.out.println("******************************************************************************************");
        xe1.xuatBangKeKhai();
        xe2.xuatBangKeKhai();
        xe3.xuatBangKeKhai();

        
    }
}
