public class Tr2 {

    public static double getAvg(int num1, int num2, int num3){
        int total = num1 + num2 + num3;
        double avg = total / 3.0;
        return avg;
    }
    public static char getGrade(double avg){
        char grade;

        if(avg >= 90){  
            grade = 'A';
        }else if (avg >= 80){
            grade = 'B';
        }else if (avg >=70){
            grade = 'C';
        }else{
            grade = 'D';
        }
        return grade;
    }

    public static void main(String[] args) {
        double avg = getAvg(80, 70, 80);
        char grade = getGrade(avg);

        System.out.println("평균은 " + avg + "입니다.");
        System.out.println("성적은 " + grade + "입니다.");
    }
}
