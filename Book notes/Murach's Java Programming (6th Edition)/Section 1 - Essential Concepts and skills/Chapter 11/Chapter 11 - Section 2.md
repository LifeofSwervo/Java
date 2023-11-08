Aman# How to work with interfaces
*- This section focuses on basic skills of coding and implementing interfaces.*
## How to code an interface
![[Pasted image 20231105123900.png]]
*- To start coding an interface you code the public keyword, followed by the interface keyword, followed by the name of the interface.*
*- When you name an interface it's common to end the name with a suffix of "able" or "er". For example, the Java API uses names like Cloneable, Comparable, EventListener, ActionListener, and so on.*
*- A common naming strategy is to prefix the name of an Interface with I. For example - "IPrint". *
<p style="text-align:center; font-style: italic; color:#00FFFF">In the 1st example, the example shows the code for a Printable interface, with a single abstract method named print(), that doesn't accept any arguments or return any data.</p>
- As with all abstract methods, you don't code braces at the end of the method. Instead, you code a semicolon immediately after the parenthesis.
<p style="text-align:center; font-style: italic; color:#00FFFF">The 2nd example shows the code for an interface named ProductWriter .</p>
- This interface contains 3 abstract methods, add(), update(), and delete(). All of these methods accept a Product object as an argument and return a boolean value, indicating weather the operation was successful.
<p style="text-align:center; font-style: italic; color:#00FFFF">The 3rd example shows how to code an interface that defines constants.</p>
- In the example an interface named DepartmentConstants defines 3 constants that map departments to integer values. 
- If you need to define a set of related constants, it often makes more sense to use an enumeration as shown later in the book.
*- When coding an abstract method in an interface, the public and abstract keywords are not needed. (Java automatically supplies these keywords for all methods).*
*- Similarly, Java automatically supplies the public, static, and final keywords for constants.*
<p style="text-align:center; font-style: italic; color:#00FFFF">The 4th example shows the code for an interface named Serializable.</p>
- This interface is available from the java.io package of the Java API, it's designed to let you identify objects that can be stored (serialized) and then later reconstructed (unserialized) for reuse.
- As an example, you might use this interface if you want to transport an object over a network or save an object to a disk. Since this interface contains no constants or methods, it is known as a tagging interface.

## How to implement an interface
![[Pasted image 20231107081341.png]]
*- The figure shows how to code a class that implements an interface. To do that, you code the implements keyword after the class name. Followed by the names of one or more interfaces separated by commas.*
*- A class that implements an interface must implement all of the abstract methods defined by that interface.*
*- As an example, the Employee class implements the Printable interface. Resulting the the need for the print() method to be declared by that interface. Without it then it wouldn't compile.*
*- This includes the @Override notation for the print() method. This isn't required but it provides clarity that the print() method in the class overrides the abstract print() method of the interface.*
<span style="color:#00FFFF">(When a class implements an interface, you can use any of the constants defined by that interface.)</span>
- To do this you can code the name of the constant without any qualifications like shown in the figure. 
- In this article the Employee class uses the Printable interface. This results in the class being able to use the ADMIN, EDITORIAL, and MARKETING constants defined by the interface. 
*- In this class the print() method uses an if/else statement, this statement uses these constants to determine the department name to include in the output. *
(If you want, you can qualify the constant with the name of the interface. To do that, code the name of the interface, followed by the dot operator and the name of the constant)
- You can qualify the ADMIN constant like - DepartmentConstants.ADMIN.

## How to inherit a class and implement a interface. 
![[Pasted image 20231107113404.png]]
*- This example focuses on how to inherit another class and implement an interface.*
- This example relies on the implementation of the extends keyword to indicate that it inherits the Product class. 
- Then it utilizes the implements keyword, to implement the Printable interface. 
- Resulting in any object created from the Book class being able to be used anywhere a Book, Product, or Printable object is required. 
*- The 2nd example showcases a Product class with interface titled Printable.*
- If the Book class inherits this version of the product class, it automatically implements the Printable interface, and it can use the print() method implemented by the Product class.

## How to use an interface as a parameter
![[Pasted image 20231107121438.png]]
<p style="text-align:center; font-style: italic; color:#00FFFF">The 1st example shows how to code a method that uses an interface as the type for one of its parameters.</p>
- When doing this, the statement that calls the method can pass any object that implements the interface to the method. Then, the method can call any of the methods that are defined by the interface and implemented by the object.
- This allows flexibility in design for processing objects created from different classes. 
- The method printMultiple() accepts 2 parameters . The 1st being an object that implements the printable interface, the 2nd being an integer value telling how many times to print the 1st parameter. 
- Since the 1st parameter specifies the type, printMultiple() doesn't know the type of the object. It knows that the object contains a print() method.
- This results in the code in the body of the method being able to call print().
<p style="text-align:center; font-style: italic; color:#00FFFF">The 2nd example uses the printMultiple() method to print 2 copies of a Product object to the console. </p>
- This works because the Product class implements the printable interface. 
- In this example, the first statement creates the Product object and assigns it to a variable of the Product type. 
- The second example prints 2 copies of the Product objects. 
<p style="text-align:center; font-style: italic; color:#00FFFF">The 3rd example works similar to the 2nd. The only difference is it declares the variable for the Product object as being of the Printable type. </p>

<p style="text-align:center; font-style: italic; color:#00FFFF">The 4th example also works like the 2nd. However, it prints one copy of an Employee object to the console. </p>

## How to work with default and static methods. 
<p style="text-align:center; font-style: italic; color:#00FFFF">Prior to Java 8 interfaces could only contain abstract instance methods, not non-abstract instance methods or static methods.</p>
*- This was a significant limitation and sometimes resulted in a lot of code duplication*
- As an example, the print() method in the Printable interface may be virtually identical for most classes. But, using the techniques presented so far, you would still need to implement the print() method for every class that implements the Printable Interface.
- With Java 8 and later you can include non-abstract instance methods in interfaces. 
- ( Known as "default methods" ) The default methods can be overridden if ever needed.
![[Pasted image 20231108052555.png]]
