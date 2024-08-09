package day_2024_08_09;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class HashMapMain {

    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(45, "Brown");
        map.put(37, "James");
        map.put(23, "Martin");

        Set<Integer> ks = map.keySet();

        //key 값 출력 
        for (Integer n : ks) {
            System.out.print(n.toString() + '\t');
        }
        System.out.println();

        //1. for-each
        for (Integer n : ks) {
            System.out.print(map.get(n).toString() + '\t');
        }
        System.out.println();

        //2. Iterator
        for (Iterator<Integer> itr = ks.iterator(); itr.hasNext();) {
            System.out.print(map.get(itr.next()) + '\t');
        }
        System.out.println();

    }
}
