package day_2024_07_23;

import java.util.Scanner;

class Circle9 {
    private double rad;
    
    public Circle9(double r) {
        this.rad = r;
    }
    
    public double getArea() {
        return rad * rad * Math.PI;
    }
}

public class CircleInputTest {
    public static void main(String[] args) {
        while(true){
            double radius;

            Scanner sc = new Scanner(System.in);
            System.out.print("원의 반지름을 입력하시오: ");
            radius = sc.nextInt();

            Circle9 circle = new Circle9(radius);
            System.out.println("원의 넓이는: " + circle.getArea());
            System.out.println("계속하시겠습니까? y,n");
            
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








// 원의 반지름을 입력하시오:10
// 원의 넓이는314.1592653589793
// 계속하시겠습니까? y,n
// y
// 원의 반지름을 입력하시오:20
// 원의 넓이는1256.6370614359173
// 계속하시겠습니까? y,n
// n
// 프로그램을 종료 합니다.

