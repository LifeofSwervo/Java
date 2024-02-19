public class LinkedList
{
    protected Link first;

    public LinkedList()
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
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
