package day_2024_08_08;

import java.util.HashSet;
import java.util.Set;

class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.valueOf(age);
    }

    @Override
    public int hashCode() {
        return age % 3;
    }

    @Override
    public boolean equals(Object obj) {
        int age = ((Person)obj).age;
        String name = ((Person)obj).name;

        if (this.age == age && this.name.endsWith(name)) {
            return true; 
        }else {
            return false;
        }
    }
}

public class SetExampleMain {

    public static void main(String[] args) {

        Set<Person> personSet = new HashSet<>();

        personSet.add(new Person("홍길동", 11));
        personSet.add(new Person("바둑이", 11));
        personSet.add(new Person("홍길동", 11));

        System.out.println(personSet.size());	//	출력 2가 나오도록 하시오.
    }

}
