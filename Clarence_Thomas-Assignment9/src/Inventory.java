public class Inventory {
    private String size;
    private String color;
    private int quantity;
    private String upc;

    public Inventory(String size, String color, int quantity, String upc) {
        this.size = size;
        this.color = color;
        this.quantity = quantity;
        this.upc = upc;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUPC() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public boolean addInventory(int amt) {
        if (amt > 0) {
            quantity += amt;
            return true;
        }
        return false;
    }

    public boolean sellItem() {
        if (quantity > 0) {
            quantity--;
            return true;
        }
        return false;
    }

    public String toString() {
        return color + " - " + size + " - qty: " + quantity + " - " + upc;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Inventory) {
            Inventory i2 = (Inventory) obj;
            return i2.getUPC().equalsIgnoreCase(upc);
        }
        return false;
    }
}
