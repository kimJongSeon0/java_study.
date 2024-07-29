package day_2024_07_29;

import java.util.Arrays;

public class ArrayMaxMain {

	public static void main(String[] args) {
		int[] arrInt =  new int[5];
		
		// 입력
		
		for(int i = 0; i < arrInt.length; i++) {
			arrInt[i] = (int)((Math.random() * 100) +1);
		}
		
		// max 값 구하기
		int max = arrInt[0];
		
		for(int i = 0; i < arrInt.length; i++) {
			if (max < arrInt[i])
				max = arrInt[i];
		}
		
		int min = arrInt[0];
		for(int i = 0; i < arrInt.length; i++) {
			if (min > arrInt[i])
				min = arrInt[i];
		}
		System.out.println(Arrays.toString(arrInt));
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
	}
}


//"1. 프로그램을 완성 하시오.
//
//- 5개의 숫자를 랜덤 으로 받아 배열로 저장
//- 5개의 숫자 중 가장 큰 값을 출력"