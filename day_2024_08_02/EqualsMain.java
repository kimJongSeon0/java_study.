package day_2024_08_02;

class INum {
	private int num;

	public INum(int num) {
		this.num = num;
	
}

	@Override
	public boolean equals(Object obj) {
		
		boolean isNum = false;
		
		if(obj instanceof INum) {
			INum inum = (INum)obj;
			
			if(this.num == ((INum)obj).num) {
	//		if(this.num == (inum.num) 둘다 가능
				isNum = true;
			}
		}	
			return isNum;
		
//		if (this.num == ((INum) obj).num)
//			return true;
//		else
//			return false;
//	}
}

public class EqualsMain {

	public static void main(String[] args) {

		INum num1 = new INum(10);
		INum num2 = new INum(12);
		INum num3 = new INum(10);

		if (num1.equals(num3)) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}
	}
}
}




	


