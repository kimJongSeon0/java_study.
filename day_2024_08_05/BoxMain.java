package day_2024_08_05;

class Apple {

    public String toString() {return "I am an apple.";}
}

class Orange {

    public String toString() {return "I am an orange.";}
}

class Box {

    private Object ob;

    public void set(Object o) {
        ob = o;
    }

    public Object get() {
        return ob;
    }
}

public class BoxMain {

    public static void main(String[] args) {
        Box abox = new Box();
        Box obox = new Box();

        abox.set(new Apple());
        obox.set(new Orange());

        Apple ap = (Apple) abox.get();
        Orange og = (Orange) obox.get();

        System.out.println(ap);
        System.out.println(og);
    }
}
