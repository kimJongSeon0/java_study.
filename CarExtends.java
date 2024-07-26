class MoterCar{
    private String tire;

    MoterCar(String tire){
        this.tire = tire;
    }
    MoterCar(){
        this("");
    }
    public String gettire(){
        return this.tire;
    }
    public void settire(String name){
        this.tire = tire;
    }
    public void start(){
        System.out.println(tire + "출발해라");
    }
}

class BabyCar extends MoterCar{
    @Override
    public void start(){
        System.out.println(gettire() + "갑니다");
    }

    BabyCar(String tire){
        super(tire);
    }
}

class Vehicle{
    private String carName;
    
    Vehicle(String carName){
        this.carName = carName;
    }
    Vehicle(){
        this("");
    }
    public void putAccel(){
        System.out.println("밟아요");
    }
}

class Tire extends Vehicle{
    
    Tire(String carName){
        super(carName);
    }
    @Override
    public void putAccel(){
        super.putAccel();
        System.out.println("구른다");
        
    }
}

public class CarExtends {
    
    public static void main(String[] args) {

        Tire tire = new Tire("카니발");
        tire.putAccel();
        
        MoterCar mcar = new MoterCar("아들아 ");
        BabyCar bcar =new BabyCar("네 엄마 ");
        
        mcar.start();
        bcar.start();
    }
}
