package oops.abstraction;
abstract class game{
    abstract public void start();

    abstract public void stop();
}
class cricket extends game{
    @Override
    public void start() {
        System.out.println("Cricket start");
    }
    @Override
    public void stop() {
        System.out.println("Cricket stop");
    }
}

class football extends game{
    @Override
    public void start() {
        System.out.println("Football start");
    }
    @Override
    public void stop() {
        System.out.println("Football stop");
    }
}

public class GameDemo {
    public static void main(String[] args) {
        game c1=new cricket();
        game f1=new football();
        c1.start();
        c1.stop();
        f1.start();
        f1.stop();
    }
}
