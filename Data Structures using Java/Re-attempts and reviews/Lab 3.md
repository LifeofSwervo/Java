Step 1 -- Create an Order class.  
  
The Order class represents a purchase order.  The details are elsewhere and the only thing an Order object contains is the alphanumeric order identifier code and a number that is the priority of that order.  
  
The Order class should have the following members:

- A private instance variable for the order code (which is alphanumeric).
- A private instance variable for the priority of the order (the acceptable values are 1, 2, or 3).
- A constructor that sets the two instance variables.
- Get methods for the order code and priority.  No set methods are required.
- A toString() method that returns a String that is a report on the data in the Order object.

Step 2 -- Create a PriorityStack class.  
  
Pages 120 to 122 of your text has the code for a basic stack class.  Modify that code as follows:

- Rename the class PriorityStack.
- Instead of having an array of longs, it should have an array of Order objects.
- Modify all members to account for the fact you are working with Order objects -- not long primitive values.

Then add the following members to the class:

- A method called numberOfOrders().  It returns an integer value that is the number of Order obects that are actually contained within your stack (i.e. the encapsulated array).  Remember, that is not the same as the length of your array!  You could have a mix of objects and nulls in your stack.
- A prioritySort() method that sorts your stack by priority values. A value of 1 is the highest priority, and a value of 3 is the lowest.  After sorting, the highest priority orders should be at the top of the stack. 

Step 3 -- Create a PriorityStackDriver class  
  
This class contains your main method.  In your main method, do the following:

- Instantiate a PriorityStack object.
- Use your push() method to add Order objects into the stack.  Go ahead and hard code the Order objects -- you don't need to use a Scanner to get user input.
- While loading your Order objects onto the stack, demonstrate your peek(), isEmpty(), isFull(), and numberOfOrders() methods.
- After the stack is full, sort it with your prioritySort() method.  You may use any sort algorithm that you like.
- Then pop() and display your Order objects from the stack.  Make sure you display the information about each object as you pop them.

The concept here is that you load your stack and then sort it by priority.  Then, when you begin processing the orders, the highest priority items are immediately available at the top of the stack.

When you're done, zip your project folder and submit it to Canvas as [Your last name]Lab3A.