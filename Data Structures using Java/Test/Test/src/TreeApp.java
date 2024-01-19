import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TreeApp {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter a string of letters: ");
        String input = getString();
        Tree theTree = new Tree();
        theTree.buildTree(input);
        theTree.displayTree();
    }

    /**
     * - Get String, reads user input and throws exception if issues operating.
     * @return - Returns readLine method, reading users input.
     * @throws IOException - Exception thrown in event of error.
     */
    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        return br.readLine();
    }
}