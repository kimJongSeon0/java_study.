package day_2024_07_29;

public class ArrayFor_Each {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        for (int i : arr) {
            System.out.println(i);
        }

        int[] ar = {1, 2, 3, 4, 5};

        // 배열 요소 전체 출력
        for (int e : ar) {
            System.out.println(e + " ");
        }
        System.out.println();

        int sum = 0;
        
        // 배열 요소의 전체 합 출력
        for (int e : ar) {
            sum += e;
        }
        System.out.println("sum: " + sum);
    }

}
