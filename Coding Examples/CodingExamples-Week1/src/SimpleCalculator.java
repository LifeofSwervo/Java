import java.util.Scanner;
public class SimpleCalculator
{
    public static void main(String[] args)
    {
        // set up my variables
        Scanner input = new Scanner(System.in);
        String output = ""; // output to print at the end
        String choice = "y"; // our looping variable, prime it to "y"

        System.out.println("**** Welcome to the Calculator ****");

        while (choice.equalsIgnoreCase("y")) {
            System.out.println("\n1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");

            //System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide"); // alternative print

            // pick operation
            System.out.print("Pick operation: ");
            int operation = input.nextInt();

            // get input for numbers
            System.out.print("\nEnter number: ");
            int num1 = input.nextInt();

            System.out.print("Enter number: ");
            int num2 = input.nextInt();

            if (operation == 1) { // addition
                int add = num1 + num2; // add numbers
                output = num1 + " + " + num2 + " = " + add; // set output to addition
            } else if (operation == 2) { // subtraction
                int dif = num1 - num2;
                output = num1 + " - " + num2 + " = " + dif; // set output to subtraction
            } else if (operation == 3) { // multiplication
                int prod = num1 * num2;
                output = num1 + " * " + num2 + " = " + prod; // set output to multiply
            } else if (operation == 4) { // division
                int quot = num1 / num2;
                output = num1 + " / " + num2 + " = " + quot; // set output to divide
            } else { // invalid operation
                output = "ERROR ON OPERATION";
            }

            System.out.println("\n" + output); // display operation

            // asking to run again
            System.out.print("\nContinue (y/n)?");
            choice = input.next();
        }
        System.out.println("*** Thanks for using the calculator!! ***");
    }
}
