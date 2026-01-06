import java.util.Scanner ;

public class ForLoopPractice {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Investment Growth Tracker ---");
        System.out.println("Please enter your initial investment: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter annual interest rate: ");
        double rate = scanner.nextDouble(); // Faiz oranı

        System.out.print("Enter how many years you want to invest: ");
        int years = scanner.nextInt(); // Kaç yıl bekleyeceksin

        System.out.println("\nYearly Progress:");
        System.out.println("-----------------");

        for(int i = 1 ; i <= years ; i++){
         principal += (principal * rate); // rate  format ex: 0.10 for 10%
            System.out.println("Year " + i + ": Your money is now $" + String.format("%.2f", principal));
        }
        System.out.println("-----------------");
        System.out.println("Investment period completed.");

        scanner.close();
    }
}
