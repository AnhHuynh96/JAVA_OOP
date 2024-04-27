package javaoop.com.tinhkethua;

public class Student extends Person{
public Student(String name, int age, float height){
    super(name, age, height);
}

public void laythongtin(){
    getInfo();
}

    public static void main(String[] args) {
        Student student = new Student("Phuong", 32, 1.5F);
                student.getInfo();
    }


    }


