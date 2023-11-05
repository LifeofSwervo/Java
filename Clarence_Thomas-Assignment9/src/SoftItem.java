import java.util.ArrayList;

public final class SoftItem extends Item
{
    private String gender;
    private String type;
    private ArrayList<Inventory> inventory;

    public SoftItem(String sku, String name, String manufacturer, double price, String location,
                    String gender, String type)
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

    public void addItem(Inventory newItem)
    {
        inventory.add(newItem);
    }
    public String getUPC(String size, String color)
    {
        for (Inventory item : inventory)
        {
            if (item.getSize().equals(size) && item.getColor().equals(color))
            {
                return item.getUPC();
            }
        }
        return null;
    }
    public void setUpc(String upc)
    {

    }
    public boolean addInventory(String upc, int amt)
    {
        for (Inventory item : inventory)
        {
            if (item.getUPC().equals(upc))
            {
                item.addInventory(amt);
            }
        }
        return false;
    }
    public boolean sellItem(String upc)
    {
        for (Inventory item : inventory)
        {
            if (item.getUPC().equals(upc))
            {
                if(item.sellItem())
                {
                    System.out.println("Sold item with UPC: " + upc);
                    return true;
                } else
                {
                    System.out.println("Failed to sell item with UPC: " + upc);
                    return false;
                }
            }
        }
        System.out.println("Items with UPC " + upc + " not found in inventory.");
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
                "Gender: " + gender + "\n"
                + "Type: " + type + "\n"
                + "Inventory: " + inventoryString.toString();
    }
}
