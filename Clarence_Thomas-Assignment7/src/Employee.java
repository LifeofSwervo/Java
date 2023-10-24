// @author: Clarence Thomas
// CLASS: Info 1521 WA
// ASSIGMENT: Assignment 7
// @version: October 23rd, 2023
/* RESOURCES: Referenced coding examples and book examples. */

/* EXPLANATION: Employee Project, displaying the employee information to the user.  */

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
    // Main Constructor setting up Employee's
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
    // Constructor with no dept, job or pay rate
    public Employee(String fn, String ln, int en)
    {
        firstName = fn;
        lastName = ln;
        employeeNum = en;
        department = "";
        jobTitle = "";
        hoursWorked = 0.0;
        payRate = 0;
    }

    public Employee(Employee e) // Sets value's
    {
        firstName = e.getFirstName();
        lastName = e.getLastName();
        employeeNum = e.getEmployeeNumber();
        department = e.getDepartment();
        jobTitle = e.getJobTitle();
        hoursWorked = 0.0;
        payRate = e.getPayRate();
    }
    // Default Constructor
    public Employee()
    {
        firstName = "";
        lastName = "";
        employeeNum = 0;
        department = "";
        jobTitle = "";
        hoursWorked = 0.0;
        payRate = 0;
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
    public void resetHours() // Sets hours worked to 0.0
    {
        hoursWorked = 0.0;
    }
    public double calculateWeeklyPay() // Returns payRate times hoursWorked
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

    public void printEmployee() // Prints Employee info
    {
        System.out.println("Name: " + firstName + " " + lastName + "\n"
        + "ID: " + employeeNum + "\n"
        + "Department: " + department + "\n"
        + "Title: " + jobTitle + "\n"
        + "Pay: " + currency.format(payRate) + "\n"
        + "Hours Worked: " + hoursWorked);
    }
}
