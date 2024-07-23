




class Grade {
	int kor = 90;
	int eng = 90;
	int math = 90;

	void getGrade() {
		double avg = (kor + eng + math) / 3.0;
		if (avg >= 90) {
			System.out.println("성적은 수 입니다.");
		} else if (avg >= 80) {
			System.out.println("성적은 누 입니다.");
		} else if (avg >= 70) {
			System.out.println("성적은 미 입니다.");
		} else if (avg >= 60) {
			System.out.println("성적은 양 입니다.");
		} else {
			System.out.println("성적은 가 입니다.");
		}
	}

	void checkGradeobject(Grade grade) {
		grade.getGrade();

	}
}

class BankAccount {
	String accNumber;
	String ssNumber;
	int balance = 0;

	BankAccount() {
		System.out.println("BankAccount 객체 생성됨");
	}

	// 생성자 함수 만들기
	// this() -> 생성자에서 다른 생성자를 호출 할 때(일반 함수에서 this()함수 호출 안됨)
	BankAccount(String accNumber, String ssNumber, int balance) {
		this();	// this() -> this 생성자 함수ex) BankAccount()를 호출
		
		this.accNumber = accNumber;
		this.ssNumber = ssNumber;
		this.balance = balance;
		
	}

	void initBackAccount(String acc, String ss, int bal) {
		accNumber = acc;
		ssNumber = ss;
		balance = bal;
	}

	void thisExample(){
		this.deposit(10000);
		this.withdraw(10000);
	}

	// 입금
	public int deposit(int amount) {
		balance += amount;
		return amount;
	}

	// 예금 출금
	public int withdraw(int amount) {
		balance -= amount;
		return amount;
	}

	// 예금 조회
	public int checkMybalance() {
		System.out.println("잔액: " + balance);
		return balance;
	}

	// 파라미터로 객체 받아오기 // 변수 선언
	public void checkBalance(BankAccount acc) {
		acc.checkMybalance();
	}
}

// 디폴트 생성자를 언제 컴파일러가 안 만들어 주는가? -> 개발자가 생성자를 한개라도 만들었을때.
// 컴파일러는 디폴트 생상자를안 넣어줌.

// this에 관하여.
// this는 자기자신
// 용도는 2가지
// this함수, this로 멤버 함수 또는 변수 접근

public class BankAccountMain {

	public static void main(String[] args) {
		BankAccount noh = new BankAccount(); // 안만들었는데도 돌아간다. -> 누군가(컴파일러)가 만들어 준다.

		BankAccount choi = new BankAccount("12-34-56", "80102", 0);
		// choi.initBackAccount("12-34-56", "80102", 0); // 초기화 함수

		// 두개의 인스턴스 생성
		// BankAccount yoon = new BankAccount();
		// BankAccount park = new BankAccount();

		// BankAccount ref1 = new BankAccount();
		// BankAccount ref2 = ref1;

		Grade grade = new Grade();

		// 각 인스턴스를 대상으로 예금을 진행
		// yoon.deposit(8000);
		// park.deposit(3000);
		// // 각 인스턴스를 대상으로 출금을 진행
		// yoon.withdraw(5000);
		// park.withdraw(2000);
		// // 각 인스턴스를 대상으로 진액을 조회
		// yoon.checkMybalance();
		// park.checkMybalance();

		// park.checkBalance(yoon);
		// yoon.checkBalance(park);

		// ref1.deposit(3000);
		// ref2.deposit(2000);
		// ref1.withdraw(400);
		// ref2.withdraw(300);
		// ref1.checkMybalance();
		// ref2.checkMybalance();

		// grade.checkGradeobject(grade); // 성적은 수 입니다.

	}
}
