import java.util.Scanner;

public class TreasureHunter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] treasures = {12, 45, 7, 23, 56, 89, 34};
        boolean isFound = false;
        int foundIndex = -1;

        System.out.print("Enter the gold amount you're looking for: ");
        int target = input.nextInt();

        for (int i = 0; i < treasures.length; i++) {
            if (treasures[i] == target) {
                isFound = true;
                foundIndex = i;
                break;
            }
        }
        if (isFound) {
            System.out.println("Success! Found " + target + " gold at box number " + (foundIndex + 1));
        } else {
            System.out.println("The treasure is not in these boxes.");
        }
    }
}
