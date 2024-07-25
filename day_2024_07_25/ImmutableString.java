package day_2024_07_25;

public class ImmutableString {

	public static void main(String[] args) {
		String str1 = "Simple String";
		String str2 = "Simple String";

		String str3 = new String("Simple String");
		String str4 = new String("Simple String");

		if (str1 == str2)
			System.out.println("동일");
		else
			System.out.println("다름");
		if (str3 == str4)
			System.out.println("동일");
		else
			System.out.println("다름");
	}

}
