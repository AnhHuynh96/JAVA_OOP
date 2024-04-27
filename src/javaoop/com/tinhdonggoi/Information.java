package javaoop.com.tinhdonggoi;

public class Information {
    public void TC01(){
        Student student = new Student("Phuc", 30, "HCM");
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getAddress());
    }
    public void TC02(){
        Student student = new Student("Ti", 28, "HN");
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getAddress());
    }
    public static void main(String[] args) {
        Student student = new Student("Anh", 28, "Can Tho");
        System.out.println(student.getName());
student.setName("Nhi");
        System.out.println(student.getName());
        Information infor = new Information();
        System.out.println("========");
        infor.TC01();
        System.out.println("=========");
        infor.TC02();

    }
}
