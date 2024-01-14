public class Node
{
    public char data;
    public Node leftChild;
    public Node rightChild;

    /**
     * - Constructor
     * @param letter - Character, letter being used.
     */
    public Node(char letter)
    {
        data = letter;
        leftChild = null;
        rightChild = null;
    }

    /**
     * - Display node function, displays node of data (showing the letter).
     */
    public void displayNode()
    {
        System.out.println(data + " ");
    }
}
