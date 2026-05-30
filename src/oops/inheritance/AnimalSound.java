package oops.inheritance;
class Animal {
    public void makesound(){
        System.out.println("Animal Sounding");
    }
}
class dog extends Animal{
@Override
    public void makesound(){
    System.out.println("Bheow Bheow");
}
}
class cat extends Animal{
@Override
    public void makesound(){
    System.out.println("Meow Meow");
}
}
public class AnimalSound{
    public static void main(String[] args){
        Animal myDog=new dog();
        Animal myCat=new cat();
        myDog.makesound();
        myCat.makesound();
    }
}




