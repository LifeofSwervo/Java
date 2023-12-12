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
        for (int i = 0; i < integerArray.length; i++)
        {
            for (int j = 1; j < (integerArray.length - i); j++)
            {
                if (integerArray[j - 1] > integerArray[j])
                {
                    int temp = integerArray[j - 1];
                    integerArray[j - 1] = integerArray[j];
                    integerArray[j] = temp;
                }
            }
        }
    }
    public void selectionSort()
    {
        for (int i = 0; i < integerArray.length; i++)
        {
            int index = i;
            for (int j = i + 1; j < integerArray.length; j++)
            {
                if (integerArray[j] < integerArray[index])
                {
                    index = j;
                }
            }
            int smallerNumber = integerArray[index];
            integerArray[index] = integerArray[i];
            integerArray[i] = smallerNumber;
        }
    }
    public void insertionSort()
    {
        for (int j = 1; j < integerArray.length; j++)
        {
            int key = integerArray[j];
            int i = j - 1;
            while ((i > -1) && ( integerArray[i] > key ))
            {
                integerArray[i + 1] = integerArray[i];
                i--;
            }
            integerArray[i+1] = key;
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



