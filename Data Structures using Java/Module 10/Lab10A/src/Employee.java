import java.time.LocalDate;

public class Employee
{
    private String firstName;
    private String lastName;
    private int id;
    private LocalDate dateOfBirth;
    private double rateOfPay;

    /**
     * - Constructor,
     * @param firstName - String, first name of employee.
     * @param lastName - String, last name of employee.
     * @param id - integer, ID of the employee.
     * @param dateOfBirth - Local Date, date of birth of the employee.
     * @param rateOfPay - Double, employee's rate of pay.
     */
    public Employee(String firstName, String lastName, int id, LocalDate dateOfBirth, double rateOfPay)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.rateOfPay = rateOfPay;
    }

    /**
     * - Employee, copy constructor.
     * @param employee - Employee variable, employee variable for copy constructor. 
     */
    public Employee(Employee employee)
    {
        this.firstName = employee.firstName;
        this.lastName = employee.lastName;
        this.id = employee.id;
        this.dateOfBirth = employee.dateOfBirth;
        this.rateOfPay = employee.rateOfPay;
    }

    // Getters

    /**
     * - Get first name, string method.
     * @return - Returns first name.
     */
    public String getFirstName()
    {
        return firstName;
    }
    /**
     * - Get last name, string method.
     * @return - Returns last name.
     */
    public String getLastName()
    {
        return lastName;
    }
    /**
     * - Get ID, integer method.
     * @return - Returns ID of employee.
     */
    public int getId()
    {
        return id;
    }

    /**
     * - Get date of birth, local date method.
     * @return - Returns date of birth of employee.
     */
    public LocalDate getDateOfBirth()
    {
        return dateOfBirth;
    }

    /**
     * - Get rate of pay, double method.
     * @return - Returns rate of pay of the employee.
     */
    public double getRateOfPay()
    {
        return rateOfPay;
    }
}


