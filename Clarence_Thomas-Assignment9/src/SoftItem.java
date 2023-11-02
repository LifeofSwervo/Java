import java.util.ArrayList;

public class SoftItem
{
    private String gender;
    private String type;
    private ArrayList<Inventory> inventory;

    public HardItem(String sku, String name, String manufacturer, double price, String location,
                    String gender, String type)
    {
        this.gender = gender;
        this.type = type;
        this.inventory = inventory;
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

    public void getItem(Inventory newItem)
    {

    }
    public String getUPC(String size, String color)
    {

    }
    public void setUpc(String upc)
    {

    }
    public String toString()
    {

    }
}
