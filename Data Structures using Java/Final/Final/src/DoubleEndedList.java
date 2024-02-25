
public class DoubleEndedList
{
    private Link first;
    private Link last;

    /**
     * - Constructor, for the Doubled ended list.
     */
    public DoubleEndedList()
    {
        first = null;
        last = null;
    }

    /**
     * - Is empty, boolean method. Indicates if first is null.
     * @return - Returns true if null (empty).
     */
    public boolean isEmpty()
    {
        return first == null;
    }

    /**
     * - Insert first, void method. Inserts data into first node.
     * @param data - Data being inserted into the node.
     */
    public void insertFirst(long data) {
        Link newLink = new Link(data);
        if (isEmpty())
            last = newLink;
        newLink.next = first;
        first = newLink;
    }

    /**
     * - Insert last, void method. Inserts data into last node.
     * @param data - Data being inserted into the node.
     */
    public void insertLast(long data)
    {
        Link newLink = new Link(data);
        if (isEmpty())
            first = newLink;
        else
            last.next = newLink;
        last = newLink;
    }

    /**
     * - Delete first, long method. Deletes first node's data.
     * @return - Return's data of deleted first node.
     */
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

    /**
     * - Delete last, long method. Deletes last node's data.
     * @return - Return's data of deleted last node.
     */
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

    /**
     * - Display list, void method. Displays list for user.
     */
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
