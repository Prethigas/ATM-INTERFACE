import java.util.Scanner;

public class ATM1 {
    public static void main(String[] args) {
        int balance = 100000;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation you want to perform: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter money to be withdrawn: ");
                    int withdrawAmount = sc.nextInt();
                    if (withdrawAmount <= 0) {
                        System.out.println("Enter amount greater than zero");
                    } else if (balance >= withdrawAmount) {
                        balance -= withdrawAmount;
                        System.out.println("Please collect your money");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Enter money to be deposited: ");
                    int depositAmount = sc.nextInt();
                    if (depositAmount <= 0) {
                        System.out.println("Enter amount greater than zero");
                    } else {
                        balance += depositAmount;
                        System.out.println("Your money has been successfully deposited");
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Balance: " + balance);
                    System.out.println();
                    break;

                case 4:
                    sc.close();
                    System.out.println("Thank you for using our ATM!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
                    System.out.println();
            }
        }
    }
}
