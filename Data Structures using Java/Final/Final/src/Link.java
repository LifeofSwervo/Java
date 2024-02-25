public class Link
{
    public long data;
    public Link next;
    public Link previous;


    public Link(long data)
    {
        this.data = data;
        this.next = null;
        this.previous = null;
    }

    public void displayLink()
    {
        System.out.print(data + " ");
    }

}
