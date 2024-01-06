public class CustomQueue<T>
{
    private int maxSize;
    private T[] queArray;
    private int front;
    private int rear;
    private int nItems; // Number of items variable

    /**
     * - Constructor, creates a new queue specified by size (int).
     * @param size - Integer, decides size of Queue.
     */
    public CustomQueue(int size)
    {
        maxSize = size;
        queArray = (T[]) new Object[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    /**
     * - Insert method, checks if queue is full,
     * @param item - generic type, inserted into queue.
     */
    public void insert(T item)
    {
        if (isFull())
        {
            System.out.println("Queue is full. Cannot insert " + item);
            return;
        }
        // Checks if end of queue has reached the end of the array
        if (rear == maxSize - 1)
        {
            rear = -1;
        }
        queArray[++rear] = item;
        nItems++;
    }

    /**
     * - Remove method, checks if queue is empty. If not, returns front of queue.
     * @return - Returns item removed from the front of queue, or null if empty.
     */
    public T remove()
    {
        if (isEmpty())
        {
            System.out.println("Queue is empty. Cannot remove.");
            return null;
        }
        T temp = queArray[front++];
        // Check if beginning (front) of queue has reached end of array.
        if (front == maxSize)
        {
            front = 0;
        }
        nItems--;
        return temp;
    }

    /**
     * - Returns element in the front of the queue without removing it.
     * @return - Returns front of queue.
     */
    public T peekFront()
    {
        return queArray[front];
    }

    /**
     * - Is Empty method, returns true if number of items in queue are 0.
     * @return - Returns true if empty.
     */
    public boolean isEmpty()
    {
        return nItems == 0;
    }
    /**
     * - Is Full method, returns true if number of items are equal to size
     * @return - Returns true if full.
     */
    public boolean isFull()
    {
        return nItems == maxSize;
    }

    /**
     * - Size method, returns size of queue.
     * @return - Returns number of items.
     */
    public int size()
    {
        return nItems;
    }
}
