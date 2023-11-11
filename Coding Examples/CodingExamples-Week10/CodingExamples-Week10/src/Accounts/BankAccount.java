package Accounts;
import Blueprints.AccountType;
import static Blueprints.AccountType.*;
import Blueprints.Printable;
import Blueprints.Transaction;

import java.util.ArrayList;

/**
 * This class is the base class for all Bank Accounts
 *
 * @author Lucas Hartman
 * @version 1.0.3
 */
public abstract sealed class BankAccount implements Printable permits CheckingAccount, SavingsAccount {
    private String firstName;
    private String lastName;
    private String accountNumber;
    private double balance;
    private AccountType accountType;
    private ArrayList<Transaction> transactions;

    private static final String ROUTING_NUMBER = "10069536";
    private static int count = 0;

    /** Main constructor that sets up full account with the send information
     *
     * @param fn a String value for first name
     * @param ln a String value for last name
     * @param an a String value for account number
     * @param b a double value for the balance
     * @param at an AccountType for the account type
     */
    public BankAccount(String fn, String ln, String an, double b, AccountType at)
    {
        firstName = fn;
        lastName = ln;
        accountNumber = an;
        balance = b;
        count++;
        accountType = at;
        transactions = new ArrayList<Transaction>();
        transactions.add(new Transaction("ACCOUNT CREATED", true, balance));
        Printable.percent.setMinimumFractionDigits(3);
        Printable.percent.setMaximumFractionDigits(5);
    }

    /**
     * This constructor doesn't have a balance sent to it, so defaults to 0.0
     * @param fn a String value for first name
     * @param ln a String value for last name
     * @param an a String value for account number
     * @param at an AccountType value for the account type
     */
    public BankAccount(String fn, String ln, String an, AccountType at)
    {
        this(fn, ln, an, 0, at);
    }

    /**
     * This constructor copies itself from another BankAccount object sent to it.
     * @param ba a BankAccount object to copy from.
     */
    public BankAccount(BankAccount ba)
    {
        firstName = ba.getFirstName();
        lastName = ba.getLastName();
        accountNumber = ba.getAccountNumber();
        balance = ba.getBalance();
        accountType = ba.getAccountType();

        count++;
        transactions = ba.getAllTransactions();
        Printable.percent.setMinimumFractionDigits(3);
        Printable.percent.setMaximumFractionDigits(5);
    }

    /**
     * Default constructor, sets everything to blank and a Checking Account
     */
    public BankAccount()
    {
        this("", "", "", CHECKING);
    }

    /**
     * This returns the Bank Account owner's first name
     * @return a String value of the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This returns the Bank Account owner's last name
     * @return a String value of the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This returns the Bank Account account number
     * @return a String value of the account number
     */
    public String getAccountNumber(){
        return accountNumber;
    }

    /**
     * This returns the Bank Account's balance
     * @return a double value of the BankAccount balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Returns the array list of transaction
     * @return an ArrayList of Transactions to view
     */
    public ArrayList<Transaction> getAllTransactions()
    {
        return transactions;
    }

    /**
     * This changes the first name
     * @param firstName the first name to update
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * This changes the last name
     * @param lastName the last name to update
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * This changes the account number
     * @param accountNumber the account number to update
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * This updates the balance of the account
     * @param balance the balance to update
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * This updates the account type of the account
     * @param at the AccountType to update
     */
    public void setAccountType(AccountType at)
    {
        accountType = at;
    }

    /**
     * This returns the AccountType of the account
     * @return the AccountType of the account
     */
    public AccountType getAccountType()
    {
        return accountType;
    }

    /**
     * This will take money out of the account as long as the funds are above the sent amount.
     * @param amt a double to take from the account balance
     * @return true if the debit was successful, false otherwise
     */
    public boolean debit(double amt) {
        if(balance > amt)
        {
            balance -= amt;
            transactions.add(new Transaction("Cash Withdraw", false, amt));
            return true;
        }
        System.out.println("Sorry, not enough funds to use.");
        return false;
    }

    /**
     * This will add money into the balance as long as it isn't negative
     * @param amt the amount to add to the balance
     */
    public void credit(double amt) {
        if (amt > 0) {
            balance += amt;
            transactions.add(new Transaction("Deposit", true, amt));
        }
        else {
            System.out.println("Error, can't credit a negative value to account.");
        }
    }

    /**
     * This will return the routing number for the bank
     * @return a String value of the routing number
     */
    public static String getRoutingNumber()
    {
        return ROUTING_NUMBER;
    }

    /**
     * This will give the amount of bank accounts in the system.
     * @return an int value of the account counts
     */
    public static int getAccountCount()
    {
        return count;
    }

    /**
     * This formats the current account's balance using the currency formatter.
     * @return a String of the balance formatted in currency
     */
    public String getFormattedBalance()
    {
        return Printable.currency.format(balance);
    }

    /**
     * This prints all transaction of the account
     */
    public void printAccountTransactions() {
        System.out.println("**** Transactions history for " + firstName + " " + lastName + " ****");
        for (Transaction transaction : transactions)
        {
            transaction.printTransaction();
        }
    }

    /**
     * This returns a formatted version of the account information
     * @return a String of the account
     */
    @Override
    public String toString()
    {
        return "Name :" + firstName + " " + lastName +
                "\nBalance :" + getFormattedBalance() +
                "\nType: " + accountType.toString();
    }

    /**
     * Calls on the toString() to print out the account
     */
    public void printAccount()
    {
        System.out.println(this.toString());
    }

    /**
     * Calls the printAccount()
     */
    @Override
    public void print()
    {
        printAccount();
    }

    /**
     * This will print account numbers with names for an administration view.
     * True must be sent for this to work.
     * @param admin a boolean value to print or not.
     */
    public void printAccount(boolean admin)
    {
        if (admin)
        {
            System.out.println(accountNumber + " - " + firstName + " " + lastName + " - " + balance);
        }
    }

    /**
     * This method will compare account numbers to make sure they are the same account
     * @param o an Object to compare this one to
     * @return True if the accounts are the same, false otherwise
     */
    @Override
    public boolean equals(Object o)
    {
        if (o instanceof BankAccount ba)
        {
            return accountNumber.equals(ba.getAccountNumber());
        }
        return false;
    }

    /**
     * This method hands monthly interest applying on sub classes
     */
    public abstract void applyMonthlyInterest();
}
