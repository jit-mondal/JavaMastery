package oops.abstraction;
abstract class Employee{
    abstract public float calculateBonus();
    abstract public float getSalary();
    abstract public float bonus();
}

class manager extends Employee{
    private int bonus=15000;
    private int salary;
    manager(int salary){
        this.salary=salary;
    }
    @Override
    public float calculateBonus() {
        return salary+bonus;
    }
    @Override
    public float getSalary(){
        return salary;
    }
    @Override
    public float bonus(){
        return bonus;
    }
}

class developer extends Employee{
    private int bonus=10000;
    private int salary;
    developer(int salary){
        this.salary=salary;
    }
    @Override
    public float calculateBonus() {
        return salary+bonus;
    }
    @Override
    public float getSalary(){
        return salary;
    }
    @Override
    public float bonus(){
        return bonus;
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee m1=new manager(75000);
        Employee d1=new developer(60000);
        System.out.println("Manager salary : "+ m1.getSalary());
        System.out.println("Manager bonus : "+ m1.bonus());
        System.out.println("Developer salary : "+ d1.getSalary());
        System.out.println("Developer bonus : "+ d1.bonus());
        System.out.println("Manager salary + bonus : "+ m1.calculateBonus());
        System.out.println("Developer salary + bonus : "+ d1.calculateBonus());
    }
}
