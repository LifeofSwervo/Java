package EmployeeBlueprints;

/**
 * This stores the name, relationship and phone number of
 * an emergency contact for an employee in the system.
 *
 * @author Lucas Hartman
 * @version 1.0.0
 */
public class EmergencyContact {

    private String name;
    private String relationship;
    private String phone;

    /**
     * Constructor that creates an EmployeeBlueprints.EmergencyContact
     * @param n String for the name
     * @param r String for the relationship
     * @param p String for the phone number
     */
    public EmergencyContact(String n, String r, String p)
    {
        name = n;
        phone = p;
        relationship = r;
    }

    /**
     * Sends the name back of the contact
     * @return a String for the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sends the phone back of the contact
     * @return a String for the phone number
     */
    public String getPhone()
    {
        return phone;
    }

    /**
     * Sends the relationship back of the contact
     * @return a String for the relationship
     */
    public String getRelationship()
    {
        return relationship;
    }

    /**
     * Updates the name of the contact
     * @param n a String for the new name
     */
    public void setName(String n)
    {
        name = n;
    }

    /**
     * Updates the phone number of the contact
     * @param p a String for the new phone number
     */
    public void setPhone(String p)
    {
        phone = p;
    }

    /**
     * Updates the relationship of the contact
     * @param r a String for the new relationship
     */
    public void setRelationship(String r)
    {
        relationship = r;
    }

    /**
     * Prints out the Emergency Contact's information.
     */
    public void printContact()
    {
        System.out.println("Name: " + name);
        System.out.println("Relationship: " + relationship);
        System.out.println("Phone Number: " + phone);
    }

}
