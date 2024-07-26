package day_2024_07_26;

import java.util.Arrays;

public class LottoMain {
    public static void main(String[] args) {
        final int LOTTO_COUNT = 6;

        int[] arrLotto = new int[LOTTO_COUNT];

        for(int i = 0; i < arrLotto.length; i++){
            arrLotto[i] = (int)(Math.random() * 45) + 1;
            for(int j = 0; j < i; j++){
                if(arrLotto[j] == arrLotto[i])
                i--;
                break;
            }
        }
        System.out.println(Arrays.toString(arrLotto));
    }
}
