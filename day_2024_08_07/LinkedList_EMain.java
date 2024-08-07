package day_2024_08_07;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class IntLinkedList {

    int num;
    IntLinkedList link;

    public IntLinkedList(int num) {
        this.num = num;
    }
}

public class LinkedList_EMain {

    public static void main(String[] args) {

        IntLinkedList l1 = new IntLinkedList(1);
        IntLinkedList l2 = new IntLinkedList(2);
        IntLinkedList l3 = new IntLinkedList(3);

        l1.link = l2;
        l2.link = l3;

        //		List<String> list = new ArrayList<>();
        List<String> list = new LinkedList<>();

        list.add("Toy");
        list.add("Box");
        list.add("Robot");

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + '\t');
        }

        for (String str : list) {
            System.out.println(str);
        }

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext());
        String str = iterator.next();
        System.out.println(str);

        System.out.println();

        list.remove(0);	//	삭제 할 수 있는 코드.

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + '\t');
        }
        System.out.println();
    }

}
