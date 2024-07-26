package day_2024_07_26;

public class Random {

    public static void main(String[] args) {
        // final int RANDOM_COUNT = 5;

        int[] intRandom = {1, 5, 3, 9, 2};
        int max = intRandom[0];
        for (int i = 0; i < intRandom.length; i++) {
            intRandom[i] = (int) (Math.random() * 5) + 1;
                if (intRandom[i] > max) {
                    max = intRandom[i];
                }
            }
            System.out.println(max);
        }
    }
