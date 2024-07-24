package day_2024_07_23;

import java.util.Scanner;

public class UpDownMain2 {

    public static void main(String[] args) {
        // 1~5사이의 랜덤 숫자 만들기
        int chance = 5;
        int answer = (int) ((Math.random() * 50) + 1);   // 1부터 50까지 숫자중 랜덤 숫자 뽑기

        System.out.println("테스트용 랜덤숫자: " + answer);

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("숫자를 입력해주세요(1~50사이의 값을 입력해주세요.)");
            System.out.print(">>>");

            //사용자 입력받기
            int input = sc.nextInt();

            if (input == answer) {
                System.out.println("정답입니다.");
                break;
            }
            if (chance == 1) {
                System.out.println("실패하였습니다. 정답은" + answer + "입니다.");
                break;
            }

            // 1회가 끝나면 기회를 1개씩 줄인다.
            chance--;

            if (input > answer) {
                System.out.println("다운!! 기회가" + chance + "남았습니다.");
            } else {
                System.out.println("업!! 기회가" + chance + "남았습니다.");
            }

        }
    }
}
