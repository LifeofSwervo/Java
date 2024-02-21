
public class ManyLinkedListDriver
{
    public static void main(String[] args)
    {
        Linked_List list1 = (Linked_List) ManyLinkedLists.createLinkedList(ManyLinkedLists.DoubleEndedList);
        Linked_List list2 = (Linked_List) ManyLinkedLists.createLinkedList(ManyLinkedLists.DoublyLinkedList);

        System.out.println("Double ended list: ");
        ((DoubleEndedList) list1).insertFirst(10);
        ((DoubleEndedList) list1).insertLast(20);
        ((DoubleEndedList) list1).insertFirst(30);
        list1.displayList();

        System.out.println("\nDoubly Linked List: ");
        ((DoublyLinkedList) list2).insertFirst(100);
        ((DoublyLinkedList) list2).insertLast(200);
        ((DoublyLinkedList) list2).insertFirst(300);
        list2.displayList();

    }
}
