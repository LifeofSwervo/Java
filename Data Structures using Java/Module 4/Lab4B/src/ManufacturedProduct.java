import java.util.Random;

public class ManufacturedProduct
{
    private int productID; // A private integer instance variable called productId.
    private boolean passedInspection; // A private boolean instance variable called passedInspection.

    // Constructor
    public ManufacturedProduct(int productID, boolean passedInspection)
    {
        this.productID = productID;
        this.passedInspection = passedInspection;
    }

    // Getter
    public int getProductID()
    {
        return productID;
    }
    // Inspection method
    public void inspection()
    {
        Random random = new Random();
        int inspectionResult = random.nextInt(20); // Generate a random number in the range 0 to 19
        passedInspection = inspectionResult != 0; // If a zero is generated, set the passedInspection variable to false.  Otherwise, set it to true.

    }

    public String toString()
    {
        return "ManufacturedProduct: \n" +
                "Product ID: " + productID +
                ", Passed Inspection: " + passedInspection;
    }
}
