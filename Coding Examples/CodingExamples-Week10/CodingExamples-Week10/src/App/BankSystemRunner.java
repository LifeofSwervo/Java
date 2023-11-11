package App;

import java.util.Scanner;
import java.util.ArrayList;
import Accounts.*;

public class BankSystemRunner {
    public static void main(String[] args)
    {
        // set up some accounts

        ArrayList<BankAccount> accounts =  new ArrayList<BankAccount>();
        accounts.add(new CheckingAccount("Steve", "Rodgers", "123584", 100.0, 250.00));
        accounts.add(new CheckingAccount("Tony", "Stark", "458416", 250000.0, 5000.0));
        accounts.add(new SavingsAccount("Bruce", "Banner", "896231", 13674.32, 5000.0, .00125));

        Scanner input = new Scanner(System.in);
        int choice = 0;
        while (choice != 7) // 6 is my exit
        {
            System.out.println("***** Bank Account System *****");
            System.out.println("1. View Accounts");
            System.out.println("2. Add Account");
            System.out.println("3. Delete Account");
            System.out.println("4. Debit Account");
            System.out.println("5. Credit Account");
            System.out.println("6. Transaction Report");
            System.out.println("7. Exit");

            do {
                choice = getInt("Choice: ", input);
            } while (choice < 1 || choice > 7);

            switch(choice)
            {
                case 1:
                    printAccounts(accounts);
                    break;
                case 2:
                    addAccount(input, accounts);
                    break;
                case 3:
                    deleteAccount(input, accounts);
                    break;
                case 4:
                    debitAccount(input, accounts);
                    break;
                case 5:
                    creditAccount(input, accounts);
                    break;
                case 6:
                    transactionReport(input, accounts);
                    break;
                case 7:
                    System.out.println("System exitting...");
            }

        }
    }

    public static void printAccounts(ArrayList<BankAccount> array)
    {
        for (BankAccount ac : array)
        {
            ac.printAccount();
            System.out.println();
        }
    }

    public static void printAdminAccounts(ArrayList<BankAccount> array)
    {
        for (BankAccount ac : array)
        {
            ac.printAccount(true);
        }
        System.out.println();
    }

    public static void debitAccount(Scanner sc, ArrayList<BankAccount> array)
    {
        System.out.println("**** Debit Account ****");
        int debitIndex = searchAccountIndex(sc, "debit", array);

        double debitAmt = getDouble("Enter debit amount: ", sc);

        // perform debit
        array.get(debitIndex).debit(debitAmt);

    }

    public static void creditAccount(Scanner sc, ArrayList<BankAccount> array) {
        System.out.println("**** Credit Account ****");
        int creditIndex = searchAccountIndex(sc, "credit", array);

        double creditAmt = getDouble("Enter amount to credit: ", sc);

        // perform debit
        array.get(creditIndex).credit(creditAmt);
    }

    public static void addAccount(Scanner input, ArrayList<BankAccount> accounts)
    {
        System.out.println("**** Creating New Account ****");
        // pick account type to create
        System.out.println("1. Checking");
        System.out.println("2. Savings");
        int acctType = getInt("Choose account type: ", input);
        while (acctType < 1 || acctType > 2)
        {
            System.out.println("Error, invalid choice.");
            acctType = getInt("Choose account type: ", input);
        }

        // get all information needed for new account
        System.out.print("Enter first name: ");
        String firstName = input.next();
        System.out.print("Enter last name: ");
        String lastName = input.next();
        System.out.print("Enter account number: ");
        String accountNum = input.next();
        // data validation for double
        double balance = getDouble("Enter starting balance: ", input);

        while (balance < 0)
        {
            System.out.println("ERROR, balance can't be negative.");
            balance = getDouble("Enter starting balance: ", input);
        }

        // create new account
        BankAccount newAccount;
        switch(acctType){
            case 1: // checking account
                double withLimit = getDouble("Enter withdraw limit: ", input);
                newAccount = new CheckingAccount(firstName, lastName, accountNum, balance, withLimit);
                break;
            default: // savings account
                double minBalance = getDouble("Enter minimum balance: ", input);
                double rate = getDouble("Enter interest rate: ", input);
                newAccount = new SavingsAccount(firstName, lastName, accountNum, balance, minBalance, rate);
                break;
        }

        accounts.add(newAccount);

        System.out.println("Account created.\n");
    }

    public static void deleteAccount(Scanner input, ArrayList<BankAccount> accounts)
    {
        System.out.println("**** Deleting Account ****");
        // find the index in our list
        int deleteIndex = searchAccountIndex(input, "delete", accounts);

        // delete the account
        accounts.remove(deleteIndex);
        System.out.println("Account deleted.\n");

    }

    public static void transactionReport(Scanner input, ArrayList<BankAccount> accounts)
    {
        System.out.println("**** Transactions of Accounts ****");
        // find the index in our list
        int transactionIndex = searchAccountIndex(input, "transactions", accounts);

        // delete the account
        accounts.get(transactionIndex).printAccountTransactions();
        System.out.println("***** end of transaction report ******7.\n");
    }

    // helper method to search
    private static int searchAccountIndex(Scanner sc, String prompt, ArrayList<BankAccount> accounts)
    {
        printAdminAccounts(accounts);
        int index = -1;
        while (index == -1) {
            System.out.print("Enter account number to " + prompt + ": ");
            String searchAcct = sc.next();

            // search through the array
            for (int i = 0; i < accounts.size(); i++) {
                if (accounts.get(i).getAccountNumber().equals(searchAcct)) {
                    index = i; //saves the found index
                    break;
                }
            }
            if (index == -1)
            {
                System.out.println("Account not found, search again");
            }

        }
        return index;
    }

    private static int getInt(String prompt, Scanner sc){
        int value = 0;
        while (true)
        {
            System.out.print(prompt);
            if (sc.hasNextInt())
            {
                value = sc.nextInt();
                sc.nextLine();
                break;
            }
            else {
                System.out.println("Error, must enter a number.");
                sc.nextLine(); // clear input
            }
        }
        return value;
    }

    private static double getDouble(String prompt, Scanner sc){
        double value = 0;
        while (true)
        {
            System.out.print(prompt);
            if (sc.hasNextDouble())
            {
                value = sc.nextDouble();
                sc.nextLine();
                break;
            }
            else {
                System.out.println("Error, must enter a number.");
                sc.nextLine(); // clear input
            }
        }
        return value;
    }

}
