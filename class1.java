

/*
주석을 주면 해당 부분을 컴파일 하지 않음
주석의 목적 - 소스코드 설명
 */

/* 들여쓰기 이유
1. 가독성

  */
public class class1 {

	public static void main(String[]args){    //스트링 배열
		
		System.out.println(7);    //정수           //println 에서 ln을 사용하지 않으면 줄 바꿈을 안 해줌
		System.out.println(3.15); //실수
		System.out.println("3 + 5");      //"3 + 5" ""안에 입력을 하면 문자열로 인식함
		System.out.println("3 + 5 = " + 8 );
		System.out.println(3.15 + "는 실수입니다" );
		System.out.println("3 + 5 = " + "는 실수입니다." );
		System.out.println("3 + 5" + "의 연산 결과는 8입니다" );
		System.out.println(3 + 5);









		
        int kor = 80;
        int math = 90;
        int eng = 70;
        int total = kor + math + eng;

        System.out.println("국어 : " + kor);
        System.out.println("수학 : " + math);
        System.out.println("영어 : " + eng);
        System.out.println("총점 : " + total);
        System.out.println("평균 : " + total/3);






		short num1 = 11;
		short num2 = 22;

		short result = num1 + num2 ;
		System.out.println(result);     




    	double width = 12.5;
		double height = 13.1;
		double area = width * height;

		System.out.println("가로: " + width);
		System.out.println("세로: " + height);
		System.out.println("넓이: " + area);

    

    	double width = 100;
		double height = 85;
		double area = width * height / 2;

		System.out.println("가로: " + width + " 세로: " + height + " 넓이: " + area);


    	double width = 10;
		double height = 10;
		double area = width * height / 2;
		
		
		
		System.out.println("가로: " + width + " 세로: " + height + " 넓이: " + area);
		
		System.out.println("20보다 큽니까?.");
		System.out.println(area > 20);
		



		

    

	}

}

/* short를 int로 바꿔주면 에러가 안 남  */
/* 자바에서는 정수 연산 시 기본적으로 int 형으로 처리하기 때문 */

