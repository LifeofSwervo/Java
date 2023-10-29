/** Author:  Lucas Hartman
 *  Class:  INFO 1521 - Java 1
 *  Version 1.0.0
 *
 *  Purpose:  This file is a tester for Assignment 8 on the employee system. Use this to
 *            test your code.  The output from this file should match what is shown in the
 *            assignment page on canvas.  If something is off, modify your Employee file as needed.
 *
 *  ***********************    DO NOT MODIFY ******************************
 */

public class A8EmployeeChecker {

    public static void main(String[] args)
    {
        // setup employees
        Employee e1 = new Employee("Steve", "Rodgers", 3781, "Sales", "Manager", 28.50);
        Employee e2 = new Employee("Clint", "Barton", 6847, "Sales", "Customer Representative", 15.34);
        Employee e3 = new Employee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);

        // everyone gets Nick Furry as a contact
        EmergencyContact nickFurry = new EmergencyContact("Nick Furry", "Boss", "He will contact you");

        e1.addNewContact(new EmergencyContact("Peggy Carter", "Friend", "202-896-3633"));
        e1.addNewContact(new EmergencyContact("Sharon Carter", "Friend", "202-836-9963"));
        e1.addNewContact(nickFurry);

        e2.addNewContact(new EmergencyContact("Laura Barton", "Spouse", "319-225-7451"));
        e2.addNewContact(nickFurry); // nick furry

        e3.addNewContact(new EmergencyContact("Virginia Potts", "Spouse", "646-746-1025"));
        e3.addNewContact(new EmergencyContact("Happy Hogan", "Bodyguard", "646-021-4411"));
        e3.addNewContact(nickFurry); // nick furry

        System.out.println("*****  Assignment 8 Employee Checker *****  ");
        System.out.println("\n   ** Steve Rodgers **");
        e1.printEmergencyContacts();

        System.out.println("\n   ** Clint Barton **");
        e2.printEmergencyContacts();

        System.out.println("\n   ** Tony Stark **");
        e3.printEmergencyContacts();

        // change tony's wife to nickname Pepper
        e3.getEmergencyContactList().get(0).setName("Pepper Potts");
        System.out.println("\n   **Updated Tony Stark **");
        e3.printEmergencyContacts();

        // remove sharon from contact, he went back in time
        e1.removeContact(1);
        System.out.println("\n   **Updated Steve Rodgers **");
        e1.printEmergencyContacts();
        // also remove nick furry, again went back in time and didn't know Nick (per say ;)  )
        e1.removeContact(nickFurry);
        System.out.println("\n   **Updated (Again) Steve Rodgers **");
        e1.printEmergencyContacts();

	// makes sure you implemented removeContact correctly here.
	e1.removeContact(10);
	e1.removeContact(-2);
	e1.removeContact(nickFurry);

    }
}
// **********************   DO NOT MODIFY ***************************