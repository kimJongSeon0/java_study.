
// 함수
// 기능을 만드는 것 -> 써먹어야 됨
// 메인함수 안에서 함수를 이동 시켜도 호출가능.
public class MethodMain {

// 1. say Hello를 출력하는 함수를 만드시오.
// 2. say Hello를 5번 출력하는 함수를 만드시오.
// 3. 두수를 전달 받아서 두수의 합을 출력하는 함수를 만드시오.
    public static void printStart(int num) {
        for(int i = 0; i <= num; i++){
            for(int j = 1; j <= num; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void sayHello2() {
        for(int i = 0; i < 5; i++){
            System.out.println("say Hello");
        }
    }

    public static void sayHello(){
        System.out.println("say Hello");
    }

    public static void printHello() {
        // System.out.println("Hello world");
        sayHello2();
    }

    public static void add(int num1, int num2){
        int result;
        result = num1 + num2;
        System.out.println(result);
    }

    public static void main(String[] args) {
        // System.out.println("say Hello");

        // printHello();s
        
        //함수명을 부르면 함수 안에 System.out.println 이 실행됨
        // sayHello();

        // sayHello2();    

        // add(5,7);
        // add(10,78);
        // add(-2,7);

        printStart(1);

    }
}
