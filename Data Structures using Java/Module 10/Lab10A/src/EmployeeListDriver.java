import java.time.LocalDate;

public class EmployeeListDriver
{
    public static void main(String[] args)
    {
        EmployeeLinkedList list = new EmployeeLinkedList();

        // Add employees to the list
        list.addToFront(new Employee("Grace", "Adkins", 101,
                LocalDate.of(2003, 4, 3), 45.50));
        list.addToFront(new Employee("Paul", "Thomas", 102,
                LocalDate.of(2003, 5, 3), 60.25));
        list.addToFront(new Employee("Rick", "Sanchez", 103,
                LocalDate.of(1966, 10, 8), 80.40));

        // Find the employees
        Employee foundEmployee = list.find(102);
        if (foundEmployee != null)
        {
            System.out.println("Employee Found: " + foundEmployee.getFirstName() + " " + foundEmployee.getLastName());
        } else
        {
            System.out.println("Employee not found.");
        }

    }
}
