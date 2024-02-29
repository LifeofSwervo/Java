Note that there is little about the subject in your textbook, but knowing how to code your own ArrayList class can be handy.*  
  
An ArrayList is a class that contains an encapsulated array.  However, an ArrayList can deal with a situation where an element is added to the encapsulated array that exceeds the existing length of the array.  
  
Create a class called MyArrayList.  It should have the following members:  
  
An encapsulated String array.  
  
A constructor that sets the size of the array.  
  
An "add" method that takes a String argument and adds it to the last free element in the array.  However, if the array is full, the add method creates a new array with double the elements of the existing array.  The contents of the old array are copied to the new array and the String argument is assigned to the next free element of the new array.  The new array is then assigned to the instance variable of the encapsulated array.  
  
A "get" method that takes an index number argument and returns the String object from that index position.  If the index number is out of the existing number range of the array, it should return a null.  
  
A method called "size" that returns an integer that is the number of elements in the array.  
  
A "search" method that takes a String argument and searches the array from the beginning (index 0) to the last element in the array.  If the method finds a match for the search argument, it returns the index number of the match.  If it doesn't find a match, it returns a -1.  Don't worry about dealing with repeated values within the array -- just return the first position number found.  
  
A "searchFromEnd" method that takes a String argument and searches the array from the last index to index 0.  If it finds a match, return the index position.  Again, don't worry about dealing with repeated values within the array -- just return the first position number found.  
  
A "findMatches" method that takes a String argument and searches the array.  It will return a number that is how many matches were found for the String argument in the array.  
  
A "findMatchesArray" method that takes a String argument and searches the array.  It will return an int array that has the index numbers for the matches found in the String array.  If it finds no matches, it returns a null.  
Example of how your driver code might look:  
  
**MyArrayList list = new MyArrayList(5);  _//creates an encapsulated array with 5 elements within the_ _MyArrayList object._**  
**list.add("Alpha");   _//the array contains ["Alpha"][null][null][null][null]_**  
**list.add("Beta");    _//the array contains ["Alpha"]["Beta"][null][null][null]_**  
**list.add("Gamma");   _//the array contains ["Alpha"]["Beta"]["Gamma"][null][null]_**  
**list.add("Delta");   _//the array contains ["Alpha"]["Beta"]["Gamma"]["Delta"][null]_**  
**list.add("Epsilon"); _//the array contains ["Alpha"]["Beta"]["Gamma"]["Delta"]["Epsilon"]_**  
**list.add("Alpha");   _//the array contains ["Alpha"]["Beta"]["Gamma"]["Delta"]["Epsilon"]["Alpha"][null][null][null][null]_**  
**System.out.println(list.size());  _//displays "10";_**  
**System.out.println(list.search("Alpha")); _//displays "0"._**  
**System.out.println(list.searchFromEnd("Alpha")); _//displays "5"._**  
**System.out.println(list.findMatches("Alpha")); _//displays "2"._**  
**int[] arr = list.findMatchesArray("Alpha");**  
**for(int x: arr){  
 System.out.println(x);  
}  
_// the above displays "0" and "5"._  
System.out.println(list.get(2)); _//displays "Gamma"_**

*You may want to review the discussion of the ArrayList collection class provided by the Java API, as found on pages 380-399 (chapter 12) of the Murach Java textbook currently used in MCC's Java Programming I & II courses.