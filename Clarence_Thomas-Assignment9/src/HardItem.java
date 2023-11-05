public final class HardItem extends Item
{
    private String type;
    private String material;
    private int quantity;
    private String upc;

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
        if (amt > 0)
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
        return super.toString() +
                "\nType: " + type + "\n"
                + "Material: " + material + "\n"
                + "Quantity: " + quantity + "\n"
                + "UPC: " + upc;
    }
}
