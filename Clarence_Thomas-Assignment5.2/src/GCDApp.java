import java.util.Scanner;

public class GCDApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int firstNumber = Integer.parseInt(sc.nextLine());

        System.out.print("Enter the second number: ");
        int secondNumber = Integer.parseInt(sc.nextLine());

        System.out.println("Iterative GCD...");
        int result = iterGCD(firstNumber, secondNumber);
        System.out.println(result);

        System.out.println("Recursive GCD...");
        result = recGCD(firstNumber, secondNumber);
        System.out.println(result);
        System.out.println();
    }    

    // iterative
    public static int iterGCD(int a, int b) {
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
    public static int recGCD(int x, int y) {
        System.out.println("Recursive solution here...");
        //return 0;
        int remainder = x % y;
        if (remainder == 0) // If remainder equals 0
        {
            return y; // return y
        } else // Otherwise
        {
            return recGCD(y, remainder); // Calculate GCD again, this time dividing y by the remainder
        }
    }
}