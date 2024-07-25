package day_2024_07_24;

//6. static -> 먼저 한번 올려 공유한다.
//7.static 함수에 instance 라면(함수,변수)이 올수 없는이유는?
//왜?
//정적변수,*공유변수*,클래스변수,static 변수
// 1. 먼저 한번 메모리에 올려 공유
// 객체 생성 카운트
class InstCnt {

    static int instNum = 0; // 정적변수,*공유변수*,클래스변수,static 변수

    InstCnt() {
        instNum++;
        System.out.println("인스턴스 생성: " + instNum);
    }
}

public class ClassVar {

    public static void main(String[] args) {

        System.out.println(Math.PI);

        InstCnt cnt1 = new InstCnt();
        InstCnt cnt2 = new InstCnt();
        InstCnt cnt3 = new InstCnt();

    }

}
//5850.3260

