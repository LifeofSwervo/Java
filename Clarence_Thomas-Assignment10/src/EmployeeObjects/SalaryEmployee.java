package EmployeeObjects;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import EmployeeBlueprints.EmployeeType;
import EmployeeObjects.SalaryEmployee;

import EmployeeBlueprints.Employee;

/**
 * This is the salary employee for which they have a set yearly pay.
 *
 * @author Lucas Hartman
 * @version 1.0.0
 */
public final class SalaryEmployee extends Employee {
    
    private double salary;

    /**
     * Constructor to set up the salary employee
     * @param fn String for the first name
     * @param ln String for the last name
     * @param en int for the employee number
     * @param dept String for the department they work in
     * @param job String for the job title
     * @param s double for the salary they make
     */
    public SalaryEmployee(String fn, String ln, int en, String dept, String job, double s)
    {
        super(fn, ln, en, dept, job, EmployeeType.SALARY);
        salary = s;
    }

    /**
     * This will return salary divided by 52(weeks in a year)
     * @return double for the weekly pay - salary/52
     */
    @Override
    public double calculateWeeklyPay()
    {
        return salary/52;
    }

    /**
     * This will give the salary an annual raise of 6.25%
     */
    @Override
    public void annualRaise()
    {
       salary += salary * .0625;
    }

    /**
     * This returns the holiday bonus of the employee which is
     * 3.365% of their salary
     * @return a double for the holiday bonus
     */
    @Override
    public double holidayBonus()
    {
        return salary * .03365;
    }

    /**
     * This is a blank method and does nothing
     */
    @Override
    public void resetWeek()
    {
        // nothing to reset
    }

    /**
     * This returns a String value of the salary employee
     * @return a String of the employee
     */
    @Override
    public String toString()
    {
        return super.toString() + "\nSalary: " + currency.format(salary);
    }

    /**
     * This updates the salary from the sent value.
     * @param pay a double of the updated salary
     */
    @Override
    public void setPay(double pay)
    {
        salary = pay;
    }
}
