package day_2024_08_07;

import java.util.HashSet;



class Num {

    int num;

    Num(int num) {
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

public class HashNum {

    public static void main(String[] args) {

        HashSet<Num> set = new HashSet<>();
        set.add(new Num(7799));
        set.add(new Num(9955));
        set.add(new Num(7799));

        System.out.println("인스턴스 수: " + set.size());

        for (Num n : set) {
            System.out.print(n.toString() + '\t');
        }

        System.out.println();
    }
}
