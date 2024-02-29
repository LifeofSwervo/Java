public class Numbers 
{
    private int[] integerArray;

    public Numbers(int arrayLength) 
    {
        integerArray = new int[arrayLength];
    }

    public void display() 
    {
        for (int num : integerArray) 
        {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Getters
    public int getValue() 
    {
        try 
        {
            return integerArray[index];
        } catch(ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Index out of bounds.");
            return 0;
        }
    }
}