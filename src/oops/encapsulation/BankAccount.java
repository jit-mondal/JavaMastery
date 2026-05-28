package oops.encapsulation;
public class BankAccount {
    private float balance=0;

    public void deposit(float balance) {
        if(balance>0) {
            this.balance = this.balance + balance;
            System.out.println("Successfully deposited: $"+balance);
        }
        else {
            System.out.println("Invalid deposit amount!");
        }
    }
    public void withdraw(float balance) {
        if (balance <= this.balance) {
            this.balance = this.balance - balance;
            System.out.println("Successfully withdrawn: $" + balance);
        }
        else if (balance>this.balance){
            System.out.println("Incefficient balance");
        }
        else {
            System.out.println("Invalid withdrawal amount!");
        }
    }
    public float getBalance() {
        return this.balance;
    }

public static void main(String[] args){
    BankAccount c1=new BankAccount();
    c1.getBalance();
    c1.deposit(500);
    c1.withdraw(400);
    System.out.println("Available amount: $"+c1.getBalance());
    c1.withdraw(200);
}
}
