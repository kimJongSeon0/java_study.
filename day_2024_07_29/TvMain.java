package day_2024_07_29;
//TV를 상속받은 ColorTV 클래스를 작성하라.

class TV {
	private int size;

	public TV(int size) {
		this.size = size;
	}

	// 상속관련 - 자손에서는 언제든지 접근 가능(패키지와 상관없이)
	protected int getSize() {
		return size;
	}
	
	protected String getIp(String str) {
		return str;
	}
}

class ColorTV extends TV {
	private int color;
	String str;
	public ColorTV(String str, int size, int color) {
		super(size);
		this.str = str;
		this.color = color;
	}

	public void printProperty() {
		System.out.println(str + " 주소에 " + super.getSize() + "인치" +", " + color + "컬러");
	}
}

//32 인치 1024컬러
public class TvMain {
	public static void main(String[] args) {

		ColorTV myTV = new ColorTV("192.1.1.2",32, 2048);
		myTV.printProperty();
	}
}
// 출력
//"192.1.1.2" 주소에 32인치,2048컬러