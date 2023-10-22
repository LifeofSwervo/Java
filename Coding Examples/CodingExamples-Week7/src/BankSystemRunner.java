import java.util.Scanner;

public class BankSystemRunner {
    public static void main(String[] args)
    {
        // set up some accounts
        BankAccount[] accounts = {
                new BankAccount("Steve", "Rodgers", "123584", 100.0, "Checking"),
                new BankAccount("Tony", "Stark", "458416", 250000.0, "Checking"),
                new BankAccount("Bruce", "Banner", "896231", 13674.32,"Savings"),
        };

        Scanner input = new Scanner(System.in);
        int choice = 0;
        while (choice != 6) // 6 is my exit
        {
            System.out.println("***** Bank Account System *****");
            System.out.println("1. View Accounts");
            System.out.println("2. Add Account");
            System.out.println("3. Delete Account");
            System.out.println("4. Debit Account");
            System.out.println("5. Credit Account");
            System.out.println("6. Exit");

            do {
                choice = getInt("Choice: ", input);
            } while (choice < 1 || choice > 6);

            switch(choice)
            {
                case 1:
                    printAccounts(accounts);
                    break;
                case 2:
                    System.out.println("ADD FUNCTION");
                    break;
                case 3:
                    System.out.println("DELETE FUNCTION");
                    break;
                case 4:
                    debitAccount(input, accounts);
                    break;
                case 5:
                    creditAccount(input, accounts);
                    break;
                case 6:
                    System.out.println("System exitting...");
            }

        }
    }

    public static void printAccounts(BankAccount[] array)
    {
        for (BankAccount ac : array)
        {
            ac.printAccount();
            System.out.println();
        }
    }

    public static void printAdminAccounts(BankAccount[] array)
    {
        for (BankAccount ac : array)
        {
            ac.printAccount(true);
        }
        System.out.println();
    }

    public static void debitAccount(Scanner sc, BankAccount[] array)
    {
        int debitIndex = searchAccountIndex(sc, "debit", array);

        double debitAmt = getDouble("Enter debit amount: ", sc);

        // perform debit
        array[debitIndex].debit(debitAmt);

    }

    public static void creditAccount(Scanner sc, BankAccount[] array) {
        int creditIndex = searchAccountIndex(sc, "credit", array);

        double creditAmt = getDouble("Enter amount to credit: ", sc);

        // perform debit
        array[creditIndex].credit(creditAmt);
    }

    // helper method to search
    private static int searchAccountIndex(Scanner sc, String prompt, BankAccount[] accounts)
    {
        printAdminAccounts(accounts);
        int index = -1;
        while (index == -1) {
            System.out.print("Enter account number to " + prompt + ": ");
            String searchAcct = sc.next();

            // search through the array
            for (int i = 0; i < accounts.length; i++) {
                if (accounts[i].getAccountNumber().equals(searchAcct)) {
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
