package day_2024_08_07;

import java.util.HashSet;
import java.util.Set;

class Num1 {

    int num;

    Num1(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return String.valueOf(num);
    }

    @Override
    public int hashCode() {
        return num % 2;  //출력 순서를 맞추려면 이렇게 변경하면 된다는것까지 알았는데 정확히 왜인지는 모르겠다.
    }

    @Override
    public boolean equals(Object obj) {
        if (this.num == ((Num) obj).num) {
            return true; 
        }else {
            return false;
        }
    }
}


public class SetMain {

    public static void main(String[] args) {
        
        // Set<Num1> n1 = new HashSet<>();

        // n1.add(new Num1(1));
        // n1.add(new Num1(2));
        // n1.add(new Num1(3));

        // System.out.println(n1.size());

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
        // Set<Integer> set = new HashSet<>();
        // set.add(1);
        // set.add(2);
        // set.add(3);
        // set.add(1);
        // System.out.println("사이즈: " + set.size());
        // for (Iterator<Integer> itr = set.iterator(); itr.hasNext();) {
        //     System.out.print(itr.next() + '\t');
        // }
        // System.out.println();
        // for (Integer s : set) {
        //     System.out.print(s + '\t');
        // }
        // System.out.println();
    }
}
