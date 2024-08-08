package day_2024_08_08;

import java.util.HashMap;

public class HashMapForeachMain {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // Key-Value 기반 데이터 저장
        map.put(45, "Brown");	//	객체
        map.put(37, "James");
        map.put(23, "Martin");

        System.out.println("1번: " + map.containsKey(45));
        System.out.println("2번: " + map.containsKey(60));
        System.out.println("3번: " + map.containsValue("Martin"));	//	텍스트로 확인.
        System.out.println("4번: " + map.isEmpty());	//	객체 안에 데이터가 있는지 없는지 확인 하는 것.
        System.out.println("5번: " + map.size());
        System.out.println("6번: " + map);

        System.out.println("23번: " + map.get(23));
//		
//		// Key만 담고 있는 컬렉션 인스턴스 생성
//		Set<Integer> ks = map.keySet();
//
//		// 전체 Key 출력 (for-each문 기반)
//		for (Integer n : ks) {
//			System.out.print(n.toString() + '\t');
//			System.out.println();
//
//			// 전체 Value 출력 (for-each문 기반)
//			for (Integer n : ks) {
//				System.out.print(map.get(n).toString() + '\t');
//				System.out.println();
//
//				// 전체 Value 출력 (반복자 기반)
//				for (Iterator<Integer> itr = ks.iterator(); itr.hasNext();)
//					System.out.print(map.get(itr.next()) + '\t');
//				System.out.println();
//

    }

}
