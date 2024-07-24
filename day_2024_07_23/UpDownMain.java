package day_2024_07_23;

import java.util.Scanner;

public class UpDownMain {

	public static void main(String[] args) {
		
		int randint = (int)((Math.random() * 50) + 1 );
		int chance = 5;
		int userPick;
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요: ");
		
        userPick = sc.nextInt();
	
		if(userPick > randint) {
			System.out.println("다운!! 기회가 " + chance-- + "번 남았습니다." );
            System.out.println("숫자를 입력해주세요: ");
            userPick = sc.nextInt();
		}else if(userPick < randint) {
			System.out.println("업!! 기회가 " + chance-- + "번 남았습니다." );
            System.out.println("숫자를 입력해주세요: ");
            userPick = sc.nextInt();
		}else if(userPick == randint) {
			System.out.println("정답은 입니다");
		}else {
			System.out.println("실패하였습니다." + "정답은" + randint + "입니다");
		} 
	}

}
