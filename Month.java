

public class Month {
    public static void main(String[] args) {
        int month;
            month = 9;

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
    }
}
