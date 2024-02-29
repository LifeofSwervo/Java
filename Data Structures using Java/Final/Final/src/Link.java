public class Link
{
    public long data;
    public Link next;
    public Link previous;

    /**
     * - Constructor, for the Link variable.
     * @param data - Data used in the link.
     */
    public Link(long data)
    {
        this.data = data;
        this.next = null;
        this.previous = null;
    }

    /**
     * - Display's link
     */
    public void displayLink()
    {
        System.out.print(data + " ");
    }

}
