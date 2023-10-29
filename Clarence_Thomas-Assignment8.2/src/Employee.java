/**
 * This is the Employee class used for Assignment 8 in INFO 1521
 *
 * @author Lucas Hartman
 * @version 1.0.0
 *
 * Modify the code as needed to complete the assignment.
 */
import java.text.NumberFormat;

public class Employee {
    private String firstName;
    private String lastName;
    private int employeeNum;
    private String department;
    private String jobTitle;
    private double hoursWorked;
    private double payRate;

    private static NumberFormat currency = NumberFormat.getCurrencyInstance();
    
    public Employee(String fn, String ln, int en, String dept, String job, double pr)
    {
        firstName = fn;
        lastName = ln;
        employeeNum = en;
        department = dept;
        jobTitle = job;
        payRate = pr;
        hoursWorked = 0;        
    }
    
    public Employee(String fn, String ln, int en)
    {
        firstName = fn;
        lastName = ln;
        employeeNum = en;
        department = "";
        jobTitle = "";
        payRate = 0;
        hoursWorked = 0;
    }

    public Employee(Employee e)
    {
        firstName = e.getFirstName();
        lastName = e.getLastName();
        employeeNum = e.getEmployeeNumber();
        department = e.getDepartment();
        jobTitle = e.getJobTitle();
        payRate = e.getPayRate();
        hoursWorked = 0;
    }
    
    // default
    public Employee()
    {
        firstName = "";
        lastName = "";
        employeeNum = 0;
        department = "";
        jobTitle = "";
        payRate = 0;
        hoursWorked = 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getEmployeeNumber() {
        return employeeNum;
    }

    public String getDepartment() {
        return department;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setEmployeeNumber(int empNum)
    {
        employeeNum = empNum;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
    
    public void resetHours()
    {
        hoursWorked = 0;
    }
    
    public void addHours()
    {
        hoursWorked += 1;
    }
    
    public void addHours(double h)
    {
        if (h > 0) {
            hoursWorked += h;
        }

    }
    
    public double calculateWeeklyPay()
    {
        return hoursWorked * payRate;
    }
    
    public void printEmployee()
    {
        System.out.println("Name: " + firstName +" " + lastName + "\nID: " + employeeNum +
                "\nDepartment: " + department + "\nTitle: " + jobTitle + "\nPay: " + 
                currency.format(payRate) + "\nHours Worked: " + hoursWorked);
    }
}
