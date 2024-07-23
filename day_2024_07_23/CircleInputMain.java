package day_2024_07_23;

import java.util.Scanner;

class Circle10 {

    private double rad;

    public Circle10(double r) {
        this.rad = r;
    }

    public double getArea() {
        return rad * rad * Math.PI;
    }
}

class Rectangle {

    private double width = 10, height = 10;
    private double Area = width * height;

    public Rectangle(double Area) {
        Area = Area;
    }

    public double getArea1() {
        return Area;
    }
}

public class CircleInputMain {

    public static void main(String[] args) {
		while (true) {
			double radius;

			Scanner sc = new Scanner(System.in);

			System.out.print("원의반지름을 입력하시오: ");
			radius = sc.nextDouble();

			Circle10 circle = new Circle10(radius);
			System.out.println("원의 넓이는" + circle.getArea());
			System.out.println("계속하시겠습니까?" + "y,n");

			String yesOrNo = sc.next();

			if (yesOrNo.equals("Y") || yesOrNo.equals("y")) {
				continue;
			} else {
				break;
			}

		}
		System.out.println("프로그램을 종료 합니다.");

        while (true) {
            double width = 10, height = 10;
            double Area = width * height;

            Scanner sc = new Scanner(System.in);

            System.out.print("사각형 넓이를 입력하시오: ");
            Area = sc.nextDouble();
            System.out.print("사각형 넓이를 입력하시오: ");
            Area = sc.nextDouble();

            Rectangle rec = new Rectangle(Area);
            System.out.println("사각형의의 넓이는" + rec.getArea1());
            System.out.println("계속하시겠습니까?" + "y,n");

            String yesOrNo = sc.next();

            if (yesOrNo.equals("Y") || yesOrNo.equals("y")) {
                continue;
            } else {
                break;
            }

        }
        System.out.println("프로그램을 종료 합니다.");
    }
}
