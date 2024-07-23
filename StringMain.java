

public class StringMain {

    public static void printString(String str) {
        System.out.print(str);
    }

    public static void main(String[] args) {
        char ch = '가';

        String name;    // 변수선언 //String(참조형)//String(name Data type은 String)
        name = "홍길동";

        String name2 = new String("AAA");

        System.out.println(name);
        System.out.println(name2);

        String str1 = "Happy";
        String str2 = "birthday";
        System.out.println(str1 + " " + str2);

        printString(str1);
        printString(str2);

    }
}
