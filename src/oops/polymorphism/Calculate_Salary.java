package oops.polymorphism;
abstract class Employee{
    public abstract float salary();
    public abstract String PositionName();
}
class Manager extends Employee {
    private int salary;
    private String PositionName = "Manager";
    private float bonus=30000f;

    Manager(int salary) {
        this.salary = salary;
    }

    @Override
    public float salary() {
        return this.salary+bonus;
    }

    @Override
    public String PositionName() {
        return this.PositionName;
    }
}
class Developer extends Employee{
    private int salary;
    private String PositionName="Developer";
    private float bonus=45000f;
    Developer(int salary){
        this.salary=salary;
    }
    @Override
    public float salary() {
        return this.salary+bonus;
    }
    @Override
    public String PositionName(){
        return this.PositionName;
    }
}
class Intern extends Employee{
    private int salary;
    private String PositionName="Intern";
    Intern(int salary){
        this.salary=salary;
    }
    @Override
    public float salary() {
        return this.salary;
    }
    @Override
    public String PositionName(){
        return this.PositionName;
    }
}

public class Calculate_Salary {
    public static void main(String[] args){
        Employee manager1=new Manager(70000);
        Employee developer1=new Developer(80000);
        Employee intern1=new Intern(30000);
        System.out.println(manager1.PositionName()+" Salary : "+manager1.salary());
        System.out.println(developer1.PositionName()+" Salary : "+developer1.salary());
        System.out.println(intern1.PositionName()+" Salary : "+intern1.salary());

    }
}
