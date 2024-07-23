
import java.util.Scanner;

public class MoneyMain {

    public static void main(String[] args) {

        while (true) {

            Scanner sc = new Scanner(System.in);

            int totalmoney;
            int m50000, m10000, m5000, m1000, m500, m100;     //int 변수선언 횟수 제한 없는듯 ?

            int tMoney;

            System.out.println("금액을 입력하세요.");
            totalmoney = sc.nextInt();

            // 총 금액 나누기 현금
            m50000 = totalmoney / 50000;   // 정수 나누기 정수(소수점이 나오더라도 int 형변환 하면서 소수점이 사라짐)
            tMoney = totalmoney % 50000;   // 잔돈 모으는 곳 totalmoney-(m50000*500000)
            // tMoney(계산 후 남은 돈) 126500을 5만원으로 계산 후 나머지 잔돈 
            m10000 = tMoney / 10000;
            tMoney = tMoney % 10000;   // 잔돈 모으는 곳
            // 5만원으로 계산하고 남은 돈을 계산
            m5000 = tMoney / 5000;
            tMoney = tMoney % 5000;   // 잔돈 모으는 곳
            // 만원으로 계산하고 남은 돈을 계산		
            m1000 = tMoney / 1000;
            tMoney = tMoney % 1000;   // 잔돈 모으는 곳
            // 천원으로 계산하고 남은 돈을 계산
            m500 = tMoney / 500;
            tMoney = tMoney % 500;   // 잔돈 모으는 곳
            // 오백원으로 계산하고 남은 돈을 계산
            m100 = tMoney / 100;
            tMoney = tMoney % 100;   // 잔돈 모으는 곳

            System.out.println("오만원" + m50000 + "장");
            System.out.println("만원" + m10000 + "장");
            System.out.println("오천원" + m5000 + "장");
            System.out.println("천원" + m1000 + "장");
            System.out.println("오백원" + m500 + "개");
            System.out.println("백원" + m100 + "개");

            System.out.println("계속 하시겠습니까? y,n");

            String yesOrNo = sc.next();

            if (yesOrNo.equals("Y") || yesOrNo.equals("y")) {
                continue;
            } else {
                break;
            }
        }
        System.out.println("프로그램을 종료 합니다.");
    }

}
