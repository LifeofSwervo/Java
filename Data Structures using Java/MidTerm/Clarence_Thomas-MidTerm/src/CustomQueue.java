public class CustomQueue<T>
{
    private int maxSize;
    private T[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public CustomQueue(int size) {
        maxSize = size;
        queArray = (T[]) new Object[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(T item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot insert " + item);
            return;
        }
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queArray[++rear] = item;
        nItems++;
    }

    public T remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot remove.");
            return null;
        }
        T temp = queArray[front++];
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        return temp;
    }

    public T peekFront() {
        return queArray[front];
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public boolean isFull() {
        return nItems == maxSize;
    }

    public int size() {
        return nItems;
    }
}
