public class LinearProbeHashTable {
    private static final int TABLE_SIZE = 26; // Assuming only lowercase words

    private String[] table;

    public LinearProbeHashTable() {
        table = new String[TABLE_SIZE];
    }

    private int hash(String key) {
        // Simple hash function for lowercase strings
        return key.charAt(0) - 'a';
    }

    public void insert(String key) {
        int index = hash(key);

        while (table[index] != null) {
            // Linear probing to handle collisions
            index = (index + 1) % TABLE_SIZE;
        }

        table[index] = key;
    }

    public boolean search(String key) {
        int index = hash(key);

        while (table[index] != null) {
            if (table[index].equals(key)) {
                return true; // Key found
            }

            // Linear probing to continue searching
            index = (index + 1) % TABLE_SIZE;
        }

        return false; // Key not found
    }

    public void displayTable() {
        for (int i = 0; i < TABLE_SIZE; i++) {
            System.out.println("Index " + i + ": " + table[i]);
        }
    }

    public static void main(String[] args) {
        LinearProbeHashTable hashTable = new LinearProbeHashTable();

        // Insert some strings
        hashTable.insert("apple");
        hashTable.insert("banana");
        hashTable.insert("cherry");

        // Display the table
        hashTable.displayTable();

        // Search for a string
        System.out.println("Search for 'banana': " + hashTable.search("banana"));
        System.out.println("Search for 'grape': " + hashTable.search("grape"));
    }
}
