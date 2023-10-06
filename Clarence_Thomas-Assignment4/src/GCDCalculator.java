// @author: Clarence Thomas
// CLASS: Info 1521 WA
// ASSIGMENT: Assignment 4
// @version: October 2nd, 2023
/* RESOURCES: Utilized example provided in assignment rubric page */

/* EXPLANATION: This program finds the Greatest Common Denominator out of the numbers given */

import java.util.Scanner;

public class GCDCalculator
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Clarence's Greatest Common Denominator Calculator" + "\n");

        // Declare variables
        Scanner input = new Scanner(System.in);
        String decision = "y";

        // While user wishes to continue
        while (decision.equalsIgnoreCase("y"))
        {
            System.out.print("Enter the first number: ");
            int firstNumberInput = input.nextInt(); // Get users 1st number

            System.out.print("Enter the second number: ");
            int secondNumberInput = input.nextInt(); // Get users 2nd number

            if (firstNumberInput >= secondNumberInput) // If 1st number is larger than or equal to 2nd
            {
                //Calculation
                while (firstNumberInput != 0) // While 1st number is not 0
                {
                    while (secondNumberInput >= firstNumberInput) // Loop until 2nd number is no longer more than or equal to 1st
                    {
                        secondNumberInput -= firstNumberInput; // Subtract 1st number from 2nd
                    }
                    int temp = secondNumberInput; // initialize a temp equaling the new-found 2nd number (from loop)
                    secondNumberInput = firstNumberInput; // Set 2nd number to be equal to 1st
                    firstNumberInput = temp; // Set the 1st number to be the value stored in the temporary variable
                }
                System.out.println(secondNumberInput);
            } else // If 2nd number is larger than 1st
            {
                while (secondNumberInput != 0) // While 2nd number is not 0
                {
                    while (firstNumberInput >= secondNumberInput) // Loop until 1st number is no longer more than or equal to 2nd
                    {
                        firstNumberInput -= secondNumberInput; // Subtract 2nd number from 1st
                    }
                    int temp = firstNumberInput; // initialize a temp equaling the new-found 1st number (from loop)
                    firstNumberInput = secondNumberInput; // Set 1st number to be equal to 2nd
                    secondNumberInput = temp; // Set the 2nd number to be the value stored in the temporary variable
                }
                System.out.println(firstNumberInput);
            }

            System.out.print("Continue (y/n)? ");
            decision = input.next(); // Check if user wishes to continue
        }
        // If user no longer wishes to continue
        if (decision.equalsIgnoreCase("n"))
        {
            System.out.println("Have a great day, Goodbye! ");
        }
    }
}
