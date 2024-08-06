package day_2024_08_06;

class DBox<T, N>{
    private T str;
    private N num;

    public void set(T str, N num){
        this.str = str;
        this.num = num;
    }
    @Override
    public String toString(){
        return str + " & " + num;
    }
}

public class DBOxMainTest {
    public static void main(String[] args) {
        DBox<String, Integer> box = new DBox<String, Integer>();
        box.set("Apple", 25);
        System.out.println(box); // Apple & 25개   


    }    
}

