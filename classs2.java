


public class classs2 {
    public static void main(String[] args) {
        
        // System.out.println("7.0 == 7 : " + (7.0 == 7));
        // //정수로 변환

        // int num1 = 10, num2 = 20, num3 = 30;
        // num1 = num2 = num3;

        // System.out.println(num1);
        // System.out.println(num2);
        // System.out.println(num3);
        // // 30 30 30 
        
        
        //%- 왼쪽의 피연산자 값을 오른쪽의 피연산자 값으로 
        //나눴을 때 얻게 되는 나머지를 반환한다.
        //ex) va = 7 & 3;

        // num = num + 5 ;
        //     num +=5;

        // num = num * 3;
        //     num *= 3;
        
        
        // 변수나 상수가 아닌 실제 값을 나타내는 표현

        // System.out.println(3147483647 + 3147483648); 
        // //int 용량 값 초과     int(-21억~21억)


        //자료형의 크기가 큰 방향으로 형 변환이 일어난다.
        //자료형의 크기에 상관없이 정수 자료형보다 실수 자료형이 우선한다.
        //ex) double num1 = 30;
        //ex) System.out.println(59L + 34.5);
        //자동형 변환 규칙에 부합하지는 않지만, 형 변환이 필요한 상황이면 명시적 형 변환을 진행한다.
        //ex) double pi = 3.1415;
        //int wholeNumber = (int)pi;
        //ex) long num1 = 3000000007L;
        //int num2 = (int)num1;

    // int a = 3;
    // int b = 4;

    // double c = a / b;
        
        
    // System.out.println(result);
    // // result 변수 없음, 명시적 변환 없음

    // int a = 3;
    // int b = 4;

    // double result = a / b;
    
    
    // System.out.println(result);

    //result 변수 값 지정

    // \n 줄바꿈 \t 수평 탭 \v 수직 탭 \b 백스페이스 \f 폼 피드 \r 캐리지 리턴 \\ 백슬래시 \' 작음따옴표 \" 큰따옴표


    // System.out.println('A'); //char 형으로 인식, 메모리에 올라갈 때 65 값이 들어감
	// System.out.println('A' + 'A'); //char형으로 65 메모리에 올리고, int형으로 자동형변환

    // //우선순위는 여러 연산자가 동시에 사용될 때 어떤 연산자가 먼저 계산되는지를 결정합니다.
    // //결합 방향은 같은 우선순위를 가진 연산자들 사이에서 어떤 순서로 계산되는지를 정의


    // int num1 = 11;
    // int num2 = 22;
    // boolean result;
    
    // result = (1 < num1) && (num1 <100);
    // System.out.println("1 초과 100미만인가? " + result);

    // //&& 둘 다 참이면 참 || 둘 중 하나라도 참이면 참

        // int num1 = 11;
        // int num2 = 22;
        // boolean result;

        // // 변수 num1에 저장된 값이 1과 100 사이의 수인가?
        // result = (1 < num1) && (num1 <100);
        // System.out.println("1 초과 100미만인가? " + result);
        
        // // 변수 num2에 저장된 값이 2 또는 3의 배수인가?
        // result = ((num2 % 2) == 0) || ((num2 % 3) == 0);
        // System.out.println("2 또는 3의 배수인가? " + result);

        // // 변수 num1이 0인가?
        // result = !(num1 != 0);
        // System.out.println("0인가? " + result);
    
		
		// int num = 5;
		// System.out.print((num++) + " ");    // 출력 후에 값이 증가 //후위 연산
		// System.out.print((num++) + " ");    // 출력 후에 값이 증가
		// System.out.print(num + "\n");    // 출력 후에 값이 증가
		
		// System.out.print((num--) + " ");    // 출력 후에 값이 감소
		// System.out.print((num--) + " ");    // 출력 후에 값이 감소
		// System.out.print(num);    



        // //비트 연산자 예제
		// byte n1 = 5;  // 00000101
		// byte n2 = 3;  // 00000011
		// byte n3 = -1; // 11111111
		
		// byte r1 = (byte)(n1 & n2);  // 00000001  // 비트 단위로 AND 연산을 한다
		// byte r2 = (byte)(n1 | n2);  // 00000111  // 비트 단위로 OR 연산을 한다
		// byte r3 = (byte)(n1 ^ n2);  // 00000110  // 비트 단위로 XOR 연산을 한다
		// byte r4 = (byte)(~n3);      // 00000000  // 피연산자의 모든 비트를 반전시켜서 얻은 결과를 반환
		
		// System.out.println(r1);   //  00000001은 1
		// System.out.println(r2);   //  00000111은 7
		// System.out.println(r3);   //  00000110은 6   
		// System.out.println(r4);   //  00000000은 0



        // <<왼쪽으로의 쉬프트는 값으 2배 증가
        // // >>오른쪽으로의 쉬프트는 값을 2로 나눈 결과로 이어진다.

		// byte num;
		
		// num = 2; //00000010
		// System.out.print((byte)(num << 1) + " ");           //00000100
		// System.out.print((byte)(num << 2) + " ");           //00001000
		// System.out.print((byte)(num << 3) + " " + '\n');    //00010000
		
		// num = 8; //00001000
		// System.out.print((byte)(num >> 1) + " ");           //00000100
		// System.out.print((byte)(num >> 2) + " ");           //00000010
		// System.out.print((byte)(num >> 3) + " " + '\n');    //00000001
		
		// num = -8; //11111000
		// System.out.print((byte)(num >> 1) + " ");           //11111100
		// System.out.print((byte)(num >> 2) + " ");           //11111110
		// System.out.print((byte)(num >> 3) + " " + '\n');    //11111111

        
        

    //     int n1 = 5;
    //     int n2 = 7;

    //     // if문
    //     if(n1 < n2){
    //         System.out.println("n1 > n2 is true");
    //     }
    //     // if ~ else문
    //     if(n1 == n2){  // 이 조건이 맞다면 1조건 실행
    //         System.out.println("n1 == n2 is true");
    //     }else{		  // 1조건이 틀리다면 else 실행
    //         System.out.println("n1 == n2 is false");
    //     }

	// }


        // int num = 23;
        
        // if(num % 2 == 0){ //짝수의 대한 표현
        //     System.out.println("짝수 입니다.");
        // }else{
        //     System.out.println("홀수 입니다.");
        // }

        // if(num % 2 != 0) {    //짝수의 대한 표현
		// 	System.out.println("짝수 입니다.");
		// }else {
		// 	System.out.println("홀수 입니다.");
		// }

        // int num = -1;
		
		// if((num >= 1) && (num <= 100)) {   //1이상 100이하 표현
		// 	System.out.println(num + "true 입니다.");
		// }else{
		// 	System.out.println(num + "false");
		// }
        

        // int num = 2020202;
		
		// if((num % 2 ==0) && (num % 3 ==0)) {
		// 	System.out.println(num + "true 입니다.");
		// }else{
		// 	System.out.println(num + "false");
		// 	}	
		
        int kor = 90;
		int math = 90;
		int eng = 70;
		
		double avg;
		
		System.out.println("국어" + kor);
		System.out.println("수학" + math);
		System.out.println("영어" + eng);
		System.out.println("평균" + avg);
		
		int total = kor + math + eng;
		
		avg = total /3.0;    //avg = total /3.0; or avg = (double)total /3;
		
		if(avg >= 90) {
			System.out.println("성적:" + "수 입니다.");
		}else if(avg >= 80) {
			System.out.println("성적:" + "우 입니다.");
		}else if(avg >= 70) {
			System.out.println("성적:" + "미 입니다.");
		}else if(avg >= 60) {
			System.out.println("성적:" + "양 입니다.");
		}else {
			System.out.println("성적:" + "가 입니다.");
		}
		
		System.out.println(avg);

        // 첫번째 방법
		int num1 = 90;
		int num2 = 80;
		int num3 = 70;
		
		int max;
		
		if((num1 >= num2) && (num1 >= num3)) {
			max = num1;
		}else if((num2 >= num1) && (num2 >= num3)) {
			max = num2;
		}else {
			max = num3;
		}
		System.out.println(max);
		
		// 두번째 방법
		max = num1;
		
		if(max <= num2) {
			max = num2;
		}
		if(max <= num3) {
			max = num3;
		}
		
		System.out.println(max);
		
		// 세번째 방법
		if(num1 >= num2) {
			if(num1 >= num3) {
				max = num1;
			}
		}else if(num2 >= num1) {
			if(num2 >= num3) {
				max = num2;
			}
		}else {
			max = num3;
		}


        


//		int num = 23;
//		
//		if(num % 2 == 0) {    //짝수의 대한 표현
//			System.out.println("짝수 입니다.");
//		}else {
//			System.out.println("홀수 입니다.");
//		}
//		
//		if(num % 2 != 0) {    //짝수의 대한 표현
//			System.out.println("짝수 입니다.");
//		}else {
//			System.out.println("홀수 입니다.");
//		}
		
//		int num = -1;
//		
//		if((num >= 1) && (num <= 100)) {   //1이상 100이하 표현
//			System.out.println(num + "true 입니다.");
//		}else{
//			System.out.println(num + "false");
//		}
//		
//		int num = 2020202;
//		
//		if((num % 2 ==0) && (num % 3 ==0)) {
//			System.out.println(num + "true 입니다.");
//		}else{
//			System.out.println(num + "false");
//			}
		
//		int n1 = 120;
//		
//		if(n1 < 0) {
//			System.out.println("0 미만");
//		}else if(n1 < 100)
//			System.out.println("0 이상 100미만");
//		else
//			System.out.println("100이상");
//		}
//		
//		int kor = 90;
//		int math = 90;
//		int eng = 70;
//		
//		double avg;
//		
//		System.out.println("국어" + kor);
//		System.out.println("수학" + math);
//		System.out.println("영어" + eng);
//		System.out.println("평균" + avg);
//		
//		int total = kor + math + eng;
//		
//		avg = total /3.0;    //avg = total /3.0; or avg = (double)total /3;
//		
//		if(avg >= 90) {
//			System.out.println("성적:" + "수 입니다.");
//		}else if(avg >= 80) {
//			System.out.println("성적:" + "우 입니다.");
//		}else if(avg >= 70) {
//			System.out.println("성적:" + "미 입니다.");
//		}else if(avg >= 60) {
//			System.out.println("성적:" + "양 입니다.");
//		}else {
//			System.out.println("성적:" + "가 입니다.");
//		}
//		
//		System.out.println(avg);
		
		// 첫번째 방법
		// + 중간값 구하기
		int num1 = 2;
		int num2 = 4;
		int num3 = 1;
		
		int max;
		// 컴퓨터 프로그래밍 언어로는 앤드도 붙여줘야 함 ex)(num3 < num1 && num1 < num2))
		if((num2 < num1 && num2 > num3) || (num3 < num1 && num1 < num2))
			System.out.println("중간값은" + num1 + "입니다");
		else if((num1 < num2 && num2 < num3) || (num3 < num2 && num2 < num1))
			System.out.println("중간값은" + num2 + "입니다");
		else
			System.out.println("중간값은" + num3 + "입니다");

		//int mid;
		
//		if((num1 <= num2) && (num1 >= num3)) {
//			mid = num1;
//		}else if((num2 <= num1) && (num2 >= num3)) {
//			mid = num2;
//		}else {
//			mid = num3;
//		}
//		System.out.println("중간 값" + mid);
		
		if((num1 >= num2) && (num1 >= num3)) {
			max = num1;
		}else if((num2 >= num1) && (num2 >= num3)) {
			max = num2;
		}else {
			max = num3;
		}
		System.out.println(max);
		
		// 두번째 방법
		max = num1;
		
		if(max <= num2) {
			max = num2;
		}
		if(max <= num3) {
			max = num3;
		}
		
		System.out.println(max);
		
		// 세번째 방법
		if(num1 >= num2) {
			if(num1 >= num3) {
				max = num1;
			}
		}else if(num2 >= num1) {
			if(num2 >= num3) {
				max = num2;
			}
		}else {
			max = num3;
		}
		System.out.println(max);


		



    }
}
