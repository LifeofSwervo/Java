import java.time.LocalDate;

public class Employee
{
    private String firstName;
    private String lastName;
    private int id;
    private LocalDate dateOfBirth;
    private double rateOfPay;

    public Employee(String firstName, String lastName, int id, LocalDate dateOfBirth, double rateOfPay)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.rateOfPay = rateOfPay;
    }

    public Employee(Employee employee)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.rateOfPay = rateOfPay;
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

    public int getId()
    {
        return id;
    }

    public LocalDate getDateOfBirth()
    {
        return dateOfBirth;
    }

    public double getRateOfPay()
    {
        return rateOfPay;
    }
}


