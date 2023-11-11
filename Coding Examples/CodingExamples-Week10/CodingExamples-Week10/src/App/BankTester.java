package App;

import Accounts.*;

public class BankTester {
    public static void main(String[] args)
    {
        System.out.println("Account Count: " + BankAccount.getAccountCount());

        BankAccount b1 = new CheckingAccount("Lucas", "Hartman", "567890", 100, 250);
        BankAccount b3 = new SavingsAccount("Tony", "Stark", "78989", 23653, 3000, .0256);
        //BankAccount b4 = new CheckingAccount(b1);

        //b4.setFirstName("Michael");

        System.out.println("Account Count: " + BankAccount.getAccountCount());

        System.out.println(b1.getFirstName() + "   :  Balance: " + b1.getFormattedBalance());
        System.out.println(b3.getFirstName() + "   :  Balance: " + b3.getFormattedBalance());
        //System.out.println(b4.getFirstName() + "   :  Balance: " + b4.getFormattedBalance());

        b1.debit(500);
        b1.credit(500);
        b1.debit(150);



        System.out.println(b1.getFirstName() + "   :  Balance: " + b1.getFormattedBalance());

        b1.print();
        b3.print();
        //System.out.println(b4);

    }
}
