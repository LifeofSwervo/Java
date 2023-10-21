
// Employee system runner. Use this to test your assignment 7.
// Created by Lucas Hartman - MCC - INFO 1521 


import java.util.Scanner;
import java.util.ArrayList;

public class EmployeeSystem {
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
            System.out.println(e.getFirstName() + " " + e.getLastName() + "\nWeekly Pay: $" + Math.round(pay*100)/100);
            total += pay;
        } 
        // print out total
        System.out.println("Total Weekly Pay: " + total);
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
        // print options
        System.out.println("Choose options for modifying");
        System.out.println("1. Change Name");
        System.out.println("2. Change Job Title");
        System.out.println("3. Change Department");
        System.out.println("4. Change Pay");
        
        // get input and valid through the menu
        int choice = getInt(sc, "Choice: ");
        while (choice < 1 || choice > 4)
        {
            choice = getInt(sc, "Choice: ");
        }
        
        System.out.println(); // insert blank line
        switch(choice)
        {
            case 1:
                changeName(emp, sc);
                break;
            case 2:
                changeJobTitle(emp, sc);
                break;
            case 3:
                changeDepartment(emp, sc);
                break;
            case 4:
                changePay(emp, sc);
        }
        System.out.println("Employee Updated\n");
        
        
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
     * Helper method that reads in valid double input. If text is entered
     * then input is ask for again.
     * 
     * @param sc Scanner object to read input.
     * @param prompt message to print for the prompt
     * @return double value read in from the keyboard
     */
    public static double getDouble(Scanner sc, String prompt)
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
    public static int getInt(Scanner sc, String prompt)
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
