package oops.polymorphism;

abstract class Animals{
    public abstract String getSound();

    public abstract String getName();
}
class dog extends Animals{

    @Override
    public String getName() {
        return "Dog";
    }

    @Override
    public String getSound() {
        return "Bheow";
    }
}

class cat extends Animals{
    @Override
    public String getSound() {
        return "Meow";
    }

    @Override
    public String getName() {
        return "Cat";
    }
}
class cow extends Animals{
    @Override
    public String getSound() {
        return "Hamba";
    }

    @Override
    public String getName() {
        return "Cow";
    }
}


public class AnimalSoundDemo {
    public static void main(String[] args){
        Animals dog1=new dog();
        Animals cat1=new cat();
        Animals cow1=new cow();
        System.out.println(dog1.getName()+" Sound : "+dog1.getSound());
        System.out.println(cat1.getName()+" Sound : "+cat1.getSound());
        System.out.println(cow1.getName()+" Sound : "+cow1.getSound());
    }
}
