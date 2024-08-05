package day_2024_08_05;

public class DBoxMain {
    public static void main(String[] args) {
        
        DBox<String, Integer> box = new DBox<String, Integer>();
        box.set("Apple", 25);
        System.out.println(box); // Apple & 25개
    }
}
