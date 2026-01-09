import java.util.Scanner;

public class MinMaxFinder {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Specify the number of products you will enter: ");
        int num =scanner.nextInt();
        double[] prices=new double[num];

        for(int i=0 ; i<prices.length;i++){
         System.out.println("Enter the price of " +(i+1)+".");
         prices [i]=scanner.nextDouble(); }

         double max =prices[0];
         double min =prices[0];

         for(int i=0;i< prices.length;i++){
             if(prices[i]>max){
                  max =prices[i];
             }
             if (prices[i] < min) {
                 min = prices[i];
             }
         }
        System.out.println("Max price: "+max);
        System.out.println("Min price: "+min);
    }
}
