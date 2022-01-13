package baihoc.tuan01_buoi2;



public class Student {
    String gioiTinh;
    int tuoi;
    String name;
    String khoa;
    double diemTB;


    Student(String n, String gT,int t,String k,double dTB ){
        name = n;
        gioiTinh = gT;
        tuoi = t;
        khoa = k;
        diemTB = dTB;
    }

    void in(){
        System.out.println("Ten sinh vien: " +name);
        System.out.println("Gioi tinh: " +gioiTinh);
        System.out.println("Tuoi: " +tuoi);
        System.out.println("Khoa : " +khoa);
        System.out.println("Diem Trung Binh: " +diemTB);
    }


}
