import  java.util.Scanner;
public class CBSE_Board {
   public static void main(String[] args) {
      int beng;
      int eng;
      int math;
      float total;
Scanner sc=new Scanner(System.in);
       System.out.println("Enter the mark of Bengali :");
       beng= sc.nextInt();
       System.out.println("Enter the mark of English :");
       eng=sc.nextInt();
       System.out.println("Enter the mark of Math :");
       math=sc.nextInt();
       total=((beng+eng+math)/300.0f)*100;
       System.out.print("Total Parcentage : ");
       System.out.println(total);

    }
}
