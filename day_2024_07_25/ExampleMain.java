package day_2024_07_25;

// C언어
// 똑같은 함수 이름을 쓸 수 있는 조건 - 파라미터 타입(int,double등등) 또는 갯수를 다르게함 = 함수 오버로딩
// 함수 오버로딩 = 같은 함수 이름으로 파ㅏ미터 타입 또는 갯수를 달리하는 것.
class OverloadingEx {

    public void function() {
        System.out.println("함수");
    }

    public void function(int num) {
        System.out.println(num);
    }

    public void function(double num) {
        System.out.println(num);
    }

    public void function(int num, int num2) {
        System.out.println(num2);
    }
}

class Person {

    private int RegiNum;
    private int PassNum;

    public Person(int rnum, int pnum) {
        RegiNum = rnum;
        PassNum = pnum;
    }

    public Person(int rnum) {
//		RegiNum = rnum;
//		PassNum = 0;
        this(rnum, 0);
    }

    void showPersonalInfo() {
        System.out.println("주민등록 번호 : " + RegiNum);

        if (PassNum != 0) {
            System.out.println("여권 번호: " + PassNum + '\n'); 
        }else {
            System.out.println("여권을 가지고 있지 않습니다. \n");
        }
    }
}

public class ExampleMain {

    public static void main(String[] args) {
        // switch 정수로 해야함
        int num = 1;
        String str = "Spring";

        switch (str) {
            case "Spring":
                System.out.println("봅 입니다.");
        }

        switch (num) {
            case 1, 2, 3:
                System.out.println("1번 입니다.");
        }

        OverloadingEx ex = new OverloadingEx();
        ex.function();
        ex.function(10);

        // 여권 있는 사람의 정보를 담은 인스턴스 생성
        Person jung = new Person(335577, 112233);

        // 여권 없는 사람의 정보를 담은 인스턴스 생성
        Person hong = new Person(775544);

        jung.showPersonalInfo();
        hong.showPersonalInfo();

        String st1 = "abcdefg";

        String st2 = st1.substring(2);
        System.out.println(st2);

        String st3 = st1.substring(2, 4);
        System.out.println(st3);

    }

}
