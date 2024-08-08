

public class ForClass {
    public static void main(String[] args) {
        //for 반복문 편.
        //초기화 문장 1회 실행(int i =0;) 조건문(i < 100;) 증가문(i++)     
        // for(int i =0; i <= 100; i++){
        //     System.out.println(i + "번: " + "Hello world");
        // }
        // int sum = 0;
        // for(int a = 1; a <= 100; a++){
        //     System.out.println(a + "합: " + sum);
        //     sum = sum + a;
        // } 
        //     System.out.println("합:" + sum);
        

        // for문 무한루프.

        // for(;;){
        //     System.out.println("Hello world");
        // }

        // 2중 for문. 구구단
		// for문에서 쓰는 순서 i,j,k 순
        // for(int i = 2; i <=10; i++){
        //     for(int j = 1; j <=10; j++)
        //         System.out.println(i + " x " + j + " = " + (j * i));
        // }

        // 구구단
        // for (int i = 1; i <= 9; i++) {
        //     System.out.println(i + "단 입니다.");
		// 	for (int j = 1; j <= 9; j++) {
		// 		System.out.println(i + " * " + j + " = " + (i * j));
		// 	}
		// 	System.out.println(); // 구구단이 끝나고 한 칸 띄워줌.
        
        // 짝수단만 나오게 하시오.
        // for(int i = 1; i <= 10; i++){
        //     if(i % 2 != 0)
        //         continue;
        //     for(int j = 1; j <= 9; j++){    
        //         System.out.println(i + " * " + j + " = " + (i * j));
                
        //     }
        // }

        // 결과물이 홀수만 나오도록 하시오.


        // int result = i * j;
        // if (result % 2 ==1)
        // if((i * j) % 2 == 1)

        for(int i = 1; i <= 9; i++){
            
            for(int j = 1; j <= 9; j++){   
                {
                System.out.print(i + " * " + j + " = " + (i * j ));
                }
                System.out.println();
            }
        }
    }
}

