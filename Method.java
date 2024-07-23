class St{

    int inta;
    String name;
    int intb;
    int int1;
    int int2;
    int int3;
    int int4;
    int int5;

    
    

    public static St createTestObject(int inta, String name, int intb, int int1, int int2, int int3, int int4, int int5, int all){
        St Sts = new St();
        Sts.inta = inta;
        Sts.name = name;
        Sts.intb = intb;
        Sts.int1 = int1;
        Sts.int2 = int2;
        Sts.int3 = int3;
        Sts.int4 = int4;
        Sts.int5 = int5;
        return Sts;
    }
}



public class Method {
    
    public static void main(String[]args){
        St Sts = new St.createTestObject(2018122104, "아무개", 100, 90, 80, 70, 50, 60 );
        System.out.println("학번: " + Sts.inta);
        System.out.println("이름: " + Sts.name);
        System.out.println("성적: " + Sts.intb);
        System.out.println("논리회로: " + Sts.int1);
        System.out.println("c언어: " + Sts.int2);
        System.out.println("c++: " + Sts.int3);
        System.out.println("자바: " + Sts.int4);
        System.out.println("컴퓨터개론: " + Sts.int5);


    
    }

}
