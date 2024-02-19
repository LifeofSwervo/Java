import java.util.LinkedList;


public class DoubleEndedList extends LinkedList
{
    private Link first;
    private Link last;

    public DoubleEndedList()
    {
        first = null;
        last = null;
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

    public boolean isEmpty()
    {
        return first == null;
    }
}
