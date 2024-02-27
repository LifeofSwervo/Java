Create an EmployeeLinkedList class.  However, instead of generic Link class for the link objects, you should use objects created from an Employee class as the objects stored in the list.  
  
The Employee class represents an employee at a company.  It should have instance variables for the employee's first name, last name, id number (use an integer), date of birth*, and rate of pay.  Also, any other variable(s) needed to make an Employee object work in a linked list should be part of the Employee class.  
  
Give your EmployeeLinkedList class a "find" method that takes an integer argument and returns an Employee object.  The argument is used to search the list for an Employee object with a matching id number value.  The method then returns a copy of the matching Employee object -- or a null if nothing is found.  
  
Note the emphasis I put on returning a copy of the Employee object from the "find" method.  The two most likely ways to create a copy involve either overriding the "clone" method of the Employee class (it's inherited from the Object class) or using a copy constructor.**  
  
Include an EmployeeListDriver class in your project.  It should test the "find" method.

*If you have Java 8 or better, for the date of birth, use the LocalData class and other features of the java.time package. One place you can find documentation of the java.time package is chapter 14 of the Murach textbook we used in Java Programming I & II. If you have a version of Java older than Java 8, you can substitute a String for the LocalDate.

**One place you can find documentation on cloning and implementing a Cloneable interface is on pp. 316 - 319 of the Murach textbook we used in Java Programming I (& II). Alternatively, a copy constructor has a single formal argument of the same class as the class under construction. The implementation body of the copy constructor can use assignment operators (=) to copy the corresponding primitive value fields and immutable object fields (such as String and LocalDate) from the argument object to the "this" object. "Get" methods on the fields of the argument object may also be used. Mutable object fields, if any, will themselves need to be cloned/copied. See pp. 364-365 of Murach for copying arrays, should you have any encapsulated arrays as fields.