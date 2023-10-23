import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {
    private String dateTime;
    private String transaction;
    private boolean credit;
    private double amount;
    private static LocalDateTime timeObject;
    private static DateTimeFormatter datetimeFormat = DateTimeFormatter.ofPattern("MM-dd-yyyy - HH:mm:ss");

    public Transaction(String t, boolean cd, double amt)
    {
        timeObject = LocalDateTime.now();
        dateTime = timeObject.format(datetimeFormat);
        transaction = t;
        credit = cd;
        amount = amt;
    }
    public Transaction(boolean cd, double amt)
    {
        this("", cd, amt);
    }

    public String getTransaction() {
        return transaction;
    }
    public String getDateTime() {
        return dateTime;
    }

    public boolean getCredit()
    {
        return credit;
    }

    public double getAmount()
    {
        return amount;
    }

    public void setTransaction(String t)
    {
        transaction = t;
    }

    public void setAmount(double amt)
    {
        amount = amt;
    }

    public void setCredit (boolean c)
    {
        credit = c;
    }

    public void printTransaction()
    {
        String debitCredit = "Debit";
        if (credit){
            debitCredit = "Credit";
        }
        System.out.println(dateTime + "   " + transaction + "    " + debitCredit + "    " + amount);
    }




}
