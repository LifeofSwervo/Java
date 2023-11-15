package EmployeeObjects;
import EmployeeBlueprints.Employee;
import EmployeeBlueprints.EmployeeType;
/**
 *
 * @author Lucas Hartman
 * @version 1.0.0
 */

/**
 * Main HourlyEmployee super class, containing wage and hourly pay information.
 */
public final class HourlyEmployee extends Employee {
    private double wage;
    private double hoursWorked;

    /**
     * Main constructor taking on all the values
     * @param fn a String for first name
     * @param ln a String for last name
     * @param en an int for the employee number
     * @param dept a String for the department
     * @param job a String for the job title
     * @param w a double for the wage
     */
    public HourlyEmployee(String fn, String ln, int en, String dept, String job, double w)
    {
        super(fn, ln, en, dept, job, EmployeeType.HOURLY);
        wage = w;
        hoursWorked = 0.0;
    }

    /**
     * Increases hours by 1
     */
    public void increaseHours()
    {
        hoursWorked += 1;
    }

    /**
     * Adds the value 'h' sent to the hours.
     * @param h is a double for hours
     */
    public void increaseHours(double h)
    {
        if (h > 0) { // checks to make sure it is positive before adding.
            hoursWorked += h;
        }
    }

    /**
     * Calculates weekly pay by multiplying pay * wage
     * @return Return's pay (overtime if greater than 40)
     */
    @Override
    public double calculateWeeklyPay()
    {
        double pay = wage * hoursWorked;
        if (hoursWorked > 40) // checks for overtime by seeing if hoursWorked > 40
        {
            pay = wage * 40 + (wage*1.5) * (hoursWorked-40); // if so recalculates by giving 1.5*wage for hourly pay above 40
        }
        
        return pay;
    }

    /**
     * Gives annual raise of 5% to the employee
     */
    @Override
    public void annualRaise()
    {
       wage += wage * .05;
    }

    /**
     * Gives a holiday bonus of a full 40 hour week
     * @return Return's wage * 40.
     */
    @Override
    public double holidayBonus()
    {
        return 40 * wage;
    }

    /**
     * Resets hoursWorked to 0 for the week
     */
    @Override
    public void resetWeek()
    {
        hoursWorked = 0.0;
    }

    /**
     * Returns back a string representation of the employee
     * @return gives wage and hours worked
     */
    @Override
    public String toString()
    {
        return super.toString() + "\nWage: " + currency.format(wage) +"\nHours Worked: " + hoursWorked;
    }

    /**
     * Updates the wage value to the sent pay
     * @param pay a double for the new pay
     */
    @Override
    public void setPay(double pay)
    {
        wage = pay;
    }
}
