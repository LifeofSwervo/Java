// @author: Clarence Thomas
// CLASS: Info 1521 WA
// ASSIGMENT: Assignment 1
// @version: September 18th, 2023
// RESOURCES:

// EXPLANATION:

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

        while (decision.equalsIgnoreCase("y"))
        {
            System.out.println("Enter the loan amount: ");
            float loanAmount = input.nextFloat(); // Parse Loan amount
            System.out.println("Enter the interest rate: ");
            float interestAmount = input.nextFloat(); // Parse interest rate
            //float roundedInterest = Math.round(interestAmount);

            double accruedInterest = loanAmount * interestAmount; // Calculate accrued interest
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            String loanAmountString = currency.format(loanAmount); // Translates loan amount to better format

            NumberFormat percent = NumberFormat.getPercentInstance();
            percent.setMaximumFractionDigits(3); // Sets minimum Interest Rate digits to be 3
            String interestRateString = percent.format(interestAmount); // Translates interest rate to percent

            String interestString = currency.format(accruedInterest); // Translates interest to better format

            // Output Loan info to user
            System.out.println("Loan Amount: " + loanAmountString);
            System.out.println("Interest Rate: " + interestRateString);
            System.out.println("Interest: " + interestString);

            System.out.println("Continue (y/n)? ");
            decision = input.next(); // Check if user wishes to continue
        }

        if (decision.equalsIgnoreCase("n")) // If user no longer wishes to continue
        {
            System.out.println("Have a great day, Goodbye! ");
        }
    }
}
