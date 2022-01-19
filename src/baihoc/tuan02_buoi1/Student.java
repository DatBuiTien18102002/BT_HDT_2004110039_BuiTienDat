package baihoc.tuan02_buoi1;

public class Student {
    
    String gioiTinh;
    float tuoi;
    String name;
    String khoa;
    double diem;

    Student(String name, float tuoi){
        System.out.println("met moi");
        this.name = name;
        this.tuoi = tuoi;
    }

    Student(String gioiTinh, float tuoi, String name, String khoa, double diem){
        this(name,tuoi); // gioi ham tao 2 tham so
        this.diem = diem;
        this.tuoi = tuoi;
        this.name = name;
        this.gioiTinh = gioiTinh;
        this.khoa = khoa;
        
    }

    void in(){

        System.out.println("Ten sinh vien: " +name);
        System.out.println("Gioi tinh: " +gioiTinh);
        System.out.println("Tuoi: " +tuoi);
        System.out.println("Khoa : " +khoa);
        System.out.println("Diem: " + diem);
    }

}
