package day_2024_08_06;

import java.util.Scanner;

class Box<T> {
    private T ob;
    
    public void set(T o) {
        ob = o;
    }
    public T get() {
        return ob;
    }
}
class BoxFactory{
	public static Box makeBox(Box o) {
		Box box = new Box();
		box.set(o);
		return box;
	}
	public static <T> Box<T> makeBox2(T o) {
		Box<T> box = new Box<T>();
		box.set(o);
		return box;
	}
	public static <T> T makeBox3(T t) {	// Double이 올수 있고 편의성이 좋음.

		return t;
	}
//	public static <T> Integer makeBox3(T t) {	// 이것도 가능
//	Integer i = new Integer(1);
//	return i;
//}
}


public class GecernicMethodMain {

	public static void main(String[] args) {
		Box<String> sbox = BoxFactory.<String>makeBox2("sweet");
		System.out.println(sbox.get());
		
		Box<Integer> ibox = BoxFactory.<Integer>makeBox2(1);
		System.out.println(ibox.get());
		
		Integer i = BoxFactory.<Integer>makeBox3(1);
		System.out.println(i);	//	출력
		
		Double d = BoxFactory.<Double>makeBox3(2.0);
		System.out.println(d);	//	출력2.0

        

	}

}
