package App;

/**
 *
 * @author Lucas Hartman
 * @version 1.0.0
 * 
 * This file will run through and make sure you have implemented 
 * the Enumerations and Packages correct
 */

import EmployeeObjects.SalaryEmployee;
import EmployeeObjects.HourlyEmployee;
import EmployeeObjects.CommissionEmployee;
import EmployeeBlueprints.Employee;
import static EmployeeBlueprints.EmployeeType.*;

public class A10EmployeeChecker {
    /**
     * Main method to test out the A10 items.
     * @param args String array of console inputs
     */
    public static void main(String[] args)
    {
        Employee[] employees = new Employee[5];
        
        employees[0] = new SalaryEmployee("Steve", "Rodgers", 3781, "Sales", "Manager", 64325);
        employees[1] = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", .0265);
        employees[2] = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        employees[3] = new HourlyEmployee("Thor", "Odinson", 1281, "Operations", "Product Stocker", 12.76);
        employees[4] = new SalaryEmployee("Bruce", "Banner", 7589, "Service", "Manager", 43876);
        
        // use employee type to only print salary employees
        System.out.println("**** Salary Employees ****");
        for (Employee e : employees)
        {
            if (e.getEmployeeType() == SALARY)
            {
                System.out.println(e + "\n");
            }
        }
        
        // use employee type to only print hourly employees
        System.out.println("**** Hourly Employees ****");
        for (Employee e : employees)
        {
            if (e.getEmployeeType() == HOURLY)
            {
                System.out.println(e + "\n");
            }
        }
        
        // use employee type to only print the commission employees
        // also check the print() method
        System.out.println("**** Commission Employees ****");
        for (Employee e : employees)
        {
            if (e.getEmployeeType() == COMMISSION)
            {
                e.print();
            }
        }
    }
}
