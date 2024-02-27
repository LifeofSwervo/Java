Create a class named Numbers.  The class should have a private integer array as an instance variable.

The Numbers constructor should take an integer argument -- that will become the length (i.e. the number of elements) in the integer array.

Give the class a method called "display".  This method will print a list of all the numbers in the integer array.

Give the class "setValue" and "getValue" methods.

The "setValue" method takes two integer arguments:  one of them is an index number for an element of the array.  The other is a value that will be assigned to that index position of the array.  The setValue method should only allow values between 0 and 100 to be assigned to the array.  If a value less than zero is to be assigned, then assign zero instead.  If a value greater than 100 is to be assigned, then assign 100 instead.

The "getValue" method takes an integer argument and uses it as an index number to retrieve the value from that index position of the array.

Both methods should have a try-catch structure to deal with the possibility of an index number that is outside the range of the array length.

Include a method called getLength.  It returns the number of elements in the array.  

Then create a class named NumbersDriver.  It contains your main method.  In the main method, do the following:

- Instantiate a Numbers object that contains a 10 element array.Call the display method of the Numbers object.
- Use the setValue method to assign values to the elements of the array that is encapsulated within the Numbers object.
- Use the getValue method to return and display the first and last numbers in the array.
- Use the getLength method to return and display the length (the number of elements) of the array.Call the display method to the Numbers object once again.
- Clearly describe what you are doing when you call your main methods.  Do not have anonymous data simple appear with no clue as to what it is.
