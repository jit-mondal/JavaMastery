package oops.encapsulation;

public class MobilePhone {
    private String name;
    private int charge;

    MobilePhone(String name,int charge){
        this.name=name;
        setCharge(charge);
    }

    public void setCharge(int charge) {
        if(charge<=100 && charge>=0){
            this.charge=charge;
        }
        else {
            System.out.println("Invalid charge");
        }
    }

    public int getCharge() {
        return charge;
    }

    public String getName() {
        return name;
    }
    public void details(){
        System.out.println("Name : " +getName());
        System.out.println("Charge : " +getCharge());
    }

    public void charging(int charge){
        if(this.charge+charge>100){
            System.out.println("Full Charge");
        }
        else {
            this.charge=this.charge+charge;
        }
    }
    public void using(int charge){
        if(this.charge-charge<0){
            System.out.println("Battery Dead");
        }
        else {
            this.charge=this.charge-charge;
        }
    }

    public static void main(String[] args){
        MobilePhone poco =new MobilePhone("POCO",50 );
        poco.details();
        poco.charging(50);
        poco.using(60);
        System.out.println("Name : "+poco.getName());
        System.out.println("charge : "+poco.getCharge());
        poco.charging(70);
        poco.details();
    }
}
