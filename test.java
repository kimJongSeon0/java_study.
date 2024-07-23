
public class test {
    public static void main(String[] args) {    

		int kor = 90;
		int math = 90;
		int eng = 77;
		
		// double avg;
		
		// int total = kor + math + eng;
		
        

		// avg = total / 3.0 ;
		
		// if(avg >= 90){
		// 	System.out.println("성적:" + "A 입니다.");
		// }else if(avg >= 80){
        //     System.out.println("성적:" + "B 입니다.");
        // }else if(avg >= 70){
        //     System.out.println("성적:" + "C 입니다.");
        // }else if(avg >= 60){
        //     System.out.println("성적:" + "D 입니다.");
        // }else{
        //     System.out.println("성적:" + "ㅗ 입니다.");
        // }
        // System.out.println(avg);

        int max;

        if((kor >= math) && (kor >= eng)) {
			max = kor;			
		}else if((math >= kor) && (math >= eng)) {
			max = math;
		}else {
			max = eng;
		}
		System.out.println(max);


        max = kor;
        
        if(max <= math){
            max = math;
        }else if(math <= eng){
            max = eng;
        }else{
            
        }
        System.out.println(max);
            

    }
        
}





    