package 정리;

import 정리.Calculator.MyClass;

public class Calculator {
    
    // 정수형 덧셈 메소드
    public int add(int a, int b) {
        return a + b;
    }
    
    // 실수형 덧셈 메소드
    public double add(double a, double b) {
        return a + b;
    }
    
    // 세 개의 정수를 더하는 메소드
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // 문자열을 결합하는 메소드
    public String add(String a, String b) {
        return a + b;

    // add(int a, int b) 메소드는 정수형 두 수를 더합니다.
    // add(double a, double b) 메소드는 실수형 두 수를 더합니다.
    // add(int a, int b, int c) 메소드는 정수형 세 수를 더합니다.
    // add(String a, String b) 메소드는 문자열 두 개를 결합합니다.
    }
}


public class 2024_07_25 {
    public static void main(String[] args) {
        // 메소드 오버로딩이란?
        // 자바 프로그래밍에서 같은 이름의 메소드를 여러 개 정의하는 것을 말합니다. 
        // 이때 각각의 메소드는 서로 다른 매개변수 리스트를 가져야 합니다.
        // 메소드 오버로딩을 통해 같은 기능을 수행하는 여러 메소드를 하나의 이름으로 그룹화할 수 있습니다.

        // 메소드 오버로딩의 주요 특징
        // 메소드 이름 동일: 메소드 이름은 동일해야 합니다.
        // 매개변수 리스트 다름: 매개변수의 개수나 데이터 타입이 서로 달라야 합니다.
        // 반환 타입은 상관 없음: 메소드 오버로딩에서는 반환 타입이 다른 경우 구분하지 않습니다. 
        // 정적 메소드와 인스턴스 메소드 모두 가능: 클래스 내부에서 정적(static) 메소드와 인스턴스(instance) 메소드 모두 오버로딩할 수 있습니다.

        // 메소드 오버로딩을 적용한 대표적인 함수는?
        // 메소드 오버로딩을 많이 활용하는 대표적인 함수 중 하나는 println 메소드입니다.
        // 이 메소드는 System.out 객체의 메소드로, 다양한 데이터 타입을 출력하는 데 사용됩니다.
        public void println(int x) {
            // 정수를 출력하는 코드
        }
        public void println(double x) {
            // 실수를 출력하는 코드
        }
        public void println(String x) {
            // 문자열을 출력하는 코드
        }
        public void println(Object x) {
            // 객체를 출력하는 코드
        }
        
        // this함수에 대하여 설명하시오.
        // this 키워드의 기본 개념 this는 현재 객체를 참조하는 데 사용되는 특수한 참조 변수입니다.
        // 자바에서 클래스의 인스턴스(객체)가 생성될 때마다 그 객체의 메모리 주소를 참조하기 위해 자동으로 생성됩니다.
        // 이 this 참조 변수는 인스턴스 메소드나 생성자에서 사용되며, 해당 메소드가 속한 객체 자신을 가리킵니다.
        
        // 현재 객체의 필드나 메소드 호출:
        public class MyClass {
            private int number;
        
            public void setNumber(int number) {
                this.number = number; // 현재 객체의 number 필드에 매개변수로 받은 값 설정
            }
        
            public void printNumber() {
                System.out.println(this.number); // 현재 객체의 number 필드 출력
            }
        }
        
        // 생성자 호출:
        public class MyClass {
            private int number;
        
            public MyClass() {
                this(0); // MyClass(int) 생성자 호출
            }
        
            public MyClass(int number) {
                this.number = number; // 현재 객체의 number 필드에 매개변수로 받은 값 설정
            }
        }
        
        // 메소드 체이닝:
        public class MyClass {
        private int number;

        public MyClass setNumber(int number) {
        this.number = number;
        return this; // 메소드 체이닝을 위해 자신의 참조 반환
    }
}

        MyClass obj = new MyClass();
        obj.setNumber(10).setNumber(20); // 메소드 체이닝으로 setNumber 메소드 연속 호출

        // 내부 클래스에서 외부 클래스 참조:
        public class OuterClass {
            private int outerNumber;
        
            public class InnerClass {
                private int innerNumber;
        
                public void setOuterNumber(int number) {
                    OuterClass.this.outerNumber = number; // 외부 클래스의 멤버 접근
                }
            }
        }
        
        // 주의사항
        // this는 메소드 내에서만 유효합니다. 정적(static) 메소드에서는 사용할 수 없습니다.
        // 메소드 내에서 this를 사용할 때, 메소드가 호출된 객체 자신을 가리키므로, 객체를 참조할 필요가 없는 경우에는 생략해도 됩니다.
        // 생성자에서 다른 생성자를 호출할 때는 반드시 첫 줄에서 호출해야 합니다.
        // this 키워드는 자바에서 객체 지향 프로그래밍의 핵심 개념 중 하나로, 객체 간의 상호작용과 데이터 은닉을 쉽게 구현할 수 있도록 도와줍니다.
        
    }
}
