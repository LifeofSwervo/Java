public class EmergencyContact {
    // Declare Variables
    private String name;
    private String relationship;
    private String phone;

    public EmergencyContact(String n, String r, String p)
    {
        name = n;
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
    public void printContact()
    {
        System.out.println("Name: " + name + "\n"
        + "Relationship: " + relationship + "\n"
        + "Phone Number: " + phone);
    }
}
