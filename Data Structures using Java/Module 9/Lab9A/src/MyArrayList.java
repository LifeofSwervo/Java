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
        if (index < 0 || index >= size)
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
        return array.length;
    }

    /**
     * - Search, integer method. Returns searched element.
     * @param element - String, element being searched.
     * @return - Returns element if found if not returns -1.
     */
    public int search(String element)
    {
        for (int i = 0; i < size; i++)
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

    /**
     * - Find matches, integer method. Finds matches in the array of the element (argument).
     * @param element - String, element being searched for potential matches.
     * @return - Returns count of element in array.
     */
    public int findMatches(String element)
    {
        int count = 0;
        for (int i = 0; i < size; i++)
        {
            if (array[i].equals(element))
            {
                count++;
            }
        }
        return count;
    }

    /**
     * - Find Matches Array, integer array method. Returns integer array, with index numbers matches.
     * @param element - String, element being searched for potential matches.
     * @return - Returns index of matches, if 0 returns null.
     */
    public int[] findMatchesArray(String element)
    {
        int count =  findMatches(element);
        if (count == 0)
        {
            return null;
        }

        int[] matches = new int[count];
        int index = 0;
        for (int i = 0; i < size; i++)
        {
            if (array[i].equals(element))
            {
                matches[index++] = i;
            }
        }
        return matches;
    }

    public static void main(String[] args)
    {
        MyArrayList list = new MyArrayList(5);
        list.add("Alpha");
        list.add("Beta");
        list.add("Gamma");
        list.add("Delta");
        list.add("Epsilon");
        list.add("Alpha");
        System.out.println("Size: " + list.size());
        System.out.println("Search for 'Alpha': " + list.search("Alpha"));
        System.out.println("Search from end for 'Alpha': " + list.searchFromEnd("Alpha"));
        System.out.println("Number of matches for 'Alpha': " + list.findMatches("Alpha"));

        int[] matchesArray = list.findMatchesArray("Alpha");
        System.out.println("Index numbers for 'Alpha' matches:");
        for (int x : matchesArray)
        {
            System.out.println(x);
        }
        System.out.println("Element at index 2: " + list.get(2));
    }
}
