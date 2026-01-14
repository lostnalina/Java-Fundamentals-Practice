import java.util.Scanner;

public class MoveZeroes {
    public static void main(String[] arqs) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the numbers:");
        int number = scanner.nextInt();
        int[] array = new int[number];
        int pointer= 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            if (array[i] != 0) {
                array[pointer] = array[i];
                pointer++;
            }
        }
            for (int i = pointer; i < array.length; i++) {
                array[i] = 0;
            }

        }
    }

