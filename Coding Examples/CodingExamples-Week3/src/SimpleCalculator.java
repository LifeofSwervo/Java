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
            /*
            // basic switch with break statements
            switch(operation)
            {
                case 1:
                    int add = num1 + num2; // add numbers
                    output = num1 + " + " + num2 + " = " + add; // set output to addition
                    break;
                case 2:
                    int dif = num1 - num2;
                    output = num1 + " - " + num2 + " = " + dif; // set output to subtraction
                    break;
                case 3:
                    int prod = num1 * num2;
                    output = num1 + " * " + num2 + " = " + prod; // set output to multiply
                    break;
                case 4:
                    int quot = num1 / num2;
                    output = num1 + " / " + num2 + " = " + quot; // set output to divide
                    break;
                default:
                    output = "ERROR ON OPERATION";
                    break;
            }*/

            /*
            // switch using the arrow labels
            switch(operation) {
                case 1 -> {
                    int add = num1 + num2; // add numbers
                    output = num1 + " + " + num2 + " = " + add; // set output to addition
                }
                case 2 -> {
                    int dif = num1 - num2;
                    output = num1 + " - " + num2 + " = " + dif; // set output to subtraction
                }
                case 3 -> {
                    int prod = num1 * num2;
                    output = num1 + " * " + num2 + " = " + prod; // set output to multiply
                }
                case 4 -> {
                    int quot = num1 / num2;
                    output = num1 + " / " + num2 + " = " + quot; // set output to divide
                }
                default -> {
                    output = "ERROR ON OPERATION";
                }
            }
            */

            // using switch expressions
            output = switch(operation) {
                case 1 -> {
                    int add = num1 + num2; // add numbers
                    yield num1 + " + " + num2 + " = " + add; // set output to addition
                }
                case 2 -> {
                    int dif = num1 - num2;
                    yield num1 + " - " + num2 + " = " + dif; // set output to subtraction
                }
                case 3 -> {
                    int prod = num1 * num2;
                    yield num1 + " * " + num2 + " = " + prod; // set output to multiply
                }
                case 4 -> {
                    int quot = num1 / num2;
                    yield num1 + " / " + num2 + " = " + quot; // set output to divide
                }
                default -> {
                    yield "ERROR ON OPERATION";
                }
            };

            System.out.println("\n" + output); // display operation

            // asking to run again
            System.out.print("\nContinue (y/n)?");
            choice = input.next();
        }
        System.out.println("*** Thanks for using the calculator!! ***");
    }
}
