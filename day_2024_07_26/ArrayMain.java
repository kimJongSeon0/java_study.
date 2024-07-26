package day_2024_07_26;

class Box {

    private String conts;

    Box(String cont) {
        this.conts = cont;
    }

    public String toString() {
        return conts;
    }

}

public class ArrayMain {

    public static void main(String[] args) {

        Box[] ar = new Box[3];

        ar[0] = new Box("First");
        ar[1] = new Box("Second");
        ar[2] = new Box("Third");

        System.out.println(ar[0]);
        System.out.println(ar[1]);
        System.out.println(ar[2]);

//		int[] ar = new int[5];
//
//		ar[0] = 1;
//		ar[1] = 2;
//		ar[2] = 3;
//		ar[3] = 4;
//		ar[4] = 5;
//
//		System.out.println(ar[0]);
//		System.out.println(ar[1]);
//		System.out.println(ar[2]);
//		System.out.println(ar[3]);
//		System.out.println(ar[4]);
//
//		for (int i = 0; i < ar.length; i++) {
//			ar[i] = i + 1;
//			System.out.println(ar[i]);
//		}
        // 길이가 5인 int형 1차원 배열의 생성
        int[] ar1 = new int[5];
        // 길이가 7인 double형 1차원 배열의 생성
        double[] ar2 = new double[7];
        // 배열의 참조변수와 인스턴스 생성분리
        float[] ar3;
        ar3 = new float[9];
//
//		System.out.println("배열 ar1 길이: " + ar1.length);
//		System.out.println("배열 ar2 길이: " + ar2.length);
//		System.out.println("배열 ar3 길이: " + ar3.length);

    }

}
