/**
 * Numbers class, holding getters and setters along with basic information.
 *
 * @author Clarence Thomas
 * @version 1.0.0
 */
import java.util.Random;

public class Numbers {
    private int[] integerArray; // Instance variable

    /**
     * - Constructor, taking int argument that will become the length.
     * @param arrayLength - A integer for the array length.
     */
    public Numbers(int arrayLength)
    {
        integerArray = new int[arrayLength];
    }
    /**
     * - Display method, printing list of all the numbers in integersArray.
     */
    public void display()
    {
        for (int num: integerArray)
        {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void randomize()
    {
        Random random = new Random();
        for (int i = 0; i < integerArray.length; i++)
        {
            integerArray[i] = random.nextInt(101); // Random number between 0 and 100
        }
    }
    // Sort methods
    public void bubbleSort()
    {

    }
    public void selectionSort()
    {

    }
    public void insertionSort()
    {

    }

    // Getters
    /**
     * - Integer method getting the value of the specified index in the integerArray.
     * @param index - A integer used to retrieve the value from that index position of the array.
     */
    public int getValue(int index)
    {
        try
        {
            return integerArray[index];
        } catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Index out of bounds. Returning 0.");
            return 0;
        }
    }
    /**
     * - Integer method returning length of the integerArray.
     */
    public int getLength()
    {
        return integerArray.length;
    }
    // Setters
    /**
     * - Method setting the value of the specified index, also puts constraint on value if 100+ or 0 or less.
     * @param index - An integer for the index of the integerArray.
     * @param value - An integer representing the value to be assigned to the index of the array.
     */
    public void setValue(int index, int value)
    {
        try
        {
            if (value < 0)
            {
                value = 0;
            } else if (value > 100)
            {
                value = 100;
            }

            integerArray[index] = value;
        } catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Index out of bounds.");
        }
    }
}



