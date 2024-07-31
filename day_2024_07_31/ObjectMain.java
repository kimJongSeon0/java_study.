package day_2024_07_31;

class Object{
    public Object(){

    }
}

class Circle extends Object{
    
    int radius;
    final double PI = 3.14;

    public void  Circle(double r){
        
    }
        

    void setRadius(int r) {
        radius= r;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString(){
        return "넓이는" + getArea() + "입니다";
    }
}


    public class ObjectMain {

        public static void main(String[] args) {
            Object obj = new Circle(10);

            System.out.println(obj);

        }

    }
