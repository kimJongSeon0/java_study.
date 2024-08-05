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



public class BoxMain {

    public static void main(String[] args) {

        Box<Apple> abox = new Box<Apple>();
        Box<Orange> obox = new Box<>();
        Box<String> sbox = new Box<>();
        Box<Integer> ibox = new Box<>();
        Box<Double> bbox = new Box<>();

        abox.set(new Apple());
        Apple ap = abox.get();  //  형변환도 필요없음.
        System.out.println(ap);
        
        obox.set(new Orange()); //  Apple 외 에는 다른 타입 못 넣음.
        Orange og = obox.get();
        System.out.println(og);

        sbox.set(new String("해킹 안됨."));
        String str = sbox.get();
        System.out.println(str);

        ibox.set(33);
        Integer in = ibox.get();
        System.out.println(in);
        
        bbox.set(3.14);
        Double db = bbox.get();
        System.out.println(db);

        
        // AppleBox aBox = new AppleBox();
        // OrangeBox oBox = new OrangeBox();

        // aBox.set(new Apple());
        // oBox.set(new Orange());

        // Apple ap = aBox.get();
        // Orange og = oBox.get();

        // System.out.println(ap);
        // System.out.println(og);


    //     Box aBox = new Box();
    //     Box oBox = new Box();

    //     // abox.set(new Apple());
    //     // obox.set(new Orange());

    //     aBox.set("Apple");
    //     oBox.set("Orage");

    //     Apple ap = (Apple) aBox.get();
    //     Orange og = (Orange) oBox.get();

    //     System.out.println(ap);
    //     System.out.println(og);
    }
}
