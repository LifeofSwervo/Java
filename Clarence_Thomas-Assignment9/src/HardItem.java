// @author: Clarence Thomas
// CLASS: Info 1521 WA
// ASSIGMENT: Assignment 9
// @version: November 6th, 2023
/* RESOURCES: Referenced coding examples and book examples, along with videos given. */

/* EXPLANATION: Returns HardItem details for A9RetailChecker.java  */
public final class HardItem extends Item
{
    // Declare Variables
    private String type;
    private String material;
    private int quantity;
    private String upc;
    // Constructor
    public HardItem(String sku, String name, String manufacturer, double price, String location,
                    String type, String material, int quantity, String upc)
    {
        super(sku, name, manufacturer, price, location);
        this.type = type;
        this.material = material;
        this.quantity = quantity;
        this.upc = upc;
    }
    // Methods
        // Getters
    public String getType()
    {
        return type;
    }
    public String getMaterial()
    {
        return material;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public String getUPC(String size,  String color)
    {
        return upc;
    }
        // Setters
    public void setType(String type)
    {
        this.type = type;
    }
    public void setMaterial(String material)
    {
        this.material = material;
    }
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    public void setUpc(String upc)
    {
        this.upc = upc;
    }

    // Add the "amt" to quantity
    public boolean addInventory(String upc, int amt)
    {
        if (amt > 0) // If positive
        {
            quantity += amt; // add amt to quantity
            return true;
        } else
        {
            return false; // Otherwise return false
        }
    }
    public boolean sellItem(String upc)
    {
        if (quantity > 0) // If positive
        {
            quantity--; // Lower value
            return true;
        } else // Otherwise return false
        {
            return false;
        }
    }
    @Override
    public String toString()
    {
        return super.toString() +
                "\nType: " + type + "\n"
                + "Material: " + material + "\n"
                + "Quantity: " + quantity + "\n"
                + "UPC: " + upc;
    }
}
