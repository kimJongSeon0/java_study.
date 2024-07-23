

class Grade5 {

    int math, science, english;

    Grade5(int math, int science, int english) {
        this.math = math;
        this.science = science;
        this.english = english;
    }

    double average() {
        return (math + science + english) / 3.0;
    }

}

// 출력
// LG에서 만든 2017년형 32인치 TV
class TV {

    String brand;
    int year;
    int inch;

    TV(String brand, int year, int inch) {
        this.brand = brand;
        this.year = year;
        this.inch = inch;
    }

    TV() {
        this.brand = "OO";
        this.year = 1900;
        this.inch = 0;
        show();
    }

    void show() {
        System.out.println(brand + "에서 만든" + year + "년" + inch + "인치");
    }
}

class Song {

    String title;
    String artist;
    int year;
    String country;

    Song(String title, String artist, String country, int year) {
        this.title = title;
        this.artist = artist;
        this.country = country;
        this.year = year;
    }
    Song() {
        this.title = "Dancing Queen";
        this.artist = "ABBA";
        this.country = "스웨덴";
        this.year = 1978;
        show();
    }


    void show() {
        System.out.println(year + "년 " + country + " 국적의 " + artist + "가 부른 " + title);
    }
}

    class Circle4 {

        double radius;

        Circle4(double radius) {
            this.radius = radius;
        }
    
        void gerArea() {
            System.out.println(radius * radius * Math.PI);
        }

    class Rectangle4 {

        double width, height;

        Rectangle4(double width, double height) {
            this.width = width;
            this.height = height;
        }

        void gerArea() {
            System.out.println(width * height);
        }

    }
}

public class TvExampleTest {

    public static void main(String[] args) {
        {
            TV myTV = new TV("LG", 2017, 32);   // LG에서 만든 2017년 32인치
            myTV.show();

            TV myTV2 = new TV();    // 00에서 만든 1900년 0인치
        }

        {
            int math = 90;
            int science = 80;
            int english = 70;

            Grade5 me = new Grade5(math, science, english);
            System.out.println("평균은 " + me.average()); // average()는 평균을 계산하여 리턴
        }

        {
            Song song = new Song("Dancing Queen", "ABBA", "스웨덴", 1978);
            song.show();
        }
        {
            Circle4 circle = new Circle4(10);
            circle.gerArea();
        }
        {
            Rectangle4 rec = new Rectangle4(10, 10);
            rec.gerArea();
        }
    }
}
