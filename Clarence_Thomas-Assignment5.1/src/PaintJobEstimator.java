// @author: Clarence Thomas
// CLASS: Info 1521 WA
// ASSIGMENT: Assignment 5.1
// @version: October 9th, 2023
/* RESOURCES: Referenced examples provided in assignment, referenced book */

/* EXPLANATION: This is app estimating the details regarding a paint job for "Happy Accidents Paint Company". */

import java.util.Scanner;
import java.text.NumberFormat;

// This is the starter file for Assignment 5 in INFO 1521 Java 1.
// Modify this, add your header and comments as needed for the file to be understood

public class PaintJobEstimator
{
    public static void main(String[] args)
    {
        // set up all the helper objects
        Scanner input = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();


        //Main Program Start
        System.out.println("Welcome to the Happy Accidents Paint Company Estimator\n");

        String cont = "y"; // prime input for looping
        while (cont.equalsIgnoreCase("y"))
        {
            // get input for calculations
            double paintSquareFootage = getDouble(input, "Enter paint square footage: ");
            double gallonPaintCost = getDouble(input, "Enter cost of paint (per gallon): ");


            // calculate paint, labor, and costs associated with the job
            int gallonsOfPaint = calculateGallonsPaint(paintSquareFootage); // Calculates gallons of paint as an integer

            int hoursOfLabor = calculateLabor(paintSquareFootage);  // Calculates labor, returns as an integer

            double totalPaintCost = calculatePaintCost(gallonsOfPaint, gallonPaintCost); // Calculates cost of paint

            double laborCharges = calculateLaborCharges(hoursOfLabor); // Calculates labor price

            double totalJob = laborCharges + totalPaintCost; // Calculates total cost of job


            // Output the results
            System.out.println("Gallons of Paint Required : " + gallonsOfPaint + " gallons");
            System.out.println("Hours of Labor            : " + hoursOfLabor + " hours");
            System.out.println("Cost of Paint             : " + currency.format(totalPaintCost));
            System.out.println("Labor Charges             : " + currency.format(laborCharges));
            System.out.println("\nTotal Cost of the Job     : " + currency.format(totalJob));


            // asks to repeat or not
            System.out.print("Continue? (y/n): ");
            cont = input.next();
        }
    }
    public static int calculateGallonsPaint(double paintSquareFeet) // Function calculating gallons of paint
    {
        // Round up gallons of paint required (data type converted to int)
        return (int) Math.ceil(paintSquareFeet / 112);
    }
    public static int calculateLabor(double paintSquareFeet) // Function calculating labor
    {
        return (int) Math.ceil(paintSquareFeet / 112 * 8);
    }
    public static double calculatePaintCost(int gallonsOfPaint, double gallonPaintCost) // Function calculating cost of paint
    {
        return gallonPaintCost * gallonsOfPaint;
    }
    public static double calculateLaborCharges(int laborHours) // Function calculating labor charges
    {
        return laborHours * 35;
    }
    public static double getDouble(Scanner sc, String prompt) // Function validating inputs
    {
        // Declare variables
        double value = 0.0;
        boolean isValid = false;

        while (!isValid)  // While not valid (turns true upon double value being entered)
        {
            System.out.print(prompt);
            String inputStr = sc.next(); // Read users input as a string
            try
            {
                value = Double.parseDouble(inputStr); // Converts input string as a double
                isValid = true; // Turns to true if possible
            }
            catch (NumberFormatException e) // If attempt fails
            {
                System.out.println("Error, enter a valid number. "); // Provide error msg
                sc.nextLine(); // Ensure error message doesn't repeat (bug fix)
            }
        }
        return value; // Return player double inputted
    }
}
