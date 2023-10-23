public class BankTester {
    public static void main(String[] args)
    {
        System.out.println("Account Count: " + BankAccount.getAccountCount());

        BankAccount b1 = new BankAccount("Lucas", "Hartman", "567890", 100, "Checking");
        BankAccount b2 = new BankAccount();
        BankAccount b3 = new BankAccount("Tony", "Stark", "78989", "Savings");
        BankAccount b4 = new BankAccount(b1);

        b4.setFirstName("Michael");

        System.out.println("Account Count: " + BankAccount.getAccountCount());

        System.out.println(b1.getFirstName() + "   :  Balance: " + b1.getFormattedBalance());
        System.out.println(b3.getFirstName() + "   :  Balance: " + b3.getFormattedBalance());
        System.out.println(b4.getFirstName() + "   :  Balance: " + b4.getFormattedBalance());

        b1.debit(102);
        b1.credit(500);
        b1.debit(150);
        b2.credit(-50);



        System.out.println(b1.getFirstName() + "   :  Balance: " + b1.getFormattedBalance());

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

    }
}
