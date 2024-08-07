package day_2024_08_07;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PositiveNumberPrint {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		System.out.println("정수(-1이 입력될 때까지)>>");
		
		List<Integer> list = new LinkedList<>();
		
		int num = 0;
		while(num != -1) {
			num = sc.nextInt();
			list.add(num);
		}
		sc.close();
		
		int maxNum = 0;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) > maxNum) {
				maxNum = list.get(i);
			}
		}
		System.out.println("가장 큰 수는 " + maxNum);
		
		//  더욱 간결한 방법이 있나 찾아보다가 알게된 방법 
        //  System.out.println("가장 큰 수는 " + Collections.max(list));
    }
}
