public abstract class Item {
    private String sku;
    private String name;
    private String manufacturer;
    private double price;
    private String location; // where in the store is it at?

    public Item(String sku, String name, String manufacturer, double price, String location) {
        this.sku = sku;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.location = location;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String printItem() {
        System.out.println("Item: " + name);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("SKU: " + sku);
        System.out.println("Price: " + price);
        System.out.println("Store Location: " + location);
        return null;
    }

    public abstract boolean addInventory(String upc, int amt);
    public abstract boolean sellItem(String upc);
    public abstract String getUPC(String size, String color);
    @Override
    public String toString() {
        return "Item: " + name
                + "\nManufacturer: " + manufacturer
                + "\nSKU:" + sku
                + "\nPrice: " + price
                + "\nStore Location: " + location;
    }
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj instanceof Item)
        {
            Item other = (Item) obj;
            return this.sku.equals(other.sku);
        }
        return false;
    }
}
