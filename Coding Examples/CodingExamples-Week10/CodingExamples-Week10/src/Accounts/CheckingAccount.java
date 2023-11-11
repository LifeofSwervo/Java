package Accounts;

import static Blueprints.AccountType.*;

/**
 * This class creates a checking account with a limit for spending from the balance.
 *
 * @author Lucas Hartman
 * @version 1.0.1
 */
public final class CheckingAccount extends BankAccount {
    private double withdrawLimit;

    /**
     * Constructor that takes on all parameters to make a new checking account
     * @param fn a String for first name
     * @param ln a String for last name
     * @param an a String for account number
     * @param b a double for balance
     * @param limit a double for the spending/withdraw limit
     */
    public CheckingAccount(String fn, String ln, String an, double b, double limit)
    {
        super(fn, ln, an, b, CHECKING);
        withdrawLimit = limit;
    }

    /**
     * Constructor that takes on first name, last name and account number.
     * Sets the balance to 0 and the withdraws limit to 200
     * @param fn a String for the first name
     * @param ln a String for the last name
     * @param an a String for the account number
     */
    public CheckingAccount(String fn, String ln, String an)
    {
        super(fn, ln, an, CHECKING);
        withdrawLimit = 200;
    }

    /**
     * Returns the withdrawl limit
     * @return a double of the withdrawl limit
     */
    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    /**
     * Sets the new withdrawl limit to sent value
     * @param withdrawLimit a double to update the withdrawl limit
     */
    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    /**
     * This method overrides from the Bank Account for debit to which we need to
     * make sure that the amount to take out of the balance is less than the limit
     * @param amt a double to take from the account balance
     * @return a boolean value of True if the debit was successful, false otherwise
     */
    @Override
    public boolean debit(double amt) {
        if (amt <= withdrawLimit)
        {
            return super.debit(amt);
        }
        else
        {
            System.out.println("Sorry, over your withdraw limit.");
            return false;
        }
    }

    /**
     * Prints out the account information.
     * @return a String prinout of the account
     */
    @Override
    public String toString()
    {
        return super.toString() + "\nWithdraw Limit: " +
                currency.format(withdrawLimit);
    }

    /**
     * This does nothing as we can't apply any interest to a savings account
     */
    @Override
    public void applyMonthlyInterest() {} // does nothing since we are not savings
}
