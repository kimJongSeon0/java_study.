package day_2024_08_01;


interface Printable {
    public void print(String doc);

    public default void printColor(String doc){
        System.out.println("컬러 되지롱" + doc);
    }
}

interface ColorPrintable extends Printable{
    void printCMYK(String doc);
}

class Prn909Drv implements ColorPrintable{
    @Override
    public void print(String doc) {
        System.out.println("흑백" + doc);
    }

    @Override
    public void printCMYK(String doc) {
        System.out.println("칼라" + doc);
    }
}



//삼성전자 개발자
class SprinterDriver implements Printable{

    @Override
    public void print(String doc) {
        System.out.println("From Samsung printer");
        System.out.println(doc);
    }
}
//LG전자 개발자
class LprinterDriver implements Printable {

    @Override
    public void print(String doc) {
        System.out.println("From LG printer");
        System.out.println(doc);
    }
}


public class InterfaceExtendsMain {
    public static void main(String[] args) {
        String myDoc = "This is a report about...";
        String brand = "삼성";

        Printable prn;

        if(brand.equals("삼성")) {
            prn = new SprinterDriver();
            prn.print(myDoc);
        }else if(brand.equals("LG")) {

            prn = new LprinterDriver();
            prn.print(myDoc);
        }

        ColorPrintable colorPrn = new Prn909Drv();
        colorPrn.print("메롱");
        colorPrn.printCMYK("메롱");

    }
}
