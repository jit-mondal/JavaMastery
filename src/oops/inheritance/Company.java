package oops.inheritance;
class Employee{
   private String name;
   private final int id;
   private float salary;
   private String work;

   Employee(String name, int id, float salary, String work){
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.work=work;
   }
   public String getName(){
       return this.name;
   }
   public int getId(){
      return this.id;
   }

    public float getSalary() {
        return salary;
    }

    public String getWork() {
        return work;
    }

    public void getDetails(){

    }
    public int getTeamSize(){
       return 0;
    }
}

class Developer extends Employee{

    Developer(String name, int id, float salary){
        super(name,id, salary, "Coding");
    }
    @Override
    public  void getDetails(){
        System.out.println("Details of the Employe Devoloper");
        System.out.println("Name : " +super.getName());
        System.out.println("ID : "+super.getId());
        System.out.println("Salary : "+super.getSalary() );
        System.out.println("Work : "+super.getWork());
    }
}
class Manager extends Employee{
    private int teamSize;
    Manager(String name, int id, float salary, int teamSize){
        super(name,id,salary,"Team Lead");
        this.teamSize=teamSize;
    }
@Override
    public int getTeamSize() {
        return this.teamSize;
    }
    @Override
    public  void getDetails(){
        System.out.println("Details of the Manager ");
        System.out.println("Name : " +super.getName());
        System.out.println("ID : "+super.getId());
        System.out.println("Salary : "+super.getSalary() );
        System.out.println("Work : "+super.getWork());
        System.out.println("Team Size : "+getTeamSize());

    }
}

public class Company {
    public static void main(String[] args){
        Employee Developer1=new Developer("Jit",101,50000);
        Employee Manager1=new Manager("Jit",101,50000,10);
        Developer1.getDetails();
        Manager1.getDetails();
    }

}
