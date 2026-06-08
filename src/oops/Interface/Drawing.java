package oops.Interface;
 interface  Drawable{
    public void draw();
}
class Circle implements Drawable{
    @Override
    public void draw() {
        System.out.println("Circle Draw");
    }
}
class Rectangle implements Drawable{
    @Override
    public void draw() {
        System.out.println("Rectangle Draw");
    }
}
class Triangle implements Drawable{
    @Override
    public void draw() {
        System.out.println("Triangle Draw");
    }
}

public class Drawing {
    public static void main(String[] args) {
    Drawable c1=new Circle();
    Drawable r1=new Rectangle();
    Drawable t1=new Triangle();
    c1.draw();
    r1.draw();
    t1.draw();
    }
}
