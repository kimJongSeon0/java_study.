package day_2024_08_05;

class Apple {

    public String toString() {
        return "I am an apple.";
    }
}

class Orange {

    public String toString() {
        return "I am an orange.";
    }
}

// class Box {
//     private Object ob;
//     public void set(Object o) {
//         ob = o;
//     }
//     public Object get() {
//         return ob;
//     }
// }


//   T -> 타입 파라미터
class Box<T> {

    private T ob;

    public void set(T o) {
        ob = o;
    }

    public T get() {
        return ob;
    }
}

//  Box<Apple> abox = new Box<Apple>();

class AppleBox {

    private Apple ap;

    public void set(Apple a) {
        ap = a;
    }

    public Apple get() {
        return ap;
    }
}

class OrangeBox {

    private Orange or;

    public void set(Orange o) {
        or = o;
    }

    public Orange get() {
        return or;
    }
}



public class BbxoMainTest {
    public static void main(String[] args) {
        
        Box<Apple> abox = new Box<Apple>();
		Box<Orange> obox = new Box<>();
		// Box<String> sbox = new Box<>();
		// Box<Integer> ibox = new Box<>();
		// Box<Double> dbox = new Box<>();
        abox. set(new Apple());
        Apple ap = abox.get();
        System.out.println(ap);
        
        obox. set(new Orange());
        Orange og = obox.get();
        System.out.println(og);

        // dbox.set(1.0);
		// double dNum = dbox.get();//형변환도 필요없음		
		// System.out.println(dNum);

        // DBox<String, Integer> box = new DBox<String, Integer>();
        // box.set("Apple", 25);
        // System.out.println(box); // Apple & 25개
    }
}
