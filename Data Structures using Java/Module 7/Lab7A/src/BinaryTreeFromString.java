import java.util.Scanner;

public class BinaryTreeFromString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string of letters: ");
        String input = scanner.nextLine();

        Tree tree = new Tree();
        tree.makeTreeFromString(input);
        tree.displayTree();
    }
}