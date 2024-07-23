
import java.util.Scanner;

public class InputMain {

    public static void main(String[] args) {
        // System.in => (키보드)
        Scanner sc = new Scanner(System.in); // 입력 기능을 가진 클래스

        String str1 = sc.nextLine();	// 띄어쓰기 까지 문자열 전체를 받아냄 

        System.out.println(str1);

        String str2 = sc.next();	// 단어만

        System.out.println(str2);

//		System.out.print("국어:");
//		int kor = sc.nextInt();	// 제어권이 키보드로 넘어가있음
//		System.out.print("영어:");
//		int eng = sc.nextInt();
//		System.out.print("수학:");
//		int math = sc.nextInt();
//
//		System.out.print("double");
//		double d = sc.nextDouble();
//		
//		System.out.println(d);
//		
//		
//		System.out.println("국어:" + kor);
//		System.out.println("영어:" + eng);
//		System.out.println("수학:" + math);
        // System.out.print("문자열 입력: ");
        // String str1 = sc.nextLine();
        // System.out.print("문자열 입력: ");
        // String str2 = sc.nextLine();
        // System.out.println(str1);
        // System.out.println(str2);
    }
}
