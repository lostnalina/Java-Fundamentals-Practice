import  java.util.Scanner;
public class SwitchCasePractice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = 1000;

        System.out.println("1 - View Balance");
        System.out.println("2 - Deposit Money");
        System.out.println("3 - Withdraw Money");
        System.out.println("4 - Exit");
        System.out.print("Please select an option: ");

        int  selection = input.nextInt();

        switch (selection){
            case 1:
                System.out.println("Current balance: $" + balance);
                break; // Exit the switch block
            case 2:
                System.out.print("Enter the amount to deposit: ");
                int depositAmount= input.nextInt();
                balance += depositAmount;
                System.out.println("New balance: $" + balance);
                break;
            case 3:
                System.out.print("Enter the amount to withdraw: ");
                int withdrawAmount = input.nextInt();
                if(balance < withdrawAmount){
                    System.out.println("Insufficient funds!");
                }
                else{
                    balance -= withdrawAmount;
                    System.out.println("Remaining balance: $"+balance);
                     }
                break;
            case 4:
                System.out.println("Safe exit successful. Have a nice day!");
                break;
        }
        input.close();
    }




}

