import java.util.Scanner;

public class App {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int inputData;   //a
        int inputData2;  //b
        int inputData3;  //c
        //c 값은 400 변수 여러개 사용가능
        //조건1: a+b > c 보다 클경우 조건

        //조건2: b+c > a 보다 클경우 조건

        //조건3: c+b+a > a+b 보다 클경우 조건
        // if then else System.out.println(" c+b+a > a+b 참");

        int int_a = 100;
        int int_b = 100;
        int int_c = 400;
        
        /* &&(and)둘 다 참일 때 , ||(all)둘 중 하나라도 참일 때 */
//         if (true && true){
//             System.out.println("1번 구문 참");
//         }
//         if (true && false){
//             System.out.println("2번 구문 참");
//         }
//         if (false && false){
//             System.out.println("3번 구문 참");
//         }
//         if (true || false){
//             System.out.println("4번 구문 참");
//         }
//         if (true || true){
//             System.out.println("5번 구문 참");
//         }
//         if (false || false){
//             System.out.println("6번 구문 참");
//         }
//     }
// }





//             if else(거짓말)
//         inputData = scan.nextInt();
//         inputData2 = scan.nextInt();
//         inputData3 = scan.nextInt();

//         if (inputData + inputData2 > inputData3){
//             System.out.println("a+b > c");
//         }if (inputData2 + inputData3 > inputData){   
//             System.out.println("b+c > a");
//         }if(inputData + inputData2 + inputData3 > inputData + inputData2){
//             System.out.println("a+b+c > a+b");
//         }
//     }
// }







        System.out.println("정수값을 입력해주세요.");
        inputData = scan.nextInt();
        System.out.println("정수값을 입력해주세요.");
        inputData2 = scan.nextInt();
        
        System.out.println(inputData);
        System.out.println(inputData2);





// int javaIsveryNiceLanguage;  낙타형(Camel case)  (보통 이 두개를 많이 씀)
// int Java_Is_Very_Nice_Language;  스네이크형(snake case)
// Camel case(클래스 이름 만들 때, 일반 변수 만들 때)
// snake case(상수 이름 만들 떄)
        }
}
