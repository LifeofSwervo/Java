import java.util.Scanner;

public class ShapeCalculator {
    public static void main(String[] args) {
        System.out.println("*** Welcome to Clarence's Shape Calculator ***");
        System.out.println(); // Blank line

        //Declare Variables
        Scanner input = new Scanner(System.in);
        String decision = "y";
        String output = "";
        while (decision.equalsIgnoreCase("y")) {
            System.out.println("1. Area of Rectangle");
            System.out.println("2. Area of Triangle");
            System.out.println("3. Area of Trapezoid");
            System.out.println("4. Area of Circle");
            System.out.print("Please select operations: ");
            int operation = input.nextInt(); // Parse operation selected by user

            System.out.print("Enter Base: ");
            double num1 = input.nextInt(); // Parse Base

            System.out.print("Enter Height: ");
            double num2 = input.nextInt(); // Parse Height

            if (operation == 1) {
                double rectangleArea = num1 * num2;
                output = num1 + " * " + num2 + " = " + rectangleArea;
            } else if (operation == 2) {
                double triangleArea = (num1 * num2) / 2;
                output = " ( " + num1 + " * " + num2 + " ) " + " = " + triangleArea;
            } else if (operation == 3) {
                System.out.print("Enter the second base: "); // Request 3rd variable for trapezoid
                double num3 = input.nextInt();
                double trapezoidArea = ((num1 + num3) / 2) * num2; // (0.5 * (Base(1) + Base(2))) * Height
                output = "The area of the trapezoid is: " + trapezoidArea;
            } else if (operation == 4) {
                System.out.println("Enter radius of Circle: ");
                double radius = input.nextInt();
                double circleArea = (radius * radius) * 3.14;
                output = "The area of the circle is: " + circleArea;
            }

            System.out.println("\n" + output); // Display Result
            // Ask user to loop program
            System.out.println("\nContinue (y/n)? ");
            decision = input.next();
        }
        if (decision.equalsIgnoreCase("n")) { // After user has exited the program
            System.out.println("Have a great day, Goodbye! ");
        }
    }
}
