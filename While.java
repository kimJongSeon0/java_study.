

public class While {
    public static void main(String[] args) {

        // 반복문 while문 편.
        // 조건이 true 일 때 까지 반복시킴
        
        int count = 1;
		// 차이: do~while문은 do 안에 있는 실행문장을 한번은 실행 시킴.
        while(count <= 1000){
            System.out.println(count + "번:" + "Hello world");
            count++;
        }


        int sum = 0;
        
        while(count <= 9) {
            if ( count % 1 == 0) {
                sum = sum * count;
                }
            count++;
            System.out.println(sum);
        }

        int i = 1;
        sum = 0;
        while(i <= 100) {
            if(i % 3 ==0) {
                sum = sum + i;
                System.out.println(sum);
                }
            i++;
        }
    }
}
