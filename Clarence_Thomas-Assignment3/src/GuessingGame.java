// @author: Clarence Thomas
// CLASS: Info 1521 WA
// ASSIGMENT: Assignment 1
// @version: September 25th, 2023
/* RESOURCES: Utilized coding examples week 3, */

/* EXPLANATION: This program is an Interest Calculator providing the interest, interest rate and loan amount after
being given the interest rate (in floating point) and loan amount. */


import java.util.Scanner;

public class GuessingGame
{
    public static void main(String[] args) {

        // Declare variables
        Scanner input = new Scanner(System.in);
        String output; // Leave output blank
        String YES_OR_NO = "Type (Y or N): "; // Constant asking yes or no
        boolean isSinglePlayer = false;

        System.out.println("Think of a game, I'll try to guess it! Press enter when ready");
        input.nextLine();

        // While user wishes to continue
        System.out.println("Is the game SinglePlayer?");
        System.out.print(YES_OR_NO);
        String gameMode = input.next();

        if (gameMode.equalsIgnoreCase("y"))
        {
            isSinglePlayer = true;
        }

        if (isSinglePlayer) {
            System.out.print("Is singlePlayer");
            System.out.print("Continue (y/n)? ");

        }
    }
}
