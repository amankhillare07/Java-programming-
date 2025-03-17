
interface Vehicle {  
    void start();    
}  
class Car implements Vehicle {  
    public void start() {  
        System.out.println("Car is starting with a key.");  
    }  
}  
class Bike implements Vehicle {  
    public void start() {  
        System.out.println("Bike is starting with a self-start button.");  
    }  
}  
public class Interface1 {  
    public static void main(String[] args) {  
        Vehicle myCar = new Car();  
        myCar.start();    

        Vehicle myBike = new Bike();  
        myBike.start();    
    }  
}
