class HashTable
{
    private String[] hashArray; // array holds hash table
    private int arraySize;
    private String nonItem; // for deleted items

    /**
     * - Constructor,
     * @param size - integer, size of the table.
     */
    public HashTable(int size)
    {
        arraySize = size;
        hashArray = new String[arraySize];
        nonItem = ""; // deleted item key is -1
    }
    // -------------------------------------------------------------

    /**
     * - Display table, void method. Prints table
     */
    public void displayTable()
    {
        System.out.print("Table: ");
        for(int j=0; j<arraySize; j++)
        {
            if (hashArray[j] != null && !hashArray[j].equals(nonItem))
                System.out.print(hashArray[j] + " ");
            else
                System.out.print("** ");
        }
        System.out.println("");
    }
    // -------------------------------------------------------------

    /**
     * - Hash Function, integer method.
     * @param key - String.
     * @return -
     */
    public int hashFunc1(String key)
    {
        int hashVal = 0;
        int pow27 = 1; // 1, 27, 27*27, etc
        for (int j = key.length() - 1; j >= 0; j--) // right to left
        {
            int letter = key.charAt(j) - 'a' + 1; // convert to 1-26
            hashVal += pow27 * letter; // times power of 27
            pow27 *= 27; // next power of 27
        }
        return hashVal % arraySize;
    }

    public int hashFunc2(String key)
    {
        int hashVal = key.charAt(0) - 'a' + 1;
        for (int j = 1; j < key.length(); j++) // left to right
        {
            int letter = key.charAt(j) - 'a' + 1; // convert to 1-26
            hashVal = hashVal * 27 + letter; // multiply and add
        }
        return hashVal % arraySize;
    }

    public int hashFunc3(String key)
    {
        int hashVal = 0;
        for (int j = 0; j < key.length(); j++) // left to right
        {
            int letter = key.charAt(j) - 'a' + 1; // convert to 1-26
            hashVal = (hashVal * 27 + letter) % arraySize; // mod
        }
        return hashVal;
    }
    // -------------------------------------------------------------

    /**
     * - Insert, void method.
     * @param key - String. Item being inserted
     */
    public void insert(String key)
    {
        int hashVal = hashFunc1(key);

        while (hashArray[hashVal] != null && !hashArray[hashVal].equals(nonItem))
        {
            ++hashVal; // linear probing
            hashVal %= arraySize;
        }
        hashArray[hashVal] = key;
    }

    /**
     * - Delete, data item method.
     * @param key - Integer. Key value being deleted.
     * @return - Returns deleted value if found, returns null if not.
     */
    public String delete(String key)
    {
        int hashVal = hashFunc1(key);

        while (hashArray[hashVal] != null)
        {
            if (hashArray[hashVal].equals(key))
            {
                String temp = hashArray[hashVal];
                hashArray[hashVal] = nonItem; // mark as deleted
                return temp;
            }
            ++hashVal;
            hashVal %= arraySize;
        }
        return null; // not found
    }

    /**
     * - Find, data item method.
     * @param key - Integer. Key value being searched.
     * @return - Returns item if found, returns null if not.
     */
    public String find(String key)
    {
        int hashVal = hashFunc1(key);

        while (hashArray[hashVal] != null)
        {
            if (hashArray[hashVal].equals(key))
                return hashArray[hashVal];
            ++hashVal;
            hashVal %= arraySize;
        }
        return null; // not found
    }
}