package oops.polymorphism;

abstract class Shape {
    public abstract float area();
}

class Circle extends Shape {
    float radius;
    Circle(float radius) {
        this.radius = radius;
    }
    @Override
    public float area() {
        return 3.14f * radius * radius;
    }
}

class Rectangle extends Shape {
    float length, width;
    Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public float area() {
        return length * width;
    }
}

class Triangle extends Shape {
    float base, height;
    Triangle(float base, float height) {
        this.base = base;
        this.height = height;
    }
    @Override
    public float area() {
        return 0.5f * base * height;
    }
}

public class ShapeAreaDemo {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0f);
        Shape rectangle = new Rectangle(4.0f, 6.0f);
        Shape triangle = new Triangle(3.0f, 8.0f);

        System.out.println("Circle area = " + circle.area());
        System.out.println("Rectangle area = " + rectangle.area());
        System.out.println("Triangle area = " + triangle.area());
    }
}