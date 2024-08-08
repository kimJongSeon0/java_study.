
import java.util.Scanner;

class Grade {
    private String[] course;
    private int[] score;
    
    public void setCourse(String[] course) {
        this.course = course;
    }
    
    public void setScore(int[] score) {
        this.score = score;
    }
    
    public void printScore(String courseName) {
        if (this.course == null || this.score == null) {
            System.out.println("과목과 성적 데이터가 초기화되지 않았습니다.");
            return;
        }
        if (this.course.length != this.score.length) {
            System.out.println("과목과 성적 데이터의 길이가 일치하지 않습니다.");
            return;
        }
        for (int i = 0; i < this.course.length; i++) {
            if (courseName.equals(this.course[i])) {
                System.out.println(this.score[i]);
                return;
            }
        }
        System.out.println("없는 과목입니다.");
    }
    
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (this.course == null || this.score == null) {
                System.out.println("과목과 성적 데이터가 없습니다.");
                return;
            }
            System.out.print("과목 이름 >> ");
            String temp = scanner.next();
            if (temp.equals("그만")) {
                scanner.close();
                return;
            }
            printScore(temp);
        }
    }
}

public class MainTest2 {
    public static void main(String[] args) {
        Grade grade = new Grade();
        
        String[] course = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
        int[] score = {95, 88, 76, 62, 55};
        
        grade.setCourse(course);
        grade.setScore(score);
        
        grade.run();
    }
}
