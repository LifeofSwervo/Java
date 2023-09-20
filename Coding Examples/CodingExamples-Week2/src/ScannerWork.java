import java.util.Scanner;

public class ScannerWork {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        /*
        //Original code with errors
        System.out.print("Enter a name: ");
        String name = input.nextLine();

        System.out.print("Enter their age: ");
        int age = input.nextInt();

        System.out.print("Enter their favorite color: ");
        String color = input.nextLine();

        System.out.print("Enter their height: ");
        double height = input.nextDouble();
        */


        /*
        //Clearing the scanner after nextInt() or nextDouble()
        System.out.print("Enter a name: ");
        String name = input.nextLine();

        System.out.print("Enter their age: ");
        int age = input.nextInt();
        input.nextLine(); // clearing the scanner

        System.out.print("Enter their favorite color: ");
        String color = input.nextLine();

        System.out.print("Enter their height: ");
        double height = input.nextDouble();
        input.nextLine(); // clear input
        */


        /*
        //Using parse methods
        System.out.print("Enter a name: ");
        String name = input.nextLine();

        System.out.print("Enter their age: ");
        int age = Integer.parseInt(input.nextLine());

        System.out.print("Enter their favorite color: ");
        String color = input.nextLine();

        System.out.print("Enter their height: ");
        double height = Double.parseDouble(input.nextLine());
        */

        //Extra stuff to show about input and UX stuff for consoles
        System.out.print("Pause, hit enter when ready...");
        input.nextLine(); // pausing until enter, have to use nextLine() over next()

        // read in two numbers via spaces
        System.out.print("Enter 2 numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        // add and print out
        int sum = num1 + num2;

        System.out.println(sum);


    }
}
