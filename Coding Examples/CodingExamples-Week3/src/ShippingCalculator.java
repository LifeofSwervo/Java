import java.util.Scanner;
import java.text.NumberFormat;
public class ShippingCalculator
{
    public static void main(String[] args)
    {
        // set up helpers
        Scanner input = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        double price = 0;

        //get input for package weight and distance
        System.out.print("Enter package weight: ");
        double weight = input.nextDouble();

        System.out.print("Enter shipping distance: ");
        int distance = input.nextInt();

        //set the price of shipping based on weight
        if (weight >= 1 && weight <= 15)
        {
            price = 1.25;
        }
        else if (weight >= 16 && weight <= 30)
        {
            price = 2.51;
        }
        else if (weight >= 31 && weight <= 45)
        {
            price = 3.72;
        }
        else if (weight >= 46 && weight <= 60)
        {
            price = 4.53;
        }
        else if (weight >= 61 && weight <= 75)
        {
            price = 5.12;
        }

        // round to the nearest 100 miles
        int hundreds = (int)Math.ceil(distance / 100.0);

        // calculate total charge
        double shippingCharge = hundreds * price;
        shippingCharge = (double)Math.round(shippingCharge * 100) / 100;

        //output
        if (weight > 75)
        {
            System.out.println("Package too heavy, can't ship.");
        }
        else
        {
            System.out.println("Shipping Charge: " + currency.format(shippingCharge));
        }
    }
}
