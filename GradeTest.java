class Grade9{
    int num1 = 90;
    int num2 = 80;
    int num3 = 60;
    
    int avg;

    Grade9(int num1, int num2, int num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    double average(){
        return avg = (num1 + num2 + num3) /3;
    }
}

public class GradeTest {
    public static void main(String[] args) {
        Grade9 me = new Grade9(90,80,60);
        System.out.println("평균은 "+me.average()); // average()는 평균을 계산하여 리턴
    }
}
