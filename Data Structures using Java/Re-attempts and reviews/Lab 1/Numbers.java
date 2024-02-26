public class Numbers 
{
    private int[] integerArray;

    public Numbers(int arrayLength) 
    {
        integerArray = new int[arrayLength];
    }

    public void disply() 
    {
        for (int num : integerArray) 
        {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}