public class EmployeeNode
{
    private Employee employee;
    private EmployeeNode next;

    /**
     * - Constructor, employee variable is used to create link objects.
     * @param employee - an Employee object in the Linked List.
     */
    public EmployeeNode(Employee employee)
    {
        this.employee = employee;
        this.next = null;
    }

    public Employee getEmployee()
    {
        return employee;
    }

    public void setNext(EmployeeNode next)
    {
        this.next = next;
    }

    public EmployeeNode getNext()
    {
        return next;
    }
}
