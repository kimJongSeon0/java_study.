class TestClass{

    int a;
    int b;
    int c;


    public static ClassTest createTestObject(int a, int b, int c){
        ClassTest testClass = new ClassTest();
        testClass.a = a;
        testClass.b = b;
        testClass.c = c;
        return testClass;
        
    }

    int setTestNumber(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        return 1;
        //this는 자기 자신을 의미함***중요***
    }

}


    //static int a / static 을 붙여주면 같은 폴더안에서 int a를 사용할 수 있음
    //static fianl int a  static fianl을 붙여주면 상수가(*그 값을 변경할 수 없는 변수*) 됨

public class Function{

    public static void main(String[] args) {   
        ClassTest testClass = ClassTest.createTestObject(150,300,450);
        System.out.println(testClass.a);
        System.out.println(testClass.b);
        System.out.println(testClass.c);

        testClass.a = 500;
        testClass.b = 1000;
        testClass.c = 1500;

        System.out.println(testClass.a);
        System.out.println(testClass.b);
        System.out.println(testClass.c);

        System.out.println(testClass.setTestNumber(777,999,888));
        
        System.out.println(testClass.a);
        System.out.println(testClass.b);
        System.out.println(testClass.c);
    }
}





//main이라는 이름을 가진 함수  static=정적인 / 퍼블릭(다른 페키지에서도 사용 할 수 있음),프로텍티드(),프라이빗(),디폴트()
//메소드 오버로딩/오버라이딩 *****중요*****
//Function.FunctionTest(인자 값);
//