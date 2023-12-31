/**
 * NumbersDriver class, using helpers from Numbers class to display information.
 *
 * @author Clarence Thomas
 * @version 1.0.0
 */
public class NumbersDriver
{
    public static void main(String[] args)
    {
        // Numbers Object with 10 elements
        Numbers numbersObject = new Numbers(10);
        // Display method on object
        System.out.println("Initial Array: ");
        numbersObject.display();
        System.out.println();

        // Use setValue method on numbers object (0 - 100)
        numbersObject.setValue(0, 50);
        numbersObject.setValue(9, 90);

        // Use getValue method, displaying values at certain indices.
        System.out.println("First number of array (Index 0): " + numbersObject.getValue(0));
        System.out.println("Last number of array (Index 9): " + numbersObject.getValue(9));
        System.out.println();

        // Use getLength method, displaying length of the array.
        System.out.println("Array Length: " + numbersObject.getLength());

        // Display array
        System.out.println();
        System.out.println("Final Array: ");
        numbersObject.display();
    }
}


