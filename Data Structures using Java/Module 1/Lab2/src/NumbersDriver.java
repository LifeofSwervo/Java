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

        Numbers numbersObject = new Numbers(10); // Create a Numbers object with 10 elements.
        numbersObject.randomize(); // Call the randomize method.

        // Display the contents of the array.
        System.out.println("Randomized Array: ");
        numbersObject.display();

        numbersObject.bubbleSort(); // Call the bubbleSort method.

        // Display the contents of the array.
        System.out.println("\nBubble Sorted Array: ");
        numbersObject.display();

        numbersObject.randomize(); // Call the randomize method.

        // Display the contents of the array.
        System.out.println("\n2nd Randomized array: ");
        numbersObject.display();

        numbersObject.selectionSort(); // Call the selectionSort method.

        // Display the contents of the array.
        System.out.println("\nSelection sorted array: ");
        numbersObject.display();

        numbersObject.randomize(); // Call the randomize method.

        // Display the contents of the array.
        System.out.println("\n3rd Randomized array: ");
        numbersObject.display();

        numbersObject.insertionSort(); // Call the insertionSort method.

        // Display the contents of the array.
        System.out.println("\nInsertion sorted array: ");
        numbersObject.display();
    }
}


