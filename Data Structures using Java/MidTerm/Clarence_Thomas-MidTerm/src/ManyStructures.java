
public class ManyStructures
{
    private long[] dataArray;

    /**
     * - Constructor, with length variable as argument.
     * @param length - An integer, representing size.
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
     * @param newArray - A long array, represents the new array being set.
     */
    public void setDataArray(long[] newArray)
    {
        dataArray = newArray.clone();
    }

    /**
     * - Array to String method,
     * @param array - A long array, iterated through.
     * @return - Returns final representation of the array.
     */
    private static String arrayToString(long[] array) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) { // Check if at the end of the array.
                sb.append(", "); // Append comma.
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /**
     * - Prints Data.
     */
    public void printDataArray() {
        System.out.println(arrayToString(dataArray));
    }


    /**
     * - Get Queue, getter for queue method.
     * @return - Returns queue.
     */
    public CustomQueue<Long> getQueue() {
        CustomQueue<Long> customQueue = new CustomQueue<>(dataArray.length);
        for (long element : dataArray) {
            customQueue.insert(element);
        }
        return customQueue;
    }

    /**
     * - Get Stack, getter for stack method.
     * @return - Returns Stack.
     */
    public CustomStack<Long> getStack() {
        CustomStack<Long> customStack = new CustomStack<>(dataArray.length);
        for (long element : dataArray) {
            customStack.push(element);
        }
        return customStack;
    }

    /**
     * - Get Linked List, getter for linked list.
     * @return - Returns head of linked list.
     */
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
