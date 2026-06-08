package oops.Interface;

interface Payable {
    void calculatePay();
}

class FullTimeEmployee implements Payable {
    private int salary;
    FullTimeEmployee(int salary) {
        this.salary = salary;
    }
    @Override
    public void calculatePay() {
        System.out.println("FullTime Employee Pay : " + salary);
    }
}

class PartTimeEmployee implements Payable {
    private int hoursWorked;
    private int hourlyRate;
    PartTimeEmployee(int hoursWorked, int hourlyRate) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    @Override
    public void calculatePay() {
        System.out.println("PartTime Employee Pay : " + hoursWorked * hourlyRate);
    }
}

public class PayableDemo {
    public static void main(String[] args) {
        Payable f1 = new FullTimeEmployee(50000);
        Payable p1 = new PartTimeEmployee(20, 500);
        f1.calculatePay();
        p1.calculatePay();
    }
}