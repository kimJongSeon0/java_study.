


class Circle1 {

    int radius;
    final double PI  = 3.14;

    void setRadius(int r) {
        radius = r;
    }

    int getRadius() {
        return radius;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }
    void addCircle(Circle1 circle1, Circle1 circle2){
        System.out.println("두원의 합은" + (circle1.getArea() + circle2.getArea()));
    }
    double mulCircle(Circle1 circle1, int mul){
        return circle1.getArea() * mul;
        
    }
    double absCircle(Circle1 circle1, Circle1 circle2){
        double abs = circle1.getArea() - circle2.getArea();
        if(abs < 0){
            abs = abs * -1; //절대값
        }
        // return (abs > 0) ? abs: (-1 * abs);
        return abs;
    }
    
    class Circle {

        void setRadius(int r) {
            radius = r;
        }

        int getRadius() {
            return radius;
        }

        double getArea() {
            // return radius * radius * Pi;
            return radius * radius * Math.PI;
        }
    }
}

public class CircleTest {

    public static void main(String[] args) {
        Circle1 circle1 = new Circle1();
        circle1.setRadius(10);

        System.out.println(circle1.getArea());

        Circle1 circle2 = new Circle1();
        circle2.setRadius(10);

        System.out.println(circle2.getArea());

        circle1.addCircle(circle1,circle2);
        System.out.println(circle1.mulCircle(circle1,2));
        System.out.println(circle1.mulCircle(circle2,3));

        System.out.println(circle1.absCircle(circle1,circle2)); // 두개의 차를 절대값
    }
}
