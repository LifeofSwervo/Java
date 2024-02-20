import java.util.LinkedList;

public class ManyLinkedListDriver
{
    public static void main(String[] args)
    {
        LinkedList list1 = ManyLinkedLists.createLinkedList(ManyLinkedLists.DoubleEndedList);
        LinkedList list2 = ManyLinkedLists.createLinkedList(ManyLinkedLists.DoublyLinkedList);

        System.out.println("Double ended list: ");
        ((DoubleEndedList) list1).insertFirst(10);
        list1.displayList();

    }
}
