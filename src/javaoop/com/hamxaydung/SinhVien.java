package javaoop.com.hamxaydung;

public class SinhVien {
    private String name;
    private int age;
    private String address;
    private String className;

    //Ham xay dung khong co tham so
    public SinhVien(){
        name = "Phuong";
        age = 32;
        address = "Ha Noi";
        className = "Java Basic";
    }
        //Ham xay dung co tham so
        public SinhVien(String name, int age, String address, String className){
            this.name = name;
            this.age = age;
            this.address = address;
            this.className = className;

        }
     public SinhVien(String name, int age){

        }


        public void printInfo(){
            System.out.println(name);
            System.out.println(age);
            System.out.println(address);
            System.out.println(className);

        }

        //Cac ham truy xuat thong tin
        public String getName () {
            return name;
        }
        public int getAge () {
            return age;
        }
        public String getclassName () {
            return className;
        }
        public String getaddress() {
            return address;
        }


    }



