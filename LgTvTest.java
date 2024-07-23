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

public class LgTvTest{
    public static void main(String[] args) {

        {
            TV myTV = new TV("LG", 2017, 32);   // LG에서 만든 2017년 32인치
            myTV.show();

            TV myTV2 = new TV();    // 00에서 만든 1900년 0인치
        }
    }
}

