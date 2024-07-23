public class Tr1 {

	public static void hiEveryone(int age, double height) {
		System.out.println("제 나이는 " + age + "세 입니다.");
		System.out.println("저의 키는 " + height + "cm 입니다.");
	}

	public static void byEveryone() {
		System.out.println("다음에 뵙겠습니다.");
	}

	public static int adder(int num1, int num2) {
		int addResult = num1 + num2;
		return addResult; // adeResult의 값을 반환
		// return: 값의 반환을 명령
	}

	public static double square(double num) {
		return num * num; // num * num의 결과를 반환
	}

	public static double getAvg(int num1, int num2, int num3) {
		int total = num1 + num2 + num3;
		double avg = (double) total / 3.0;

		// return (num1 + num2 + num3) / 3.0;
		return avg;
	}

	public static char getGrade(double avg) {
		char grade;

		if (avg >= 90) {
			grade = '수';
		} else if (avg >= 80) {
			grade = '우';
		} else {
			grade = '가';
		}

		return grade;
	}

	public static double getCirleArea(double r) {
		double Pi = 3.14;
		double area = r * r * Pi;
		return area;
		// return r * r * Math.PI;
	}

	public static double getRetangleArea(double width, double height) {
		return width * height;
	}

	public static void divide(int num1, int num2) {
		if (num2 == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return;
		}
		System.out.println("나눗셈 결과: " + (num1 / num2));
	}

	public static void main(String[] args) {
		// double myHeight = 175.9;
		// hiEveryone(12, 12.5);
		// hiEveryone(13, myHeight);
		// byEveryone();

		// int result;
		// result = adder(4, 5); // adder가 반환하는 값을 result에 저장
		// System.out.println("4 + 5 = " + result);
		// System.out.println("3.5 * 3.5 = " + square(3.5));

		double avg = getAvg(70, 80, 60);
		char grade = getGrade(avg);

		System.out.println("평균은 " + avg + "입니다.");
		System.out.println("성적은 " + grade + "입니다."); // 수

		// System.out.println(getCirleArea(10)); // 314.0~~~~

		// System.out.println(getRetangleArea(14.5, 16.7));

		// divide(4, 2);
		// divide(6, 2);
		// divide(9, 0);

		// 문법상 문제는 없지만 실무에서 사용 하지 않음.
		{
			int num = 10;
			System.out.println(10);
		}

		{
			int num = 10;
			System.out.println(10);
		}
        
        
	}
}
