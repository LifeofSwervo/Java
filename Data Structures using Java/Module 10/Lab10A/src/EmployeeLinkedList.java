public class EmployeeLinkedList
{
    private EmployeeNode head;

    public void addToFront(Employee employee)
    {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
    }

    /**
     * - Find, employee method. Finds the selected ID.
     * @param id - Integer, provides employee id.
     * @return - Returns Employee if found, null if not. 
     */
    public Employee find(int id)
    {
        EmployeeNode current = head;
        while (current != null)
        {
            if (current.getEmployee().getId() == id)
            {
                return new Employee(current.getEmployee());
            }
            current = current.getNext();
        }
        return null;
    }
}