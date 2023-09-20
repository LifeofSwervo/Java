import java.util.Scanner;

public class MathWithInput
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); // setting up scanner for input
        int num1, num2; // setup variables for input

        // get input for first number
        System.out.print("Enter first number: ");
        num1 = input.nextInt();

        // get input for second number
        System.out.print("Enter second number: ");
        num2 = input.nextInt();

        /*
        // Another way to get input having both numbers entered at same time.
        System.out.print("Enter 2 numbers separated by spaces: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        */

        // doing add, subtract, multiply and divide
        int sum = num1 + num2;
        int dif = num1 - num2;
        int prod = num1 * num2;
        int quot = num1 / num2;

        // print out results
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + dif);
        System.out.println(num1 + " * " + num2 + " = " + prod);
        System.out.println(num1 + " / " + num2 + " = " + quot);
    }
}
