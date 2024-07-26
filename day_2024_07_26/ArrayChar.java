package day_2024_07_26;

public class ArrayChar {

	public static void main(String[] args) {
        char[] ch = new char[26];
		
		for (int i = 0; i < + 26; i++){
			ch[i] = (char)('A' + i);	
		}
		for (char letter  : ch) {
            System.out.print(letter  + " ");
        }
	}
}
