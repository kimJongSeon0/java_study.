class Circle4 {

    double radius;

    Circle4(double radius) {
        this.radius = radius;
    }

    void gerArea() {
        System.out.println(radius * radius * Math.PI);
    }
}

class Rectangle4 {

    double width, height;

    Rectangle4(double width, double height) {
        this.width = width;
        this.height = height;
    }

    void gerArea() {
        System.out.println(width * height);
    }

}


public class tete {
    Circle4 cs = new Circle4(10);
}
