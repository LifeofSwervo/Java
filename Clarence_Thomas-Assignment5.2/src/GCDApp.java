// @author: Clarence Thomas
// CLASS: Info 1521 WA
// ASSIGMENT: Assignment 5.2
// @version: October 9th, 2023
/* RESOURCES: Referenced examples provided in assignment, reviewed previous GCD project. */

/* EXPLANATION: This is a GCD project with an iterative and recursive answer provided to the user. */

import java.util.Scanner;

public class GCDApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int firstNumber = Integer.parseInt(sc.nextLine()); // Parse first number

        System.out.print("Enter the second number: ");
        int secondNumber = Integer.parseInt(sc.nextLine()); // Parse second number

        System.out.println("Iterative GCD...");
        int result = iterGCD(firstNumber, secondNumber); // Calculate iterative GCD
        System.out.println(result); // Print result to iterative GCD

        System.out.println("Recursive GCD...");
        result = recGCD(firstNumber, secondNumber); // Calculate recursive GCD
        System.out.println(result); // Print result to recursive GCD
        System.out.println();
    }    

    // iterative
    public static int iterGCD(int a, int b) { // Function calculating iterative GCD
        System.out.println("Iterative solution here...");
        int remainder = a % b; // initial division
        while (remainder != 0) // checks if remainder is 0, once it is we have our GCD
        {
            a = b; // overwrite a with b
            b = remainder; // overwrite b with remainder
            remainder = a % b; // perform division again to check GCD
        }
        return b;
    }

    // recursive
    public static int recGCD(int x, int y) // Function calculating recursive GCD
    {
        System.out.println("Recursive solution here...");
        int remainder = x % y; // Calculate remainder
        if (remainder == 0) // If remainder equals 0
        {
            return y; // return y
        } else // Otherwise
        {
            return recGCD(y, remainder); // Recursively calculate GCD again, this time dividing y by the remainder
        }
    }
}