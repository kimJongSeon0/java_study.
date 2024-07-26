package day_2024_07_26;

import java.util.Scanner;

class Circle1 {

	private double rad;

	public Circle1(double r) {
		this.rad = r;
	}

	public double getArea() {
		return rad * rad * Math.PI;
	}
}

public class ArrayCircleSc {

	public static void main(String[] args) {

		Circle[] arrCircle = new Circle[3];

		for (int i = 0; i < arrCircle.length; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println(i + "번째의" + "반지름을 입력하세요");
			arrCircle[i] = new Circle(sc.nextInt());
		}

		double area = 0;

		for (int i = 0; i < arrCircle.length; i++) {
			area += arrCircle[i].getArea(); // area = area + arrCircle[i].getArea();
		}

		System.out.println("총 넓이: " + area);

	}

}
