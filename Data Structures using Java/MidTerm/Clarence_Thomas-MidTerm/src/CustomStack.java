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
    public void push(T value) {
        if (!isFull()) {
            stackArray[++top] = value;
        } else {
            System.out.println("Stack is full. Cannot push " + value);
        }
    }

    public T pop() {
        if (!isEmpty()) {
            return stackArray[top--];
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return null;
        }
    }

    public T peek() {
        if (!isEmpty()) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty. Cannot peek.");
            return null;
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }
}

