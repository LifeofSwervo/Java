public class Linked_List
{
    protected Link first;

    public Linked_List()
    {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void displayList()
    {
        Link current = first;
        while (current != null)
        {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }
}
