package day_2024_07_26;

class Circle {

	private double rad;

	public Circle(double r) {
		this.rad = r;
	}

	public double getArea() {
		return rad * rad * Math.PI;
	}
}

public class ArrayCircle {

	public static void main(String[] args) {

		Circle[] arrCircle = new Circle[3];

		arrCircle[0] = new Circle(10);
		arrCircle[1] = new Circle(15);
		arrCircle[2] = new Circle(7);

		double area = 0;

		for (int i = 0; i < arrCircle.length; i++) {
			area += arrCircle[i].getArea(); // area = area + arrCircle[i].getArea();
		}

		System.out.println("총 넓이: " + area);

	}

}
