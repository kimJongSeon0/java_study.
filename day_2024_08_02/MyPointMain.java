package day_2024_08_02;

class MyPoint{
    private int num;
    private int num2;

    public MyPoint(int num, int num2){
        this.num = num;
        this.num2 = num2;
    }
    
    
}

public class MyPointMain {

    public static void main(String[] args) {
        MyPoint p = new MyPoint(3, 50);
        MyPoint q = new MyPoint(4, 50);

        System.out.println(p);

        if (p.equals(q)) {
            System.out.println("같은 점"); 
        }else {
            System.out.println("다른 점");
        }
    }
}
