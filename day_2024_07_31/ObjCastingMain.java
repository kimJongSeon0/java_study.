package day_2024_07_31;

class A {
	public void aaa() {
		System.out.println("aaa 호출");
	}
}

class B extends A {
	public void bbb() {
		System.out.println("bbb 호출");
	}
}

public class ObjCastingMain {

	public static void main(String[] args) {
		A a = /*(A)*/ new B();	//	Polymorphism(다형성) 형변환을 안 해줘도 자동 형변환이 됨.
		
		
		
		B b = (B) a;	//	자식=(자식)부모(에러)/형변환 
		
		b.bbb();
	}

}
