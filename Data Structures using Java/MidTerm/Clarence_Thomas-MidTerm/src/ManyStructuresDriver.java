
public class ManyStructuresDriver
{
    public static void main(String[] args)
    {
        ManyStructures manyStructures = new ManyStructures(5);

        // Set values using setArray
        long[] newArray = {1, 2, 3, 4, 5};
        manyStructures.setDataArray(newArray);

        // Get and Print
        System.out.print("Array: ");
        manyStructures.printDataArray();

        // Get and print queue
        CustomQueue<Long> queue = manyStructures.getQueue();
        System.out.print("Queue: ");
        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
        }
        System.out.println();

        // Get and print stack
        CustomStack<Long> stack = manyStructures.getStack();
        System.out.print("Stack: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();

        // Get and print linked list
        Link linkedList = manyStructures.getLinkedList();
        System.out.print("Linked List: ");
        while (linkedList != null) {
            System.out.print(linkedList.data + " ");
            linkedList = linkedList.next;
        }
    }
}
