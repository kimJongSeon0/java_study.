package day_2024_08_08;

import java.util.HashMap;
import java.util.Scanner;

public class MapMainTest {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Key-Value 기반 데이터 저장
        map.put("Korea", 5000 );	//	객체
        map.put("USA", 1000000 );
        map.put("France", 3000);

        System.out.println(map);

        Scanner sc = new Scanner(System.in); // 입력 기능을 가진 클래스

        String str1 = sc.nextLine();	// 띄어쓰기 까지 문자열 전체를 받아냄 

        System.out.println(str1);

        String str2 = sc.next();	// 단어만

        System.out.println(str2);
    }
}
