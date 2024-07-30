package day_2024_07_30;

class Cake {

    public void yummy() {
        System.out.println("yummy Cake");
    }
}

class CheeseCake extends Cake {

    public void yummy() {
        System.out.println("Yummy Cheese Cake");
    }
}

//	함수오버라이딩 = 상속 관계에서 이름 같은 함수(함수 바디만 달리하는 것)가
//	있을 때 자식 함수로 부모함수 엎어 쓰는 것(주소 바꿔치기).
//	오버라이딩은 자식꺼
//	폴리몰피즘 + 오버라이딩 = 자바의 70%
public class CakeMain {

    public static void main(String[] args) {
        // 함수 이름이 똑같나 찾음(똑같으면 부모에 자식의 데이터를 덮어 씌움.)
        Cake c1 = new CheeseCake(); // 오바라이딩 규칙 객체를 생성할 때 부모에 자식의 데이터를 덮어 씌운다.
        CheeseCake c2 = new CheeseCake();

        c1.yummy();
        c2.yummy();

    }
}
