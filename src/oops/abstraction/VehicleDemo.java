package oops.abstraction;
abstract class Vehicle{
    abstract public void start();
    public void stop() {
        System.out.println("Vehicle stopping...");
    }
}
class car extends Vehicle{
    @Override
    public void start() {
        System.out.println("Car starting");
    }
}

class bike extends Vehicle{
    @Override
    public void start(){
        System.out.println("Bike starting");
    }
}
public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle c1=new car();
        Vehicle b1=new bike();
        c1.start();
        c1.stop();
        b1.start();
        b1.stop();
    }
}
