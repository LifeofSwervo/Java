public class LinearProbeHashTable
{
    private static final int TABLE_SIZE = 26;
    private String[] table;

    /**
     * - Constructor, initializes the hash table.
     */
    public LinearProbeHashTable()
    {
        table = new String[TABLE_SIZE];
    }

    /**
     * - Hash, integer method.
     * @param key - String, key variable being looked for.
     * @return - Returns of character.
     */
    private int hash(String key)
    {
        // hash function for lowercase strings
        return key.charAt(0) - 'a'; // string turned into index value based off position in alphabet.
    }

    /**
     * - Insert, void method.
     * @param key - String, key variable being inserted.
     */
    public void insert(String key)
    {
        int index = hash(key);

        while (table[index] != null)
        {
            // Linear probing for collisions
            index = (index + 1) % TABLE_SIZE;
        }

        table[index] = key;
    }

    /**
     * - Search, boolean method.
     * @param key - String, key variable being
     * @return - Returns true if key is found. False, if not.
     */
    public boolean search(String key)
    {
        int index = hash(key);

        while (table[index] != null)
        {
            if (table[index].equals(key))
            {
                return true; // Key found
            }

            // Linear probing to continue searching
            index = (index + 1) % TABLE_SIZE;
        }

        return false; // Key not found
    }

    /**
     * - Display table, void method.
     */
    public void displayTable()
    {
        for (int i = 0; i < TABLE_SIZE; i++)
        {
            System.out.println("Index " + i + ": " + table[i]);
        }
    }

    public static void main(String[] args)
    {
        LinearProbeHashTable hashTable = new LinearProbeHashTable();

        // Insert strings
        hashTable.insert("apple");
        hashTable.insert("banana");
        hashTable.insert("orange");


        // Display table
        hashTable.displayTable();

        // Search for string
        System.out.println("Search for 'banana': " + hashTable.search("banana"));
        System.out.println("Search for 'grape': " + hashTable.search("grape")); // Fail test
    }
}
