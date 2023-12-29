public class PriorityStack
{
    private int maxSize;
    private Order[] orderArray;
    private int top;

    public PriorityStack(int maxSize)
    {
        this.maxSize = maxSize;
        this.orderArray = new Order[maxSize];
        this.top = -1;
    }
    public void push(Order order)
    {
        if (!isFull())
        {
            orderArray[++top] = order;
        } else
        {
            System.out.println("Stack is full.");
        }
    }
    public Order pop() {
        if (!isEmpty()) {
            return orderArray[top--];
        } else {
            System.out.println("Stack is empty. Cannot pop more orders.");
            return null;
        }
    }
    public Order peek()
    {
        if (!isEmpty())
        {
            return orderArray[top--];
        } else
        {
            System.out.println("Stack is empty. Cannot peek");
            return null;
        }
    }
    public boolean isEmpty()
    {
        return top == -1;
    }
    public boolean isFull()
    {
        return top == maxSize - 1;
    }
    public int numberOfOrders()
    {
        int count = 0;
        for (Order order : orderArray)
        {
            if (order != null)
            {
                count++;
            }
        }
        return count;
    }
    public void prioritySort()
    {
        for (int i = 0; i < top; i++)
        {
            for (int j = 0; j < top - 1; j++)
            {
                if (orderArray[j].getPriority() < orderArray[j + 1].getPriority())
                {
                    Order temp = orderArray[j + 1];
                    orderArray[j] = orderArray[j + 1];
                    orderArray[j + 1] = temp;
                }
            }
        }
    }
}
