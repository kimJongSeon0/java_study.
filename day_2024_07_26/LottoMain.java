package day_2024_07_26;

import java.util.Arrays;

public class LottoMain {
	public static void main(String[] args) {

		int[] intArr = new int[3];
		
		intArr[0] = 0;
		intArr[1] = 1;
		intArr[2] = 2;
		
		System.out.println(Arrays.toString(intArr));
		
		int[] intArr2 = {0,1,2};
		System.out.println(Arrays.toString(intArr2));
		
		String[] season = {"spring","summer","fall","winter"};
		String[] season2 = {new String("spring"),"summer","fall","winter"};
		
		System.out.println(Arrays.toString(season));
		System.out.println(Arrays.toString(season2));
		
		
		for(int i = 0; i < season.length; i++) {
			System.out.println(season[i]);
		}
		
		
		final int LOTTO_COUNT = 6;

		int[] arrLotto = new int[LOTTO_COUNT];

		for (int i = 0; i < arrLotto.length; i++) {
			arrLotto[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (arrLotto[j] == arrLotto[i])
				i--;
				break;
			}
		}

		System.out.println(Arrays.toString(arrLotto));

		// 츌력
//    	for(int i = 0; i < arrLotto.length; i++) {
//    	System.out.print(arrLotto[i] + " ");
//    	
//    	}
	}
}
