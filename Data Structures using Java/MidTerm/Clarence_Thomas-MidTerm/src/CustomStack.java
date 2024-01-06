public class CustomStack<T>
{
    private int maxSize;
    private T[] stackArray;
    private int top;
    /**
     * - Constructor, creates new stack specified by size (int).
     * @param size - Integer, allows user to specify size.
     */
    public CustomStack(int size)
    {
        maxSize = size;
        stackArray = (T[]) new Object[maxSize];// Create array
        top = -1; // No items yet
    }
    /**
     * - Push method, checks if stack has room for another value.
     * @param value - generic type, pushed into stack if it can fit.
     */
    public void push(T value)
    {
        if (!isFull())
        {
            stackArray[++top] = value;
        } else
        {
            System.out.println("Stack is full. Can't push " + value);
        }
    }

    /**
     * - Pop method, checks if stack is not empty, returns the top of stack and removes it.
     * @return - Returns element from the top of stack if not empty or null if empty.
     */
    public T pop()
    {
        if (!isEmpty())
        {
            return stackArray[top--];
        } else
        {
            System.out.println("Stack is empty. Can't pop.");
            return null;
        }
    }

    /**
     * - Peek method, checks if stack is not empty, returns the top of stack without removing it.
     * @return - Returns element from the top of stack if not empty or null if empty.
     */
    public T peek()
    {
        if (!isEmpty())
        {
            return stackArray[top];
        } else
        {
            System.out.println("Stack is empty. Can't peek.");
            return null;
        }
    }

    /**
     * - Checks if empty
     * @return - Returns true if top == -1, (indicating an empty stack).
     */
    public boolean isEmpty()
    {
        return top == -1;
    }

    /**
     * - Checks if full
     * @return - Returns true if top == maxSize - 1, (indicating a full stack).
     */
    public boolean isFull()
    {
        return top == maxSize - 1;
    }
}

