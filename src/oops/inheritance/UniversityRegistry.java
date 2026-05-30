package oops.inheritance;

class person{
    private  String name;
    person(String name){
        this.name=name;
    }

    public String getName() {
        return this.name;
    }
    public int getRoll(){
        return 0;
    }
    public String getSubject(){
        return "HI Subject";
    }
}
class Student extends person{
    private int roll;
    Student(String name, int Roll){
        super(name);
        this.roll=Roll;
    }
@Override
    public int getRoll() {
        return this.roll;
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
class Teacher extends person{
    private String Subject;
    Teacher(String name, String Subject){
        super(name);
        this.Subject=Subject;

    }
    @Override
    public String getSubject(){
        return this.Subject;
    }
    @Override
    public String getName(){
        return super.getName();
    }

}


public class UniversityRegistry {
   public static void main(String[] args) {
        person Student1=new Student("Jit MOndal", 3);
        person Teacher1=new Teacher("Elias ", "CSE");
       System.out.println("Student Name : " +Student1.getName());
       System.out.println("Student Roll : "+Student1.getRoll());
       System.out.println("Teacher Name : " +Teacher1.getName());
       System.out.println("Teacher subject : "+Teacher1.getSubject());
    }
}
