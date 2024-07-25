class Pet{
    private String name;

    Pet(String name){
        this.name = name;    
    }
    Pet(){
        this("");
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void eating(){
        System.out.println(name + "가 사료를 먹는중!");
    }
}

class MyDog extends Pet{

    @Override   // 메서드의 재정의
    public void eating(){
        System.out.println(getName() + "가 간식을 먹는다!");
    }

    MyDog(String name){     // 자식 class
        super(name);    // 부모 calss 생성자
    }
}
public class Extends {
    public static void main(String[] args) {
        Pet pet = new Pet("토리");
        MyDog dog = new MyDog("고도리");
        

        System.out.println(dog.getName());
        dog.eating();
        pet.eating();
    }
}
