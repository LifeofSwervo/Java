import java.util.LinkedList;

public class DoublyLinkedList extends LinkedList
{
    private Link last;
    private Link first;
    public DoublyLinkedList()
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
        {
            last.next = newLink;
            newLink.next = first;
        }
        last = newLink;
    }

    public boolean isEmpty() {
        return first == null;
    }
}


