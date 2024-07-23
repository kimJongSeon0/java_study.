class Phone{
    String name1,number1;

    Phone(String name1,String number1){
        this.name1 = name1;
        this.number1 = number1;
    }
    Phone(){
        this.name1 = "없음";
        this.number1 = "없음";
    }
    void show(){
        System.out.println("이름: " + name1);
        System.out.println("전화 번호: " + number1);
    }
}





public class Profile {
    public static void main(String[] args) {
        Phone phone = new Phone("홍길동", "010-0000-0000")	;
        phone.show();
        
        phone = new Phone("홍길순", "010-1111-1111");	
        phone.show();
        
        phone = new Phone();
        phone.show();
    }
}
