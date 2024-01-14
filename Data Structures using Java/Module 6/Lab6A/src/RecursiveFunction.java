import java.util.Random;

public class RecursiveFunction
{
    private static int total = 0;

    public static void main(String[] args)
    {
        runRecursive(1);
    }

    /**
     * Run Recursive function, runs the recursive program.
     * @param runNumber - An integer. The number of runs.
     */
    private static void runRecursive(int runNumber)
    {
        Random random = new Random();
        int randomNumber = random.nextInt(20) + 1;

        System.out.println("Current amount of runs: " + runNumber + ", \nCurrent Random Number: " + randomNumber);

        total += randomNumber;
        // End program if random number becomes 20.
        if (randomNumber == 20)
        {
            System.out.println("\nProgram ended. Total amount: " + total);
        } else // Recursive call
        {
            runRecursive(runNumber + 1);
        }
    }
}

