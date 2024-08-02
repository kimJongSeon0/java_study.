package day_2024_08_01;

interface ICalculator {

    int add(int num1, int num2);

    int sub(int num1, int num2);

    int mul(int num1, int num2);

    int div(int num1, int num2);

}

class MyCalculator implements ICalculator {

    @Override
    public int add(int num1, int num2) {

        return num1 + num2;
    }

    @Override
    public int sub(int num1, int num2) {

        return num1 - num2;
    }

    @Override
    public int mul(int num1, int num2) {

        return num1 * num2;
    }

    @Override
    public int div(int num1, int num2) {

        if (num2 == 0) {
            System.out.println("잘 못 된 입력");
            return 0;
        }

        return num1 / num2;
    }

}

interface IFruit {

    public abstract void print();
}

class Grape implements IFruit {

    @Override
    public void print() {
        System.out.println("나는 포도이다.");
    }
}

class Apple implements IFruit {

    @Override
    public void print() {
        System.out.println("나는 사과이다.");
    }
}

class Pear implements IFruit {

    @Override
    public void print() {
        System.out.println("나는 배이다.");
    }
}

public class InterfaceExampleMain {

    public static void main(String[] args) {

        IFruit fAry[] = {new Grape(), new Apple(), new Pear()};

        for (IFruit f : fAry) {
            f.print();
        }

//		- 결과
//		나는 포도이다.
//		나는 사과이다.
//		나는 배이다.
        ICalculator calculator = new MyCalculator();
        System.out.println(calculator.add(0, 0));	//	0
        System.out.println(calculator.sub(1, 1));	//	0
        System.out.println(calculator.mul(0, 0));
        System.out.println(calculator.div(1, 1));
    }

}
