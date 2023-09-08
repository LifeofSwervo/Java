import java.util.Scanner;

public class ShapeCalculator {
    public static void main(String[] args) {
        System.out.println("*** Welcome to Clarence's Shape Calculator ***");
        System.out.println(); // Blank line

        //Declare Variables
        Scanner input = new Scanner(System.in);
        String decision = "y";
        String output = "";

        // Check if user wishes to repeat
        while (decision.equalsIgnoreCase("y")) {
            System.out.println("1. Area of Rectangle");
            System.out.println("2. Area of Triangle");
            System.out.println("3. Area of Trapezoid");
            System.out.println("4. Area of Circle");
            System.out.print("Please select operations: ");
            int operation = input.nextInt(); // Parse operation selected by user


            if (operation == 1) { // If user selects rectangle
                System.out.print("Enter length of the rectangle: ");
                double num1 = input.nextInt(); // Parse Length
                System.out.print("Enter width of the rectangle: ");
                double num2 = input.nextInt(); // Parse Width
                double rectangleArea = num1 * num2; // Calculate's area of rectangle
                output = "The area of the rectangle is: " + rectangleArea;
            } else if (operation == 2) { // If user selects triangle
                System.out.print("Enter base of the triangle: ");
                double num1 = input.nextInt(); // Parse Base
                System.out.print("Enter height of the triangle: ");
                double num2 = input.nextInt(); // Parse Height
                double triangleArea = (num1 * num2) / 2; // Calculate's area of triangle
                output = "The area of the triangle is: " + triangleArea;
            } else if (operation == 3) { // If user selects trapezoid
                System.out.print("Enter base of the trapezoid: ");
                double num1 = input.nextInt(); // Parse Base
                System.out.print("Enter height of the trapezoid: ");
                double num2 = input.nextInt(); // Parse Height
                System.out.print("Enter the second base of the trapezoid: "); // Request 3rd variable for trapezoid
                double num3 = input.nextInt(); // Parse second Base value
                double trapezoidArea = ((num1 + num3) / 2) * num2; // Calculate's area of trapezoid
                output = "The area of the trapezoid is: " + trapezoidArea;
            } else if (operation == 4) { // If user selects circle
                System.out.println("Enter radius of Circle: ");
                double radius = input.nextInt(); // Parse radius of circle
                double circleArea = (radius * radius) * 3.14; // Calculate's area of circle
                output = "The area of the circle is: " + circleArea;
            } else {
                System.out.println("Incorrect Operation, press \"y\" to retry or \"n\" to close the calculator.);
            }

            System.out.println("\n" + output); // Display Result
            // Ask user to loop program
            System.out.println("\nContinue (y/n)? ");
            decision = input.next();
        }
        // Checks if user wishes to end program
        if (decision.equalsIgnoreCase("n")) {
            System.out.println("Have a great day, Goodbye! ");
        }
    }
}
