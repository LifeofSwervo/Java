class LinkedListDriver {
    public static void main(String[] args) {
        // Instantiate a LinkedList object using the array constructor
        long[] dataArray = { 22, 44, 66, 88, 44 };
        LinkList theList = new LinkList(dataArray);

        // Demonstrate existing methods
            // Is Empty
        System.out.println("\nIs the list empty? " + theList.isEmpty());
        theList.displayList();

            // Insert First
        System.out.println("\nInsert a new link with data 77 at the beginning");
        theList.insertFirst(77);
        theList.displayList();

            // Delete First
        System.out.println("\nDelete the first link");
        Link deletedLink = theList.deleteFirst();
        if (deletedLink != null) {
            System.out.print("Deleted ");
            deletedLink.displayLink();
            System.out.println();
        }
        theList.displayList();

        // Demonstrate new methods
            // Search
        System.out.println("\nSearch for value 66: " + theList.search(66));

            // Number of values
        System.out.println("\nNumber of occurrences of value 44: " + theList.numberOfValues(44));

            // Replace
        System.out.println("\nReplace all occurrences of 44 with 99");
        theList.replace(44, 99);
        theList.displayList();

            // Zero
        System.out.println("\nZero all values in the list");
        theList.Zero();
        theList.displayList();

            // Get Array
        System.out.println("\nGet array representation of the list:");
        long[] newArray = theList.getArray();
        for (long value : newArray) {
            System.out.print(value + " ");
        }
    }
}
