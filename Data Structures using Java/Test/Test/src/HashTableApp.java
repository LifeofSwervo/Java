import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class HashTableApp
{
    public static void main(String[] args) throws IOException
    {
        int size = 26; // assuming 26 characters for lowercase words
        HashTable hashTable = new HashTable(size);

        hashTable.insert("apple");
        hashTable.insert("banana");
        hashTable.insert("cherry");

        hashTable.displayTable();

        String keyToFind = "banana";
        String foundItem = hashTable.find(keyToFind);

        if (foundItem != null)
            System.out.println("Found: " + foundItem);
        else
            System.out.println("Not Found: " + keyToFind);

        String keyToDelete = "banana";
        String deletedItem = hashTable.delete(keyToDelete);

        if (deletedItem != null)
            System.out.println("Deleted: " + deletedItem);
        else
            System.out.println("Not Found: " + keyToDelete);

        hashTable.displayTable();
    }
}