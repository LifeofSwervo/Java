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

    /**
     * - Get Employee, employee method. Getter for employee
     * @return - Returns employee.
     */
    public Employee getEmployee()
    {
        return employee;
    }

    /**
     * - Set next, void method.
     * @param next - Next variable being set.
     */
    public void setNext(EmployeeNode next)
    {
        this.next = next;
    }

    /**
     * - Get next, EmployeeNode method. Getter for next.
     * @return - Returns next.
     */
    public EmployeeNode getNext()
    {
        return next;
    }
}
