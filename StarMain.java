

public class StarMain {
    public static void main(String[] args) {
        for(int i = 1; i <= 1000; i++){
            System.out.println(i + "번: " + "*");
        }

        for (int i = 1; i <= 5; i++) {
			System.out.println("*");
		}

        for (int i = 1; i <= 5; i++) {  // 세로칸수(층수 설정)
            for (int j = 1; j < i; j++){   //가로 방수 결정
                System.out.print("*");
            }
            System.out.println();
		}
        
        for(int i = 5; i >= 0; i--){
            for (int j = 0; j <= i; j++){
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

        for (int i = 1; i <= 5; i++) {  // 세로칸수(층수 설정)
            for (int j = i; j <= 5; j++){   //가로 방수 결정
                System.out.print("*");
            }
            System.out.println();
		}

        for(int i = 1; i <= 5; i++){
            
            for(int j = 1; j < i; j++){
                System.out.print(" ");
            }
            for(int j = i; j <= 5; j++){
                System.out.print("*");
            }
            System.out.println();
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
    }
}
