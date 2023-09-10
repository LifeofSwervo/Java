// @author Clarence Thomas
// CLASS: Info 1521 WA
// ASSIGNMENT: ASSIGNMENT 1
// DATE: September 11th, 2023
// RESOURCES: Utilized the Coding Examples provided in week 1

// This program is an Area Calculator providing the area of 4 shapes (Rectangle, Triangle, Trapezoid, Circle)
import java.util.Scanner;

public class ShapeCalculator
{
    public static void main(String[] args)
    {
        System.out.println("*** Welcome to Clarence's Shape Calculator ***");
        System.out.println(); // Blank line

        //Declare Variables
        Scanner input = new Scanner(System.in);
        String decision = "y";
        //String output = "";
        String output;

        // Check if user wishes to repeat
        while (decision.equalsIgnoreCase("y")) // Account for if user enters value other than Y / N
        {
            System.out.println("\n1. Area of Rectangle \n2. Area of Triangle \n3. Area of Trapezoid \n" +
                    "4. Area of Circle \nPlease select operations: ");
            int operation = input.nextInt(); // Parse operation selected by user


            if (operation == 1) // If user selects rectangle
            {
                System.out.print("Enter length of the rectangle: ");
                double num1 = input.nextDouble(); // Parse Length
                System.out.print("Enter width of the rectangle: ");
                double num2 = input.nextDouble(); // Parse Width
                double rectangleArea = num1 * num2; // Calculate's area of rectangle
                output = "The area of the rectangle is: " + rectangleArea;
                System.out.println("\n" + output); // Display Result
            } else if (operation == 2) // If user selects triangle
            {
                System.out.print("Enter base of the triangle: ");
                double num1 = input.nextDouble(); // Parse Base
                System.out.print("Enter height of the triangle: ");
                double num2 = input.nextDouble(); // Parse Height
                double triangleArea = (num1 * num2) / 2; // Calculate's area of triangle
                output = "The area of the triangle is: " + triangleArea;
                System.out.println("\n" + output); // Display Result
            } else if (operation == 3) // If user selects trapezoid
            {
                System.out.print("Enter base of the trapezoid: ");
                double num1 = input.nextDouble(); // Parse Base
                System.out.print("Enter height of the trapezoid: ");
                double num2 = input.nextDouble(); // Parse Height
                System.out.print("Enter the second base of the trapezoid: "); // Request 3rd variable for trapezoid
                double num3 = input.nextDouble(); // Parse second Base value
                double trapezoidArea = ((num1 + num3) / 2) * num2; // Calculate's area of trapezoid
                output = "The area of the trapezoid is: " + trapezoidArea;
                System.out.println("\n" + output); // Display Result
            } else if (operation == 4) // If user selects circle
            {
                System.out.println("Enter radius of Circle: ");
                double radius = input.nextDouble(); // Parse radius of circle
                double circleArea = (radius * radius) * 3.14; // Calculate's area of circle
                output = "The area of the circle is: " + circleArea;
                System.out.println("\n" + output); // Display Result
            } else
            {
                System.out.println("Incorrect Operation, press \"y\" to retry or \"n\" to close the calculator.");
            }


            // Ask user to loop program
            System.out.println("\nContinue (y/n)? ");
            decision = input.next();
        }
        // Checks if user wishes to end program
        if (decision.equalsIgnoreCase("n"))
        {
            System.out.println("Have a great day, Goodbye! ");
        }
    }
}
