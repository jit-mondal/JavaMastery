package oops.inheritance;
class Vehicle {
 String name;
 final String fuelType;
 int speed;

 public Vehicle(String name, String fuel, int speed) {
  this.name = name;
  this.fuelType = fuel;
  this.speed = speed;
 }

 public String getName() {
  return this.name;
 }
 public int getSpeed(){
  return this.speed;
 }
 public String getFuelType(){
  return this.fuelType;
 }

 public void ditels() {
  System.out.println("Name : " +getName());
  System.out.println("FuelType : "+getFuelType());
  System.out.println("Speed : "+ getSpeed());
 }
}
class  Car extends Vehicle{
   public Car(String name, int Speed){
    super(name,"Disel", Speed );
   }
}
 class Bike extends Vehicle{
public Bike(String name,int Speed ){
 super(name, "Petrol", Speed);
}
 }


public class VehicleTesting {
 public static void main(String[] args){
  Vehicle mycar=new Car("Suv", 180);
  Vehicle mybike=new Bike("KTM", 250);
  mybike.ditels();
  mycar.ditels();
 }
}
