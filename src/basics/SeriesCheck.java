import java.util.Scanner;

public class SeriesCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isAP = true;
        System.out.print("Terms: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int d = arr[1] - arr[0];
        int d2 = arr[2] - arr[1];

        if(d>d2 && d/2==d2) {
            isAP = true;
        }
        else {


            for (int i = 0; i < n - 1; i++) {
                if (arr[i + 1] - arr[i] != d ){
                    isAP = false;
                    break;
                }
            }
        }
        if (isAP) {
            System.out.println("Not an  AP series");
        } else {
            System.out.println("Not an not AP series");
        }
    }
}
