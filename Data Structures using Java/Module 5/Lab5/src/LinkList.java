public class LinkList
{
    private Link first;

    /**
     * - Constructor, the data (long) variable are used to create Link objects.
     * @param dataArray - a long for objects in the Linked List.
     */
    public LinkList(long[] dataArray) {
        first = null;
        for (long data : dataArray) {
            insertFirst(data);
        }
    }

    /**
     * Is Empty method, returns boolean. (True if list is empty or false if not)
     */
    public boolean isEmpty()
    {
        return (first==null);
    }

    /**
     * - Insert First method. Takes data (long), inserts new link at the beginning of the list.
     */
    public void insertFirst(long data) {
        Link newLink = new Link(data);
        newLink.next = first;
        first = newLink;
    }

    /**
     * - Delete First method, deletes first link in list.
     */
    public Link deleteFirst() {
        if (!isEmpty()) {
            Link temp = first;
            first = first.next;
            return temp;
        } else {
            return null; // If list is empty
        }
    }

    /**
     * - Display's list.
     */
    public void displayList()
    {
        System.out.print("List (fist-->last): ");
        Link current = first; // start at beginning of list
        while(current != null) // iterate until end of list
        {
            current.displayLink();
            current = current.next; // move to next link
        }
        System.out.println();
    }

    /**
     * - Search method, takes value (long), returns a boolean value.
     * @param value - checked to see if matches current link.
     */
    public boolean search(long value)
    {
        Link current = first; // start at beginning of list
        while (current != null) // iterate until end of list
        {
            if (current.data == value)
            {
                return true; // Returns true if they match
            }
            current = current.next; // Set up next link
        }
        return false;
    }

    /**
     * - Number of values method, takes value (long), returns count.
     * @param value - checked to see if matches current link.
     */
    public int numberOfValues(long value)
    {
        int count = 0; // Count, tracked to be returned.
        Link current = first; // start at beginning of list
        while (current != null) // iterate until end of list
        {
            if (current.data == value)
            {
                count++; // Increase count if match is found
            }
            current = current.next; // Move to next link
        }
        return count;
    }

    /**
     * - Replace method, takes 2 values (long), returns void.
     * @param oldValue - A long. Swapped with newValue.
     * @param newValue - A long. Swapped with oldValue.
     */
    public void replace(long oldValue, long newValue)
    {
        Link current = first; // start at beginning of list
        while (current != null) // iterate until end of list
        {
            if (current.data == oldValue)
            {
                current.data = newValue;
            }
            current = current.next; // Move to next link
        }
    }

    /**
     * - Zero method, replacing all values in the list with 0's.
     */
    public void Zero()
    {
        Link current = first; // start at beginning of list
        while (current != null) // iterate until end of list
        {
            current.data = 0;
            current = current.next; // Move to next link
        }
    }

    /**
     * - Get Array method, returns data values in array.
     */
    public long[] getArray()
    {
        int size = getSize();
        long[] dataArray = new long[size];
        Link current = first; // start at beginning of list
        int index = 0;
        while (current != null) // iterate until end of list
        {
            dataArray[index++] = current.data;
            current = current.next; // Move to next link
        }
        return dataArray;
    }

    /**
     * Get Size method, helper function returning size of link.
     */
    private int getSize()
    {
        int count = 0;
        Link current = first; // start at beginning of list
        while (current != null) // iterate until end of list
        {
            count++;
            current = current.next; // Move to next link
        }
        return count;
    }
}
