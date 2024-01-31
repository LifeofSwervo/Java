public class MyArrayList
{
    private String[] array;
    private int size;

    /**
     * - Constructor, sets the size of the array list.
     * @param initialSize - An integer.
     */
    public MyArrayList(int initialSize)
    {
        array = new String[initialSize];
        size = 0;
    }

    /**
     * - Add, void method. Takes string argument and adds it to the last free element.
     * @param element - A string, the element being added.
     */
    public void add(String element)
    {
        // If full create a new array with double the elements.
        if (size == array.length)
        {
            String[] newArray = new String[array.length * 2];

            // Copy contents of old array to new array
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        // Add new elements to last free position.
        array[size++] = element;
    }

    /**
     * - Get, string method. Takes index value, returns String object from that index value.
     * @param index - An integer, element used to identify the String object value.
     * @return - Returns string object value.
     */
    public String get(int index)
    {
        if (index < 0 || index > size)
        {
            return null;
        }
        return array[index];
    }

    /**
     * - Size, integer method. Returns number of elements able to fit in the array.
     * @return - Returns size of array.
     */
    public int size()
    {
        return size;
    }

    /**
     * - Search, integer method. Returns searched element.
     * @param element - String, element being searched.
     * @return - Returns element if found if not returns -1.
     */
    public int search(String element)
    {
        for (int i = 0; 1 < size; i++)
        {
            // If match is found.
            if (array[i].equals(element))
            {
                return i;
            }
        }
        return -1; // Match not found.
    }

    /**
     * - Search from end, integer method. Searches from last index to index 0.
     * @param element - String, element being searched.
     * @return - Returns element if found if not returns -1.
     */
    public int searchFromEnd(String element)
    {
        for (int i = size - 1; i >= 0; i--)
        {
            if (array[i].equals(element))
            {
                return i;
            }
        }
        return -1;
    }
}
