package day_2024_08_06;

public class BoxMainTest {

    public static void main(String[] args) {
        //아래가 main에서 돌아가도록 Box 지네릭으로 구현하시오.

        Box<Integer> ibox = new Box<>();
        Box<Double> dbox = new Box<>();
        

        dbox.set(1.0);
        double dNum = dbox.get();//형변환도 필요없음                
        System.out.println(dNum);



    }
}
