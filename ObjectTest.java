

class A {

    int num; // 인스턴스 변수
    int kor, eng, math;
    

    void setNum(int n1) { // void setNum(int n1) (안에 있는 건 파라미터&매개변수)
        // this.num = num;
        num = n1;
    }

    int getNum() {
        return num;
    }

    void setKor(int k1) {
        // this.kor = kor;
        kor = k1;
    }

    int getKor() {
        return kor;
    }

    void setEng(int e1) {
        // this.kor = kor;
        eng = e1;
    }

    int getEng() {
        return eng;
    }

    void setMath(int m1) {
        // this.kor = kor;
        math = m1;
    }

    int getMath() {
        return math;
    }

    double getAvg(){
        return (kor + eng + math) / 3.0;
    }
}
class Circle{
    
    int radius;
    final double Pi = 3.14;

    void setRadius(int r){
        radius = r;
    }

    int getRadius(){
        return radius;
    }

    double getArea(){
        // return radius * radius * Pi;
        return radius * radius * Math.PI;
    }
}
class Rectangle{

    double Height,Width;

    void setHeight(double h){
        Height = h;
    }
    void setWidth(double w){
        Width = w;
    }
    double getArea(){
        return  Width * Height;
    }
}
class Grade{
    int kor, eng, math;
    int avg = kor + eng + math;

    void setKor(int kor){
        this.kor = kor;
    }
    void setEng(int eng){
        this.eng = eng;
    }
    void setMath(int math){
        this.math = math;
    }
    int getKor(){
        return kor;
    }
    int getEng(){
        return eng;
    }
    int getMath(){
        return math;
    }
    char getCharGrade(){
        char grade;
        double avg = (kor + eng + math) / 3.0;
        
        if(avg >=90){
            grade = '수';
        }else if (avg >= 80){
            grade = '우';
        }else if(avg >= 70){
            grade = '미';
        }else if(avg >= 60){
            grade = '양';
        }else{
            grade = '가';
        }
        return grade;
    }
    void getGrade(){
        double avg = (kor + eng + math) / 3.0;
        if(avg >=90){
            System.out.println("성적은 수 입니다.");
        }else if (avg >= 80){
            System.out.println("성적은 누 입니다.");
        }else if(avg >= 70){
            System.out.println("성적은 미 입니다.");
        }else if(avg >= 60){
            System.out.println("성적은 양 입니다.");
        }else{
            System.out.println("성적은 가 입니다.");
        }
    }
    double getTotal(){
        double avg = (kor + eng + math) / 3.0;
        return avg;
    }
}
public class ObjectTest {

    public static void main(String[] args) {
        
        Grade grade = new Grade();

        grade.setKor(90);
        grade.setEng(90);
        grade.setMath(90);
    
        System.out.println("국어 " + grade.getKor());
        System.out.println("영어 " + grade.getEng());
        System.out.println("수학 " + grade.getMath());
        
        System.out.println(grade.getCharGrade() + "입니다."); // 수 입니다.
        grade.getGrade();   //성적은 수 입니다.
        System.out.println("평균은 " + grade.getTotal() + "입니다.");

        // Circle circle = new Circle();
        Rectangle rec = new Rectangle();
        
        rec.setHeight(10.1);
        rec.setWidth(10.1);

        System.out.println(rec.getArea());






        // circle.setRadius(10);
        // System.out.println(circle.getArea());

        // circle.setRadius(20);
        // System.out.println(circle.getArea());

        A a; // 변수 선언 == int num; // 참조형(참조형 선언할 대 class 이름이 옴)
        a = new A(); // 객체(인스턴스) 생성

        // a.setKor(90);
        // a.setEng(80);
        // a.setMath(90);

        // System.out.println(a.getKor());
        // System.out.println(a.getEng());
        // System.out.println(a.getMath());
        // System.out.println(a.getAvg());

        // System.out.println(a.num);
        // a.num = 3;
        // System.out.println(a.num);
        // System.out.println("국어" + a.kor);
        // System.out.println("영어" + a.eng);
        // System.out.println("수학" + a.math);
        // System.out.println(a);
    }
}
