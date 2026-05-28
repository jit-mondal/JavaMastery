package oops.encapsulation;

public class Student {
    private String name;
   private int age;
   private float marks;
   public Student(String name, int age){
       this.name=name;
       this.age=age;
   }
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public float getMarks() {
        return this.marks;
    }
    public void setMarks(float marks){
       if(marks<=100 && marks>=0) {
           this.marks = marks;
           System.out.println("Success: Marks updated to " + this.marks + " for student " + this.name + ".");
       }
       else {
           System.out.println("Invalid Marks");
       }
    }
    public void details(){
        System.out.println("Name : " + getName());
        System.out.println("Age : "+ getAge());
        System.out.println("Marks : "+ getMarks());
    }

    public static void main(String[] args){
        Student jit= new Student("Jit",19);
        jit.details();
        jit.setMarks(100);
        System.out.println("Marks of " + jit.getName() + " is : " + jit.getMarks());
    }
}
