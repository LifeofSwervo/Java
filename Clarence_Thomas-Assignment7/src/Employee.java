import java.text.NumberFormat;

public class Employee
{
    // Declare variables
    private String firstName;
    private String lastName;
    private int employeeNum;
    private String department;
    private String jobTitle;
    private double hoursWorked;
    private double payRate;
    private static NumberFormat currency = NumberFormat.getCurrencyInstance();

    // Constructors
    public Employee(String fn, String ln, int en, String dept, String job, double pr)
    {
        firstName = fn;
        lastName = ln;
        employeeNum = en;
        department = dept;
        jobTitle = job;
        payRate = pr;
    }

    public Employee(String fn, String ln, int en)
    {
        this(fn, ln, en, "", "", 0.0);
    }

    public Employee(Employee event)
    {
        firstName = event.getFirstName();
        lastName = event.getLastName();
    }
        // Getters
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public int getEmployeeNumber()
    {
        return employeeNum;
    }
        // Setters
    public void setFirstName()
    {
        firstName = fn;
    }
    public void setLastName()
    {
        lastName = ln;
    }
    public void setEmployeeNum()
    {
        employeeNum = en;
    }

    public String printEmployee()
    {
        System.out.println("Name: " + firstName + " " + lastName + "\n"
        + "ID: " + employeeNum + "\n"
        + "Department: " + department + "\n"
        + "Title: " + jobTitle + "\n"
        + "Pay: " + currency.format(payRate) + "\n"
        + "Hours Worked: " + hoursWorked);
    }
}
