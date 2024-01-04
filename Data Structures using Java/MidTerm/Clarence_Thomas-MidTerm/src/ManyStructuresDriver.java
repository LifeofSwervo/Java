import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class ManyStructuresDriver
{
    public static void main(String[] args)
    {
        ManyStructures manyStructures = new ManyStructures(5);

        // Set values using setArray
        long[] newArray = {1, 2, 3, 4, 5};
        manyStructures.setDataArray(newArray);

        // Get and Print
        System.out.println("Array: " + Arrays.toString(manyStructures.getDataArray()));

        // Get and print queue
        Queue<Long> queue = manyStructures.getQueue();
        System.out.print("Queue: ");
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
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