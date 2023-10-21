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
        hoursWorked = 0.0;
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
        employeeNum = event.getEmployeeNumber();
        department = event.getDepartment();
        jobTitle = event.getJobTitle();
        hoursWorked = 0.0;
        payRate = event.getPayRate();
    }

    public Employee()
    {
        this("", "", 0);
    }
    // Methods
    public void addHours()
    {
        addHours(1.0);
    }
    public void addHours(double h)
    {
        if (h >= 0.0)
        {
            hoursWorked += h;
        }
    }
    public void resetHours()
    {
        hoursWorked = 0.0;
    }
    public double calculateWeeklyPay()
    {
        return payRate * hoursWorked;
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
    public String getDepartment()
    {
        return department;
    }
    public String getJobTitle()
    {
        return jobTitle;
    }
    public double getPayRate()
    {
        return payRate;
    }
        // Setters
    public void setFirstName(String fn)
    {
        firstName = fn;
    }
    public void setLastName(String ln)
    {
        lastName = ln;
    }
    public void setEmployeeNumber(int en)
    {
        employeeNum = en;
    }
    public void setDepartment(String dept)
    {
        department = dept;
    }

    public void setJobTitle(String job) {
        jobTitle = job;
    }
    public void setPayRate(double pr)
    {
        payRate = pr;
    }

    public void printEmployee()
    {
        System.out.println("Name: " + firstName + " " + lastName + "\n"
        + "ID: " + employeeNum + "\n"
        + "Department: " + department + "\n"
        + "Title: " + jobTitle + "\n"
        + "Pay: " + currency.format(payRate) + "\n"
        + "Hours Worked: " + hoursWorked);
    }
}
