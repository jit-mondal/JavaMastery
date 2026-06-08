package basics;

public class BudgetDemo {
    static void main(String[] args) {
       int budget=200;
       int lowestPrice=999;
       int sum;
      int flag=-1;
      int k=-1;
      int m=-1;
        int[] kPrice= {90, 85, 78};
        int [] mPrice={70,60,95};

        for(int i=0; i< kPrice.length;i++){
            for (int j=0; j< mPrice.length; j++){
                if (kPrice[i] + mPrice[j] <= budget) {
                    flag=0;
                    sum= kPrice[i] + mPrice[j];
                    if(sum<lowestPrice){
                        k=i;
                        m=j;
                        lowestPrice=sum;
                    }
//                    System.out.println("keyboard"+(i+1) +" And " +"Mouse"+(j+1)+" purchased possible");
                }

            }
        }
        System.out.println("keyboard "+(k+1) +" And " +"Mouse "+(m+1)+" purchased possible");
        System.out.println("Lowest price : "+lowestPrice);
        if (flag==-1){
            System.out.println("Not possible to purchased");
        }
    }
}
