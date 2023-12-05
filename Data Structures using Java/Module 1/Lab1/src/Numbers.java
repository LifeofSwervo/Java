public class Numbers {
    private int[] integerArray; // Instance variable

    // Constructor
    public Numbers(int arrayLength)
    {
        integerArray = new int[arrayLength];
    }
    // Display method
    public void display()
    {
        System.out.println(integerArray);
    }

    // Getters
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
    public int getLength()
    {
        return integerArray.length;
    }
    // Setters
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

    public class NumbersDriver
    {
        public 
    }
}


