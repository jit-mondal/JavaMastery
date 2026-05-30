package oops.inheritance;
class Shape{
 public float area(){
     return 0;
 }
}

class Circle extends Shape{
    float radius;
    Circle(float radius){
        this.radius=radius;
    }
    double pi=3.14159265359;
    @Override
    public float area(){
        return (float) (pi * radius * radius);
    }
}

class Rectangle extends Shape{
float length;
float width;
Rectangle(float length, float width){
    this.length=length;
    this.width=width;
}
@Override
    public float area(){
    return (length*width);
}
}

public class ShapeCalculator {
    public static  void main(String[] args){
        Shape circle1=new Circle(5);
        Shape Rectengle1 = new Rectangle(4,5);
        System.out.println("Area Circle : "+circle1.area());
        System.out.println("Area Rectengle : "+Rectengle1.area());
    }
}
