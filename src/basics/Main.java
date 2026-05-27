import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int i, n,v,sum=0,value;

    System.out.println("Enter the Number of terms");
    Scanner sc = new Scanner(System.in);

    n = sc.nextInt();

    int arr[] = new int[n-1];

    System.out.println("Enter the array element");

    for(i = 0; i < n-1; i++){
      arr[i] = sc.nextInt();
      sum=sum+arr[i];
    }
    v=n*(n+1)/2;
    value = v-sum;
    System.out.println("Missing Value is "+ value);
  }
}