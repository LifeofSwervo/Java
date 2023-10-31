
// Employee system runner. Use this to test your assignment 8.
// Created by Lucas Hartman - MCC - INFO 1521
// Version 2 - Added in the EmergencyContacts


import java.util.Scanner;
import java.util.ArrayList;

public class EmployeeSystemV2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Employee> empList = new ArrayList<>();
        
        // add some employees in
        empList.add(new Employee("Steve", "Rodgers", 3781, "Sales", "Manager", 28.50));
        empList.add(new Employee("Clint", "Barton", 6847, "Sales", "Customer Representative", 15.34));
        empList.add(new Employee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85));
        
        // loop through menu
        int choice = 0;
        while(choice != 8)
        {
            System.out.println("1. List Employees");
            System.out.println("2. Add Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. Modify Employee");
            System.out.println("5. Add Hours");
            System.out.println("6. Reset Hours");
            System.out.println("7. Calculate Weekly Pay");
            System.out.println("8. Exit");
            
            // get input and check valid range
            choice = getInt(input, "Choice: ");
            while (choice < 1 || choice > 8)
            {
                choice = getInt(input, "Choice: ");
            }
            System.out.println(); // add blank line
            switch(choice)
            {
                case 1:
                    printEmployees(empList);
                    break;
                case 2:
                    addEmployee(empList, input);
                    break;
                case 3: 
                    deleteEmployee(empList, input);
                    break;
                case 4:
                    modifyEmployee(empList, input);
                    break;
                case 5:
                    addHours(empList, input);
                    break;
                case 6:
                    resetHours(empList, input);
                    break;
                case 7:
                    calculateWeeklyPay(empList);
                    break;
            }
            System.out.println(); // insert blank line between each
        }
        
    }
    
    /**
     * Loops through all the employees and calls their print method.
     * 
     * @param emp ArrayList of Employees
     */
    public static void printEmployees(ArrayList<Employee> emp)
    {
        // call employee print method here.
        for (Employee e : emp)
        {
            e.printEmployee();
            System.out.println();
        }
    }
    
    /**
     * This method gets input to add a new employee into the system.
     * 
     * @param emp ArrayList of the employees
     * @param sc Scanner object
     */
    public static void addEmployee(ArrayList<Employee> emp, Scanner sc)
    {
        // input for employee
        System.out.println("*** Add Employee ***");
        System.out.print("Enter first name: ");
        String fn = sc.next();
        System.out.print("Enter last name: ");
        String ln = sc.next();
        int empNum = getInt(sc, "Enter employee number: ");
        System.out.print("Enter department: ");
        String dept = sc.next();
        System.out.print("Enter job title: ");
        String job = sc.next();
        double pay = getDouble(sc, "Enter pay rate: ");
        
        // create employee object
        Employee e = new Employee(fn, ln, empNum, dept, job, pay);
        
        emp.add(e); // add employee
    }
    
    /**
     * This method calls searchEmployee() to find an employee to delete from the list.
     * 
     * @param emp ArrayList of employees
     * @param sc Scanner object
     */
    public static void deleteEmployee(ArrayList<Employee> emp, Scanner sc)
    {
        int delete = searchEmployee(emp, sc, "delete");
        
        emp.remove(delete);
        System.out.println("Account Deleted");
    }
    
    /**
     * Calls the searchEmployee method and adds hours to employee found.
     * 
     * @param emp ArrayList of Employee objects
     * @param sc Scanner for input
     */
    public static void addHours(ArrayList<Employee> emp, Scanner sc)
    {
        int employee = searchEmployee(emp, sc, "add hours");  // find employee to add
        
        double hoursToAdd = getDouble(sc, "Enter hours to add: "); // get hours to add
        
        emp.get(employee).addHours(hoursToAdd); // add hours
    }
    
    /**
     * This method will reset all working hours of the employees.
     * 
     * @param emp ArrayList of employees
     * @param sc Scanner object
     */
    public static void resetHours(ArrayList<Employee> emp, Scanner sc)
    {
        for (Employee e : emp)
        {
            e.resetHours();
        } 
        System.out.println("\nHours Reset");
    }
    
    /**
     * This method will print the weekly pay of each 
     * employee and total it up for the week.
     * 
     * @param emp ArrayList of the employees
     */
    public static void calculateWeeklyPay(ArrayList<Employee> emp)
    {
        double total = 0;// total up
        for (Employee e : emp)
        {
            double pay = e.calculateWeeklyPay();
	    pay = (double)Math.round(pay*100)/100;
	    System.out.printf("%s %s%nWeekly Pay: $%.2f%n", e.getFirstName(), e.getLastName(), pay);
            total += pay;
        } 
        // print out total
        System.out.printf("Total Weekly Pay: $%.2f%n", total);
    }
    
    /**
     * This method will locate an employee in the list and return the index it is found at.
     * 
     * @param emp ArrayList of employees
     * @param sc Scanner object
     * @param prompt String to print in the prompt
     * @return index location of found employee
     */
    public static int searchEmployee(ArrayList<Employee> emp, Scanner sc, String prompt)
    {
        
        // quick print for searching employee
        System.out.println("ID Number:\tName");
        for (Employee e : emp)
        {
            System.out.println(e.getEmployeeNumber() + "\t" + e.getLastName() + ", " + e.getFirstName());
        }
        
        // look for employee search
        int index = -1;
        while(index == -1)
        {
            int searchID = getInt(sc, "Enter employee ID to " + prompt + ": "); // get valid input
            
            // loop through employees to search
            for (int i = 0; i < emp.size(); i++)
            {
                // if employee found save index and break out of loop.
                if (emp.get(i).getEmployeeNumber() == searchID)
                {
                    index = i;
                    break;
                }
            }
            
            // error if can't find employee
            if (index == -1)
            {
                System.out.println("Employee not found, search again");
            }
        }
        return index;
    }
    
    // sub method that lets us change the employee
    /**
     * This method will ask and call on methods depending on what modification
     * to the employeee you want to perform.
     * 
     * @param emp ArrayList of the employee
     * @param sc Scanner object
     */
    public static void modifyEmployee(ArrayList<Employee> emp, Scanner sc)
    {
        int choice;
        do {
            // print options
            System.out.println("Choose options for modifying");
            System.out.println("1. Change Name");
            System.out.println("2. Change Job Title");
            System.out.println("3. Change Department");
            System.out.println("4. Change Pay");
            System.out.println("5. Manage Emergency Contacts");
            System.out.println("6. Exit to Main Menu");

            // get input and valid through the menu
            choice = getInt(sc, "Choice: ");
            while (choice < 1 || choice > 6) {
                choice = getInt(sc, "Choice: ");
            }

            System.out.println(); // insert blank line
            switch (choice) {
                case 1:
                    changeName(emp, sc);
                    System.out.println("Employee Updated\n");
                    break;
                case 2:
                    changeJobTitle(emp, sc);
                    System.out.println("Employee Updated\n");
                    break;
                case 3:
                    changeDepartment(emp, sc);
                    System.out.println("Employee Updated\n");
                    break;
                case 4:
                    changePay(emp, sc);
                    System.out.println("Employee Updated\n");
                    break;
                case 5:
                    changeEmergencyContacts(emp, sc);
                    break;
            }

        }while (choice != 6);
        
        
    }
    
    /**
     * This method will get input for first and last name to then update
     * the searched for employees first and last name.
     * 
     * @param emp ArrayList of employees
     * @param sc Scanner object
     */
    public static void changeName(ArrayList<Employee> emp, Scanner sc)
    {
        System.out.println("*** Change Employee Name ***\n");
        int index = searchEmployee(emp, sc, "name change");
        
        // print employee
        emp.get(index).printEmployee();
        
        // get input
        System.out.print("Enter new first name: ");
        String fn = sc.next();
        System.out.print("Enter new last name: ");
        String ln = sc.next();
  
        // change the names
        emp.get(index).setFirstName(fn);
        emp.get(index).setLastName(ln);
        
    }
    
    /**
     * This method will get input and change the job title of the chosen employee
     * 
     * @param emp ArrayList of employees
     * @param sc Scanner object
     */
    public static void changeJobTitle(ArrayList<Employee> emp, Scanner sc)
    {
        System.out.println("*** Change Job Title ***\n");
        int index = searchEmployee(emp, sc, "job change");
        
        // print employee
        emp.get(index).printEmployee();
        
        // get input
        System.out.print("Enter new job: ");
        String job = sc.next();
  
        // change the job
        emp.get(index).setJobTitle(job);
    }
    
    /**
     * This method will get input and change the department of the chosen employee
     * 
     * @param emp ArrayList of employees
     * @param sc Scanner object
     */
    public static void changeDepartment(ArrayList<Employee> emp, Scanner sc)
    {
        System.out.println("*** Change Department ***\n");
        int index = searchEmployee(emp, sc, "department change");
        
        // print employee
        emp.get(index).printEmployee();
        
        // get input
        System.out.print("Enter new department: ");
        String dept = sc.next();
  
        // change the department
        emp.get(index).setDepartment(dept);
    }
    
    /**
     * This method will get input and change the pay of the chosen employee
     * 
     * @param emp ArrayList of employees
     * @param sc Scanner object
     */
    public static void changePay(ArrayList<Employee> emp, Scanner sc)
    {
        System.out.println("*** Change Pay Rate ***\n");
        int index = searchEmployee(emp, sc, "pay change");
        
        // print employee
        emp.get(index).printEmployee();
        
        // get input
        double pay = getDouble(sc, "Enter new pay: ");
  
        // change the pay
        emp.get(index).setPayRate(pay);
    }

    /**
     * This method will update/change the employee contacts as needed.
     * @param emp ArrayList of Employees
     * @param sc Scanner object
     */
    public static void changeEmergencyContacts(ArrayList<Employee> emp, Scanner sc)
    {
        System.out.println("*** Manage Employee Contacts ***\n");
        int index = searchEmployee(emp, sc, "manage emergency contacts"); // pick employee to do contacts

        Employee foundEmployee = emp.get(index); // create employee from search for easy reference

        // loop through options to modify same employee contacts
        int choice;
        do {

            // print employee
            System.out.println("\nEmployee: " + foundEmployee.getFirstName() + " " + foundEmployee.getLastName());

            // print contacts that employee has
            foundEmployee.printEmergencyContacts();

            System.out.println("\n1. Add New Contact");
            System.out.println("2. Modify a Contact");
            System.out.println("3. Clear All Contacts");
            System.out.println("4. Exit back to Modify Employee");

            // get input and valid through the menu
            choice = getInt(sc, "Choice: ");
            while (choice < 1 || choice > 6) {
                choice = getInt(sc, "Choice: ");
            }

            System.out.println(); // insert blank line
            switch (choice) {
                case 1:
                    addNewEmergencyContact(foundEmployee, sc);
                    System.out.println("New Contact Added\n");
                    break;
                case 2: // makes sure employee has at least 1 contact otherwise don't allow to modify
                    if (foundEmployee.getEmergencyContactList().size() > 0) {
                        System.out.println("*** Modify a Contact for " + foundEmployee.getFirstName() + " ***\n");
                        modifyEmergencyContact(foundEmployee.getEmergencyContactList(), sc);
                        System.out.println("Contact Updated\n");
                    }
                    else {
                        System.out.println("No Emergency Contacts to modify.");
                    }
                    break;
                case 3:
                    foundEmployee.clearContacts();
                    System.out.println("Contacts Cleared\n");
                    break;

            }

        }while(choice != 4);

        System.out.println();

    }

    /**
     * This method will get input for a new emergency contact and add it to the employee
     *
     * @param emp Employee object to add an emergency contact to
     * @param sc Scanner object
     */
    public static void addNewEmergencyContact(Employee emp, Scanner sc)
    {
        System.out.println("*** Add New Contact for " + emp.getFirstName() + " ***\n");

        // clear scanner because we are getting a full name with spaces and we just got int() input.
        sc.nextLine();
        // get input for new contact
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter relationship: ");
        String relationship = sc.nextLine(); // in case spaces are added "Best Friend" etc.

        System.out.print("Enter phone number: ");
        String phone = sc.nextLine(); // in case spaces are added

        // create a new contact
        EmergencyContact newContact = new EmergencyContact(name, relationship, phone);

        // add contact to new emloyee
        emp.addNewContact(newContact);

        System.out.println();

    }

    /**
     * This method will allow the user to modify the name, relationship and/or phone number of a contact.
     *
     * @param contactList ArrayList of the EmergencyContact to modify
     * @param sc Scanner object
     */
    public static void modifyEmergencyContact(ArrayList<EmergencyContact> contactList, Scanner sc)
    {
        System.out.print("Select a contact from list above: ");
        // contacts are printed with 1 - size,  so minus 1 to get actual index 0 - size-1
        int contactNum = getInt(sc,"Select a contact from list above: ") - 1;
        while (contactNum < 0 || contactNum >= contactList.size())
        {
            contactNum = getInt(sc,"Select a contact from list above: ") - 1; // again minus 1
        }

        // set up contact for chosen easy modification
        EmergencyContact contact = contactList.get(contactNum);
        // menu for what to modify chosen employee contact
        int choice;
        do {
            System.out.println("*** Contact Information ***");
            contact.printContact();
            System.out.println("1. Modify Name");
            System.out.println("2. Modify Relationship");
            System.out.println("3. Modify Phone Number:");
            System.out.println("4. Exit to Modify Contact");
            choice = getInt(sc, "Choice: ");
            while (choice < 1 && choice > 4) {
                choice = getInt(sc, "Choice: ");
            }

            // clear scanner for text input
            sc.nextLine();
            switch(choice) {
                case 1: // get new name and update
                    System.out.print("Enter new name: ");
                    String name = sc.nextLine();
                    contact.setName(name);
                    break;
                case 2: // get new relationship and update
                    System.out.print("Enter new relationship: ");
                    String relationship = sc.nextLine();
                    contact.setRelationship(relationship);
                    break;
                case 3: // get new phone number and update
                    System.out.print("Enter new phone number: ");
                    String phone = sc.nextLine();
                    contact.setPhone(phone);
                    break;
            }

        }while(choice != 4);


        System.out.println("\nContact Updated\n");

    }

    
    /**
     * Helper method that reads in valid double input. If text is entered
     * then input is ask for again.
     * 
     * @param sc Scanner object to read input.
     * @param prompt message to print for the prompt
     * @return double value read in from the keyboard
     */
    private static double getDouble(Scanner sc, String prompt)
    {
        boolean isValid = false;
        double value = 0.0;
        while(!isValid)
        {
            System.out.print(prompt);
            if(sc.hasNextDouble())
            {
                value = sc.nextDouble();
                isValid = true;
            }
            else
            {
                System.out.println("Error, must enter a number.");
                sc.nextLine(); // clear input
            }
        }
        return value;
    }
    
    /**
     * Helper method that reads in valid integer input. If text is entered
     * then input is asked for again.
     * 
     * @param sc Scanner object to read input.
     * @param prompt message to print for the prompt
     * @return integer value read in from the keyboard
     */
    private static int getInt(Scanner sc, String prompt)
    {
        boolean isValid = false;
        int value = 0;
        while(!isValid)
        {
            System.out.print(prompt);
            if(sc.hasNextInt())
            {
                value = sc.nextInt();
                isValid = true;
            }
            else
            {
                System.out.println("Error, must enter a number.");
                sc.nextLine(); // clear input
            }
        }
        return value;
    }
}
