import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the word: ");
        String word = input.nextLine();

        String originalWord = word.toLowerCase();
        String reverse = "";

        for (int i = originalWord.length() - 1; i >= 0; i--) {
            reverse = reverse + originalWord.charAt(i);
        }

        System.out.println("The opposite of the word: " + reverse);

        if (originalWord.equals(reverse)) {
            System.out.println("Great! This is a palindrome.");
        } else {
            System.out.println("Unfortunately, this is not a palindrome.");
        }
    }
}