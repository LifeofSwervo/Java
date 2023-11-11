package Blueprints;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * This holds the transaction information for each time something happens on a bank account
 * @author Lucas Hartman
 * @version 1.0.0
 */
public class Transaction {
    private String dateTime;
    private String transaction;
    private boolean credit;
    private double amount;
    private static LocalDateTime timeObject;
    private static DateTimeFormatter datetimeFormat = DateTimeFormatter.ofPattern("MM-dd-yyyy - HH:mm:ss");

    /**
     * This is the main constructor that takes all parameters to create a transaction
     * Time stamps for the date and time.
     * @param t a String for the transaction information
     * @param cd a boolean for True if it is a credit or false if it is a debit
     * @param amt a double for the amount on the transaction
     */
    public Transaction(String t, boolean cd, double amt)
    {
        timeObject = LocalDateTime.now();
        dateTime = timeObject.format(datetimeFormat);
        transaction = t;
        credit = cd;
        amount = amt;
    }

    /**
     * Constructor that doesn't have a transaction description but still has
     * a whether it is credit/debit and the amount taken.
     * @param cd a boolean for True if credit and False if a debit
     * @param amt a double for the amount to credit/debit
     */
    public Transaction(boolean cd, double amt)
    {
        this("", cd, amt);
    }

    /**
     * This method returns the transaction description
     * @return a String of the transaction
     */
    public String getTransaction() {
        return transaction;
    }

    /**
     * This returns the date and time of the transaction
     * @return a String of the date & time
     */
    public String getDateTime() {
        return dateTime;
    }

    /**
     * This returns whether it is a credit for debit transaction
     * @return a boolean value, True if credit, False if debit
     */
    public boolean getCredit()
    {
        return credit;
    }

    /**
     * This returns the amount creditted/debitted from the transaction
     * @return a double for the transaction amount
     */
    public double getAmount()
    {
        return amount;
    }

    /**
     * This sets the transaction description
     * @param t a String for the transaction data
     */
    public void setTransaction(String t)
    {
        transaction = t;
    }

    /**
     * This sets the amount of the transaction
     * @param amt a double for the amount on the transaction
     */
    public void setAmount(double amt)
    {
        amount = amt;
    }

    /**
     * This sets whether the transaction is credit or debit
     * @param c a boolean of True for credit or False for debit
     */
    public void setCredit (boolean c)
    {
        credit = c;
    }

    /**
     * Prints out the transaction information.
     */
    public void printTransaction()
    {
        System.out.println(toString());
    }

    /**
     * Sends a String of the transaction information
     * @return a String of the transaction
     */
    @Override
    public String toString()
    {
        String debitCredit = "Debit";
        if (credit){
            debitCredit = "Credit";
        }

        return dateTime + "   " + transaction + "    " + debitCredit + "    " + amount;
    }




}
