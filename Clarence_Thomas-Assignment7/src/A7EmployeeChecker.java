/** Author:  Lucas Hartman
 *  Class:  INFO 1521 - Java 1
 *  Version 1.0.1
 *
 *  Purpose:  This file is a tester for Assignment 7 on the employee system. Use this to
 *            test your code.  The output from this file should match what is shown in the
 *            assignment page on canvas.  If something is off, modify your Employee file as needed.
 *
 *  ***********************    DO NOT MODIFY ******************************
 */

public class A7EmployeeChecker {

    public static void main(String[] args)
    {
        // setup employees
        Employee e1 = new Employee("Steve", "Rodgers", 3781, "Sales", "Manager", 28.50);
        Employee e2 = new Employee("Clint", "Barton", 6847, "Sales", "Customer Representative", 15.34);
        Employee e3 = new Employee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);

        System.out.println("*****  Assignment 7 Employee Checker *****  ");
        // print employees
        e1.printEmployee();
        System.out.println();
        e2.printEmployee();
        System.out.println();
        e3.printEmployee();
        System.out.println();
        System.out.println();

        // add some hours
        e1.addHours(5);
        e3.addHours();
        e2.addHours(12);
        e1.addHours(-20); // make sure you have negative check
	e1.addHours(7.65); // makes sure addHours also ADDS hours doesn't assign


        // print pay
        System.out.println("Employee Pay:");
        System.out.printf("%s : $%.2f%n", e1.getFirstName(), (double)Math.round(e1.calculateWeeklyPay()*100)/100);
        System.out.printf("%s : $%.2f%n", e2.getFirstName(), (double)Math.round(e2.calculateWeeklyPay()*100)/100);
        System.out.printf("%s : $%.2f%n%n", e3.getFirstName(), (double)Math.round(e3.calculateWeeklyPay()*100)/100);

        // copy employee and modify
        Employee e4 = new Employee(e3);
        e4.setFirstName("Thor");
        e4.setLastName("Odinson");
        e4.setEmployeeNumber(8623);
        e4.setPayRate(24.36);
        e4.addHours(18);

        // print new employee info
        System.out.println("\nNew Employee:");
        e4.printEmployee();
        System.out.println();

        // another new employee but using default constructor
        System.out.println("\nNew Blank Employee:");
        Employee e5 = new Employee();
        e5.printEmployee();

        // modify new employee 5
        e5.setFirstName("Natasha");
        e5.setLastName("Romanoff");
        e5.setEmployeeNumber(6589);
        e5.setPayRate(19.25);
        e5.setDepartment("Service");
        e5.setJobTitle("Repair Associate");
        e5.addHours(24);
        // print employee updates
        System.out.println("\nUpdated Emmployee");
        e5.printEmployee();
	
        // reset hours
        e1.resetHours();
        e2.resetHours();
        e3.resetHours();
        e4.resetHours();
	    e5.resetHours();

        System.out.println("\nLast Employee Print: ");
        // last print of employees
        e1.printEmployee();
        System.out.println();
        e2.printEmployee();
        System.out.println();
        e3.printEmployee();
        System.out.println();
        e4.printEmployee();
	System.out.println();
	e5.printEmployee();

    }
}
// **********************   DO NOT MODIFY ***************************