
public class Training {

    public static double getCirleArea(double r){
        
        double Pi = 3.14;
		double area = r * r * Pi;
		return area;
    }
    public static double getAvg(int kor, int eng, int math){
        int total = kor + eng + math;
        double avg = total / 3;
        return avg;
    }

    
    public static char getGrade(double avg){

        char grade;
        if(avg >= 90){
            grade = 'A';
        }else if(avg >= 80){
            grade = 'B';
        }else if(avg >= 70){
            grade = 'C';
        }else if(avg >= 60){
            grade = 'D';
        }else{
            grade = 'E';
        }
        return grade;
    }
    

    public static void main(String[] args) {

        System.out.println(getCirleArea(10));

        double avg = getAvg(80, 70, 90);
        char grade = getGrade(avg);

        System.out.println("평균은" + avg + "입니다.");
        System.out.println("성적은" + grade + "입니다.");
    }
}
