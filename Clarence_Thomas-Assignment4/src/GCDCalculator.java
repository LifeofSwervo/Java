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
            int firstNumberInput = input.nextInt();

            System.out.print("Enter the second number: ");
            int secondNumberInput = input.nextInt();

            //Calculation
            while (firstNumberInput != 0)
            {
                while (secondNumberInput >= firstNumberInput)
                {
                    secondNumberInput -= firstNumberInput;
                }
                int temp = secondNumberInput;
                secondNumberInput = firstNumberInput;
                firstNumberInput = temp;
            }
            System.out.println(secondNumberInput);


            System.out.print("Continue (y/n)? ");
            decision = input.next(); // Check if user wishes to continue
        }

        if (decision.equalsIgnoreCase("n"))
        {
            System.out.println("Have a great day, Goodbye! ");
        }
    }
}
