import java.util.Scanner;

public class
TempatureTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many days of temperature will you enter?: ");
        int days = scanner.nextInt();


        double[] temps = new double[days];
        double sum = 0;


        for (int i = 0; i < temps.length; i++) {
            System.out.print("Enter temperature for day " + (i + 1) + ": ");
            temps[i] = scanner.nextDouble();
            sum += temps[i];
        }


        double average = sum / temps.length;


        System.out.println("\n--- Temperature Report ---");
        System.out.println("Number of days tracked: " + temps.length);
        System.out.println("Average temperature: " + String.format("%.2f", average) + "°C");


        double maxTemp = temps[0];
        for (int i = 1; i < temps.length; i++) {
            if (temps[i] > maxTemp) {
                maxTemp = temps[i];
            }
        }
        System.out.println("Highest temperature: " + maxTemp + "°C");
    }
}