
public class ManyLinkedListDriver
{
    public static void main(String[] args)
    {
        DoubleEndedList list1 = (DoubleEndedList) ManyLinkedLists.createLinkedList(ManyLinkedLists.DoubleEndedList);
        DoublyLinkedList list2 = (DoublyLinkedList) ManyLinkedLists.createLinkedList(ManyLinkedLists.DoublyLinkedList);

        System.out.println("Double ended list: ");
        list1.insertFirst(22);
        list1.insertFirst(44);
        list1.insertLast(66);
        list1.insertLast(11);
        System.out.println("List after initial insertions:");
        list1.displayList();
        System.out.println();

        // Deleting from both ends
        System.out.println("Deleting first item: " + list1.deleteFirst());
        System.out.println("Deleting last item: " + list1.deleteLast());
        System.out.println();

        System.out.println("List after deletions:");
        list1.displayList();

        System.out.println("\nDoubly Linked List: ");
        list2.insertFirst(22);
        list2.insertLast(44);
        list2.insertLast(66);
        System.out.println("List after initial insertions:");
        list2.displayList();
        System.out.println();

        // Traversing forwards and backwards
        System.out.println("Traversing forwards:");
        Link current = list2.getFirst();
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("\nTraversing backwards:");
        current = list2.getLast();
        while (current != null) {
            current.displayLink();
            current = current.previous;
        }
    }
}
