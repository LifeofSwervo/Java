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
    public void bubbleSortTest()
    {
        for (int i = 0; i < integerArray.length - 1; i++)
        {
            for (int j = 0; j < integerArray.length - i - 1; j++)
            {
                if (integerArray[j] > integerArray[j + 1])
                {
                    int temp = integerArray[j];
                    integerArray[j] = integerArray[j + 1];
                    integerArray[j + 1] = temp;
                }
            }
        }
    }
    public void bubbleSort()
    {
        for (int i = 0; i < integerArray.length; i++) // Iterate through array, start from index 0.
        {
            for (int j = 1; j < (integerArray.length - i); j++) // Iterate through the array again,
            {
                // Check if element below inner loop index is greater than index of inner loop.
                if (integerArray[j - 1] > integerArray[j])
                {
                    int temp = integerArray[j - 1];
                    // Swap the element below the inner loop index with the inner loop index.
                    integerArray[j - 1] = integerArray[j];
                    integerArray[j] = temp; // Place temp value in the index of the inner loop.
                }
            }
        }
    }
    public void selectionSort()
    {
        for (int i = 0; i < integerArray.length; i++) // Iterate through array, start from index 0.
        {
            int index = i;
            // Iterate through the array again, start 1 element higher than the current element.
            for (int j = i + 1; j < integerArray.length; j++)
            {
                if (integerArray[j] < integerArray[index]) // Check if 'j' index is less than 'i' index.
                {
                    index = j; // Then assign index to 'j'.
                }
            }
            int smallerNumber = integerArray[index];
            integerArray[index] = integerArray[i]; // Swaps the smallerNumber with the current outer loop index.
            integerArray[i] = smallerNumber; // Place small element at the sorted position.
        }
    }
    public void insertionSort()
    {
        for (int j = 1; j < integerArray.length; j++) // Iterate through array, start from index 1.
        {
            int key = integerArray[j]; // Current element stored in key.
            int i = j - 1; // "i" represents the index of the element below the current element.
            while ((i > -1) && ( integerArray[i] > key )) // While i > -1 and the "i" index > the current element.
            {
                integerArray[i + 1] = integerArray[i]; // Shift elements up by 1.
                i--;
            }
            integerArray[i+1] = key; // Assign key to element above the shifted element.
        }
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



