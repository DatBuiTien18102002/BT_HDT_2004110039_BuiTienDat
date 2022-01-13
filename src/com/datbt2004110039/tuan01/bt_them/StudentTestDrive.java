package com.datbt2004110039.tuan01.bt_them;

public class StudentTestDrive {
    public static void main(String[] args) {
        Student sinhVien1 = new Student("Nguyen Minh Tuan","Nam",19,"CNTT",7.9);
        Student sinhVien2 = new Student("Le Viet Duc","Nam",19,"CNTT",8.2);
        Student sinhVien3 = new Student("Bui Tien Dat","Nam",19,"CNTT",7.5);
        
        sinhVien1.in();
        sinhVien2.in();
        sinhVien3.in();

    }
}
