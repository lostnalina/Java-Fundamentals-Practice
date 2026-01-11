import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Please enter amount the array you want to reverse");
        int amount= scanner.nextInt();
        int[] numbers = new int[amount];

        System.out.println("Please enter the" +amount+ "amount");

        for (int i=0;i<amount;i++){
            numbers[i]=scanner.nextInt();

        }

        System.out.println("Reverse array:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

    }
}
