public class Link
{
    public long data;
    public Link next;

    // Constructor
    /**
     * - Constructor, the data (long) variable are used to create Link objects.
     * @param data - a long for objects in the Linked List.
     */
    public Link(long data)
    {
        this.data = data;
        this.next = null;
    }

    /**
     * - Displays the Link.
     */
    public void displayLink()
    {
        System.out.print("{" + data + "} ");
    }
}
