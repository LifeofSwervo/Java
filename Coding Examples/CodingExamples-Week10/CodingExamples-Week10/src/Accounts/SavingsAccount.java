package Accounts;

import static Blueprints.AccountType.*;

/**
 * This class creates a savings account in the bank system.
 *
 * @author Lucas Hartman
 * @version 1.0.1
 */
public non-sealed class SavingsAccount extends BankAccount {

    private double minimumBalance;
    private double interestRate;

    /**
     * This constructor takes on all the parameters to set up a full savings account
     * @param fn a String of the first name
     * @param ln a String of the last name
     * @param an a String of the account number
     * @param b a double of the starting balance
     * @param balance a double of the minimum balance required for the savings account to have
     * @param rate a double for the interest rate to earn off the balance
     */
    public SavingsAccount(String fn, String ln, String an, double b, double balance, double rate)
    {
        super(fn, ln, an, b, SAVINGS);
        minimumBalance = balance;
        interestRate = rate;
    }

    /**
     * This constructor takes on the first and last name and account number to set up the account
     * It sets the balance to 0, minimum required balance to 300 and interest rate to .1%
     * @param fn a String for first name
     * @param ln a String for last name
     * @param an a String for account number
     */
    public SavingsAccount(String fn, String ln, String an)
    {
        super(fn, ln, an, SAVINGS);
        minimumBalance = 300;
        interestRate = .001;
    }

    /**
     * This returns the minimum balance required for the savings accoung
     * @return a double for the minimum balance
     */
    public double getMinimumBalance() {
        return minimumBalance;
    }

    /**
     * This will set a new minimum balance that is sent.
     * @param minimumBalance a double for the new minimum balance
     */
    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    /**
     * This will return the interest rate of the savings account
     * @return a double for the interest rate on the account
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * This will set a new interest rate
     * @param interestRate a double value to set for the interest rate.
     */
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    /**
     * This method checks to make sure the current balance is above the minimum
     * required balance. If it is below there will be $5 charge on the account.
     * @return a boolean value of True if above the minimum balance, false otherwise
     */
    public boolean checkMinimumBalance() {
        if (super.getBalance() < minimumBalance)
        {
            System.out.println("Minimum balance not met, -$5 charge");
            super.debit(5);
            return false;
        }
        return true;
    }

    /**
     * This method will apply the interest earned on the account by
     * multiplying balance by interest and creditting to the account.
     */
    @Override
    public void applyMonthlyInterest()
    {
        double accrued = (double)Math.round(interestRate * super.getBalance() * 100) / 100;
        super.credit(accrued);
    }

    /**
     * This method will print the savings account
     * @return a String of the savings account
     */
    @Override
    public String toString()
    {
        return super.toString() + "\nMinimum Balance: " +
                currency.format(minimumBalance) + "\nInterest Rate: " + percent.format(interestRate);
    }
}
