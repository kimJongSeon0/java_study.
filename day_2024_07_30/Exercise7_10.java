package day_2024_07_30;

class MyTv2 {

	boolean isPowerOn;

	int channel;

	int volume;

	final int MAX_VOLUME = 100;

	final int MIN_VOLUME = 0;

	final int MAX_CHANNEL = 100;

	final int MIN_CHANNEL = 1; 



        /* (1) 알맞은 코드를 넣어 완성하시오. */



}



class Exercise7_10 {

	public static void main(String args[]) {

		MyTv2 t = new MyTv2();

		t.setChannel(10);

		System.out.println("CH:" + t.getChannel());

		t.setVolume(20);

		System.out.println("VOL:" + t.getVolume());

	}

}



/*[실행결과]

CH : 10

VOL : 20 */