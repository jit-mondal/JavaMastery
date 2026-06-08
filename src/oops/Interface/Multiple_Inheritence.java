package oops.Interface;

interface Resizable {
    void resize();
}

interface Drawables {
    void draw();
}

class Square implements Resizable, Drawables {
    @Override
    public void resize() {
        System.out.println("Square resizing");
    }
    @Override
    public void draw() {
        System.out.println("Square drawing");
    }
}

public class Multiple_Inheritence {
    public static void main(String[] args) {
        Square s1 = new Square();
        s1.resize();
        s1.draw();
    }
}