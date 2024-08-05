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
        // AppleBox aBox = new AppleBox();
        // OrangeBox oBox = new OrangeBox();


        // aBox.set(new Apple());
        // oBox.set(new Orange());


        // Apple ap = aBox.get();
        // Orange og = oBox.get();

        // System.out.println(ap);
        // System.out.println(og);

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
