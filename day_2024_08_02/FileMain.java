package day_2024_08_02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileMain {

    public static void print() throws ArrayIndexOutOfBoundsException {
        System.out.println("안녕하세요");
    }

    public static void print2() throws FileNotFoundException {
        System.out.println("안녕하세요");
    }

    public static void main(String[] args) {

        print();
        print2();

//		File file = new File("abcd.txt");
//		Scanner sc = new Scanner(file);
    }

}
