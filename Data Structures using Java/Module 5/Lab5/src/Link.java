public class Link
{
    public long data;
    public Link next;

    // Constructor
    public Link(long data)
    {
        this.data = data;
        this.next = null;
    }

    // Display
    public void displayLink()
    {
        System.out.print("{" + data + "} ");
    }
}
