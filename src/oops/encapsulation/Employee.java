package oops.encapsulation;

public class Employee {
    private String name;
    private float salary=0;
    Employee(String name,float salary){
        this.name=name;
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }
    public void details(){
        System.out.println("Name : " +getName());
        System.out.println("Salary : " + getSalary());
    }

    public void setSalary(float salary) {
        if(salary>0){
            this.salary = salary;

        }
        else {
            System.out.println(+salary+ " Salary invalid ");
        }
    }
    public void increment(float amount){
        if(amount>0) {
            this.salary = this.salary + amount;
            System.out.println(amount+" Amount is incremented ");
        }
        else {
            System.out.println( amount+" IS Invalid amount");
        }
    }
    public static void main(String[] args){
        Employee jit=new Employee("Jit", 50000);
        jit.details();
        jit.increment(50000);
        jit.increment(-100);
        jit.details();
    }

}
