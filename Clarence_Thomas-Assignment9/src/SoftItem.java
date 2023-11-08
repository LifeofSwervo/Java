// @author: Clarence Thomas
// CLASS: Info 1521 WA
// ASSIGMENT: Assignment 9
// @version: November 6th, 2023
/* RESOURCES: Referenced coding examples and book examples, along with videos given. */

/* EXPLANATION: Returns SoftItem details for A9RetailChecker.java  */

import java.util.ArrayList;

public final class SoftItem extends Item
{
    // Declare variables
    private String gender;
    private String type;
    private ArrayList<Inventory> inventory;
    // Constructor
    public SoftItem(String sku, String name, String manufacturer, double price, String location,
                    String type, String gender)
    {
        super(sku, name, manufacturer, price, location);
        this.gender = gender;
        this.type = type;
        this.inventory = new ArrayList<>();
    }
    // Methods
        // Getters
    public String getGender()
    {
        return gender;
    }
    public String getType()
    {
        return type;
    }
    public  ArrayList<Inventory> getInventory()
    {
        return inventory;
    }
    public String getUPC(String size, String color)
    {
        for (Inventory item : inventory) // Loop through array list
        {
            if (item.getSize().equals(size) && item.getColor().equals(color)) // Loop through inventory, return upc
            {
                return item.getUPC();
            }
        }
        return null;
    }
        // Setters
    public void setGender(String gender)
    {
        this.gender = gender;
    }
    public void setType(String type)
    {
        this.type = type;
    }
    public void setInventory(ArrayList<Inventory> inventory)
    {
        this.inventory = inventory;
    }

    public void addItem(Inventory newItem) // Adds item in the array list
    {
        inventory.add(newItem);
    }
    //public void setUpc(String upc)
    //{
    //
    //} Not used - No instructions on purpose or implementation
    public boolean addInventory(String upc, int amt)
    {
        for (Inventory item : inventory) // Loop through array list
        {
            if (item.getUPC().equals(upc)) // Find matching upc
            {
                item.addInventory(amt);
            }
        }
        return false;
    }
    public boolean sellItem(String upc)
    {
        for (Inventory item : inventory) // Loop through array list
        {
            if (item.getUPC().equals(upc)) // Find matching upc
            {
                if (item.sellItem())
                {
                    return true; // Item sold successfully
                } else
                {
                    return false; // Sale failed
                }
            }
        }
        // Item not found with UPC
        return false;
    }
    @Override
    public String toString()
    {
        StringBuilder inventoryString = new StringBuilder();
        for (Inventory item : inventory)
        {
            inventoryString.append(item.toString()).append("\n");
        }
        return super.toString() +
                "\nGender: " + gender + "\n"
                + "Type: " + type + "\n"
                + "Inventory: " + inventoryString.toString();
    }
}
