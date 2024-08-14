package day_2024_08_08;

import java.util.HashSet;
import java.util.Set;

class Num {

    private int num;

    Num(int num) {
        this.num = num;
    }

    public String toString() {
        return String.valueOf(num);
    }

    public int hashCode() {
        return num % 2;
    }

    public boolean equals(Object obj) {
        if (this.num == ((Num) obj).num) {
            return true;
        } else {
            return false;
        }
    }
}

public class SetLotteoMain {

    public static void main(String[] args) {

        Set<Integer> lottoSet = new HashSet<>();
        final int LOTTO = 6;
        while (lottoSet.size() < LOTTO) {
            int num = (int) ((Math.random() * 45) + 1);
            lottoSet.add(num);
        }
        System.out.println(lottoSet);
        // for (Integer s : lottoSet) {
        //     System.out.println(s);
        // }
    }
}
