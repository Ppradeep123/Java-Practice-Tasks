package Day10.mini_project;

import java.util.Scanner;

public class atm {

    // Custom Exception
    static class InvalidAmount extends Exception {
        InvalidAmount(String message) {
            super(message);
        }
    }

    // Bank Class
    static class Bank {
        int balance = 0;

        // Deposit
        void deposit(int amount) {
            if (amount <= 0) {
                System.out.println("Please enter a valid amount.");
                return;
            }

            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        }

        // Withdraw
        void withdraw(int amount) throws InvalidAmount {
            if (amount <= 0) {
                throw new InvalidAmount("Withdrawal amount must be greater than 0.");
            }

            if (amount > balance) {
                throw new InvalidAmount("Insufficient balance.");
            }

            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        }

        // Check Balance
        void checkBalance() {
            System.out.println("Current Balance: ₹" + balance);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bank b1 = new Bank();

        int choice;

        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter amount to deposit: ");
                    int deposit = sc.nextInt();
                    b1.deposit(deposit);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    int withdraw = sc.nextInt();

                    try {
                        b1.withdraw(withdraw);
                    } catch (InvalidAmount e) {
                        System.out.println("Error: " + e.getMessage());
                    }

                    break;

                case 3:
                    b1.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}