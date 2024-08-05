package day_2024_08_05;

import java.util.Scanner;

public class AbstractClassMainTest {

	public static void main(String[] args) {

		final int COUNT = 8;
		double[] arrGrade = new double[COUNT];

		System.out.println("8학기 학점을 순서대로 입력하세요");
		double sum = 0;

		for (int i = 0; i < arrGrade.length; i++) {
			System.out.println((i + 1) + "학기 학점→");
			Scanner sc = new Scanner(System.in);

			try {
				arrGrade[i] = sc.nextDouble();
				sum += arrGrade[i];

			} catch (Exception e) {
				System.out.println(" 잘못된 입력입니다. 다시 입력하세요.");
				i--;
				continue;
			}
		}
		System.out.println("총점" + sum + "평균" + sum / arrGrade.length);
	}

}
