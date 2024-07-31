package day_2024_07_31;

//public String gtString(){
//	return getClass().getName() + "@" + integer.toHexString(hashCode());
//}
class A extends Object {

    public void aaa() {
        System.out.println("aaa 호출");
    }
}

class B extends A {

    public void bbb() {
        System.out.println("bbb 호출");
    }
}

class C extends B {

    public void ccc() {
        System.out.println("ccc 호출");
    }
}

public class ObjCastingMain {

    public static void main(String[] args) {

        // A a = new A();
        // System.out.println(a); // day_2024_07_31.A@48cf768c // toString()
        A a = /* (A) */ new B(); // Polymorphism(다형성) 형변환을 안 해줘도 자동 형변환이 됨.

        if (a instanceof B) { // a주소 찾아가서 B가 있으면 true 없으면 false // 형변환 가능한가 묻는 것.
            B b = (B) a; // 자식=(자식)부모/형변환
            b.bbb();

            ((B) a).bbb(); // 똑같음
        }

        a = new C(); // Polymorphism(다형성)

        if (a instanceof B) {
            System.out.println("트루입니다.");
        }

        if (a instanceof A) {
            System.out.println("트루입니다.");
        }

        if (a instanceof C) {
            System.out.println("트루입니다.");
        }
    }

}
