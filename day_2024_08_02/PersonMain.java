package day_2024_08_02;

class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
	public boolean equals(Object obj) {
		
		boolean isName = false;
		
		if(obj instanceof Person) {
			Person iName = (Person)obj;
			
			if(this.name == ((Person)obj).name) {
	//		if(this.num == (inum.num) 둘다 가능
				isName = true;
			}
		}	
			return isName;
    }
}

public class PersonMain {

    public static void main(String[] args) {

        Person p1 = new Person("홍길동");

        System.out.println(p1.equals(new Person("홍길동")));  //true 출력
        System.out.println(p1.equals(new Person("최명태")));  //false  출력

    }
}
