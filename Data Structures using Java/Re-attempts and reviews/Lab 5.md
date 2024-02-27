Step 1

Your text has an example of LinkedList class.  Convert the class so that the Link objects have a single long instance variable -- call it "data" -- and the Link instance variable..

  
Step 2

Then add the following capabilities to the class.  
  
A constructor that takes an array of longs as an argument.  The contents of the array are use to create Link objects that become objects in the LinkedList.  
  
A "search" method that takes a long argument and returns a boolean value.  The method searches the LinkedList object for Link objects with a data value that matches the long argument.  It returns a true or false based on whether or not a matching value is present in the LinkedList.  
  
A "numberOfValues" method that takes a long argument and returns an int value.  The method searches the LinkedList object for Link objects with a data value that matches the long argument.  It returns a numeric value that is the number of times the long argument is present in the LinkedList.  
  
A "replace" method that takes two long arguments and returns a void.  The method finds all occurrences of the first long value in the Links of the LinkedList and replaces their data value with the method's second long value.  
  
A "zero" method that replaces all values in the LinkedList's Link objects with zeros.

A "getArray" method that returns a long array.  The method returns long array that contains the long data values in the Link objects of the LinkedList

Step 3  
  
Give the project a LinkedListDriver class that contains your main method.

Instantiate a LinkedList object, using the array constructor.

Demonstrate the isEmpty, insertFirst, deleteFirst, and displayList methods.

Also demonstrate the methods from Step 2. Remember that your output should clearly state what you are doing in your code.