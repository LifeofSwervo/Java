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
