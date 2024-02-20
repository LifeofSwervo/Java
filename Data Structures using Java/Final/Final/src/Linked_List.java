public class Linked_List
{
    protected Link first;

    public Linked_List()
    {
        first = null;
    }

    public void insertFirst(long data)
    {
        Link newLink = new Link(data);
        newLink.next = first;
        first = newLink;
    }

    public void displayList()
    {
        Link current = first;
        while (current != null)
        {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }
}
