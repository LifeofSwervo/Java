import java.util.List;

public class AssemblyLineTest
{
    public static void main(String[] args)
    {
        AssemblyLine assemblyLine = new AssemblyLine();

        for (int i = 1; i <= 20; i++)
        {
            ManufacturedProduct product = new ManufacturedProduct(i, false);
            ManufacturedProduct returnedProduct = assemblyLine.insert(product);

            if (returnedProduct != null)
            {
                System.out.println("Returned Product: " + returnedProduct); // Report for each object
            }
        }

        // Print left over products
        List<ManufacturedProduct> leftOverProducts = assemblyLine.getLeftOverProducts();
        if (!leftOverProducts.isEmpty())
        {
            System.out.println("\nLeft-over Products:");
            for (ManufacturedProduct leftOverProduct : leftOverProducts)
            {
                System.out.println(leftOverProduct);
            }
        }
    }
}
