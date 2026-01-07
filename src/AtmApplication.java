import  java.util.Scanner;
public class AtmApplication {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int correctPin= 45837 ;
        int attempts = 3;
        boolean isAuthorized = false ;
        double balance = 1000.0;
        boolean isRunning = true;
        System.out.println("--- Welcome to the Global Bank ---");

        while (!isAuthorized && attempts > 0){

            System.out.print("Please enter your password (" +attempts + " attempts left): ");
            int enteredPin = scanner.nextInt();
            if(enteredPin== correctPin){
                System.out.println("Login successful! Welcome to your account.");
                isAuthorized = true;
            }
            else {
             attempts-- ;
            if(attempts>0){
            System.out.println("Wrong PIN. Please try again.");
            }
            else{
                System.out.println("Your account is locked due to 3 failed attempts.\"");
                }
                }
           }
        if(isAuthorized){
            while(isRunning){
                System.out.println("\n--- MAIN MENU ---");
                System.out.println("1. View Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Investment Calculator");
                System.out.println("5. Exit");
                System.out.print("Select an option: ");
                int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Your balance: "+balance+ "$");
                    break;

                case 2:
                    System.out.println("Amount to deposit:");
                    double deposit = scanner.nextDouble();
                    balance += deposit;
                    System.out.println("New balance: " + balance + " $");
                    break;

                case 3:
                    System.out.print("Amount to withdraw: ");
                    double withdraw = scanner.nextDouble();

                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Success! You have withdrawn " + withdraw + " $");
                    }
                    else {
                        System.out.println("Insufficient funds! Your balance is only " + balance + " $");
                    }

                    System.out.println("Current balance: " + balance + " $");
                    break;

                case 4:
                    System.out.println("--- Investment Growth Simulator ---");
                    System.out.print("Enter annual interest rate (e.g., 0.10 for 10%): ");
                    double rate = scanner.nextDouble();

                    System.out.print("How many years do you want to calculate for?: ");
                    int years = scanner.nextInt();

                    double tempBalance = balance;
                    for (int i = 1; i <= years; i++) {
                        tempBalance += (tempBalance * rate);
                        System.out.println("Year " + i + ": Your projected balance is " + String.format("%.2f", tempBalance) + " $");
                    }
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    isRunning = false; // Döngüyü kırar ve programı bitirir
                    break;
                default:
                    System.out.println("Invalid choice!");
            }


            }



        }


    }
}
