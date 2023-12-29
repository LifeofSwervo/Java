import java.util.ArrayList;
import java.util.List;

public class AssemblyLine
{
    private ManufacturedProduct[] assemblyLineArray;
    private List<ManufacturedProduct> leftOverProducts;

    // Constructor
    public AssemblyLine()
    {
        assemblyLineArray = new ManufacturedProduct[5];
        leftOverProducts = new ArrayList<>();
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

        // Check if occupied
        if (assemblyLineArray[assemblyLineArray.length - 1] != null)
        {
            leftOverProducts.add(assemblyLineArray[assemblyLineArray.length - 1]);
        }

        return assemblyLineArray.length == 5 ? assemblyLineArray[4] : null;
    }

    // Getter
    public List<ManufacturedProduct> getLeftOverProducts()
    {
        return leftOverProducts;
    }
}
