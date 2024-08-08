package day_2024_08_07;


// class AAA extends Object{

// }
class AAA{
    
    public AAA(){
        System.out.println(hashCode()); //  hashCode(주소)hash(암호화)
        //System.out.println(super.hashCode());
    }
}

public class HashCodeEx {
    public static void main(String[] args) {
        
        AAA aaa = new AAA();

    }
}
