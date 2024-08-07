package day_2024_08_07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMain {

    public static void main(String[] args) {
        Set<Num> n1 = new HashSet<>();

        n1.add(new Num(1));
        n1.add(new Num(2));
        n1.add(new Num(2));

        System.out.println(n1.size());

        Set<Integer> lottoSet = new HashSet<>();
        final int LOTTO = 6;

        while (lottoSet.size() < LOTTO) {
            int num = (int) ((Math.random() * 45) + 1);
            lottoSet.add(num);
        }

        System.out.println(lottoSet);

        for (Integer s : lottoSet) {
            System.out.println(s);
        }

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        System.out.println("사이즈: " + set.size());

        for (Iterator<Integer> itr = set.iterator(); itr.hasNext();) {
            System.out.print(itr.next() + '\t');
        }
        System.out.println();

        for (Integer s : set) {
            System.out.print(s + '\t');
        }
        System.out.println();

    }
}
