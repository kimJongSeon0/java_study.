


public class Continue {

	public static void main(String[] args) {

//		while (true) {   // 무한 루프.
//			System.out.println("Hello world");
//		}
		
		int num = 1;
		while(num <= 5){
			if(num % 2== 0)
				continue;    // 반복문에 조건검사로 돌아가는 것.
			System.out.println("Hello world");
			num++;
				
		}

	}

}