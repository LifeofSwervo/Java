package EmployeeObjects;
import EmployeeBlueprints.Employee;
import EmployeeObjects.HourlyEmployee;
import EmployeeBlueprints.EmployeeType;
/**
 *
 * @author Lucas Hartman
 * @version 1.0.0
 */

public final class HourlyEmployee extends Employee {
    private double wage;
    private double hoursWorked;

    // constructor
    public HourlyEmployee(String fn, String ln, int en, String dept, String job, double w)
    {
        super(fn, ln, en, dept, job, EmployeeType.HOURLY);
        wage = w;
        hoursWorked = 0.0;
    }

    // adds 1 to hours
    public void increaseHours()
    {
        hoursWorked += 1;
    }

    // adds the value 'h' sent to the hours.
    // checks to make sure it is positive before adding.
    public void increaseHours(double h)
    {
        if (h > 0) {
            hoursWorked += h;
        }
    }

    // calculates weekly pay by multiply pay * wage
    // checks for overtime by seeing if hoursWorked > 40
    // if so recalculates by giving 1.5*wage for hourly pay above 40
    @Override
    public double calculateWeeklyPay()
    {
        double pay = wage * hoursWorked;
        if (hoursWorked > 40)
        {
            pay = wage * 40 + (wage*1.5) * (hoursWorked-40);
        }
        
        return pay;
    }

    // gives annual raise of 5% to the employee
    @Override
    public void annualRaise()
    {
       wage += wage * .05;
    }

    // gives a holiday bonus of a full 40 hour week
    @Override
    public double holidayBonus()
    {
        return 40 * wage;
    }

    // resets hoursWorked to 0 for the week
    @Override
    public void resetWeek()
    {
        hoursWorked = 0.0;
    }

    // returns back a string representation of the employee
    @Override
    public String toString()
    {
        return super.toString() + "\nWage: " + currency.format(wage) +"\nHours Worked: " + hoursWorked;
    }

    // updates the wage value to the sent pay
    @Override
    public void setPay(double pay)
    {
        wage = pay;
    }
}
