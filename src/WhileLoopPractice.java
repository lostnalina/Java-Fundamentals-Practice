import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int correctPin = 1234;
        int attempts = 3;
        boolean isAuthorized = false;

        System.out.println("--- Welcome to the Global Bank ---");

        while (!isAuthorized && attempts > 0) {
            System.out.print("Please enter your PIN (" + attempts + " attempts left): ");
            int enteredPin = scanner.nextInt();

            if (enteredPin == correctPin) {
                System.out.println("Login successful! Welcome to your account.");
                isAuthorized = true;
            } else {
                attempts--;
                if (attempts > 0) {
                    System.out.println("Wrong PIN. Please try again.");
                } else {
                    System.out.println("Your account is locked due to 3 failed attempts.");
                }
            }
        }

        scanner.close();
    }
}