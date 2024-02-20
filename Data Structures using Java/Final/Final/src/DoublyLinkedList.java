

public class DoublyLinkedList extends Linked_List
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
        {
            first = newLink;
        }
        else
        {
            last.next = newLink;
            newLink.next = null;
        }
        last = newLink;
    }

    public boolean isEmpty() {
        return first == null;
    }
}


