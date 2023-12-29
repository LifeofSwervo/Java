class LinkedListDriver {
    public static void main(String[] args) {
        // Instantiate a LinkedList object using the array constructor
        long[] dataArray = { 22, 44, 66, 88, 44 };
        LinkList theList = new LinkList(dataArray);

        // Demonstrate existing methods
        System.out.println("Is the list empty? " + theList.isEmpty());
        theList.displayList();

        // Demonstrate new methods
        System.out.println("Search for value 66: " + theList.search(66));
        System.out.println("Number of occurrences of value 44: " + theList.numberOfValues(44));

        System.out.println("Replace all occurrences of 44 with 99");
        theList.replace(44, 99);
        theList.displayList();

        System.out.println("Zero all values in the list");
        theList.Zero();
        theList.displayList();

        System.out.println("Get array representation of the list:");
        long[] newArray = theList.getArray();
        for (long value : newArray) {
            System.out.print(value + " ");
        }
    }
}
