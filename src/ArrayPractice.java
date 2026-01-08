import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;

        System.out.println("Please enter 5 numbers: ");
        for (int i=0; i < numbers.length;i++){
            System.out.println("Number :"+(i+1));
            numbers[i] = scanner.nextInt();
        }
        for(int i=0 ;i<numbers.length; i++){
            sum += numbers[i] ;
        }
        System.out.println(" The total sum of numbers is : "+sum);

    }
}
