package day_2024_07_26;

import java.util.Scanner;

class RectangleSc {

    private double width, height;

    public RectangleSc(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

}

public class ArryRectangleSc {

    public static void main(String[] args) {

        Rectangle[] arrRec = new Rectangle[3];

        for (int i = 0; i < arrRec.length; i++) {
            Scanner sc = new Scanner(System.in);

            System.out.println(i + "번째 사각형의 가로 세로를 넣으세요");

            System.out.print("가로");// area = area + arrCircle[i].getArea();
            int width = sc.nextInt();

            System.out.print("세로");// area = area + arrCircle[i].getArea();
            int height = sc.nextInt();
            arrRec[i] = new Rectangle(width, height);
        }

//		arrRec[0] = new Rectangle(10, 10);
//		arrRec[1] = new Rectangle(17, 89);
//		arrRec[2] = new Rectangle(90, 100);
//
        double area = 0;
//
        for (int i = 0; i < arrRec.length; i++) {
            area += arrRec[i].getArea(); // area = area + arrCircle[i].getArea();
        }

        System.out.println("총 사각형 넓이: " + area);

    }

}
