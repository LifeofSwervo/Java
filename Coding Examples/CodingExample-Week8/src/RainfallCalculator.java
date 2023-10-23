import java.util.Scanner;
import java.util.ArrayList;

public class RainfallCalculator {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> rainfall = new ArrayList<Double>(12);

        String[] months = {"January", "February", "March", "April", "May",
                        "June", "July", "August", "September", "October",
                        "November", "December"};

        // get input for rainfall
        for (int i = 0; i < 12; i++)
        {
            System.out.print("Enter rainfall " + months[i] + ": ");
            double rainMonth = input.nextDouble();
            rainfall.add(rainMonth);
        }

        // loop through total up
        // find smallest and largest
        double totalRainfall = 0;
        int smallestIndex = 0;
        int largestIndex = 0;
        for (int i = 0; i < rainfall.size(); i++)
        {
            totalRainfall += rainfall.get(i); // total up
            // loop through finding smallest
            if (rainfall.get(smallestIndex) > rainfall.get(i))
            {
                smallestIndex = i;
            }
            // loop through finding largest
            if (rainfall.get(largestIndex) < rainfall.get(i))
            {
                largestIndex = i;
            }
        }


        // print out results
        System.out.println("\n\nTotal Rainfall for the year: " + totalRainfall);
        System.out.println("Average rainfall for the year: " + (totalRainfall/rainfall.size()));
        System.out.println("Largest rainfall was in " + months[largestIndex] + " at: " +
                rainfall.get(largestIndex));
        System.out.println("Smallest rainfall was in " + months[smallestIndex] + " at: " +
                rainfall.get(smallestIndex));
    }
}
