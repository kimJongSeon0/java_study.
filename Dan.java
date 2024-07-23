

public class Dan {
    public static void main(String[]args){
    // 3단 구구단 출력
    int b = 0;
    int c = 1;
        for(c = 1; c<= 9; c++) {
            b = 3*c;
        System.out.println("구구단 3단은 = " + c + "*" + b);
        }
        
    int dan = 5;
    for(int i=1; i<=9; i++){
        System.out.println(dan + "*" + i + "=" + (dan * i));
    }
        
    }
}