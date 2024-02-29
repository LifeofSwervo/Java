

public class DoublyLinkedList
{
    private Link first;
    private Link last;

    /**
     * - Constructor, for the Doubly Linked list.
     */
    public DoublyLinkedList()
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

    /**
     * - Insert last, void method. Inserts data into last node.
     * @param data - Data being inserted into the node.
     */
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

    /**
     * - Display list, void method. Displays list for user.
     */
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

    // Getters

    /**
     * - Get first, Link method. Gets first node's data.
     * @return - Return's first.
     */
    public Link getFirst() {
        return first;
    }

    /**
     * - Get last, Link method. Gets last node's data.
     * @return - Return's last.
     */
    public Link getLast() {
        return last;
    }
}


