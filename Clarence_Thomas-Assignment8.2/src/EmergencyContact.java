// @author: Clarence Thomas
// CLASS: Info 1521 WA
// ASSIGMENT: Assignment 8
// @version: October 30th, 2023
/* RESOURCES: Referenced coding examples and book examples. */

/* EXPLANATION: Returns emergency contact information in the format requested  */

public class EmergencyContact {
    // Declare Variables
    private String name;
    private String relationship;
    private String phone;

    // Constructor
    public EmergencyContact(String n, String r, String p)
    {
        name = n;
        relationship = r;
        phone = p;
    }

    // Methods
        // Getters
    public String getName()
    {
        return name;
    }
    public String getRelationship()
    {
        return relationship;
    }
    public String getPhone()
    {
        return phone;
    }
        // Setters
    public void setName(String n)
    {
        name = n;
    }
    public void setRelationship(String r) {
        relationship = r;
    }
    public void setPhone(String p)
    {
        phone = p;
    }

    public void printContact() { // Prints out info of the contact
        System.out.println("Name: " + name + "\n"
        + "Relationship: " + relationship + "\n"
        + "Phone Number: " + phone);
    }
}
