import java.util.Scanner;
public class ChangeCalculator
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Change Calculator\n");

        String cont = "y";

        while(!cont.equalsIgnoreCase("n"))
        {
            System.out.print("Enter number of cents(0-99): ");
            int cents = input.nextInt();

            //calculate quarters
            int quarters = cents / 25;
            cents %= 25; // get me the remainder after quarters

            // calculate dimes
            int dimes = cents / 10;
            cents %= 10; // get me the remainder after dimes

            // calculate nickels
            int nickels = cents / 5;
            cents %= 5;

            // calculates pennies
            int pennies = cents;

            System.out.println("Quarters: " + quarters);
            System.out.println("Dimes   : " + dimes);
            System.out.println("Nickels : " + nickels);
            System.out.println("Pennies : " + pennies);

            System.out.print("\nContinue? (y/n): ");
            cont = input.next();
        }

    }
}

