package day_2024_08_01;

class Circle9 {
    double radius;

    public Circle9(double radius) {

        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString(){
        return "넓이는 " + getArea() + " 입니다.";
    }
}

public class ObjectMain {
    public static void main(String[] args) {

        Object obj = new Circle9(10);

        System.out.println(obj); //출력: 넓이는 100 입니다. (예시)"
    }
}
