
public class DoubleEndedList extends Linked_List
{
    private Link last;

    public DoubleEndedList()
    {
        super();
        last = null;
    }

    public void insertFirst(long data) {
        Link newLink = new Link(data);
        if (isEmpty())
            last = newLink;
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(long data)
    {
        Link newLink = new Link(data);
        if (isEmpty())
            first = newLink;
        else
            last.next = newLink;
        last = newLink;
    }
}
