package day_2024_07_26;

class Rectangle {

    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

}

public class ArryRectangle {

    public static void main(String[] args) {

        Rectangle[] arrRec = new Rectangle[3];

        arrRec[0] = new Rectangle(10, 10);
        arrRec[1] = new Rectangle(17, 89);
        arrRec[2] = new Rectangle(90, 100);

        double area = 0;

        for (int i = 0; i < arrRec.length; i++) {
            area += arrRec[i].getArea(); // area = area + arrCircle[i].getArea();
        }

        System.out.println("총 사각형 넓이: " + area);

    }

}
