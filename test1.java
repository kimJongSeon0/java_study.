public class test1 {
    public static void main(String[] args) {
        
        int num = 5;
		
		if(num >= 5) {
			num = 10;
		}else {
			num = 20;
		}
		System.out.println(num);
		
		int result = (num >= 5) ? 10:20;    //삼항 연산자
		System.out.println(result);

		int kor = 90;
		int eng = 100;
		int math = 70;
		int mmax;
		
		mmax = kor;
		
		mmax = (mmax <= eng) ? eng:mmax;
		mmax = (math <= mmax) ? mmax:math;
		
		System.out.println(mmax);
		
		mmax = (kor > eng) ? (kor > math ? kor:math) : (eng > math ? eng:math);
		
		System.out.println(mmax);
		
		
		
		
		int maxx = (kor <= eng) ? eng:kor;
		System.out.println(maxx);
			maxx = (kor >= math) ? kor:math;
		System.out.println(maxx);
			maxx = (eng >= kor) ? eng:kor;
		System.out.println(maxx);
			maxx = (eng >= math) ? eng:math;
		System.out.println(maxx);
			maxx = (math >= kor) ? math:kor;
		System.out.println(maxx);
			maxx = (math >= eng) ? math:eng;
		System.out.println(maxx);

    }
}
