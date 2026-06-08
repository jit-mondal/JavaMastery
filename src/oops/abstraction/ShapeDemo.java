package oops.abstraction;

abstract class Shape {
    public abstract float area();
    public abstract float perimeter();
}

class Circle extends Shape {
    private float radius;
    Circle(float radius) {
        this.radius = radius;
    }
    @Override
    public float area() {
        return 3.14f * radius * radius;
    }
    @Override
    public float perimeter() {
        return 2 * 3.14f * radius;
    }
}

class Rectangle extends Shape {
    private float length, width;
    Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public float area() {
        return length * width;
    }
    @Override
    public float perimeter() {
        return 2 * (length + width);
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape c1 = new Circle(5.0f);
        Shape r1 = new Rectangle(4.0f, 6.0f);
        System.out.println("Circle area : " + c1.area());
        System.out.println("Circle perimeter : " + c1.perimeter());
        System.out.println("Rectangle area : " + r1.area());
        System.out.println("Rectangle perimeter : " + r1.perimeter());
    }
}