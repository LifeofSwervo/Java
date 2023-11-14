package EmployeeBlueprints;
// tester employee

import java.text.NumberFormat;
import java.util.ArrayList;

/**
 * The main employee super class that holds the basic information of every
 * employee in the system
 *
 * @author Lucas Hartman
 * @version 1.0.3
 */
public abstract class Employee implements Printable {
    private String firstName;
    private String lastName;
    private int employeeNum;
    private String department;
    private String jobTitle;
    private EmployeeType employeeType;

    private ArrayList<EmergencyContact> emergencyContacts;


    /**
     * Main constructor that takes on all values
     * @param fn a String for first name
     * @param ln a String for last name
     * @param en an int for the employee number
     * @param dept a String for the department
     * @param job a String for the job title
     * @param et an EmployeeType of the employee
     */
    public Employee(String fn, String ln, int en, String dept, String job, EmployeeType et)
    {
        firstName = fn;
        lastName = ln;
        employeeNum = en;
        department = dept;
        jobTitle = job;
        emergencyContacts = new ArrayList<EmergencyContact>();
        percent.setMaximumFractionDigits(3);
        employeeType = et;
    }

    /**
     * The constructor that doesn't have the department or job of the employee
     * @param fn a String for first name
     * @param ln a String for last name
     * @param en an int for the employee number
     * @param et an EmployeeType of the employee
     */
    public Employee(String fn, String ln, int en, EmployeeType et)
    {
        firstName = fn;
        lastName = ln;
        employeeNum = en;
        department = "";
        jobTitle = "";
        emergencyContacts = new ArrayList<EmergencyContact>();
        percent.setMaximumFractionDigits(3);
        employeeType = et;
    }

    /**
     * The copy constructor that copies from the EmployeeBlueprints.Employee
     * Creates a new Emergency Contact list doesn't copy that.
     * @param e an EmployeeBlueprints.Employee to copy from.
     */
    public Employee(Employee e)
    {
        firstName = e.getFirstName();
        lastName = e.getLastName();
        employeeNum = e.getEmployeeNumber();
        department = e.getDepartment();
        jobTitle = e.getJobTitle();
        emergencyContacts = new ArrayList<EmergencyContact>();
        employeeType = e.getEmployeeType();
    }

    /**
     * Default constructor that sets everything to blank values.
     */
    public Employee()
    {
        firstName = "";
        lastName = "";
        employeeNum = 0;
        department = "";
        jobTitle = "";
        emergencyContacts = new ArrayList<EmergencyContact>();
        percent.setMaximumFractionDigits(3);
        employeeType = EmployeeType.HOURLY;
    }

    /**
     * Sends back the first name of the employee
     * @return a String for the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sends back the last name of the employee
     * @return a String for the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sends back the employee number of the employee
     * @return an int for the employee number
     */
    public int getEmployeeNumber() {
        return employeeNum;
    }

    /**
     * Sends the department the employee works in back
     * @return a String for the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sends the job title of the employee
     * @return a String for the job title
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Sends back the EmployeeType
     * @return a String for the employeeType
     */
    public EmployeeType getEmployeeType()
    {
        return employeeType;
    }

    /**
     * Updates the employee number
     * @param empNum an int for the new employee number
     */
    public void setEmployeeNumber(int empNum)
    {
        employeeNum = empNum;
    }

    /**
     * Updates the employee first name
     * @param firstName a String for the new first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Updates the employee last name
     * @param lastName a String for the new last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Updates the department the employee works in
     * @param department a String for the new department
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Updates the job title of the employee
     * @param jobTitle a String for the new department
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    /**
     * abstract method to calculate employee pay
     * @return a double of the weekly pay
     */
    public abstract double calculateWeeklyPay();

    /**
     * abstract method that resets the week for each employee
     * (hours, sales, etc)
     */
    public abstract void resetWeek();

    /**
     * abstract method that gives the employees an annual raise
     */
    public abstract void annualRaise();

    /**
     * abstract method that gives the employees a holiday bonus
     * @return a double for the amount of holiday bonus
     */
    public abstract double holidayBonus();

    /**
     * abstract method that updates the pay values for the employee
     * @param pay a double for the new pay
     */
    public abstract void setPay(double pay);

    /**
     * Updates the Employee type
     * @param et a variable for the new employeeType
     */
    public void setEmployeeType(EmployeeType et)
    {
        employeeType = et;
    }

    /**
     * Sends back a format of the EmployeeBlueprints.Employee to print out
     * @return a String of the employee
     */
    @Override
    public String toString()
    {
        return "Name: " + firstName +" " + lastName + "\nID: " + employeeNum +
                "\nDepartment: " + department + "\nTitle: " + jobTitle +
                employeeType.toString();
    }


    /**
     * Old print employee method for redundancy
     */
    @Override
    public void print()
    {
        System.out.println(toString());
    }

    /**
     * Loops through the emergnecy contacts and prints them out.
     */
    public void printEmergencyContacts()
    {
        System.out.println("**** Emergency Contacts ****\n");
        for (int i = 0; i < emergencyContacts.size(); i++)
        {
            System.out.println("**** Contact "+ (i+1) + "****");
            emergencyContacts.get(i).printContact();
            System.out.println(); // add a space between each
        }
    }

    /**
     * Clears the emergency contact list
     */
    public void clearContacts()
    {
        emergencyContacts.clear();
    }

    /**
     * Adds a new emergency contact to the employee
     * @param contact an EmployeeBlueprints.EmergencyContact to add to the list
     */
    public void addNewContact(EmergencyContact contact)
    {
        emergencyContacts.add(contact);
    }

    /**
     * Sends back the emergencyContact arraylist
     * @return ArrayList of EmergencyContacts
     */
    public ArrayList<EmergencyContact> getEmergencyContactList() {
        return emergencyContacts;
    }

    /**
     * Removes a contact from the list based on parameter
     * @param contact EmployeeBlueprints.EmergencyContact to remove
     * @return true if found and removed, false otherwise
     */
    public boolean removeContact(EmergencyContact contact)
    {
        return emergencyContacts.remove(contact);
    }

    /**
     * Removes a contact based on index location in the list
     * @param index an int of the contact index
     * @return true if found and removed, false otherwise
     */
    public boolean removeContact(int index)
    {
        if (emergencyContacts.size() > index && emergencyContacts.size() > 0)
        {
            emergencyContacts.remove(index);
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Compares this employee to another one sent to see if they are the
     * same employee object
     * Compares via employeeNum values
     *
     * @param obj2 an Object of the EmployeeBlueprints.Employee to compare
     * @return true they are the same employee, false otherwise
     */
    public boolean equals(Object obj2)
    {
        if (obj2 instanceof Employee e2)
        {
            if (employeeNum == e2.getEmployeeNumber())
            {
                return true;
            }
        }
        return false;
    }

}
