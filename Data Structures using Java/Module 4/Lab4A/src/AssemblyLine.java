public class AssemblyLine
{
    private ManufacturedProduct[] assemblyLineArray;

    // Constructor
    public AssemblyLine()
    {
        assemblyLineArray = new ManufacturedProduct[5];
    }

    // Insert method
    public ManufacturedProduct insert(ManufacturedProduct product)
    {
        // Shifts element up
        for (int i = assemblyLineArray.length - 1; i > 0; i--)
        {
            assemblyLineArray[i] = assemblyLineArray[i - 1];
        }

        // Add product to index 0
        assemblyLineArray[0] = product;

        // Inspect product
        product.inspection();

        // Return the product in element four, or null if not there
        return assemblyLineArray.length == 5 ? assemblyLineArray[4] : null;
    }
}
