package oops.Interface;
interface Flyable{
    public void fly();
}
class bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("Bird flying ");
    }
}

class Drone implements Flyable{
    @Override
    public void fly() {
        System.out.println("Drone flying ");
    }
}
class Airplane implements Flyable{
    @Override
    public void fly() {
        System.out.println("Airplane flying ");
    }
}

public class FlyDemo {
   public static void main(String[] args) {
        Flyable b1=new bird();
        Flyable d1=new Drone();
        Flyable a1=new Airplane();
        b1.fly();
        d1.fly();
        a1.fly();
    }
}
