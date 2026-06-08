package oops.polymorphism;

abstract class Payment {
    public abstract void processPayment();
}

class CreditCard extends Payment {
    private int pin;
    CreditCard(int pin) {
        this.pin = pin;
    }
    @Override
    public void processPayment() {
        if (pin == 123) {
            System.out.println("Processing Credit Card Payment..");
        } else {
            System.out.println("Wrong pin..Try again");
        }
    }
}

class UPI extends Payment {
    private String upi;
    UPI(String upi) {
        this.upi = upi;
    }
    @Override
    public void processPayment() {
        if (upi.equals("jit")) {
            System.out.println("Processing UPI Payment..");
        } else {
            System.out.println("Wrong UPI ID..Try again");
        }
    }
}

class Cash extends Payment {
    private int cod;
    Cash(int pin) {
        this.cod = pin;
    }
    @Override
    public void processPayment() {
        if (cod == 123) {
            System.out.println("Processing Cash on Delivery..");
        } else {
            System.out.println("Wrong code..Try again");
        }
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        Payment c1 = new CreditCard(123);
        Payment u1 = new UPI("jit");
        Payment cash1 = new Cash(123);

        c1.processPayment();
        u1.processPayment();
        cash1.processPayment();
    }
}