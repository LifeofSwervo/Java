import java.util.Stack;

class Tree
{
    private Node root; // first node of tree

    /**
     * - Constructor, setting root to null.
     */
    public Tree()
    {
        root = null;
    } // no nodes in tree yet

    /**
     * - Build Tree, void method.
     * @param input - A string, variable for user input.
     */
    public void buildTree(String input)
    {
        Node[] trees = new Node[input.length()]; // Creates array of node objects, size determined by input length

        // Creates 1 node tree for each letter.
        for (int i = 0; i < input.length(); i++)
        {
            Node node = new Node();
            node.data = input.charAt(i);
            trees[i] = node;
        }

        // Builds the Binary Tree
        while (trees.length > 1)
        {
            Node[] newTrees = new Node[(trees.length + 1) / 2]; // Array, half the size of tree
            for (int i = 0; i < newTrees.length; i++)
            {
                Node parent = new Node();
                parent.data = '+';
                parent.leftChild = trees[i * 2];
                if (i * 2 + 1 < trees.length)
                {
                    parent.rightChild = trees[i * 2 + 1];
                }
                newTrees[i] = parent;
            }
            trees = newTrees;
        }

        // The final tree is stored in the root
        root = trees[0];
    }

    /**
     * - Traverse, void method. Initiates the type of tree traversal being used.
     * @param traverseType - An integer. The type of traversal method being initiated.
     */
    public void traverse(int traverseType) // Nowhere to put as switch statement relied on methods (insert, delete, etc..)
    {
        switch(traverseType)
        {
            case 1: System.out.print("\nPreorder traversal: ");
                preOrder(root);
                break;
            case 2: System.out.print("\nInorder traversal: ");
                inOrder(root);
                break;
            case 3: System.out.print("\nPostorder traversal: ");
                postOrder(root);
                break;
        }
        System.out.println();
    }

    /**
     * - PreOrder, void method.
     * @param localRoot - A node. Root node.
     */
    private void preOrder(Node localRoot)
    {
        if(localRoot != null)
        {
            System.out.print(localRoot.data + " ");
            preOrder(localRoot.leftChild);
            preOrder(localRoot.rightChild);
        }
    }

    /**
     * - In Order, void method.
     * @param localRoot - A node. Root node.
     */
    private void inOrder(Node localRoot)
    {
        if(localRoot != null)
        {
            inOrder(localRoot.leftChild);
            System.out.print(localRoot.data + " ");
            inOrder(localRoot.rightChild);
        }
    }

    /**
     * - Post Order, void method.
     * @param localRoot - A node. Root node.
     */
    private void postOrder(Node localRoot)
    {
        if(localRoot != null)
        {
            postOrder(localRoot.leftChild);
            postOrder(localRoot.rightChild);
            System.out.print(localRoot.data + " ");
        }
    }

    /**
     * - Display Tree, void method. Displays the binary tree. Taken from book
     */
    public void displayTree()
    {
        Stack globalStack = new Stack();
        globalStack.push(root);
        int nBlanks = 32;
        boolean isRowEmpty = false;
        System.out.println(
                "......................................................");
        while (isRowEmpty == false)
        {
            Stack localStack = new Stack();
            isRowEmpty = true;
            for (int j = 0; j < nBlanks; j++)
                System.out.print(" ");
            while (globalStack.isEmpty() == false)
            {
                Node temp = (Node) globalStack.pop();
                if (temp != null)
                {
                    System.out.print(temp.data);
                    localStack.push(temp.leftChild);
                    localStack.push(temp.rightChild);
                    if (temp.leftChild != null || temp.rightChild != null)
                        isRowEmpty = false;
                } else
                {
                    System.out.print("--");
                    localStack.push(null);
                    localStack.push(null);
                }
                for (int j = 0; j < nBlanks * 2 - 2; j++)
                    System.out.print("  ");
            } // end while globalStack not empty
            System.out.println();
            nBlanks /= 2;
            while (localStack.isEmpty() == false)
                globalStack.push(localStack.pop());
        } // end while isRowEmpty is false
        System.out.println(
                "......................................................");
    } // end displayTree()
} // end class Tree

