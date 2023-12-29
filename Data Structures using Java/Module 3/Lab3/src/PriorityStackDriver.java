public class PriorityStackDriver
{
    public static void main(String[] args)
    {
        PriorityStack stack = new PriorityStack(5); // Instantiate a PriorityStack object.

        // Use your push() method to add Order objects into the stack.
        stack.push(new Order("1, 2, 3", 1));
        stack.push(new Order("4, 5, 6", 2));
        stack.push(new Order("7, 8, 9", 3));
        stack.push(new Order("10, 11, 12", 4));
        stack.push(new Order("13, 14, 15", 5));

        // Demonstrate your peek(), isEmpty(), isFull(), and numberOfOrders() methods.
        System.out.println("Peek: " + stack.peek());
        System.out.println("Is Full: " + stack.isFull());
        System.out.println("Is Empty: " + stack.isEmpty());
        System.out.println("Peek: " + stack.numberOfOrders());

        // Priority Sort
        stack.prioritySort();

        // Then pop() and display your Order objects from the stack.
        System.out.println("\nProcessing Orders: ");
        while (!stack.isEmpty())
        {
            Order processedOrder = stack.pop();
            System.out.println("Processed Order: " + processedOrder);
        }

    }
}
