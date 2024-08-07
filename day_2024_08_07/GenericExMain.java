package day_2024_08_07;

class Box<T> {

    private T ob;

    public void set(T o) {
        ob = o;
    }

    public T get() {
        return ob;
    }
}

public class GenericExMain {

    public static <T> boolean compBox(Box<T> box, T t) {

        boolean isTrue = true;	//boolean 이름 만들 때 앞에 (is).

        if (box.get().equals(t)) {	//	일부러 false 나오게 하려고 만듬
            isTrue = true;
        } else {
            isTrue = false;
        }

        return isTrue;
    }

    public static void main(String[] args) {

        Box<Integer> box1 = new Box<>();
        box1.set(24);

        Box<String> box2 = new Box<>();
        box2.set("Poly");

        if (compBox(box1, 25)) {
            System.out.println("상자 안에 25 저장");
        }
        if (compBox(box2, "Moly")) {
            System.out.println("상자 안에 Moly 저장");
        }

        System.out.println(box1.get()); // 24
        System.out.println(box2.get()); // Poly

    }

}
