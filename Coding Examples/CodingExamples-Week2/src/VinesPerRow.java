import java.util.Scanner;
public class VinesPerRow
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // get input for all variables
        System.out.print("Enter row length: ");
        double rowLength = input.nextDouble();

        System.out.print("Enter end post loss: ");
        double endPost = input.nextDouble();

        System.out.print("Enter vine spacing: ");
        double vineSpacing = input.nextDouble();
        vineSpacing = Math.max(vineSpacing, 3); // checks to make sure minimum of 3' entered

        // calculating vines to plant
        int vinesPerRow= (int)Math.floor((rowLength - 2 * endPost) / vineSpacing);

        // output the results
        System.out.println("Row Length : " + rowLength + " ft");
        System.out.println("End Post Loss : " + endPost*2 + " ft");
        System.out.println("Vine Spacing : " + vineSpacing + " ft");
        System.out.println("\nVines Per Row : " + vinesPerRow);
    }
}
