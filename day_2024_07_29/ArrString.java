package day_2024_07_29;

public class ArrString {
    public static void main(String[] args) {
        String[] sr = new String[4];

        sr[0] = new String("Java");
        sr[1] = new String("System");
        sr[2] = new String("Compiler");
        sr[3] = new String("Park");
        
        int cnum = 0;
            for(int i = 0; i <sr.length; i++){
                cnum += sr [i].length();
            }
            System.out.println(cnum);

//위의 스트링 배열에서 해당 배열안에 있는 총글자수의 합은?(잘 안되면 13 장 ppt 참고)
    }
}
