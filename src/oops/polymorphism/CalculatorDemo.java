package oops.polymorphism;
class Calculator{
    public int add(int a,int b, int c){
        return (a+b+c);
    }
    public int add(int a,int b){
        return (a+b);
    }
    public float add(float a,int b, int c){
        return (a+b+c);
    }
    public float add(int a,float b, int c){
        return (a+b+c);
    }
}

public class CalculatorDemo {
    public static void main(String[] args){
        int a=5;
        int b=4;
        float c=5.5f;
        int d=9;
        Calculator C =new Calculator();
        System.out.println(a+"+"+b+" = "+C.add(a,b));
        System.out.println(a+"+"+c+"+"+b+ " = "+C.add(a,c,b));

    }
}
