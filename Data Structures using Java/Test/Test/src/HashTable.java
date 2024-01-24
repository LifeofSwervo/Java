class HashTable
{
    private DataItem[] hashArray; // array holds hash table
    private int arraySize;
    private DataItem nonItem; // for deleted items

    /**
     * - Constructor,
     * @param size - integer, size of the table.
     */
    public HashTable(int size)
    {
        arraySize = size;
        hashArray = new DataItem[arraySize];
        nonItem = new DataItem(-1); // deleted item key is -1
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
            if(hashArray[j] != null)
                System.out.print(hashArray[j].getKey() + " ");
            else
                System.out.print("** ");
        }
        System.out.println("");
    }
    // -------------------------------------------------------------

    /**
     * - Hash Function, integer method.
     * @param key - Integer.
     * @return -
     */
    public int hashFunc(int key)
    {
        return key % arraySize; // hash function
    }
    // -------------------------------------------------------------

    /**
     * - Insert, void method.
     * @param item - Integer. Item being inserted
     */
    public void insert(DataItem item) // insert a DataItem
// (assumes table not full)
    {
        int key = item.getKey(); // extract key
        int hashVal = hashFunc(key); // hash the key

        // Loop until empty or -1
        while(hashArray[hashVal] != null &&
                hashArray[hashVal].getKey() != -1)
        {
            ++hashVal; // go to next cell
            hashVal %= arraySize; // wraparound if necessary
        }
        hashArray[hashVal] = item; // insert item
    } // end insert()

    /**
     * - Delete, data item method.
     * @param key - Integer. Key value being deleted.
     * @return - Returns deleted value if found, returns null if not.
     */
    public DataItem delete(int key)
    {
        int hashVal = hashFunc(key); // hash the key
        while(hashArray[hashVal] != null) // until empty cell,
        {
            // If key is found.
            if(hashArray[hashVal].getKey() == key)
            {
                DataItem temp = hashArray[hashVal]; // save item
                hashArray[hashVal] = nonItem; // delete item
                return temp; // return item
            }
            ++hashVal; // go to next cell
            hashVal %= arraySize; // wraparound if necessary
        }
        return null; // can’t find item
    }

    /**
     * - Find, data item method.
     * @param key - Integer. Key value being searched.
     * @return - Returns item if found, returns null if not.
     */
    public DataItem find(int key)
    {
        int hashVal = hashFunc(key); // hash the key

        // Loop until empty
        while(hashArray[hashVal] != null) // until empty cell,
        {
            // If key is found.
            if(hashArray[hashVal].getKey() == key)
                return hashArray[hashVal]; // yes, return item
            ++hashVal; // go to next cell
            hashVal %= arraySize; // wraparound if necessary
        }
        return null; // can’t find item
    }
}