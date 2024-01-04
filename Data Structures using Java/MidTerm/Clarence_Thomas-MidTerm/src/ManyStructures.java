import java.util.LinkedList;
import java.util.Queue;

public class ManyStructures
{
    private long[] dataArray;

    /**
     * - Constructor,
     * @param length
     */
    public ManyStructures(int length)
    {
        dataArray = new long[length];
    }

    /**
     * - Get Data Array, getter for dataArray.
     * @return - Returns a clone of the data array.
     */
    public long[] getDataArray()
    {
        return dataArray.clone(); // Returns copy
    }

    /**
     * - Set Data Array, setter for dataArray.
     * @param newArray -
     */
    public void setDataArray(long[] newArray)
    {
        dataArray = newArray.clone();
    }

    /**
     * -
     * @return
     */
    public Queue<Long> getQueue()
    {
        Queue<Long> queue = new LinkedList<>();
        for (long element : dataArray)
        {
            queue.offer(element);
        }
        return queue;
    }

    /**
     *
     * @return
     */
    public CustomStack<Long> getStack() {
        CustomStack<Long> customStack = new CustomStack<>(dataArray.length);
        for (long element : dataArray) {
            customStack.push(element);
        }
        return customStack;
    }

    public Link getLinkedList()
    {
        Link head = new Link(dataArray[0]);
        Link current = head;
        for (int i = 1; i < dataArray.length; i++)
        {
            current.next = new Link(dataArray[i]);
            current = current.next;
        }
        return head;
    }
}
