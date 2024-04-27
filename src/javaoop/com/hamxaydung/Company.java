package javaoop.com.hamxaydung;

import java.util.ArrayList;

public class Company {

    public static void main(String[] args) {
        //Khoi tao doi tuong class SinhVien
        // sv1 = new SinhVien( name: "Anh", age: 40, address: "Ha Noi", className: "Auto test");
        //sv1.printInfo();

        SinhVien sv1 = new SinhVien("An", 40, "HN", "Auto test");
        //sv1.printInfo();

        SinhVien sv2 = new SinhVien("Nam", 30, "HCM", "Auto test");
       // sv2.printInfo();

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Selenium");
        arrayList.add("Auto");

        ArrayList<SinhVien> ListSinhVien = new ArrayList<>();
        ListSinhVien.add(sv1); //Them bo data sv1 vao vi tri dau tien trong ArrayList
        ListSinhVien.add(sv2);

        for (SinhVien sv: ListSinhVien){
            System.out.println("==============");
            sv.printInfo();
        }
    }

}

