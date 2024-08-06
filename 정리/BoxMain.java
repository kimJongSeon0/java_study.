package 정리;

import java.net.http.HttpResponse;

class Box<T>{
    private T ob;

    public void set(T o){
        ob = o;
    }
    public T get(){
        return ob;
    }
}
class BoxFactory{
    public static Box makeBox(Box o){
        Box box = new Box();
        box.set(o);
        return box;
    }
    public static <T> Box<T> makeBox2(T o){
        Box<T> box = new Box<T>();
        box.set(o);
        return box;
    }
    public static <T> T makeBox3(T t){
        
        return t;
        
    }
}
public class BoxMain {
    public static void main(String[] args) {
        Box<String> sbox = BoxFactory.<String>makeBox2("sweet");		
		System.out.println(sbox.get());
		
		Box<Integer> ibox = BoxFactory.<Integer>makeBox2(1);		
		System.out.println(ibox.get());
		
		Integer i = BoxFactory.<Integer>makeBox3(1);		
		System.out.println(i); //출력 1
		
		Double d = BoxFactory.<Double>makeBox3(2.0);		
		System.out.println(d); //출력 2.0
    }
}
