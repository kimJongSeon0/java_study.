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

public class CarExtends {
    public static void main(String[] args) {
        MoterCar mcar = new MoterCar("아들아 ");
        BabyCar bcar =new BabyCar("네 엄마 ");
        
        mcar.start();
        bcar.start();
    }
}
