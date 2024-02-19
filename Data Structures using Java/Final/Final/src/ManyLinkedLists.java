import java.util.LinkedList;

public class ManyLinkedLists
{
    public static final int DoubleEndedList = 1;
    public static final int DoublyLinkedList = 2;

    public static LinkedList createLinkedList(int type)
    {
        switch(type)
        {
            case DoubleEndedList:
                return new DoubleEndedList();
            case DoublyLinkedList:
                return new DoublyLinkedList();
        }
    }
}
