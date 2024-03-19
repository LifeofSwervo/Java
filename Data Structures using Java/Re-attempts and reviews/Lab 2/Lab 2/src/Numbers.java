import java.util.Random;

public class Numbers
{
    private int[] intArray;

    public Numbers(int arrayLength)
    {
        intArray = new int[arrayLength];
    }

    public void display()
    {
        System.out.println("Displayed array: ");
        for (int num : intArray)
        {
            System.out.println(num + " ");
        }
        System.out.println();
    }

    public void randomize()
    {
        Random random = new Random();
        for (int i = 0; i < intArray.length; i++)
        {
            intArray[i] = random.nextInt(101);
        }
    }

    public void bubbleSort()
    {
        for (int i = 0; i < intArray.length; i++)
        {
            for (int j = 1; j < (intArray.length - 1); j++)
            {
                if (intArray[j - 1] > intArray[j])
                {
                    int temp = intArray[j - 1];
                    // Swap
                    intArray[j - 1] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
    }

    public void selectionSort()
    {
        for (int i = 0; i < intArray.length; i++)
        {
            int index = i;
            for (int j = i + 1; j < intArray.length; j++)
            {
                if (intArray[j] > intArray[index])
                {
                    index = j;
                }
            }
            int smallerNumber = intArray[index];
            intArray[index] = intArray[i];
            intArray[i] = smallerNumber;
        }
    }

    public void insertionSort()
    {
        for (int j = 1; j < intArray.length; j++)
        {
            int key = intArray[j];
            int i = j - 1;
            while ((i > -1) && (intArray[i] > key))
            {
                intArray[i + 1] = intArray[i];
                i--;
            }
            intArray[i + 1] = key;
        }
    }

    public int getLength()
    {
        return intArray.length;
    }

    // Getters
    public int getValue(int index)
    {
        return intArray[index];
    }

    public void setValue(int index, int value)
    {
        if (value < 0)
        {
            value = 0;
        } else if (value > 100)
        {
            value = 100;
        }
        intArray[index] = value;
    }
}
