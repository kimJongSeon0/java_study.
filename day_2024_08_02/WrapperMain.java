package day_2024_08_02;

import java.util.ArrayList;

public class WrapperMain {

	public static void main(String[] args) {
		
		Number intObj10 = new Integer(29);
		System.out.println(intObj10.doubleValue());
		
		
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		arrList.add(1);
		arrList.add(2);
		arrList.add(3);
		
		for (Integer num : arrList) {
			System.out.println(num);
		}
		
		int num = 10;
		
		Integer iObj = 10;	//	박싱 기본형을 객체로
		Integer iObj2 = new Integer(10);
		Integer iObj3 = Integer.valueOf(30);
		
		int max = Integer.MAX_VALUE;
		
		int num1 = iObj;	//	객체를 기본형으로 = 언박싱
		num1 = iObj.intValue();
		
		System.out.println(num1);
		
		System.out.println(iObj);
		System.out.println(iObj2);
		System.out.println(iObj3);
		
		Integer num2 = new Integer(29);
		System.out.println(num2.intValue());
		System.out.println(num2.doubleValue());
		
		Double num3 = new Double(3.14);
		System.out.println(num3.intValue());
		System.out.println(num3.doubleValue());
		
		Integer n1 = Integer.valueOf(5);
		Integer n2 = Integer.valueOf("1024");
		
		System.out.println("큰 수: " + Integer.max(n1,n2));
		System.out.println("작은 수: " + Integer.min(n1,n2));
		System.out.println("합: " + Integer.sum(n1,n2));
		System.out.println();
		
		System.out.println("12의 2진 표현: " + Integer.toBinaryString(12));
		System.out.println("12의 8진 표현: " + Integer.toOctalString(12));
		System.out.println("12의 16진 표현: " + Integer.toHexString(12));
	}

}

