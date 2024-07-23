
public class Switch {
    public static void main(String[] args) {
        int n = 1;
        
        switch (n) { //switch(정수가 들어감)
            case 1:
                System.out.println("1 입니다.");
                System.out.println("1 입니다.");
            case 2:
                System.out.println("2 입니다.");
                System.out.println("2 입니다.");
                break;
            default:
                System.out.println("디폴트 입니다.");
                System.out.println("디폴트 입니다.");
                
        }
                System.out.println("프로그램 종료 합니다.");
                
                int month;
                month = 6;
        
                switch (month) {
                    case 12,1,2:
                        System.out.println("겨울 입니다.");
                        break;
                    case 3,4,5:
                        System.out.println("봄 입니다.");
                        break;
                    case 6,7,8:
                        System.out.println("여름 입니다.");
                        break;
                    case 9,10,11:
                        System.out.println("가을 입니다.");
                        break;
                    default:
                        System.out.println("잘 못 된 입력입니다.");
                    
                }
                if(month == 3 || month == 4 || month == 5){
                    System.out.println("봄 입니다.");
                }else if(month == 6 || month == 7 || month == 8){
                    System.out.println("여름 입니다.");
                }else{
                    System.out.println("잘 못 된 입력입니다.");
                }

                for(int i = 1; i <= 100; i++){
                    if(i == 35)    // i가 20번째가 되면 탈춞
                        break;     //break 위에 반드시 조건이 있어야 함
                    System.out.println(i + "번: " + "Hello world");
                }
    }
}
