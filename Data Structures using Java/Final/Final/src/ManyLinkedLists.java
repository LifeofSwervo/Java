
public class ManyLinkedLists
{
    public static final int DoubleEndedList = 1;
    public static final int DoublyLinkedList = 2;

    /**
     * - Created Linked list, static object method. Creates linked list that is either DEL or DLL.
     * @param type - Indicator to the type of Linked list.
     * @return - Returns a new list or an exception.
     */
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
