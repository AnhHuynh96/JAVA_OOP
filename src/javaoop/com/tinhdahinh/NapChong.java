package javaoop.com.tinhdahinh;

public class NapChong {


public void clickElement(){
    System.out.println("Click Element");
}
//cung ten ham nhung khac kieu du lieu
public void clickElement(String xpath) {
    System.out.println("Click Element" + xpath);
}
//cung ten ham nhung khac kieu du lieu
    public void clickElement(int id){
        System.out.println("Click Element" + id);
}
public void clickElement(String xpath, int timeout){
    System.out.println("Click Element" + xpath + "with" + timeout);
}

    public static void main(String[] args) {
        NapChong np = new NapChong();
        np.clickElement("/html/body/div/div/div/div/div/div/div/div/form/button");
        np.clickElement("//div", 10);
    }
}
