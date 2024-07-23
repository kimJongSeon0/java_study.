
// 그리고 그 값을 출력해주는 메서드를 작성하세요
class MyClass1 {

    private int Myclassint;

    public void setMyClassint(int Myclassint) {
        this.Myclassint = Myclassint;
    }

    public void printData() {
        System.out.println(Myclassint);
    }
}

class MyClass2 {

    private double MyclassDb;

    public void setMyClassDb(double MyclassDb) {
        this.MyclassDb = MyclassDb;

    }

    public void printData() {
        System.out.println(MyclassDb);
    }
}

class MyClass3 {

    private String MyclassStr;

    public void setMyClassStr(String MyclassStr) {
        this.MyclassStr = MyclassStr;

    }

    public void printData() {
        System.out.println(MyclassStr);
    }
}

public class ClassTest1 {

    public static void main(String[] args) {
        MyClass1 mc1 = new MyClass1();
        MyClass2 mc2 = new MyClass2();
        MyClass3 mc3 = new MyClass3();

        mc1.setMyClassint(10);
        mc2.setMyClassDb(10.5);
        mc3.setMyClassStr("객체지향");

        mc1.printData();
        mc2.printData();
        mc3.printData();

    }
}
