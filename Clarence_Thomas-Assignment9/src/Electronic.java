public final class Electronic extends Item
{
    private String type;
    private String size;
    private String color;
    private int quantity;
    private int warranty;
    private String upc;

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
        if (amt > 0) // Check
        {
            quantity += amt;
            return true;
        } else
        {
            return false;
        }
    }
    public boolean sellItem(String upc)
    {
        if (quantity > 0)
        {
            quantity--;
            return true;
        } else
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
