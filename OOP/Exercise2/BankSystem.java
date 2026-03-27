package OOP.Exercise2;

import java.util.ArrayList;
import java.util.Scanner;

public class BankSystem {
    static ArrayList<Account> accounts = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("\n\tWelcome to the Bank System!!");
            System.out.println("\t-----------------------------\n");
            System.out.println("Please choose an option:");
            System.out.println("1. Create an account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. View account details");
            System.out.println("5. Exit");

            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    depositMoney();
                    break;
                case 3:
                    withdrawMoney();
                    break;
                case 4:
                    viewAccountDetails();
                    break;
                case 5:
                    System.out.println("Exiting the system....!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void createAccount() {
        System.out.println("Enter your account number:");
        int accountNumber = Integer.parseInt(sc.nextLine());
        System.out.println("Enter your account name:");
        String accountName = sc.nextLine();
        System.out.println("Enter your initial deposit amount:");
        int amount = Integer.parseInt(sc.nextLine());
        accounts.add(new Account(accountNumber, accountName, amount));
        System.out.println("Account created successfully!");

    }
}
