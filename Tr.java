
public class Tr {

    
    public static void printStar(){
        for (int i = 0; i <= 5; i++) {  // 세로칸수(층수 설정)
            for (int j = 0; j < 5; j++){   //가로 방수 결정
                System.out.print("*");
            }
        System.out.println();
        }
    }

    public static void StarTr(int num){
        for(int i = 1; i <= num; i++){  // 세로칸수(층수 설정)
            for(int j = i;  j < num; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <=(2 * i - 1) ; j++){   //가로 방수 결정
                System.out.print("*");
            }
        System.out.println();
    }
}
    public static void main(String[] args) {
        
        for(int i = 1; i <= 5; i ++){  // 세로칸수(층수 설정)
            for(int j = 1; j < i; j++){   //가로 방수 결정
                System.out.print("*");
            }
            System.err.println();
        }
        
        for(int i = 1; i <= 5; i++){
            
            for(int j = i; j < 5; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {  // 세로칸수(층수 설정)
            for (int j = 5; j >= i; j--){   //가로 방수 결정
                System.out.print("*");
            }
            System.out.println();
		}

        for(int i = 1; i <= 5; i ++){  // 세로칸수(층수 설정)
            for(int j = i; j <= 5; j++){   //가로 방수 결정
                System.out.print("*");
            }
            System.err.println();
        }

        printStar();
        
        StarTr(6);
        
        

            
    }
}

