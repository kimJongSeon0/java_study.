

class Circle3{
    
    int radius;
    final double PI = 3.14;

    void setRadius(int r) {
        radius= r;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }
}


    




public class CircleTest1 {
    public static void main(String[] args) {
        
        
        Circle3 circle3 = new Circle3();
        circle3.setRadius(10);

        System.out.println(circle3.getArea());
    }
}
