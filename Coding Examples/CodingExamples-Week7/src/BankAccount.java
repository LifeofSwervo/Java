import java.text.NumberFormat;

public class BankAccount {
    private String firstName;
    private String lastName;
    private String accountNumber;
    private double balance;
    private String type;
    private static final String ROUTING_NUMBER = "10069536";
    private static int count = 0;
    private NumberFormat currency = NumberFormat.getCurrencyInstance();

    // main constructor that sets up full account
    public BankAccount(String fn, String ln, String an, double b, String t)
    {
        firstName = fn;
        lastName = ln;
        accountNumber = an;
        balance = b;
        type = t;
        count++;
    }
    //constructor with no balance
    public BankAccount(String fn, String ln, String an, String t)
    {
        this(fn, ln, an, 0, t);
    }
    // copy constructor
    public BankAccount(BankAccount ba)
    {
        firstName = ba.getFirstName();
        lastName = ba.getLastName();
        accountNumber = ba.getAccountNumber();
        balance = ba.getBalance();
        type = ba.getAccountType();
        count++;
    }

    // default constructor
    public BankAccount()
    {
        this("", "", "", 0, "Checking");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountType() {
        return type;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountType(String type) {
        this.type = type;
    }

    public boolean debit(double amt) {
        if(balance > amt)
        {
            balance -= amt;
            return true;
        }
        System.out.println("Sorry, not enough funds to use.");
        return false;
    }

    public void credit(double amt) {
        if (amt > 0) {
            balance += amt;
        }
        else {
            System.out.println("Error, can't credit a negative value to account.");
        }
    }

    public static String getRoutingNumber()
    {
        return ROUTING_NUMBER;
    }

    public static int getAccountCount()
    {
        return count;
    }

    public String getFormattedBalance()
    {
        return currency.format(balance);
    }

    public void printAccount()
    {
        System.out.println("Name :" + firstName + " " + lastName);
        System.out.println("Balance :" + getFormattedBalance());
        System.out.println("Type: " + type);
    }

    public void printAccount(boolean admin)
    {
        if (admin)
        {
            System.out.println(accountNumber + " - " + firstName + " " + lastName + " - " + balance);
        }
    }


}
