package day_2024_08_02;

import java.util.Scanner;

//8학기 학점을 순서대로 입력하세요
//
//1학기 학점  → 3.37
//2학기 학점  → 3.89
//3학기 학점  → 4.35
//4학기 학점  → 3.76
//5학기 학점  → 3.89
//6학기 학점  → 4.26
//7학기 학점  → 4.89
//8학기 학점  → 3.89

public class AbstractClassMain {

	public static void main(String[] args) {
		final int COUNT = 8;
		double[] arrGrade = new double[COUNT];
		
		
		
		System.out.println("8학기 학점을 순서대로 입력하세요");
		double sum = 0;
		for(int i = 0 ; i < arrGrade.length; i++) {
			System.out.print((i + 1) +  "학기 학점→");
			Scanner sc = new Scanner(System.in);
			
			try {
				arrGrade[i] = sc.nextDouble();
				sum += arrGrade[i];
				
			} catch (Exception e) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요");
				i--;
				continue;
			}
		}
		System.out.println("총점" + sum + "평균" + sum / arrGrade.length);
	}

}
