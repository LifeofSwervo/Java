// @author: Clarence Thomas
// CLASS: Info 1521 WA
// ASSIGMENT: Assignment 1
// @version: September 18th, 2023
/* RESOURCES: Utilized Examples in Chapter 2 of Murach's Java Programming, Also utilized Java Docs on BigDecimal,
 NumebrFormat, setMaximumFractionDigits and setScale */

/* EXPLANATION: This program is an Interest Calculator providing the interest, interest rate and loan amount after
being given the interest rate (in floating point) and loan amount. */

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class InterestCalculator
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Clarence's Interest Calculator");
        System.out.println(); // Blank line

        // Declare variables
        Scanner input = new Scanner(System.in);
        String decision = "y";

        // While user wishes to continue
        while (decision.equalsIgnoreCase("y"))
        {
            System.out.print("Enter the loan amount: ");
            float loanAmount = input.nextFloat(); // Parse Loan amount
            loanAmount = (float) Math.round(loanAmount * 100) / 100; // Round loan amount

            System.out.print("Enter the interest rate: ");
            float interestAmount = input.nextFloat(); // Parse interest rate

            float accruedInterest = loanAmount * interestAmount; // Calculate accrued interest
            accruedInterest = Math.round(accruedInterest * 100) / 100f; // Round

            NumberFormat currency = NumberFormat.getCurrencyInstance(); // Format number's to be currency
            NumberFormat percent = NumberFormat.getPercentInstance(); // Format number's to be percent

            percent.setMaximumFractionDigits(3); // Sets minimum Interest Rate digits to be 3

            BigDecimal interest = BigDecimal.valueOf(accruedInterest); // Convert accrued interest to BigDecimal for more accurate calculations.

            interest = interest.setScale(2, RoundingMode.HALF_UP); // Sets to 2 decimals and rounds up.

            String interestRateString = percent.format(interestAmount); // Translates interest rate to percent
            String loanAmountString = currency.format(loanAmount); // Translates loan amount to better format
            String interestString = currency.format(interest); // Translates interest to better format

            // Output Loan info to user
            System.out.println(); // Blank line
            System.out.println("Loan Amount: " + loanAmountString);
            System.out.println("Interest Rate: " + interestRateString);
            System.out.println("Interest: " + interestString);

            System.out.print("Continue (y/n)? ");

            decision = input.next(); // Check if user wishes to continue
        }

        if (decision.equalsIgnoreCase("n")) // If user no longer wishes to continue
        {
            System.out.println("Have a great day, Goodbye! ");
        }
    }
}