package day_2024_07_30;

//	참조형도 형 변환 존재함.(casting 가능)
class MobilePhone {

    protected String number;

    public MobilePhone(String num) {
        number = num;
    }

    public void answer() {
        System.out.println("Hi~ From " + number);
    }
}

class SmartPhone extends MobilePhone {

    private String androidVer;

    public SmartPhone(String num, String ver) {
        super(num);
        androidVer = ver;
    }

    public void playApp() {
        System.out.println("App is running is " + androidVer);
    }
}

//함수오버라이딩 = 상속 관계에서 이름 같은 함수(함수 바디만 달리하는 것)가
//있을 때 자식 함수로 부모함수 엎어 쓰는 것(주소 바꿔치기).
//오버라이딩은 자식꺼
//폴리몰피즘 + 오버라이딩 = 자바의 70%
public class PhoneMain {

    public static void main(String[] args) {

        SmartPhone phone = new SmartPhone("010-555-777", "Nougat");

        phone.answer();
        phone.playApp();

        // 다형성(polymorphism) = 폴리몰피즘(부모 = 자식)
        MobilePhone ph2 = new SmartPhone("010-999-333", "Nougat");
        //	MobilePhone ph2 = (MobilePhone)new SmartPhone("010-999-333", "Nougat");
        //	형변환 가능 , 자동형변환 도 됨
        SmartPhone ph3 = new MobilePhone("010-999-333", "Nougat");

        ph2.answer();
        ph2.playApp();

    }

}
