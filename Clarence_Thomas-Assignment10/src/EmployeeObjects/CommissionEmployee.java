package EmployeeObjects;
import EmployeeBlueprints.Employee;
import EmployeeBlueprints.EmployeeType;


/**
 * This is the commission employee that works on how much they sell
 * and make a percentage of their total sales.
 * @author Lucas Hartman
 * @version 1.0.0
 */
public final class CommissionEmployee extends Employee {
    
    private double sales;
    private double rate;

    /**
     * Constructor that sets up the commission employee.
     * @param fn String for the first name
     * @param ln String for the last name
     * @param en int for the employee number
     * @param dept String for the department they work in
     * @param job String fo rthe job title of the employee
     * @param r double for the percentage rate the employee makes
     */
    public CommissionEmployee(String fn, String ln, int en, String dept, String job, double r)
    {
        super(fn, ln, en, dept, job, EmployeeType.COMMISSION);
        rate = r;
        sales = 0.0;
    }

    /**
     * Increases sales of the employee by 100
     */
    public void increaseSales()
    {
        sales += 100.0;
    }

    /**
     * Increases sales of the employee by the send amount.
     * Also makes sure it isn't a negative value sent.
     * @param s double for the sales made
     */
    public void increaseSales(double s)
    {
        if (s > 0) {
            sales += s;
        }
    }

    /**
     * Calculates the pay for the employee by multiplying their commission rate and sales
     * @return a double for the weekly pay
     */
    @Override
    public double calculateWeeklyPay()
    {
        return rate * sales;
    }

    /**
     * Gives a raise of .2% to the employee
     */
    @Override
    public void annualRaise()
    {
       rate += .002;
    }

    /**
     * Does nothing. The commission employee doesn't get a bonus
     * @return double value of zero (0)
     */
    @Override
    public double holidayBonus()
    {
        return 0;
    }

    /**
     * Sets the weekly sales to zero (0)
     */
    @Override
    public void resetWeek()
    {
        sales = 0.0;
    }

    /**
     * Updates the commission rate by the value sent.
     * @param pay double for the updated commission rate
     */
    @Override
    public void setPay(double pay)
    {
        rate = pay;
    }

    /**
     * Returns a String to print out for the employee information.
     * @return a String of the employee
     */
    @Override
    public String toString()
    {
        return super.toString() + "\nRate: " + percent.format(rate) +"\nSales: " + currency.format(sales);
    }
}

