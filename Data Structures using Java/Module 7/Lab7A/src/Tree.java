
public class Tree {
    private Node root;

    /**
     * - Constructor,
     */
    public Tree() {
        root = null;
    }


    public void makeTreeFromString(String input) {
        Node[] treeArray = new Node[input.length()];

        // Node for each letter
        for (int i = 0; i < input.length(); i++) {
            treeArray[i] = new Node(input.charAt(i));
        }

        for (int i = 1; i < treeArray.length; i++) {
            Node newNode = new Node('+');
            newNode.leftChild = treeArray[i - 1];
            newNode.rightChild = treeArray[i];
            treeArray[i] = newNode;
        }

        root = treeArray[treeArray.length - 1];
    }

    public void displayTree() {
        System.out.println("Tree (in-order): ");
        inOrder(root);
        System.out.println();
    }

    private void inOrder(Node localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.leftChild);
            localRoot.displayNode();
            inOrder(localRoot.rightChild);
        }
    }
}