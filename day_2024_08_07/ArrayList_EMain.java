package day_2024_08_07;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_EMain {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();

        list.add("Toy");
        list.add("Box");
        list.add("Robot");

        for(int i= 0; i < list.size(); i++)
            System.out.print(list.get(i) + '\t');
        System.out.println();

        list.remove(0);	//	삭제 할 수 있는 코드.

        for(int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + '\t');
        System.out.println();
    }
}
