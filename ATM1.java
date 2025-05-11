import java.util.Scanner;

public class atm {
    static int balance = 100000;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            showMenu();
            int choice = getUserChoice();

            switch (choice) {
                case 1: withdraw(); break;
                case 2: deposit(); break;
                case 3: checkBalance(); break;
                case 4: exitATM(); break;
                default: System.out.println("Invalid choice. Please try again.\n");
            }
        }
    }

    static void showMenu() {
        System.out.println("Automated Teller Machine");
        System.out.println("Choose 1 for Withdraw");
        System.out.println("Choose 2 for Deposit");
        System.out.println("Choose 3 for Check Balance");
        System.out.println("Choose 4 for EXIT");
        System.out.print("Choose the operation you want to perform: ");
    }

    static int getUserChoice() {
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            sc.next(); // consume invalid input
        }
        return sc.nextInt();
    }

    static void withdraw() {
        System.out.print("Enter money to be withdrawn: ");
        int amount = sc.nextInt();
        if (amount <= 0) {
            System.out.println("Enter amount greater than zero\n");
        } else if (balance >= amount) {
            balance -= amount;
            System.out.println("Please collect your money\n");
        } else {
            System.out.println("Insufficient Balance\n");
        }
    }

    static void deposit() {
        System.out.print("Enter money to be deposited: ");
        int amount = sc.nextInt();
        if (amount <= 0) {
            System.out.println("Enter amount greater than zero\n");
        } else {
            balance += amount;
            System.out.println("Your money has been successfully deposited\n");
        }
    }

    static void checkBalance() {
        System.out.println("Balance: " + balance + "\n");
    }

    static void exitATM() {
        sc.close();
        System.out.println("Thank you for using our ATM!");
        System.exit(0);
    }
}
