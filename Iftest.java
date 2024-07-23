
public class Iftest {
    public static void main(String[] args) {

// int kor = 80;
		// int math = 80;
		// int eng = 60;
		
		// double avg;
		
		// System.out.println("국어" + kor);
		// System.out.println("수학" + math);
		// System.out.println("영어" + eng);
		// // System.out.println("평균" + avg);
		
		// int total = kor + math + eng;
		
		// avg = total /3.0;    //avg = total /3.0; or avg = (double)total /3;
		
		// if(avg >= 90) {
		// 	System.out.println("성적:" + "수 입니다.");
		// }else if(avg >= 80) {
		// 	System.out.println("성적:" + "우 입니다.");
		// }else if(avg >= 70) {
		// 	System.out.println("성적:" + "미 입니다.");
		// }else if(avg >= 60) {
		// 	System.out.println("성적:" + "양 입니다.");
		// }else {
		// 	System.out.println("성적:" + "가 입니다.");
		// }
		
		// System.out.println(avg);

        // 최대값
        // int num1 = 100;
        // int num2 = 90;
        // int num3 = 70;

        // int max;

        // if((num1 >= num2) && (num1 >= num3)){
        //     max = num1;
        // }
        // else if((num2 >= num1) && (num2 >= num3)){
        //     max = num2;
        // }else{
        //     max = num3;
        // }
        //     System.out.println(max);

        // 중간값
        // int num1 = 100;
        // int num2 = 90;
        // int num3 = 70;
    
        // int max;
    
        // if((num1 <= num2) && (num1 >= num3)){
        //     max = num1;
        // }
        // else if((num2 <= num1) && (num2 >= num3)){
        //     max = num2;
        // }else{
        //     max = num3;
        // }
        //     System.out.println(max);


        //1초과 100미만
        // int num = -1;
        
		// if((num >= 1) && (num <= 100)) {   //1이상 100이하 표현
        //     System.out.println(num + "true 입니다.");
        // }else{
        //     System.out.println(num + "false");
        // }

        //7이 2의 배수 또는 3의 배수?
        // int num = 7;
		
		// if((num % 2 ==0) && (num % 3 ==0)) { //2의 배수((num % 2 ==0),&& 3의 배수(num % 3 ==0))
		// 	System.out.println(num + "true 입니다.");
		// }else{
		// 	System.out.println(num + "false");
		// }

        //&& 모두 true 일 때 true
        //|| 둘중 하나만 true 여도 true

        // int num1 = 0;

        // int num2 = 0;

        // boolean result;

        // result = ((num1 += 10) < 0) && ((num2 += 10) > 0);
        //     System.out.println("result = " + result);
        //     System.out.println("num1 = " + num1);
        //     System.out.println("num2 = " + num2 + '\n');
        
        // result = ((num1 += 10) > 0) || ((num2 += 10) > 0);
        //     System.out.println("result = " + result);
        //     System.out.println("num1 = " + num1);
        //     System.out.println("num2 = " + num2);
        
        // 변수 선언만 하고 초기화를 하지 않아서
        // short num1;

        // short num = -num;
        



            
            // int num1 = 0;            
            // int num2 = 0;
            
            // boolean result;
            
            // num1 += 10;
            // num2 += 10;
            
            // result = (num1 < 0) && (num2 > 0);
            //     System.out.println("result = " + result);
            //     System.out.println("num1 = " + num1);
            //     System.out.println("num2 = " + num2 + '\n'); 
            
            // num1 += 10;
            // num2 += 10;
            
            // result = (num1 > 0) || (num2 > 0);
            //     System.out.println("result = " + result);
            //     System.out.println("num1 = " + num1);
            //     System.out.println("num2 = " + num2);


            // int result = 3 + 6;
            
            // System.out.println("3 + 6 = " + result);
            
            // result += 9;
            //     System.out.println("3 + 6 + 9 = " + result);
            
            // result += 12;
            //     System.out.println("3 + 6 + 9 + 12 = " + result);
            
            
            int result = true?100:90;
                System.out.println(result);
            result = true?100:70;
                System.out.println(result);
            result = false?90:100;
                System.out.println(result);
            result = false?70:100;
                System.out.println(result);
    }
}
                
