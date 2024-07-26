package day_2024_07_26;

import java.util.Arrays;

public class Random {

    public static void main(String[] args) {
        // final int RANDOM_COUNT = 5;

        int[] intRandom = {1,2,3,4,5};

        for (int i = 0; i < intRandom.length; i++) {
            intRandom[i] = (int) (Math.random() * 5) + 1;
            for (int j = 0; j < i; j++) {
                if (intRandom[i] >= intRandom[j]) {
                    break;
                }
            }
            System.out.println(Arrays.toString(intRandom));
        }

    }
}
