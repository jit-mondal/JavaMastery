package oops.abstraction;
abstract class Animal{
    abstract public void makesound();
}

class bird extends Animal{
    @Override
    public void makesound() {
        System.out.println("Bird Sounding");
    }
}
class cat extends Animal{
    @Override
    public void makesound(){
        System.out.println("meow meow ");
    }
}
class dog extends Animal{
    @Override
    public void makesound(){
        System.out.println("Bheow Bheow ");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Animal b1=new bird();
        Animal c1=new cat();
        Animal d1=new dog();
        b1.makesound();
        c1.makesound();
        d1.makesound();
    }
}
