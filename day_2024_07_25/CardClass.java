package day_2024_07_25;

//6. static -> 먼저 한번 올려 공유한다.
//7.static 함수에 instance 라면(함수,변수)이 올수 없는이유는?
//왜?
//정적변수 = static 변수 = 공유변수 = 클래스 변수
//1. 먼저 한번 메모리에 올려 공유 
class InstCnts {

    static int instNum = 100;
    int instNum2;

    public InstCnts() {
//       instNum = 100;
        instNum2 = 100;
        instNum++;
        System.out.println("인스턴스 생성 " + instNum);
    }
}

class Card {

    String kind;
    int num;
    public final static int WIDTH = 180;
    public final static int HEIGHT = 120;
}

class AA {

    public AA() {
        System.out.println("AA" + "생성");
    }

    public void println() {
        System.out.println("메롱!!");
        System.out.println("메롱!!");
        System.out.println("메롱!!");
        
    }
}

class System2 {

    static AA out = new AA();
}

class CardClass {

    public static void main(String[] args) {
        System2.out.println();

        System.out.println(Math.PI);

        InstCnts cnt1 = new InstCnts();
        InstCnts cnt2 = new InstCnts();
        InstCnts cnt3 = new InstCnts();
    }
}
