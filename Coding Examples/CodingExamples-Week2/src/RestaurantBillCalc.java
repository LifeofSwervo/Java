import java.util.Scanner;
import java.text.NumberFormat;

public class RestaurantBillCalc
{
    public static void main(String[] args)
    {
        // set up scanner and numberformat
        Scanner input = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        NumberFormat percent = NumberFormat.getPercentInstance();
        percent.setMinimumFractionDigits(2);
        percent.setMaximumFractionDigits(2);

        final double SALES_TAX = .07; // constant sales tax 7%

        // get input for bill
        System.out.print("Enter subtotal: ");
        double subtotal = input.nextDouble();

        // get input for tip percentage
        System.out.print("Enter tip percentage: ");
        double tipPercentage = input.nextDouble();
        tipPercentage /= 100;  // convert to decimal

        // calculations
        double tipAmount = subtotal * tipPercentage;
        tipAmount = (double)Math.round((tipAmount * 100)) / 100; // round 2 decimal places
        double taxAmount = subtotal * SALES_TAX;
        taxAmount = (double)Math.round((taxAmount * 100)) / 100; // round 2 decimal places
        double grandTotal = tipAmount + taxAmount + subtotal;


        // output
        /*
        System.out.printf("%-10s%,10.2f%n%-10s%,10.2f%n%-10s%,10.2f%n%n%-10s%,10.2f%n",
                "Subtotal:",  subtotal, "Tax:", taxAmount, "Tip:", tipAmount, "Total:", grandTotal);
        */
        System.out.printf("%-10s%10s%n%-10s%10s%n%-10s%10s%n%n%-10s%10s",
                "Subtotal:",  currency.format(subtotal), "Tax " + percent.format(SALES_TAX) + ":",
                currency.format(taxAmount), "Tip " + percent.format(tipPercentage) + ":",
                currency.format(tipAmount), "Total:", currency.format(grandTotal));
    }
}
