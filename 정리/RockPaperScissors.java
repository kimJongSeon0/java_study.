package 정리;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"가위", "바위", "보"};

        while (true) {
            // 사용자 입력 받기
            System.out.print("가위바위보! (가위, 바위, 보 중 하나를 입력): ");
            String userChoice = scanner.next();

            // 컴퓨터 선택 랜덤으로
            int randomIndex = random.nextInt(3);
            String computerChoice = choices[randomIndex];

            // 사용자와 컴퓨터의 선택 출력
            System.out.println("사용자: " + userChoice);
            System.out.println("컴퓨터: " + computerChoice);

            // 게임 결과 판정
            String result = determineWinner(userChoice, computerChoice);
            System.out.println(result);

            // 게임을 더 진행할지 물어보기
            System.out.print("계속 하시겠습니까? (y/n): ");
            String answer = scanner.next();
            if (!answer.equalsIgnoreCase("y")) {
                break;
            }
        }

        System.out.println("게임 종료!");
        scanner.close();
    }

    // 가위바위보 승부 결정
    public static String determineWinner(String user, String computer) {
        if (user.equals(computer)) {
            return "비겼습니다!";
        } else if ((user.equals("가위") && computer.equals("보"))
                || (user.equals("바위") && computer.equals("가위"))
                || (user.equals("보") && computer.equals("바위"))) {
            return "사용자가 이겼습니다!";
        } else {
            return "컴퓨터가 이겼습니다!";
        }
    }
}
