
public class ManyLinkedLists
{
    public static final int DoubleEndedList = 1;
    public static final int DoublyLinkedList = 2;

    public static Object createLinkedList(int type)
    {
        switch(type)
        {
            case DoubleEndedList:
                return new DoubleEndedList();
            case DoublyLinkedList:
                return new DoublyLinkedList();
            default:
                throw new IllegalArgumentException("Invalid linked list type: ");
        }
    }
}
