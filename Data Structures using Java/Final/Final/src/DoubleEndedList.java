
public class DoubleEndedList
{
    private Link first;
    private Link last;

    public DoubleEndedList()
    {
        first = null;
        last = null;
    }

    public boolean isEmpty()
    {
        return first == null;
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

    public long deleteFirst()
    {
        long temp = first.data;
        if (first.next == null)
        {
            last = null;
        }
        first = first.next;
        return temp;
    }

    public long deleteLast()
    {
        if (isEmpty())
        {
            throw new IllegalStateException("List is empty");
        }
        long temp = last.data;
        if (first == last)
        {
            first = null;
            last = null;
        } else
        {
            Link current = first;
            while (current.next != last)
            {
                current = current.next;
            }
            last = current;
            current.next = null;
        }
        return temp;
    }

    public void displayList()
    {
        System.out.print("List (first-->last): ");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }
}
