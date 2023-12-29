public class LinkList
{
    private Link first;

    // Constructor that takes an array of longs as an argument
    public LinkList(long[] dataArray) {
        first = null;
        for (long data : dataArray) {
            insertFirst(data);
        }
    }

    public boolean isEmpty() // true if list is empty
    {
        return (first==null);
    }

    // insertFirst method
    public void insertFirst(long data) {
        Link newLink = new Link(data);
        newLink.next = first;
        first = newLink;
    }

    public void displayList()
    {
        System.out.print("List (fist-->last): ");
        Link current = first; // start at beginning of list
        while(current != null) // until end of list,
        {
            current.displayLink(); // print data
            current = current.next; // move to next link
        }
        System.out.println();
    }

    // Search
    public boolean search(long value)
    {
        Link current = first;
        while (current != null)
        {
            if (current.data == value)
            {
                return true;
            }
            current = current.next; // Set up next link
        }
        return false;
    }

    // Number of values
    public int numberOfValues(long value)
    {
        int count = 0;
        Link current = first;
        while (current != null)
        {
            if (current.data == value)
            {
                count++;
            }
            current = current.next;
        }
        return count;
    }

    // Replace Method
    public void replace(long oldValue, long newValue)
    {
        Link current = first;
        while (current != null)
        {
            if (current.data == oldValue)
            {
                current.data = newValue;
            }
            current = current.next;
        }
    }

    // Zero method
    public void Zero()
    {
        Link current = first;
        while (current != null)
        {
            current.data = 0;
            current = current.next;
        }
    }

    // GetArray Method
    public long[] getArray()
    {
        int size = getSize();
        long[] dataArray = new long[size];
        Link current = first;
        int index = 0;
        while (current != null)
        {
            dataArray[index++] = current.data;
            current = current.next;
        }
        return dataArray;
    }

    // helper
    private int getSize()
    {
        int count = 0;
        Link current = first;
        while (current != null)
        {
            count++;
            current = current.next;
        }
        return count;
    }
}
