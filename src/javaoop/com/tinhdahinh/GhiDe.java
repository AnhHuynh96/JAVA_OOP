package javaoop.com.tinhdahinh;

public class GhiDe  extends ActionKeyword{
    @Override
    public void clickElement() {
        System.out.println("click on element on Child class");
    }

    @Override
    public void setText(String text) {
        System.out.println("set text from child class" + text );
    }
public void srolltoelement(){
    System.out.println("from child class");
}


    public static void main(String[] args) {
        GhiDe ghiDe = new GhiDe();
        ghiDe.clickElement();
        ghiDe.setText("selenium");
        ghiDe.srolltoelement();
    }
}
