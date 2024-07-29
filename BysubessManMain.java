package day_2024_07_29;

class Man {
	String name;

	public Man() {

	}

	public Man(String name) {
		this.name = name;
	}

	public void tellYourName() {
		System.out.println("My name is " + name);
	}
}

class BusinessMan extends Man {
	String company;
	String position;

	public BusinessMan(String name, String company, String position) {
		//this.name = name;
		//super.name = name;
		super(name);
		
		this.company = company;
		this.position = position;
	}

	public void tellYourInfo() {
		System.out.println("My company is " + company);
		System.out.println("My position is " + position);
		tellYourName();
	}
}

public class BysubessManMain {

	public static void main(String[] args) {
		BusinessMan businessMan = new BusinessMan("홍길동","홍길동 컴퍼니", "staff");
		businessMan.tellYourInfo();

	}

}
