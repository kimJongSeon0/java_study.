public class StarTr {

    public static void printStart(int num) {
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= num; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
    
        //구구단
    for (int i = 1; i <= 9; i++) {
        System.out.println(i + "단 입니다.");
		for (int j = 1; j <= 9; j++) {
			System.out.println(i + " * " + j + " = " + (i * j));
		}
		System.out.println(); // 구구단이 끝나고 한 칸 띄워줌.
    }
    
    // //짝수단만 나오게 하시오.
    // for(int i = 1; i <= 10; i++){
    //     if(i % 2 != 0)
    //     continue;
    // for(int j = 1; j <= 9; j++){    
    //     System.out.println(i + " * " + j + " = " + (i * j));
    //         }
    //     }
    
    // 3의 배수인 단만 출력하시오.(3,6,9)
    // for(int i = 1; i <= 10; i++){
    //     if(i % 3 != 0)
    //     continue;
    // for(int j = 1; j <= 9; j++){    
    //     System.out.println(i + " * " + j + " = " + (i * j));
    //         }
    //     }

    // 반복문 3가지의 무한루프 만드는 방법은?
        // for(;;){
        //     System.out.println(1);
        // }
        // while(true){
        //     System.out.println(1);
        // }
        // do { 
        //     System.out.println(1);
        // } while (true);
        

        // for(int i = 0; i <=5; i++){
        //     for(int j = 1; j <=5; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for (int i = 1; i <= 5; i++) {  // 세로칸수(층수 설정)
        //     for (int j = 0; j < i; j++){   //가로 방수 결정
        //         System.out.print("*");
        //     }
        //     System.out.println();
		// }

        // for(int i = 5; i >= 0; i--){
        //     for (int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // printStart(3);
    }
}
