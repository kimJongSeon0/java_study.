public class ArrayTr {
    
    public static void main(String[] args) {
        // 1차원 배열
        int[] arrayInt = {10,20,30,40,50};  
        int[] arrayInt2 = new int[10]; // 빈 상태로 방을 0부터 9까지 만들어라.
        arrayInt2[1] = 10;

        // 다차원 배열
        int[][] arrayInt3 = {{10,20,30,}, {40,50,60}, {70,80,90} };
        int[][] arrayInt4 = 
        { {arrayInt3 [0][0],2,3},
          {arrayInt3 [0][1],5,6},
          {arrayInt3 [0][2],8,9} };

        // System.out.println(arrayInt3[0][0]);

        System.out.println(arrayInt4[0][0]);  //배열 순서는 0번부터 시작(0,1,2,3,4)

    }
  }




