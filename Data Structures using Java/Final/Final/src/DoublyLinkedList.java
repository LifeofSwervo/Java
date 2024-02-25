

public class DoublyLinkedList
{
    private Link first;
    private Link last;

    public DoublyLinkedList()
    {
        first = null;
        last = null;
    }

    public boolean isEmpty()
    {
        return first == null;
    }

    public void insertFirst(long data)
    {
        Link newLink = new Link(data);
        if (isEmpty())
        {
            last = newLink;
        } else
        {
            first.previous = newLink;
        }
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(long data)
    {
        Link newLink = new Link(data);
        if (isEmpty())
        {
            first = newLink;
        } else
        {
            last.next = newLink;
            newLink.previous = last;
        }
        last = newLink;
    }

    public void displayList()
    {
        System.out.print("List (first-->last): ");
        Link current = first;
        while (current != null)
        {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }

    public Link getFirst() {
        return first;
    }

    public Link getLast() {
        return last;
    }
}


