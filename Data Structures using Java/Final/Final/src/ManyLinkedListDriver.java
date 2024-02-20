import java.util.LinkedList;

public class ManyLinkedListDriver
{
    public static void main(String[] args)
    {
        Linked_List list1 = (Linked_List) ManyLinkedLists.createLinkedList(ManyLinkedLists.DoubleEndedList);
        Linked_List list2 = (Linked_List) ManyLinkedLists.createLinkedList(ManyLinkedLists.DoublyLinkedList);

        System.out.println("Double ended list: ");
        ((DoubleEndedList) list1).insertFirst(10);
        list1.displayList();

    }
}
