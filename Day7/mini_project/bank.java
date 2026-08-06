package Day7.mini_project;

import java.util.Scanner;

public class bank {

    static class BankAccount {

        int accountNumber;
        String accountHolder;
        double balance;

        void deposit(double amount) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        }

        void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("₹" + amount + " withdrawn successfully.");
            } else {
                System.out.println("Insufficient Balance!");
            }
        }

        void displayBalance() {
            System.out.println("\n----- Account Details -----");
            System.out.println("Account Number : " + accountNumber);
            System.out.println("Account Holder : " + accountHolder);
            System.out.println("Balance        : ₹" + balance);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount();

        // Initial Account Details
        account.accountNumber = 101;
        account.accountHolder = "Pradeep";
        account.balance = 5000;

        int choice;

        do {

            System.out.println("\n========== BANK MENU ==========");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter deposit amount: ");
                    double deposit = sc.nextDouble();
                    account.deposit(deposit);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = sc.nextDouble();
                    account.withdraw(withdraw);
                    break;

                case 3:
                    account.displayBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using our Bank.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}