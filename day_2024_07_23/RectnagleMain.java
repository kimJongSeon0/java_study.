package day_2024_07_23;

import A;

class Rectangle {

    int x, y, width, height;
    int x2, y2;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.x2 = x + width;
        this.y2 = y + height;
    }

    void show() {
        System.out.println("(" + x + "," + y + ")에서 크기가" + width + "x" + height + "인 사각형");
    }

    int square() {
        return width * height;
    }

    // if (t.contains(r))
    boolean contains(Rectangle rec) {
        boolean isContain = false;

        if ((this.x < rec.x) && (this.x2 > rec.x2) && (this.y2 > rec.y2) && (this.y < rec.y)) {
            isContain = true; 
        }else {
            isContain = false;
        }

        return isContain;
    }
}

public class RectnagleMain {
// access modifier: 접근 제한자

    public static void main(String[] args) {

        A a = new A();
        // a.a = -10;

        Rectangle r = new Rectangle(2, 2, 8, 7);
        Rectangle s = new Rectangle(5, 5, 6, 6);
        Rectangle t = new Rectangle(1, 1, 10, 10);

        r.x = -10;
        r.width = -10;
        r.x2 = 10;

        r.show();
        System.out.println("s의 면적은 " + s.square());
        if (t.contains(r)) {
            System.out.println("t는 r을 포함합니다.");
        }
        if (t.contains(s)) {
            System.out.println("t는 s를 포함합니다.");
        }

        //(2,2)에서 크기가 8x7인 사각형
        // s의 면적은 36
        // t는 r을 포함합니다.
    }
}
