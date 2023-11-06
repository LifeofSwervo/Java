public final class Electronic extends Item
{
    // Declare variables
    private String type;
    private String size;
    private String color;
    private int quantity;
    private int warranty;
    private String upc;
    // Constructor
    public Electronic(String sku, String name, String manufacturer, double price, String location, String type,
                      String size, String color, int quantity, int warranty, String upc)
    {
        super(sku, name, manufacturer, price, location);
        this.type = type;
        this.size = size;
        this.color = color;
        this.quantity = quantity;
        this.warranty = warranty;
        this.upc = upc;
    }

    // Methods
        // Getters
    public String getType()
    {
        return type;
    }
    public String getSize()
    {
        return size;
    }
    public String getColor()
    {
        return color;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public int getWarranty()
    {
        return warranty;
    }
    public String getUPC(String size, String color)
    {
        return upc;
    }
        // Setters
    public void setType(String type)
    {
        this.type = type;
    }
    public void setSize(String size)
    {
        this.size = size;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    public void setWarranty(int warranty)
    {
        this.warranty = warranty;
    }

    // Adds amount to the quantity field
    public boolean addInventory(String upc, int amt)
    {
        if (amt > 0) // If positive
        {
            quantity += amt; // add amt to quantity
            return true;
        } else // Otherwise return false
        {
            return false;
        }
    }
    public boolean sellItem(String upc) // Ensures' quantity is more than 0 before subtracting 1.
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
        return super.toString() + "\nType: " + type + "\n"
                + "Size: " + size + "\n"
                + "Color: " + color + "\n"
                + "Quantity: " + quantity + "\n"
                + "Warranty(months): " + warranty + "\n"
                + "UPC: " + upc;
    }
}
