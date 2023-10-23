import java.util.Scanner;
import java.util.ArrayList;

public class ClassRoster {
    public static void main(String[] args)
    {
        // variable setup
        Scanner input = new Scanner(System.in);
        ArrayList<String> roster = new ArrayList<String>();

        // asks how many names
        System.out.print("How many are in your class? ");
        int classSize = input.nextInt();

        // loops through gets names
        for (int i = 0; i < classSize; i++)
        {
            System.out.print("Enter student name: ");
            //String name = input.next();
            //roster.add(name);
            roster.add(input.next()); // simplified way of input and add together
        }

        // print names
        System.out.println("\n\n**** Class Roster ****");
        for (String name : roster)
        {
            System.out.println("Student Name: " + name);
        }

        /*
        // other way of looping through
        for (int i = 0; i < roster.size(); i++)
        {
            System.out.println("Student Name: " + roster.get(i));
        }
         */


    }
}
