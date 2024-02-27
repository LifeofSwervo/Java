Step 1

Create a ManufacturedProduct class.  The ManufacturedProduct class is a simplified representation of a product that is being built on an assembly line.

The data in a ManufacturedProduct object are as follows:

- A private integer instance variable called productId.
- A private boolean instance variable called passedInspection.

The ManufacturedProduct class should have the following additional members:

- A constructor that sets the productId value.  Allow the inspection variable to have a default value of your choice.
- A get method for the productId value.  No set method should be provided.  The only way to assign the productId is with the constructor.
- A toString() method that returns a String that is a report on the data in a ManufacturedProduct object.

ALSO...  
  
Remember that the AssemblyLine array (see below) represents an actual assembly line.  After a ManufacturedProduct object is finally returned by the insert method, it should be inspected to see if it has been correctly assembled.  
   
So also give the ManufacturedProduct class a public inspection method.  All it should do is generate a random number in the range zero to nineteen.  If a zero is generated, set the passedInspection variable to false.  Otherwise, set it to true.  
  
Step 2

Create an AssemblyLine class.  An assembly line is, of course, a good real-world representation of a queue.  
  
The AssemblyLine class has an encapsulated ManufacturedProduct array with five elements.  Each element represents a position on an actual assembly line.  
  
Give the AssemblyLine class a public insert method that adds a ManufacturedProduct object to element zero the ManufacturedProduct array.  If any objects are already in the array, shift all of them one element 'up' the ManufacturedProduct array.  
  
Example:

- We are adding a ManufacturedProduct object to the array.  However, we already have an object in the array.  The new object occupies element zero in the array and the old object shifts up to element one.
- Then we insert another object.  The new object goes into element zero.  The object we inserted previously shifts up to element one.  And the first object now occupies element two.
- etc.

The insert method should also return a ManufacturedProduct object.  However, it will only return the ManufacturedProduct object that is currently the object in element four of the ManufacturedProduct array.  Otherwise, it will return a null.  
  
Example:

- We have five objects in the five element ManufacturedProduct array.  When a sixth object is added, it goes to element zero and all of the objects in the array shift up one in the element count -- except for the object in element number four, which is actually returned by the insert method.

The only way to add or return an element from the array should be via the insert method.  
  
Remember that you should inspect each ManufacturedProduct object when they are finally returned by the insert method.

Step 3

Create an AssemblyLineTest class -- it should contain your main method.  
  
In the main method, instantiate an AssemblyLine object.  Use your insert() method to add twenty ManufacturedProduct objects into the AssemblyLine object.  Go ahead and hard code the ManufacturedProduct objects -- you don't need to use a Scanner to get user input.  
  
As the insert method returns ManufacturedProduct objects, display a report on each object.